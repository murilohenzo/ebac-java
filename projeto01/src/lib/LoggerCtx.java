package lib;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerCtx {

    public LoggerCtx() {
        // TODO document why this constructor is empty
    }

    public void createLogger(String className, Level level, String message) {
        Logger logger = Logger.getLogger(className);
        logger.log(level, message);
    }
}
