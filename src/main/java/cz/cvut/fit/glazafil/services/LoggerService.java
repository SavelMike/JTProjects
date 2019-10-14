package cz.cvut.fit.glazafil.services;

import cz.cvut.fit.glazafil.Level;

public interface LoggerService {

    void log(String msg, Level level);

    void debug(String msg);

    void info(String msg);

    void warn(String msg);

    void error(String msg);


}
