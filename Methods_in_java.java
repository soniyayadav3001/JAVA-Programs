package employee;
public class EmployeeDB {
    int id;
    String name;
    double salary;
    void setId(int ID){
        id = ID;
    }
    int getId(){
        return id;
    }
    void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }
    void setSalary(double sal){
        salary = sal;
    }
    double getSalary(){
        return salary;
    }
    public static void main(String[] args) {
        EmployeeDB obj = new EmployeeDB();
        obj.setId(03);
        obj.setName("Soniya");
        obj.setSalary(50000.76);
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }
}
