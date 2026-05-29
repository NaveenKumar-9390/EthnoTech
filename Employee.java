class Employee {
    String name = "Naveen";
    int id = 101;
}
class Manager extends Employee {
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
    }
}