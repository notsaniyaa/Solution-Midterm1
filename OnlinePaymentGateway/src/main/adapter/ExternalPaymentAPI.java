package main.adapter;

public class ExternalPaymentAPI {
    public boolean sendPayment(String method, double amount) {
        System.out.println("[External API] Processing " + method + " payment of $" + amount);
        return true;
    }
}

