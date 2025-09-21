import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {
    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args){
        logger.debug("This is debug");
        logger.warn("This is warning log");
        logger.error("This is error");
        logger.info("This is info");
    }
}
