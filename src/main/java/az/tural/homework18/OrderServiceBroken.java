package az.tural.homework18;

public class OrderServiceBroken {
    private final PaymentService paymentService;
    private final DeliveryServiceWithoutAnnotation deliveryService;

    public OrderServiceBroken(PaymentService paymentService, DeliveryServiceWithoutAnnotation deliveryService) {
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
    }

    public void processOrder(String orderId) {
        paymentService.pay(orderId);
        deliveryService.deliver(orderId);
    }
}
