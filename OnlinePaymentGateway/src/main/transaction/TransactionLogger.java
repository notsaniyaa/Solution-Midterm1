package main.transaction;
import java.util.ArrayList;
import java.util.List;

public class TransactionLogger {
    private final List<Transaction> transactions = new ArrayList<>();

    public void logTransaction(Transaction transaction) {
        transactions.add(transaction);
        System.out.println("Transaction logged: " + transaction);
    }

    public void printAllTransactions() {
        for (Transaction t : transactions) {
            t.printTransaction();
            System.out.println("-----------------");
        }
    }
}