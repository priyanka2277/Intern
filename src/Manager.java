public class Manager extends Empolyee{
    private double bonus;
    public Manager(String name,int age,String department,double salary,double bonus){
        super(name,age,department,salary);
        this.bonus=bonus;
    }
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public double getBonus(){
        return bonus;
    }
    public double calculateTotalSalary(){
        return getSalary()+bonus;
    }
    @Override
    public void displayEmpolyeeInfo(){
        super.displayEmpolyeeInfo();
        System.out.println("Bonus:$"+bonus);
        System.out.println("Total salary:$"+calculateTotalSalary());

    }

}
