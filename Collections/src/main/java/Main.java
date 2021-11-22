import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        ТелефонныйСправочник phonebook = new ТелефонныйСправочник();
        phonebook.add("Joker", "8-987-666");
        phonebook.add("Carter", "6-953-838");
        phonebook.add("Raider", "2-771-552");
        phonebook.add("Big Smoke", "4-111-030");
        phonebook.add("Joker", "5-172-690");
        phonebook.add("Parker", "1-721-879");
        phonebook.get("Joker");
    }

    public static void task1() {
        String[] words = {"tea", "chocolate", "milk", "orange", "coffee", "home",
                "night", "dream", "cinema", "stars", "moon", "orange", "dream", "tea", "orange"};
        Map<String, Short> uniqueWords = new LinkedHashMap<>();

        for (String word : words) {
            if (!uniqueWords.containsKey(word)) {
                uniqueWords.put(word, (short) 1);
            } else {
                uniqueWords.put(word, (short) (uniqueWords.get(word) + 1));
            }
        }

        System.out.println(uniqueWords);

    }
}
