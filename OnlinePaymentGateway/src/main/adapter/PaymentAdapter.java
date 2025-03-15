package main.adapter;

import main.payment.PaymentMethod;

public class PaymentAdapter implements PaymentMethod {
    private final ExternalPaymentAPI externalAPI;
    private final String method;

    public PaymentAdapter(String method) {
        this.externalAPI = new ExternalPaymentAPI();
        this.method = method;
    }

    @Override
    public void processPayment(double amount) {
        boolean success = externalAPI.sendPayment(method, amount);
        if (success) {
            System.out.println("Payment of $" + amount + " via " + method + " was successful.");
        } else {
            System.out.println("Payment failed.");
        }
    }
}
