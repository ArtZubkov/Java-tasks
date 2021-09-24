public class Main {

    public static void main(String[] args) {
        defNum(0);
        System.out.println(defNumNeg(-5));
        hello("Jack");
        leap((short) 2012);
    }

    public static void defNum(int num) {
        System.out.println(num < 0 ? "A negative number" : "A positive number");
    }

    public static boolean defNumNeg(int num) {
        return num < 0;
    }

    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void leap(short year) {
        if (year < 0) {
            System.err.println("ValueError year");
        } else {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) System.out.println("A leap year");
            else System.out.println("Not a leap year");
        }
    }

}