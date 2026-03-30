package az.tural.homework18;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final PaymentService paymentService;
    private final DeliveryService deliveryService;

    public OrderService(PaymentService paymentService, DeliveryService deliveryService) {
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
    }

    public void processOrder(String orderId) {
        System.out.println("Order started: " + orderId);
        paymentService.pay(orderId);
        deliveryService.deliver(orderId);
        System.out.println("Order completed: " + orderId);
    }
}
