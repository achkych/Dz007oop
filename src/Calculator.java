public class Calculator implements Calculable {

    private ComplexNumber result;

    public Calculator(ComplexNumber result) {
        this.result = result;
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        double real = result.getReal() + arg.getReal();
        double imaginary = result.getImaginary() + arg.getImaginary();
        result = new ComplexNumber(real, imaginary);
        return this;
    }

    @Override
    public Calculable multiply(ComplexNumber arg) {
        double real = result.getReal() * arg.getReal() - result.getImaginary() * arg.getImaginary();
        double imaginary = result.getReal() * arg.getImaginary() + result.getImaginary() * arg.getReal();
        result = new ComplexNumber(real, imaginary);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return result;
    }
}
