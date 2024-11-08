import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number here : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("The sum will be : ");
        System.out.println(sum);
    }
}
