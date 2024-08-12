import java.util.*;
public class Main{
public static void main(String[]args){
    int original_num, reverse_num = 0, remainder;
    System.out.println("Enter the number here : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    original_num = num;
    while (num > 0) {
        remainder = num % 10;
        reverse_num = reverse_num * 10 + remainder;
        num = num / 10;
    } 
    if (original_num == reverse_num) {
        System.out.println("Number is Palindrome");
    }
    else {
        System.out.println("Number is not Palindrome");
    }
}
}
