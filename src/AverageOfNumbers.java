import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();

    System.out.println("Input numbers, type \"end\" to stop.");

    while (true) {
      String input = scanner.nextLine();

      if ("end".equals(input)) {
        break;
      }

      list.add(Integer.valueOf(input));
    }

    final double average = list.stream()
            .mapToInt(n -> n)
            .average()
            .getAsDouble();

    System.out.println("average of the numbers: " + average);
  }
}