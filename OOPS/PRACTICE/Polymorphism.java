package PRACTICE;
class EmployeePoly{
    String emp_name;
    //Method Overloading
    void Details(){
        System.out.println("Employee Name: "+emp_name);
    }
    void Details(int salary){
        System.out.println("Employee Salary: "+salary);
    }
    void Details(String company){
        System.out.println("Institute name: "+company);
    }
}
class Faculty extends EmployeePoly{
    void Details(){
        System.out.println("Welcome to Faculties.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        EmployeePoly ep=new EmployeePoly();
        // ep.emp_name="Yashash";
        // ep.Details();
        // ep.Details(50000);
        // ep.Details("KIET Group of Institutions");
        Faculty f=new Faculty();
        f.emp_name="SAKSHAM";
        f.Details();
    }
}
