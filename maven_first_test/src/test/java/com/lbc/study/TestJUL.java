package com.lbc.study;

import org.junit.Test;

import java.io.IOException;
import java.util.logging.*;

public class TestJUL {

    public static final Logger LOGGER = Logger.getLogger("myLog");
    @Test
    public void testJUL() throws IOException {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new SimpleFormatter());
        consoleHandler.setLevel(Level.ALL);
        //构建一个fileHandle
        FileHandler fileHandler = new FileHandler("/Users/mao/Learn/ideaProject/maven_first_test/src/test/java/com/lbc/study/test.log",true);
        fileHandler.setFormatter(new SimpleFormatter());
        fileHandler.setLevel(Level.WARNING);




        //
        LOGGER.setLevel(Level.ALL);
        LOGGER.setUseParentHandlers(false);
        LOGGER.addHandler(consoleHandler);
        LOGGER.addHandler(fileHandler);
        LOGGER.severe("severe");
        LOGGER.warning("warning");
        LOGGER.info("info");
        LOGGER.config("config");
        LOGGER.fine("fine");
        LOGGER.finer("finer");
        LOGGER.finest("finest");
    }

    @Test
    public void testParent() {
        Logger logger = Logger.getLogger(TestJUL.class.getName());
        Logger younglogger = Logger.getLogger("com.lbc");
        System.out.println(logger.getParent().getName());


        younglogger.info("info");
        younglogger.config("config");

    }

    @Test
    public void testJULFormat() throws IOException {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        consoleHandler.setFormatter(simpleFormatter);
        consoleHandler.setLevel(Level.ALL);
//        //构建一个fileHandle
//        FileHandler fileHandler = new FileHandler("/Users/mao/Learn/ideaProject/maven_first_test/src/test/java/com/lbc/study/test.log",true);
//        fileHandler.setFormatter(new SimpleFormatter());
//        fileHandler.setLevel(Level.WARNING);


        LOGGER.setLevel(Level.ALL);
//        LOGGER.setUseParentHandlers(false);
        LOGGER.addHandler(consoleHandler);
//        LOGGER.addHandler(fileHandler);
        LOGGER.severe("severe");
        LOGGER.warning("warning");
        LOGGER.info("info");
        LOGGER.config("config");
        LOGGER.fine("fine");
        LOGGER.finer("finer");
        LOGGER.finest("finest");
    }
}
