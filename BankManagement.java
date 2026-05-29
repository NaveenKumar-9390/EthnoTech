class Bank {
    int balance = 20000;
    void checkBalance() {
        System.out.println("Balance = " + balance);
    }
}
class Customer extends Bank {
    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited = " + amount);
    }
    void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Withdrawn = " + amount);
    }
}
public class BankManagement {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.checkBalance();
        c.deposit(1000);
        c.checkBalance();
        c.withdraw(500);
        c.checkBalance();
    }
}