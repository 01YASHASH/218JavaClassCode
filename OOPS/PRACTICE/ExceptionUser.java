package PRACTICE;
class Employee{
    int emp_id;
    String name;
    Employee(int emp_id,String name)throws InvalidEmployeeId{
        if(emp_id<=0){
            throw new InvalidEmployeeId("Employee ID cannot be negative or zero");
        }
        this.emp_id=emp_id;
        this.name=name;
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Employee Name: "+name);
    }
}
public class ExceptionUser {
    public static void main(String args[]){
        try{
            Employee e=new Employee(-101,"Yashash");
        }
        catch(InvalidEmployeeId e){
            System.out.println(e);
        }
    }    
}
