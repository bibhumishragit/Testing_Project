package Java_Programs;

public class inherit {
    public static void main(String[] args) {
        Child_Class mgr = new Child_Class("Bibhu Prasad", 201, 80000, "Automation QA");
        Base_Class emp= new Base_Class("Adyasha Mishra", 101, 50000);

        System.out.println("=== Employee Details ===");
        //emp.displayDetails();
        System.out.println("Bonus      : ₹" + emp.calculateBonus());
        //emp.newsalary();
        System.out.println("New Salary : ₹" + emp.newsalary());

        System.out.println("\n=== Manager Details ===");
        //mgr.displayDetails();
        System.out.println("Bonus      : ₹" + mgr.calculateBonus());
        //mgr.newsalary();
        System.out.println("New Salary : ₹" + mgr.newsalary());
    }
}

