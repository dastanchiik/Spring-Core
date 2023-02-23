package peak.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("island2")
public class Island2 {
    private Wood3 wood3;

    public Island2(){

    }
    @Autowired
    public Island2(Wood3 wood3) {
        this.wood3 = wood3;
    }

    @Override
    public String toString() {
        return ", на острове дерево 🌳"+wood3.toString();

    }
}
