package peak.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peak.model.Deth8;
import peak.model.Duck5;
import peak.model.Egg6;
import peak.model.Needle7;

@Configuration
@ComponentScan(basePackages = "peak")
public class AppConfig {
    @Bean
    public static Duck5 duck5(Egg6 egg6) {
        return new Duck5(egg6);
    }
    @Bean
    public static Egg6 egg6(Needle7 needle7) {
        return new Egg6(needle7);
    }
    @Bean
    public static Needle7 needle7 (Deth8 deth8){
        return new Needle7(deth8);
    }
    @Bean
    public static Deth8 deth8 (){
        return new Deth8();
    }


}
