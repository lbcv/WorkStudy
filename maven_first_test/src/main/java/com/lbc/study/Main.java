package com.lbc.study;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(getCurrentPath1());// D:eclipseJavaWorkspaceeclipse202006WorkspaceHelloin
//        System.out.println(new Hello01().getCurrentPath2());// D:eclipseJavaWorkspaceeclipse202006WorkspaceHelloinp01
//        System.out.println(getCurrentPath3());// D:eclipseJavaWorkspaceeclipse202006WorkspaceHello
        System.out.println(getCurrentPath4());// file:/D:/eclipseJavaWorkspace/eclipse202006Workspace/Hello/bin/
        System.out.println(getCurrentPathtest());// file:/D:/eclipseJavaWorkspace/eclipse202006Workspace/Hello/bin/
//        System.out.println(getCurrentPath5());// D:eclipseJavaWorkspaceeclipse202006WorkspaceHelloin
//        System.out.println(getCurrentPath6());// D:eclipseJavaWorkspaceeclipse202006WorkspaceHello
//        System.out.println(getCurrentPath7());// /D:/eclipseJavaWorkspace/eclipse202006Workspace/Hello/bin/

        /* 结果：
D:eclipseJavaWorkspaceeclipse202006WorkspaceHelloin
D:eclipseJavaWorkspaceeclipse202006WorkspaceHelloinp01
D:eclipseJavaWorkspaceeclipse202006WorkspaceHello
file:/D:/eclipseJavaWorkspace/eclipse202006Workspace/Hello/bin/
D:eclipseJavaWorkspaceeclipse202006WorkspaceHelloin
D:eclipseJavaWorkspaceeclipse202006WorkspaceHello
D:eclipseJavaWorkspaceeclipse202006WorkspaceHelloin
        */
    }

    // 获取当前类的所在工程路径;
//    public static String getCurrentPath1() {
//        File f = new File(Hello01.class.getResource("/").getPath());
//        return f.getPath();
//    }

    // 获取当前类的绝对路径；
    public String getCurrentPath2() {
        File f = new File(this.getClass().getResource("").getPath());
        return f.getPath();
    }

    // 获取当前类的所在工程路径;
    public static String getCurrentPath3() {
        File directory = new File("");// 参数为空
        // getCanonicalPath()返回的就是标准的将符号完全解析的路径
        String courseFile = "";
        try {
            courseFile = directory.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseFile;
    }

    // 获取当前类的所在工程路径;
    // file:/D:/eclipseJavaWorkspace/eclipse202006Workspace/Hello/bin/
    public static String getCurrentPath4() {
        URL path = Thread.currentThread().getContextClassLoader().getResource("");

        return path.toString();
    }
    public static String getCurrentPathtest() {
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("users.properties");

        return resourceAsStream.toString();
    }

    public static String getCurrentPath5() {
        return System.getProperty("java.class.path");
    }

    public static String getCurrentPath6() {
        return System.getProperty("user.dir");
    }

    public static String getCurrentPath7() {
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();// /D:/eclipseJavaWorkspace/eclipse202006Workspace/Hello/bin/
        String p = new File(path).getAbsolutePath();// D:eclipseJavaWorkspaceeclipse202006WorkspaceHelloin
        return p;
    }

}