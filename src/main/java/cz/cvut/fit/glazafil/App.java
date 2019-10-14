package cz.cvut.fit.glazafil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Logger logger = ctx.getBean(Logger.class);
        logger.log("Error", Level.ERROR);
    }
}
