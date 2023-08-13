package com.lbc.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringNacos {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
        UserService bean = annotationConfigApplicationContext.getBean(UserService.class);
        bean.test();
    }
}
