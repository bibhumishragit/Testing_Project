package Java_Programs;

import java.sql.SQLOutput;

class Child_Class extends Base_Class {
    private String department;

    public Child_Class(String name, int id, double salary, String department) {
        super(name, id, salary); // Call base class constructor
        this.department = department;
        String s="Adyasha";
        System.out.println("Before S hashcode::"+s.hashCode());
        s=s+" Mishra";
        System.out.println("s hashcode::"+s.hashCode());
        StringBuilder sb=new StringBuilder("Bibhu");
        System.out.println("Before sb hashcode::"+sb.hashCode());
        sb=sb.append(" Prasad").append(" Mishra");
        System.out.println("After sb hashcode::"+sb.hashCode());
        System.out.println("StringBuilder sb value::"+sb);
    }
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call base method
        System.out.println("Department : " + department);
    }
    @Override
    public double calculateBonus() {
        return salary * 0.20; // Managers get 20% bonus
    }
    @Override
    public double newsalary(){
        double new_Salary=calculateBonus()+salary;
        //super.newsalary();
        return new_Salary;
    }
}