//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empolyee e1=new Empolyee("priya",22,"it",2000);
        Manager m1=new Manager("surav",23,"Management",20000,2000);
        System.out.println("Information before salary raise");
        e1.displayEmpolyeeInfo();
        m1.displayEmpolyeeInfo();
        //Raise the salaryy of empolyee
        m1.raiseSalary(10);
        e1.raiseSalary(10);
        System.out.println("Information after salary raised");
        e1.displayEmpolyeeInfo();
        m1.displayEmpolyeeInfo();

    }
}