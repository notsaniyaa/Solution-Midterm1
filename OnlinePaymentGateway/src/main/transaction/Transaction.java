package main.transaction;
import java.time.LocalDateTime;

public class Transaction {
    private final String id;
    private final double amount;
    private final LocalDateTime timestamp;
    private final String status;

    public Transaction(String id, double amount, String status) {
        this.id = id;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.status = status;
    }

    public void printTransaction() {
        System.out.println("Transaction ID: " + id);
        System.out.println("Amount: $" + amount);
        System.out.println("Time: " + timestamp);
        System.out.println("Status: " + status);
    }
}
