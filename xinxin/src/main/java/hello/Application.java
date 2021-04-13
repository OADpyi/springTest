package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService moMessageService() {
        return new MessageServiceImpl();
    }
    
    
}