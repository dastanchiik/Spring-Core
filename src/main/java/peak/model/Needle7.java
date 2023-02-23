package peak.model;

import org.springframework.stereotype.Component;

@Component("needle7")
public class Needle7 {
    private Deth8 deth8;
    public  Needle7(){}
    public Needle7(Deth8 deth8) {
        this.deth8 = deth8;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( 😈"+deth8.toString();

    }
}
