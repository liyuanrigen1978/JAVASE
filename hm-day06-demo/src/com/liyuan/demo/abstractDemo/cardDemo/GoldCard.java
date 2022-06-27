package com.liyuan.demo.abstractDemo.cardDemo;

/**
 * @author liyuan_start
 * @create 2022-06-25 20:02
 */
public class GoldCard extends Card {



    public GoldCard() {
    }

    @Override
    public void pay(double payMoney) {
        double discountsMoney = payMoney * 0.8;
        double balance = getMoney() - discountsMoney;
        System.out.println(getName() + "当前账户总金额："
                + getMoney() +",当前消费了：" + discountsMoney +",消费后余额剩余：" +
                balance);
        setMoney(balance);

    }
}
