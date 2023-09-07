package com.lbc.study;

//import org.apache.log4j.*;
//import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.PrintWriter;

public class TestLog4j {

   private static final Logger LOG = Logger.getLogger(TestLog4j.class);
    @Test
    public void TestLog4j() {
//        BasicConfigurator.configure();
//        Logger root = Logger.getRootLogger();
//        ConsoleAppender consoleAppender = new ConsoleAppender();
//        consoleAppender.setWriter(new PrintWriter(System.out));
//
//        Layout layout = new PatternLayout();
//        consoleAppender.setLayout(layout);
//        root.addAppender(consoleAppender);
        LOG.trace("trace");
        LOG.debug("debug");
        LOG.info("info");
        LOG.warn("warn");
        LOG.error("error");
    }
}
