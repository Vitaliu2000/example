package logi.ex03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerRollingPolicyExample {
    private static Logger logger = LoggerFactory.getLogger(LoggerRollingPolicyExample.class);
    private long counter = 0;

    public static void main(String[] args) {
        new LoggerRollingPolicyExample().loop();
    }

    public void loop() {
        while(true) {
            logger.warn("message warn for file:{}", counter);
            logger.info("message info for file:{}", counter);
            logger.error("message error for file:{}", counter);
            logger.debug("message debug for file:{}", counter);
            logger.trace("message trace for file:{}", counter);

            counter++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            break;
        }
    }
}
