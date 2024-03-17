import java.util.*;
public class Perimeter {
    public static void main(String[] args) {
        //Perimeter of rectangle.
        System.out.println("Enter the value of 'l' and 'b' : ");
        Scanner sc = new Scanner(System.in);
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("The perimeter of rectangle is : "+2*(l+b));
    }
}
