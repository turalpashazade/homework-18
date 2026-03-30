package az.tural.homework18;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine {
    @Override
    public String type() {
        return "Petrol engine";
    }
}
