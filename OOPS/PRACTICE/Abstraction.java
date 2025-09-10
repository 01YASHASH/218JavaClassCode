package PRACTICE;
abstract class College {
    abstract void Register();
    abstract void Infra();
    abstract void Student();
    abstract void Faculty();
    void medicalFacility() {
        System.out.println("Medical Facility is optional");
    }
}
class KIIET extends College {
    void Register() {
        System.out.println("Register for KIET");
    }
    void Infra() {
        System.out.println("Good Infrastructure");
    }
    void Student() {
        System.out.println("Many Students");
    }

    void Faculty() {
        System.out.println("Many Faculties");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        College colg = new KIIET(); 
        colg.Register();
        colg.Infra();
        colg.Student();
        colg.Faculty();
        colg.medicalFacility();
    }
}
