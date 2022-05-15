package com.atguigu.java;

import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-05-15 17:45
 */
public class ForWhileTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int positiveNumber = 0;//记录正数的个数
        int negativeNumber = 0;//记录负数的个数

        for(;;){//while(true){

            int number = scan.nextInt();

            //判断number的正负情况
            if(number > 0){
                positiveNumber++;
            }else if(number < 0){
                negativeNumber++;
            }else{
                //一旦执行break，跳出循环
                break;
            }

        }

        System.out.println("输入的正数个数为：" + positiveNumber);
        System.out.println("输入的负数个数为：" + negativeNumber);


    }
}
