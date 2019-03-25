package torba.java1101.homework5.binaryCalculator;

import java.lang.String;
public class BinaryCalcImpl implements Calc {
    @Override
    public String sum(int a, int b) {
        int plus = a+b;
        String transfer = Integer.toBinaryString(plus);
        return transfer;
    }

    @Override
    public String minus(int a, int b) {
        int subtraction = a-b;
        String transfer = Integer.toBinaryString(subtraction);
        return transfer;
    }

    @Override
    public String multiplication(int a, int b) {
        int multiply = a*b;
        String transfer = Integer.toBinaryString(multiply);
        return transfer;
    }

    @Override
    public String divide(int a, int b) throws ArithmeticException {
        int div = a/b;
        String transfer = Integer.toBinaryString(div);
        return transfer;
    }

    @Override
    public String getPercent(double number, double percent) {
        double percentage = (number/100)*percent;
        double n = 0.5d;
        int round = (int)(percentage+n);
        String transfer = Integer.toBinaryString(round);
        return transfer;
    }

    @Override
    public String pow(double a, double n) {
        int powing = new Double(Math.pow(a,n)).intValue();
        String transfer = Integer.toBinaryString(powing);
        return transfer;
    }
}
