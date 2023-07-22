public interface Calculable {
    Calculable sum(ComplexNumber arg);
    Calculable multiply(ComplexNumber arg);
    ComplexNumber getResult();
}
