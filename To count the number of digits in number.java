import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter the number here : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            num = num / 10;
            count = count + 1;
        }
        System.out.println(count);
    }
}
