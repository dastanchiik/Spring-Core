package peak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import peak.model.Ocean1;

@Component("koschei")
public class KoscheiTheDeathless {
    private Ocean1 ocean1;
    @Autowired
    public KoscheiTheDeathless(Ocean1 ocean1) {
        this.ocean1 = ocean1;
    }

    public String getRulesByDeath() {
        return "На свете есть океан 🌊 , "+ocean1.toString();

    }
}
