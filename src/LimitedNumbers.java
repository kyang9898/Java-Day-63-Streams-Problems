import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pNumbers = new ArrayList<>();

        while (true) {
            Integer input = Integer.valueOf(scanner.nextLine());

            if (input < 0) {
                break;
            }

            pNumbers.add(input);
        }

        pNumbers.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(System.out::println);
    }
}