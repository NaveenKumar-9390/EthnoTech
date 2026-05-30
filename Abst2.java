abstract class FoodOrder {
    String customerName;
    int quantity;
    double price;

    FoodOrder(String customerName, int quantity, double price) {
        this.customerName = customerName;
        this.quantity = quantity;
        this.price = price;
    }
    abstract void orderFood();
    void generateBill() {
        double total = quantity * price;

        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : " + price);
        System.out.println("Total Bill    : " + total);
        System.out.println("--------------------------");
    }
}
class RestaurantOrder extends FoodOrder {
    String foodName;
    RestaurantOrder(String customerName, String foodName,
                    int quantity, double price) {
        super(customerName, quantity, price);
        this.foodName = foodName;
    }
    void orderFood() {
        System.out.println("Food Ordered : " + foodName);
    }
}
public class Abst2 {
    public static void main(String[] args) {

        RestaurantOrder c1 = new RestaurantOrder("Naveen", "Pizza", 2, 300);
        RestaurantOrder c2 = new RestaurantOrder("Rahul", "Burger", 1, 120);
        RestaurantOrder c3 = new RestaurantOrder("Kiran", "Biryani", 2, 250);
        RestaurantOrder c4 = new RestaurantOrder("Teja", "Noodles", 1, 150);
        RestaurantOrder c5 = new RestaurantOrder("Sai", "Pasta", 2, 180);
        RestaurantOrder c6 = new RestaurantOrder("Arjun", "Sandwich", 3, 100);
        RestaurantOrder c7 = new RestaurantOrder("Varun", "Fries", 2, 80);
        RestaurantOrder c8 = new RestaurantOrder("Charan", "Ice Cream", 4, 90);
        RestaurantOrder c9 = new RestaurantOrder("Lokesh", "Juice", 2, 70);
        RestaurantOrder c10 = new RestaurantOrder("Vijay", "Dosa", 3, 60);

        c1.orderFood(); c1.generateBill();
        c2.orderFood(); c2.generateBill();
        c3.orderFood(); c3.generateBill();
        c4.orderFood(); c4.generateBill();
        c5.orderFood(); c5.generateBill();
        c6.orderFood(); c6.generateBill();
        c7.orderFood(); c7.generateBill();
        c8.orderFood(); c8.generateBill();
        c9.orderFood(); c9.generateBill();
        c10.orderFood(); c10.generateBill();
    }
}