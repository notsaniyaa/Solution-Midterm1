package main.ui;

import main.payment.PaymentFactory;
import main.payment.PaymentMethod;
import main.adapter.PaymentAdapter;
import main.transaction.Transaction;
import main.transaction.TransactionLogger;

import java.util.Scanner;
import java.util.UUID;

public class OnlinePaymentGateway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionLogger logger = new TransactionLogger();

        System.out.println("Welcome to the Online Payment Gateway!");
        System.out.println("Available payment methods: creditcard, paypal, crypto");
        System.out.print("Enter payment method: ");
        String method = scanner.nextLine();

        System.out.print("Enter amount to pay: $");
        double amount = scanner.nextDouble();

        PaymentMethod payment;
        if (method.equalsIgnoreCase("external")) {
            payment = new PaymentAdapter("External Service");
        } else {
            payment = PaymentFactory.getPaymentMethod(method);
        }

        try {
            payment.processPayment(amount);
            Transaction transaction = new Transaction(UUID.randomUUID().toString(), amount, "Completed");
            logger.logTransaction(transaction);
        } catch (Exception e) {
            Transaction transaction = new Transaction(UUID.randomUUID().toString(), amount, "Failed");
            logger.logTransaction(transaction);
            System.out.println("Error processing payment: " + e.getMessage());
        }

        System.out.println("\nTransaction History:");
        logger.printAllTransactions();
    }
}