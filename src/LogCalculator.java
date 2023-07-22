public class LogCalculator implements Calculable {

    private Calculable decorated;
    private Logable logger;

    public LogCalculator(Calculable decorated, Logable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        logger.log("Вызвался метод сложения с параметром: " + arg.toString());
        return decorated.sum(arg);
    }

    @Override
    public Calculable multiply(ComplexNumber arg) {
        logger.log("Вызвался метод умножения с параметром: " + arg.toString());
        return decorated.multiply(arg);
    }

    @Override
    public ComplexNumber getResult() {
        logger.log("Пользователь запросил результат!");
        return decorated.getResult();
    }
}
