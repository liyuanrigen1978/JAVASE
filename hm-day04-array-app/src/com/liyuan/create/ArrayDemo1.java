package com.liyuan.create;

/**
 * @author liyuan_start
 * @create 2022-06-11 22:58
 */

/*
数据类型[]  数组名 = { 元素1，元素2 ，元素3，… };
    int[] ages = {12, 24, 36, 48, 60};
    double[] scores = {89.9, 99.5, 59.5};




 */


public class ArrayDemo1 {
    public static void main(String[] args) {
        // 目标：学会使用静态初始化的方式定义数组
        // 数据类型[] 数组名称 = new 数据类型[]{元素1,元素2,...}
        // double[] scores = new double[]{99.5, 88.0, 75.5};
        double[] scores = {99.5, 88.0, 75.5}; // 简化写法

        // int[] ages = new int[]{12, 24, 36};
        int[] ages = {12, 24, 36};

        // String[] names = new String[]{"牛二", "全蛋儿", "老王"};
        String[] names = {"牛二", "全蛋儿", "老王"};

        System.out.println(names);
    }
}
