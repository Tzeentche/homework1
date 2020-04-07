package task31;

import java.util.*;
import java.util.stream.*;

public class NumbersCalculator {

    List<String> numbersFinder(String text) {
        String numbers = text.replaceAll("[^\\d\\s]", "");

        if (!numbers.isBlank()) {
            return Stream.of(numbers.split("\\s+"))
                    .filter(s -> !s.isBlank()).map(String::new)
                    .collect(Collectors.toList());
        } else return new ArrayList<>();
    }

    int counter(List<String> numbers) {

        if (!numbers.isEmpty()) {
            return numbers.stream()
                    .mapToInt(Integer::parseInt)
                    .reduce(0, (a, b) -> (a + b));
        } else return 0;
    }

    List<String> repeatKiller(List<String> numbers) {
        return numbers.stream().distinct().collect(Collectors.toList());
    }
}
