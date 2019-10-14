package cz.cvut.fit.glazafil;

import cz.cvut.fit.glazafil.services.LoggerService;

public class Logger {

    private LoggerService service;

    Logger(LoggerService service) {
        this.setService(service);
    }

    public LoggerService getService() {
        return service;
    }

    public void setService(LoggerService service) {
        this.service = service;
    }

    public void log(String msg, Level level) {
        service.log(msg, level);
    }
}
