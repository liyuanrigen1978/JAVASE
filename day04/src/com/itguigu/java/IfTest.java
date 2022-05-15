package com.itguigu.java;

import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-05-15 17:35
 */
public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入岳小鹏期末成绩：(0-100)");
        int score = scan.nextInt();

        if(score == 100){
            System.out.println("奖励一辆BMW");//be my wife!  BMW <---> MSN
        }else if(score > 80 &&  score <= 99){
            System.out.println("奖励一台iphone xs max");
        }else if(score >= 60 && score <= 80){
            System.out.println("奖励一个 iPad");
        }else{
            System.out.println("什么奖励也没有");
        }
    }
}
