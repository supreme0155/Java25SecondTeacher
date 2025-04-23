import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
            System.out.println("Hello, World!");
    }
List<Integer> numbers = new ArrayList<>();
for (int i = 1; i <= 30; i++) {
    if (i != 16 && i != 18) {
        numbers.add(i);
    }
}

Collections.shuffle(numbers);

for (int i = 0; i < numbers.size(); i += 2) {
    if (i + 1 < numbers.size()) {
        System.out.println("Pair: " + numbers.get(i) + " and " + numbers.get(i + 1));
    } else {
        System.out.println("Unpaired: " + numbers.get(i));
    }
}
