import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //gameNum();
        gameWord();
    }

    public static void gameNum() {
        int n = (int) Math.round((Math.random() * 9));
        System.out.println("A random number from 0 to 9 was conceived " + n);
        int attempts = 3;
        boolean guessing = true;

        while (guessing && attempts >= 0) {
            System.out.println("Try to guess it: ");
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();

            attempts -= 1;

            if (answer != n && attempts > 0) {
                if (n > answer) {
                    System.out.println("Try again. The number is greater. You have " + attempts + " more attempts.");
                } else {
                    System.out.println("Try again. The number less. You have " + attempts + " more attempts.");
                }

            } else if (answer == n) {
                guessing = false;
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("Do you want to repeat the game again? 1 - yes / 0 - no");
                int repeat = input.nextInt();
                if (repeat == 1) {
                    gameNum();
                }

            } else if (attempts == 0) {
                System.out.println("You haven't guessed the number.");
                System.out.println("Do you want to repeat the game again? 1 - yes / 0 - no");
                int repeat = input.nextInt();
                if (repeat == 1) {
                    gameNum();
                }
            }

        }
    }

    public static void gameWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int randIndex = (int) Math.round((Math.random() * words.length));
        String word = words[randIndex];
        System.out.println("The word was conceived. " + word);

        StringBuilder prompt = new StringBuilder("###############");
        boolean guessing = true;

        while (guessing) {
            System.out.println("Try to guess it: ");
            Scanner input = new Scanner(System.in);
            String answer = input.next();

            int k = Math.min(word.length(), answer.length());

            for (int i = 0; i < k; i++) {
                if (answer.charAt(i) == word.charAt(i)) {
                    prompt.setCharAt(i, word.charAt(i));
                }
            }

            if (!answer.equals(word)) {
                System.out.println("Try again.\n " + prompt);
            } else {
                guessing = false;
                System.out.println("Congratulations! You guessed the word.");
            }
        }
    }


}