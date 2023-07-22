import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите вещественную часть первого аргумента: ");
            double real1 = scanner.nextDouble();
            System.out.print("Введите мнимую часть первого аргумента: ");
            double imaginary1 = scanner.nextDouble();
            ComplexNumber complexNumber1 = new ComplexNumber(real1, imaginary1);

            Calculable calculator = calculableFactory.create(complexNumber1);

            while (true) {
                System.out.print("Введите команду (+, *) или = : ");
                String cmd = scanner.next();

                if (cmd.equals("+")) {
                    System.out.print("Введите вещественную часть второго аргумента: ");
                    double real2 = scanner.nextDouble();
                    System.out.print("Введите мнимую часть второго аргумента: ");
                    double imaginary2 = scanner.nextDouble();
                    ComplexNumber complexNumber2 = new ComplexNumber(real2, imaginary2);
                    calculator.sum(complexNumber2);
                } else if (cmd.equals("*")) {
                    System.out.print("Введите вещественную часть второго аргумента: ");
                    double real2 = scanner.nextDouble();
                    System.out.print("Введите мнимую часть второго аргумента: ");
                    double imaginary2 = scanner.nextDouble();
                    ComplexNumber complexNumber2 = new ComplexNumber(real2, imaginary2);
                    calculator.multiply(complexNumber2);
                } else if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.println("Результат: " + result);
                    break;
                }
            }

            System.out.print("Еще посчитать (Y/N)? ");
            String cmd = scanner.next();
            if (cmd.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
