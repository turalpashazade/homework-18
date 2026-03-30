package az.tural.homework18;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CardPaymentService.class)
public class BrokenConfig {

    @Bean
    public OrderServiceBroken orderServiceBroken(PaymentService paymentService,
                                                 DeliveryServiceWithoutAnnotation deliveryService) {
        return new OrderServiceBroken(paymentService, deliveryService);
    }
}
