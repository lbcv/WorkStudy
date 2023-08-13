package com.lbc.study;

import com.alibaba.fastjson2.JSONArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BigLog {
    @Test
    public void bigLog() throws InterruptedException {
        JSONArray objects = new JSONArray();
        for (int i = 0; i < 200; i++) {
            objects.add(new Log());
            System.out.println(i);

        }
        Thread.sleep(1000000000L);
    }


}
class Log {
    private byte[] big = new byte[1024*10240];
}
