package com.itguigu.java;

import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-05-15 17:36
 */
public class ScannerTest {
    public static void main(String[] args){
        //2.Scanner的实例化
        Scanner scan = new Scanner(System.in);

        //3.调用Scanner类的相关方法
        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的芳龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否相中我了呢？(true/false)");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        //对于char型的获取，Scanner没有提供相关的方法。只能获取一个字符串
        System.out.println("请输入你的性别：(男/女)");
        String gender = scan.next();//"男"
        char genderChar = gender.charAt(0);//获取索引为0位置上的字符
        System.out.println(genderChar);


    }
}
