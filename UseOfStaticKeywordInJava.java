package student;
public class StudentDB {
    static String UNIVERSITY = " RGPV";
    int roll_num ;
    String name;
    StudentDB(int roll , String n){
        roll_num = roll;
        name = n;
    }
    void getdata(){
        System.out.println("Student's name is : "+name);
        System.out.println("Student's roll number is : "+roll_num);
    }
    static void change(){
        UNIVERSITY  = "BGIEM";
    }
    public static void main(String[] args) {
        StudentDB s = new StudentDB(203 , "Soniya");
        System.out.println("Student's university is "+StudentDB.UNIVERSITY);
        s.getdata();
        StudentDB.change();
        System.out.println("Student's university is "+StudentDB.UNIVERSITY);
    }
}
