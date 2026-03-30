package az.tural.homework18;

import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
    public void deliver(String orderId) {
        System.out.println("Delivery arranged for order: " + orderId);
    }
}
