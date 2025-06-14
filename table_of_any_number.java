import java.util.*;
public class hello {
    public static void main(String[] args) {
        int i;
        System.out.print("Enter the value of 'n' : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 1; i <= 10;i++) {
            System.out.println(n*i);
        }
    }
}
