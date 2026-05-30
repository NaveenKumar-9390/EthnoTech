class Ride {
    void bookRide(){
        System.out.println("Ride booked successfully!");
    }
}
class Auto extends Ride {
    @Override
    void bookRide() {
        int distance = 2;
        int price = 180;
        System.out.println("Auto booked successfully!");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Price: " + price + " INR");
        System.out.println();
    }
}
class Car extends Ride {
    @Override
    void bookRide() {
        int distance = 2;
        int price = 250;
        System.out.println("Car booked successfully!");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Price: " + price + " INR");
        System.out.println();
    }
}
class Bike extends Ride {
    @Override
    void bookRide() {
        int distance = 2;
        int price = 80;
        System.out.println("Bike booked successfully!");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Price: " + price + " INR");
        System.out.println();
    }
}
public class RideBooking {
    public static void main(String[] args){
        Ride customer;
        customer = new Auto();
        customer.bookRide();
        customer = new Car();
        customer.bookRide();
        customer = new Bike();
        customer.bookRide();

    }
}
