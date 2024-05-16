public class Main {
    public static void main(String[] args) {
        System.out.println("Case1");
        System.out.println("Case2");
        System.out.println("Case3");
        try{
        int a =50/0;}
        catch (Exception e){
            System.out.println("Exception Handled");
        }
        finally{
            System.out.println("Final block called ");
        }
        System.out.println("Case4");
        System.out.println("Case5");
    }
}
