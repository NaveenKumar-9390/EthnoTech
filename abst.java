abstract class Foodorder {
    String customerName;
    int quantity;
    double price;
    Foodorder(String name, int quantity, double price) {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }
    abstract void orderFood();
    void generateBill() {
        double total = quantity * price;
        System.out.println("Total Bill = " + total);
    }
}
class PizzaOrder extends Foodorder {
    PizzaOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }
    @Override
    void orderFood() {
        System.out.println("Pizza Order Confirmed!");
    }
    @Override
    void generateBill() {
        double total = quantity * price;
        System.out.println("----- Order Details -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : " + price);
        System.out.println("Total Bill    : " + total);
    }
}
public class abst {
    public static void main(String[] args) {
        PizzaOrder p = new PizzaOrder("Naveen", 4, 365);
        p.orderFood();
        p.generateBill();
    }
}