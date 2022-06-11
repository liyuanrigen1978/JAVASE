package com.liyuan.scanner;


import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-06-11 15:39
 */


/*
API （Application Programming Interface,应用程序编程接口）
    1 Java写好的程序(功能代码)，咱们可以直接调用
    2 Oracle 也为Java写好的程序提供了相应的 API文档(技术使用说明书)
键盘录入功能实现的三个步骤：
    ①：导包：告诉程序去JDK的哪个包中找扫描器技术
    ②：写一行代码代表得到键盘扫描器对象。
    ③：等待接收用户输入数据。


 */
public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数字");
        int a = scan.nextInt();
        System.out.println("您输入的数字是" + a + '\n');

        System.out.println("请输入您的名字");
        String name = scan.next();
        System.out.println("您的名字是" + name);


    }
}
