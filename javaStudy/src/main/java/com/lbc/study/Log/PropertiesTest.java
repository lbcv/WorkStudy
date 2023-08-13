package com.lbc.study.Log;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        System.out.println(properties);

        properties.load(new FileReader("/Users/mao/Learn/ideaProject/javaStudy/src/main/java/com/lbc/study/users.properties"));
        System.out.println(properties);
        System.out.println(properties.getProperty("张无忌"));
    }
}
