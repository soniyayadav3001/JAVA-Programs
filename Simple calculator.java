import java.util.*;
public class Main{
    public static void main(String[]args){
        System.out.println("Enter the value of num1 : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num2 : ");
        Scanner s = new Scanner(System.in);
        int num2 = s.nextInt();
        System.out.println("Enter the operator here : ");
        Scanner scr = new Scanner(System.in);
        char op = scr.next().charAt(0);
          switch(op){
              case '+' :
                  System.out.println(num1+num2);
                  break;
              case '-' :
                  System.out.println(num1-num2);
                  break;
              case '*' :
                  System.out.println(num1*num2);
                  break;
              case '/' :
                  System.out.println(num1/num2);
                  break;
              default:
                  System.out.println("Invalid operator");
          }
    }
}
