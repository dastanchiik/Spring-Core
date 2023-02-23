package peak.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wood3")
public class Wood3 {
    private Rabbit4 rabbit4;

    public Wood3(){}

    @Autowired
    public Wood3(Rabbit4 rabbit4) {
        this.rabbit4 = rabbit4;
    }

    @Override
    public String toString() {
        return ", на дереве заяц 🐇"+rabbit4.toString();

    }
}
