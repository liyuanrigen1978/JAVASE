package com.liyuan.demo;

import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-06-12 15:43
 */

/*

买飞机票

需求:
    机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
    按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
分析：
    定义一个方法可以进行键盘录入机票原价、月份和机舱类型。
    使用if判断月份是是旺季还是淡季，使用switch分支判断是头等舱还是经济舱。
    选择对应的折扣进行计算并返回计算的结果。



 */




public class Demo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double price = sc.nextDouble();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入您希望的舱位");
        String type = sc.next();
        System.out.println("您购买的机票价钱是: " + calc(price,month,type));
        //System.out.println("您购买的机票价钱是: " + calc1(price,month,type));

    }
    //定义一个方法对机票原价、月份和机舱类型进行判断。
    public static double calc(double money,int month,String type){

        //旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
        if(month >= 5 && month<=10){
            switch(type){
                case "头等舱":
                    money *= 0.9;
                    break;
                case "经济舱":
                    money *= 0.85;
                    break;
                default:
                    System.out.println("您输入的舱位不存在");
                    money = -1;

            }
        }else if(month == 11 || month == 12 || month>= 1 && month<= 4){
            switch(type){
                case "头等舱":
                    money *= 0.7;
                    break;
                case "经济舱":
                    money *= 0.65;
                    break;
                default:
                    System.out.println("您输入的舱位不存在");
                    money = -1;

            }
        }else{
            System.out.println("您输入的月份不存在！");
            money = -1;
        }

        return money;

    }


//    public static double calc1(double money,int month,String type){
//        OUT:
//        for (int i = 1; i <=12 ; i++) {
//            switch(month){
//                case 5:
//                case 6:
//                case 7:
//                case 8:
//                case 9:
//                case 10:
//                    if(type.equals("头等舱")){
//                        money *= 0.9;
//                        break OUT;
//                    }else if(type.equals("经济舱")){
//                        money *= 0.85;
//                        break OUT;
//                    }else{
//                        System.out.println("您输入的舱位不存在");
//                        money = -1;
//                        break OUT;
//                    }
//                case 11:
//                case 12:
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                    if(type.equals("头等舱")){
//                        money *= 0.7;
//                        break OUT;
//                    }else if(type.equals("经济舱")){
//                        money *= 0.65;
//                        break OUT;
//                    }else{
//                        System.out.println("您输入的舱位不存在");
//                        money = -1;
//                        break OUT;
//                    }
//
//            }
//        }
//        return money;
//    }


}
