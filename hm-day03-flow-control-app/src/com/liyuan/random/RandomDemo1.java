package com.liyuan.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
//        // 目标：学会使用Java提供的随机数类Random
//        // 1、导包
//        // 2、创建随机数对象
//        Random r = new Random();
//
//        // 3、调用nextInt功能（方法）可以返回一个整型的随机数给你
//        for (int i = 0; i < 20; i++) {
//            int data = r.nextInt(10); // 0 - 9 不包含10的（包前不包后）
//            System.out.println(data);
//        }
//
//        System.out.println("-----------------------");

        //Random生成区间随机数的技巧：减加法。
//        // 1 - 10 ==> -1 ==> (0 - 9) + 1
//        int data = r.nextInt(10) + 1;
//        System.out.println(data);
//
//        // 3 - 17 ==> -3 ==> (0 - 14) + 3
//        int data1 = r.nextInt(15) + 3;
//        System.out.println(data1);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int data = random.nextInt(10);
            System.out.println("随机生成了" + data);
        }

        System.out.println("-----------------------");
        for (int i = 0; i < 10; i++) {
            //生成23-35之间的随机数 35-23=12
            int data = random.nextInt(13)+23;
            System.out.println(data);
        }






    }
}
