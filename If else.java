import java.util.*;
public class Main{

    public static void main(String[] args) {
        System.out.println("Enter the age here : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        }
        else {
            System.out.println("Not eligible to vote.");
        }
    }
}
