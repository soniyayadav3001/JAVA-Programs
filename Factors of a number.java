import java.util.*;
public class Factor {
  public static void main(String[] args) {
    System.out.println("Enter the number here : ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.print("Factors of " + number + " are: ");

    for (int i = 1; i <= number; ++i) {
      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
