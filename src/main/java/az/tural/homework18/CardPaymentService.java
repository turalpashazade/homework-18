package az.tural.homework18;

import org.springframework.stereotype.Service;

@Service
public class CardPaymentService implements PaymentService {
    @Override
    public void pay(String orderId) {
        System.out.println("Payment completed for order: " + orderId);
    }
}
