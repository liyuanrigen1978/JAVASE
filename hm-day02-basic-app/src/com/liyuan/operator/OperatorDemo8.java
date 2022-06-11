package com.liyuan.operator;


/*
三元运算符介绍

条件表达式 ?  值1 : 值2;

执行流程：首先计算关系表达式的值，如果值为true，返回值1，如果为false，返回值2。
 */


import org.junit.Test;

public class OperatorDemo8 {

    @Test
    public void Test2(){
        int a = 50;

        boolean rs = a > 30 ? true : false;
        System.out.println(rs);

    }


    @Test
    public void Test1(){

        double score = 60;

        String rs = score>60 ? "及格":"不及格";
        System.out.println(rs);


    }



    public static void main(String[] args) {
        // 目标：学会使用三元运算符，理解其流程
        double score = 18;
        String rs = score >= 60 ? "考试通过" : "挂科";
        System.out.println(rs);

        // 需求：需要从2个整数中找出较大值
        int a = 10000;
        int b = 2000;
        int max = a > b ? a : b;
        System.out.println(max);

        System.out.println("-------------------------");
        int i = 10;
        int j = 30;
        int k = 50;
        // 1、找出2个整数的较大值
        int temp = i > j ? i : j;
        // 2、拿临时变量与第三个变量的值继续比较
        int rsMax = temp > k ? temp : k;
        System.out.println(rsMax);

        System.out.println("-------------拓展知识-------------");
        int rsMax1 = i > j ? (i > k ? i : k) : (j > k ? j : k);
        System.out.println(rsMax1);
    }
}
