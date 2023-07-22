public class LogCalculableFactory implements ICalculableFactory {

    private Logable logger;

    public LogCalculableFactory(Logable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(ComplexNumber result) {
        return new LogCalculator(new Calculator(result), logger);
    }
}
