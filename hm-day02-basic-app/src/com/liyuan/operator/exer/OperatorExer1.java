package com.liyuan.operator.exer;

/**
 * @author liyuan_start
 * @create 2022-06-11 14:57
 */


/*
自增、自减拓展案例（有些面试题会出现）

 */


public class OperatorExer1 {

    public static void main(String[] args) {

        //c  10 11 12 11
        //d  5  4  5

        int c = 10;
        int d = 5;

        //rs3     10  +  12 -  4  -  5  + 1 + 12 26
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(rs3);
        System.out.println(c); //11
        System.out.println(d); //5


    }


}
