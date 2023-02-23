package peak.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ocean1")
public class Ocean1 {
    private Island2 island2;

    public Ocean1() {
    }

    @Autowired
    public Ocean1(Island2 island2) {
        this.island2 = island2;
    }

    @Override
    public String toString() {
        return "на океане остров 🏝"+island2.toString();

    }
}
