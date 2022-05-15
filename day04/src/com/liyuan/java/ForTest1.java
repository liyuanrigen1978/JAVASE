package com.liyuan.java;

/**
 * @author liyuan_start
 * @create 2022-05-15 17:33
 */
public class ForTest1 {
    public static void main(String[] args) {

        for(int i = 1;i <= 150;i++){

            System.out.print(i + "  ");

            if(i % 3 == 0){
                System.out.print("foo ");
            }

            if(i % 5 == 0){
                System.out.print("biz ");
            }

            if(i % 7 == 0){
                System.out.print("baz ");
            }

            //换行
            System.out.println();

        }

    }
}
