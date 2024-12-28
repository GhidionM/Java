import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter numbers to check (enter 0 to stop):");

    while (true) {
      System.out.print("Enter a number: ");
      int num = input.nextInt();

      if (num == 0) {
        System.out.println("Exiting...");
        break;
      }

      if (num % 2 == 0) {
        System.out.println(num + " is even.");
      } else {
        System.out.println(num + " is odd.");
      }
    }

    input.close();
  }
}
