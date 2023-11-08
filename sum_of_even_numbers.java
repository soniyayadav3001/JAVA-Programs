import java.util.*;

public class hello {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        System.out.println("Enter the value of 'n' upto which sum has to be calculated : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 2; i <= n; i = i + 2) {

            sum = sum + i;

        }
        System.out.println(" The sum of " + n + " even numbers is " + sum);

    }

}
