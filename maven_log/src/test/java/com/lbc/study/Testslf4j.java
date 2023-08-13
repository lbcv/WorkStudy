package com.lbc.study;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Testslf4j {

    private static final Logger LOG = LoggerFactory.getLogger(Testslf4j.class);
    @Test
    public void Testslf4j() {
//        BasicConfigurator.configure();
//        Logger root = Logger.getRootLogger();
//        ConsoleAppender consoleAppender = new ConsoleAppender();
//        consoleAppender.setWriter(new PrintWriter(System.out));
//
//        Layout layout = new PatternLayout();
//        consoleAppender.setLayout(layout);
//        root.addAppender(consoleAppender);
        LOG.info("log");
        LOG.debug("debug");
        LOG.warn("war");


    }
}
