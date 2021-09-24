import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();

        // 6 task
        int[] nums = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("\n-6 task-");
        System.out.println(sixth(nums));

        // 7 task
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("\n-7 task-");
        seventh(array, 2);
        System.out.println(Arrays.toString(array));

    }

    public static void first() {
        int[] bin = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < bin.length; i++) {
            if (bin[i] == 0) bin[i] = 1;
            else if (bin[i] == 1) bin[i] = 0;
        }
        System.out.println("-1 task-");
        System.out.println(Arrays.toString(bin));
    }

    public static void second() {
        int[] nums = new int[8];
        System.out.println("\n-2 task-");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 8 elements: ");
        for (int i = 0; i < nums.length; i++) nums[i] = input.nextInt();
        System.out.println(Arrays.toString(nums));
    }

    public static void third() {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) nums[i] = nums[i] * 2;
        }
        System.out.println("\n-3 task-");
        System.out.println(Arrays.toString(nums));
    }

    public static void fourth() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix size: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
            matrix[n - i - 1][i] = 1;
        }
        System.out.println("\n-4 task-");
        for (int i = 0; i < n; i++) System.out.println(Arrays.toString(matrix[i]));
    }

    public static void fifth() {
        int[] nums = {4, 7, 15, -6, 8};
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        System.out.println("\n-5 task-");
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    public static boolean sixth(int[] nums) {
        if (nums.length == 0) throw new NullPointerException();

        int sum_left = 0;
        int sum_right = 0;
        boolean bool = false;

        for (int i = 0; i < nums.length - 1; i++) {
            sum_left += nums[i];
            for (int j = i + 1; j < nums.length; j++) sum_right += nums[j];
            if (sum_left == sum_right) bool = true;
            sum_right = 0;
        }
        return bool;
    }


    public static void seventh(int[] array, int n) {
        if (n > 0) {
            for (int i = array.length - 1; i >= n; i--) {
                array[i] = array[i - n];
            }

            for (int i = 0; i < n && i < array.length; i++) {
                array[i] = 0;
            }
        }

        if (n < 0) {
            n = Math.abs(n);
            for (int i = 0; i < array.length - n; i++) {
                array[i] = array[i + n];
            }

            for (int i = array.length - 1; i > array.length - 1 - n && i >= 0; i--) {
                array[i] = 0;
            }
        }
    }
}
