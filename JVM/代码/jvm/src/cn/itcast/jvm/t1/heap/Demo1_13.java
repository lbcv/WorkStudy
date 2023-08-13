package cn.itcast.jvm.t1.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示查看对象个数 堆转储 dump
 */
public class Demo1_13 {

    public static void main(String[] args) throws InterruptedException {
        List<Log> students = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            students.add(new Log());
//            Student student = new Student();
        }
        Thread.sleep(1000000000L);
    }
}
class Log {
    private byte[] big = new byte[1024*1024];
}
