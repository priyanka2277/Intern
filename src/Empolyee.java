public class Empolyee {
    private String name;
    private int age;
    private String department;
    private double salary;
    public Empolyee(String name,int age,String department,double salary){
        this.name=name;
        this.age=age;
        this.department=department;
        this.salary=salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public void raiseSalary(double percentage){
        this.salary=this.salary+this.salary*(percentage/100);
    }
    public void displayEmpolyeeInfo(){
        System.out.println("Empolyee Information:");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Department:"+department);
        System.out.println("Salary:$"+salary);
    }

}
