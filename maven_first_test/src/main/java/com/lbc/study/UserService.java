package com.lbc.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Value("${spring.databases.username}")
    private String username;

    public void test(){
        System.out.println(username);
    }
}
