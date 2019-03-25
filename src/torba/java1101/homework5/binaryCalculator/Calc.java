package torba.java1101.homework5.binaryCalculator;

public interface Calc {
    String sum(int a, int b);
    String minus(int a, int b);
    String multiplication(int a, int b);
    String divide(int a, int b) throws ArithmeticException;
    String getPercent(double number, double percent);
    String pow(double a, double n);
}
