import java.util.ArrayList;;
import java.util.List;

/*
Решение геометрическое с помощью отрезков.
Складываем все элементы массива весов - это длина всего отрезка, т.е. 100%.
Потом разделяем целый отрезок на малые в зависимости от весов по порядку.
На какой отрезок выпадет рандом, тот вес и соотвественно элемент выберется.
*/


public class Task4 {
    List<Integer> values = new ArrayList<>();
    List<Integer> weights = new ArrayList<>();

    public Task4(int[] values, int[] weights) {
        for (int i = 0; i < values.length; i++) {
            this.values.add(values[i]);
            this.weights.add(weights[i]);
        }

    }

    public int returnItem() {
        int sum = weights.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        int random = (int) Math.round(Math.random() * (sum - 1)) + 1;
        System.out.println(random);

        int item = -999999999;

        if (random <= weights.get(0)) {
            item = values.get(0);
        } else {
            int current_sum = weights.get(0);
            for (int i = 1; i < weights.size(); i++) {
                current_sum += weights.get(i);
                if (random > weights.get(i - 1) && random <= current_sum) {
                    item = values.get(i);
                    break;
                }
            }
        }

        if (item == -999999999) {
            System.err.println("Error in logic");

        }

        return item;
    }
}
