public class Recursion {
    public static void printnum(int num) {
        if (num == 6) {
            return;
        } 
        System.out.println(num);
        printnum(num+1);
    }
    public static void main(String[] args) {
        int num = 1;
        printnum(num);
    }
}
