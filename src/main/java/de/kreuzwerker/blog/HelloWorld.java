package de.kreuzwerker.blog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    public static void log() {
        logger.error("Hello, World!");
    }
}