package com.itguigu.java;

import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-05-15 17:36
 */
public class SwitchCaseExer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入year：");
        int year = scan.nextInt();
        System.out.println("请输入month：");
        int month = scan.nextInt();
        System.out.println("请输入day：");
        int day = scan.nextInt();


        //定义一个变量来保存总天数
        int sumDays = 0;

        switch(month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                //sumDays += 28;
                //判断year是否是闰年
                if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0){
                    sumDays += 29;
                }else{
                    sumDays += 28;
                }

            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }

        System.out.println(year + "年" + month + "月" + day + "日是当年的第" + sumDays + "天");
    }
}
