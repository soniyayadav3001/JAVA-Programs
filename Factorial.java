import java.util.*;
public class Factorial {
    
    public static void main(String[] args) {
        System.out.println("Enter the number here : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        int i;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is "+fact);
    }
}
