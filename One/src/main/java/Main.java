import java.io.IOError;

public class Main {

    public static void main(String[] args) {
        System.out.println(calc(1, 1, 6, 3));
        System.out.println(logicSum(3,8));
    }


    public static float calc(float a, float b, float c, float d) throws IOError, ArithmeticException, IllegalArgumentException {
        if (d != 0) {
            float result = a * (b + (c / d));
            return result;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }


    public static boolean logicSum(float a, float b) throws IOError, IllegalArgumentException {
        boolean result = false;
        float sum = a+b;
        if (sum>=10 && sum<=20) {
            result = true;
        }
        return result;
    }



}
