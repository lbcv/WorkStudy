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
        LOG.trace("trace");
        LOG.debug("debug");
        LOG.info("info");
        LOG.warn("warn");
        LOG.error("error");
//        - com.test
//            |- subpackage
//                |- SubLogger
    //当在SubLogger中记录了一条日志消息时，如果在com.example的Logger上配置了相应的日志级别，那么该消息会在SubLogger和com.example两个Logger上都被记录。



    }

    @Test
    public void systemTest() {
        System.out.println("TRACE（追踪）");
        System.out.println("DEBUG（调试）");
        System.out.println("INFO（信息）");
        System.out.println("WARN（警告）");
        System.out.println("ERROR（错误）");
        System.out.println("FATAL（严重错误）");
    }
}
