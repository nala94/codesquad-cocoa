package bullsAndCows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        int answer = numbers.get(0) * 100 +
                numbers.get(1) * 10 +
                numbers.get(2);

    }
}
