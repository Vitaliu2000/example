package logi.ex02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerConfigExample {
    private static Logger logger = LoggerFactory.getLogger(LoggerConfigExample.class);
    private long counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new LoggerConfigExample().loop();
    }

    public void loop() throws InterruptedException {
        while(true) {
            logger.info("Текст, который должен попасть в лог файл");
            logger.info("info level:{}", counter);
            logger.error("error level:{}", counter);
            counter++;
            Thread.sleep(2_000);
            break;
        }
    }
}
