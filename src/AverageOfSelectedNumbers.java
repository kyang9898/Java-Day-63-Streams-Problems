import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input numbers, type \"end\" to stop.");
    List<Integer> numbers = new ArrayList<>();
    
    while (true) {
      String input = scanner.nextLine();
      
      if ("end".equals(input))
        break;
      
      numbers.add(Integer.valueOf(input));
    }
        
    System.out.println("\nPrint the average of the negative numbers or the positive numbers? (n/p)");
    String choice = scanner.nextLine();
    
    switch (choice) {
      case "n":
        System.out.println("Average of the negative numbers: " + 
                numbers.stream().filter(n -> n < 0).mapToInt(n -> n).average().getAsDouble());
        break;
      case "p":
        System.out.println("Average of the positive numbers: " + 
                numbers.stream().filter(n -> n > 0).mapToInt(n -> n).average().getAsDouble());
        break;
    }
  }
}