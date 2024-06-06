import java.util.*; 
public class lab {
    public static void main(String[] args) {
        System.out.println("WELCOME TO CHEM LAB TESTING");
        System.out.println("Enter the pH value of chemical to be tested : ");
        Scanner sc = new Scanner(System.in);
        float pH = sc.nextFloat();
        if (pH > 7.0) {
            System.out.println("CHEMICAL IS BASIC");
        } else if (pH < 7.0) {
            System.out.println("CHEMICAL IS ACIDIC");
        } else {
            System.out.println("CHEMICAL IS NEUTRAL");
        }
        System.out.println("THANK YOU");
    }
}
