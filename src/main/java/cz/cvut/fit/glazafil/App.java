package cz.cvut.fit.glazafil;

import cz.cvut.fit.glazafil.services.LoggerService;
import cz.cvut.fit.glazafil.services.MailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Logger logger = (Logger) context.getBean("logger");
        logger.log("Error", Level.ERROR);
    }
}
