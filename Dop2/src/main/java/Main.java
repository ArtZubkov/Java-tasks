import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("--Task1--");
        task1();
        System.out.println("--Task2--");
        task2();

        // task3
        System.out.println("--Task3--");
        int[] nums = {2, 5, 7, 9, 8, 10, 7};
        System.out.println(Arrays.toString(task3(nums, 7)));

        // task4
        //System.out.println("--Task4--");
        /*int[] values = {1, 2, 3};
        int[] weights = {1, 2, 10};
        Task4 task4 = new Task4(values, weights);
        System.out.println(task4.returnItem());
        */

        //System.out.println("--Task5--");
        //task5();

        // task6
        System.out.println("--Task6--");
        System.out.println(BaseConverter.convertToKelvin(25) + "K");
        System.out.println(BaseConverter.convertToFahrenheit(42) + "F");

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

    public static int[] task3(int[] nums, int item) {

        int amountItem = 0;

        for (int num : nums) {
            if (num == item) {
                amountItem++;
            }
        }

        int[] newNums = new int[nums.length - amountItem];
        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == item) {
                offset++;
            } else {
                newNums[i - offset] = nums[i];
            }
        }

        return newNums;

    }


    public static void task5() {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas et dolor interdum, tristique arcu sed, egestas augue. " +
                "Fusce quis venenatis sem, id egestas odio. Donec vitae pulvinar odio, eget vehicula urna. " +
                "Maecenas rhoncus vestibulum orci ac mollis. Fusce euismod, libero quis pellentesque tristique, sapien nunc pretium neque, et consectetur ex sem sit amet ipsum. " +
                "Duis sollicitudin dapibus felis, at mollis sapien elementum condimentum. Phasellus nunc nibh, pellentesque venenatis nibh vitae, feugiat convallis magna. " +
                "Nam congue turpis eget porta semper. Cras sed sapien non lacus ullamcorper porttitor. In hendrerit volutpat ornare.";

        Map<Character, Integer> dict = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char current_char = text.charAt(i);
            if (current_char >= 65 && current_char <= 90 || current_char >= 97 && current_char <= 122) {
                if (!dict.containsKey(current_char)) {
                    dict.put(current_char, 1); // Инициализируем ключ, если его еще не встречалось
                } else {
                    dict.put(current_char, dict.get(current_char) + 1); // Итерируем кол-во, если ключ уже записан в карте
                }
            }
        }

        for (Map.Entry entry : dict.entrySet()) {
            Character key = (Character) entry.getKey();
            int value = (int) entry.getValue();
            System.out.println(key + ": " + value);
        }

    }

}
