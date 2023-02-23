package peak.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component("duck5")
@Data
public class Duck5 {
    private Egg6 egg6;


    public Duck5() {
    }

    public Duck5(Egg6 egg6) {
        this.egg6 = egg6;
    }

    @Override
    public String toString() {
        return ", в утке яйцо 🥚"+egg6.toString();

    }
}
