package com.liyuan.demo.staticDemo.poker;

import java.util.ArrayList;

/**
 * @author liyuan_start
 * @create 2022-06-23 1:19
 */


/**
 模拟初始化牌操作
 点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
 花色: "♠", "♥", "♣", "♦"
 1、准备一个容器，存储54张牌对象，这个容器建议使用静态的集合。静态的集合只加载一次。
 */
public class PokerDemo {
    public static ArrayList<String> cards = new ArrayList<>();


    static{
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (int i = 0; i < sizes.length ; i++) {
            for (int j = 0; j < colors.length; j++) {
                cards.add(sizes[i]+colors[j]);
            }
        }

        cards.add("小🃏");
        cards.add("大🃏");

    }

    public static void main(String[] args) {
        System.out.println(cards);
    }

}
