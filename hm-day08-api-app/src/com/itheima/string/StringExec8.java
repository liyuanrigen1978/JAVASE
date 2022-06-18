package com.itheima.string;

import java.util.Scanner;

/**
    练习题：手机号码屏蔽
 */
public class StringExec8 {
//    public static void main(String[] args) {
//        // 1、键盘录入一个手机号码
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请您输入您的手机号码：");
//        String tel = sc.next();
//
//        // 2、截取号码的前三位，后四位    18665666520
//        String before = tel.substring(0, 3); // 0  1  2
//        String after = tel.substring(7);  // 从索引7开始截取到手机号码的末尾
//
//        String s = before + "****" + after;
//        System.out.println(s);
//    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //13805028827
        System.out.println("请输入您的电话");
        String phoneNumber = s.next();

        String firtNumber = phoneNumber.substring(0,3);
        String lastNumber = phoneNumber.substring(7);

        String newPhoneNumber = firtNumber + "****" + lastNumber;
        System.out.println(newPhoneNumber);

    }

























}
