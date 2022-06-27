package com.liyuan.demo.abstractDemo.cardDemo;

/**
 * @author liyuan_start
 * @create 2022-06-25 20:27
 */
public class Test {
    public static void main(String[] args) {
        GoldCard c = new GoldCard();
        c.setMoney(10000);
        c.setName("liyuan");
        c.pay(100);
        System.out.println("余额" + c.getMoney());

    }
}
