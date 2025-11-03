package Java_Programs;

class Base_Class {
    protected String name;
    protected int id;
    protected double salary;
    public Base_Class(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : ₹" + salary);
    }
    public double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }
    public double newsalary(){
        double new_Salary=calculateBonus()+salary;
        System.out.println("Base_Class New Salary::::");
        return new_Salary;
    }
}

