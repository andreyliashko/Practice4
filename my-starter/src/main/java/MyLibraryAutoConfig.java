import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryAutoConfig {
    @Bean
   MyLibraryClass MyLibraryClass(){
        return new MyLibraryClass();
    }
    @Bean
    @ConditionalOnProperty(value = "value", havingValue = "default")
    ComponentOnPropertyValue defaultComponent() {
        return new ComponentOnPropertyValue();
    }

}
