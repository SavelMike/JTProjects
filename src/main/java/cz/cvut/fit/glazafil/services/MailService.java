package cz.cvut.fit.glazafil.services;

import cz.cvut.fit.glazafil.Level;

public class MailService implements LoggerService {

    private final String service = "[E-mail]";

    public void log(String msg, Level level) {
        System.out.println(service + level + msg);
    }

    public void debug(String msg) {
        System.out.println(service + Level.DEBUG + msg);
    }

    public void info(String msg) {
        System.out.println(service + Level.INFO + msg);
    }

    public void warn(String msg) {
        System.out.println(service + Level.WARN + msg);
    }

    public void error(String msg) {
        System.out.println(service + Level.ERROR + msg);
    }
}
