class Employee {
    String name = "Naveen";
    int id = 101;
	String role = "Software";
	float salary = 80000;
}
class Manager extends Employee {
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
		System.out.println("Employee Role : " + role);
		System.out.println("Employee Salary: " + salary); 
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
    }
}