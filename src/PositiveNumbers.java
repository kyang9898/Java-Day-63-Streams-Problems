import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Integer> list = Arrays.asList(1, -4, -2, 4, 5, 2, 6, 2, -4, -2, -5);
    System.out.println(positive(list));

  }

  public static List<Integer> positive(List<Integer> numbers) {
    return numbers.stream()
            .filter(n -> n > 0)
            .collect(Collectors.toList());
  }

}