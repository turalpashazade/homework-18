package az.tural.homework18;

import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements Engine {
    @Override
    public String type() {
        return "Diesel engine";
    }
}
