package cz.cvut.fit.glazafil;

import cz.cvut.fit.glazafil.services.LoggerService;
import cz.cvut.fit.glazafil.services.MailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Logger logger(){
        return new Logger(loggerService());
    }

    @Bean
    public LoggerService loggerService() {
        return new MailService();
    }

}
