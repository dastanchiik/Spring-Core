package peak;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peak.configuration.AppConfig;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless koscheiTheDeathless = (KoscheiTheDeathless) an.getBean("koschei");
        System.out.println(koscheiTheDeathless.getRulesByDeath());
    }
}
