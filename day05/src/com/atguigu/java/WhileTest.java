package com.atguigu.java;

/**
 * @author liyuan_start
 * @create 2022-05-15 17:47
 */
public class WhileTest {
    public static void main(String[] args) {

        //遍历100以内的所有偶数
        int i = 1;
        while(i <= 100){

            if(i % 2 == 0){
                System.out.println(i);
            }

            i++;
        }
        //出了while循环以后，仍可以调用。
        System.out.println(i);//101

    }
}
