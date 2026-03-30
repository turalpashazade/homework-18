package az.tural.homework18;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    public Car(@Qualifier("dieselEngine") Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car is driving with " + engine.type());
    }
}
