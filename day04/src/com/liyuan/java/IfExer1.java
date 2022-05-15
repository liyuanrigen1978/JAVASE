package com.liyuan.java;

import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-05-15 17:34
 */
public class IfExer1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的身高：(cm)");
        int height = scan.nextInt();
        System.out.println("请输入你的财富：(千万)");
        double wealth = scan.nextDouble();

		/*
		方式一：
		System.out.println("请输入你是否帅：(true/false)");
		boolean isHandsome = scan.nextBoolean();

		if(height >= 180 && wealth >= 1 && isHandsome){
			System.out.println("我一定要嫁给他!!!");
		}else if(height >= 180 || wealth >= 1 || isHandsome){
			System.out.println("嫁吧，比上不足，比下有余。");
		}else{
			System.out.println("不嫁！");
		}
		*/

        //方式二：
        System.out.println("请输入你是否帅：(是/否)");
        String isHandsome = scan.next();


        if(height >= 180 && wealth >= 1 && isHandsome.equals("是")){
            System.out.println("我一定要嫁给他!!!");
        }else if(height >= 180 || wealth >= 1 || isHandsome.equals("是")){
            System.out.println("嫁吧，比上不足，比下有余。");
        }else{
            System.out.println("不嫁！");
        }
    }
}
