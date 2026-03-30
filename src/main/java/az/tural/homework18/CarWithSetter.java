package az.tural.homework18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarWithSetter {
    private Engine engine;

    @Autowired
    public void setEngine(@Qualifier("petrolEngine") Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("CarWithSetter is driving with " + engine.type());
    }
}
