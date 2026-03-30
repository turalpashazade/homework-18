package az.tural.homework18;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        runSuccessfulDemos();
        runMissingAnnotationDemo();
    }

    private static void runSuccessfulDemos() {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            System.out.println("1) Setter injection demo:");
            CarWithSetter carWithSetter = context.getBean(CarWithSetter.class);
            carWithSetter.drive();

            System.out.println("\n2) Constructor injection + @Qualifier demo:");
            Car car = context.getBean(Car.class);
            car.drive();

            System.out.println("\n3) Order processing demo:");
            OrderService orderService = context.getBean(OrderService.class);
            orderService.processOrder("ORD-1001");
        }
    }

    private static void runMissingAnnotationDemo() {
        System.out.println("\n4) Remove annotation demo:");
        try (AnnotationConfigApplicationContext brokenContext =
                     new AnnotationConfigApplicationContext(BrokenConfig.class)) {
            brokenContext.getBean(OrderServiceBroken.class).processOrder("ORD-2001");
        } catch (Exception e) {
            System.out.println("Expected error happened.");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}
