import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task1();
        task2();

    }

    public static void task1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.round((Math.random() * 100));
        }

        int max = array[0], min = array[0], sum = array[0];

        for (int i = 1; i < n; i++) {
            sum += array[i];
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        double average = (double) sum / n;

        System.out.println(Arrays.toString(array));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);

    }


    public static void task2() {

        List<Integer> simpleNums = new ArrayList<>();

        for (int num = 2; num <= 100; num++) {

            boolean simple = true;

            for (int divider = 2; divider <= Math.sqrt(num); divider++) {
                if (num % divider == 0) {
                    simple = false;
                    break;
                }
            }

            if (simple) {
                simpleNums.add(num);
            }
        }

        System.out.println(simpleNums.toString());
    }

    public static void task3() {
        int[] nums = new int[];
    }

}
