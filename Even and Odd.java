import java.util.*;
public class hello {
    
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Number is even.");
        } 
        else 
        {
            System.out.println("Number is odd.");
        }
    }
}
