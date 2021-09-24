import java.io.IOError;

public class Main {

    public static void main(String[] args) {
        System.out.println(calc(2, 1, 6, 3));
        System.out.println(logicSum(3, 8));
    }


    public static float calc(float a, float b, float c, float d) throws IOError, ArithmeticException, IllegalArgumentException {
        if (d != 0) {
            return a * (b + (c / d));
        } else throw new ArithmeticException("Division by zero");
    }


    public static boolean logicSum(float a, float b) throws IOError, IllegalArgumentException {
        float sum = a + b;
        return sum >= 10 && sum <= 20;
    }


}
