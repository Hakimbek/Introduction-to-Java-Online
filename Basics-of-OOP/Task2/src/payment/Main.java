package payment;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(new ArrayList<>(Arrays.asList(
            new Payment.Product("Apple", 5.0, 2),
            new Payment.Product("Phone", 1200.0, 1),
            new Payment.Product("Pen", 0.5, 5),
            new Payment.Product("T-short", 15.0, 3)
        )));

        payment.pay();
    }
}
