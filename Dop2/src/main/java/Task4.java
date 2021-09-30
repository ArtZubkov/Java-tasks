import java.util.Arrays;

public class Task4 {

    public Task4(int[] values, int[] weights) {
        int sum = Arrays.stream(weights).sum();

        int random = (int) Math.round(Math.random() * sum);

    }
}
