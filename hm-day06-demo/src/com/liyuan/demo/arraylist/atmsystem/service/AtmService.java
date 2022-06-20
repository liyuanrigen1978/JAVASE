package com.liyuan.demo.arraylist.atmsystem.service;

import com.liyuan.demo.arraylist.atmsystem.pojo.Account;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-06-18 20:59
 */
public class AtmService {


    /**
     * 开户界面
     * 随机生成8位数的卡号，并且不能和其他的账号重复
     *
     * @param accounts
     * @return
     */
    public static String createCardId(ArrayList<Account> accounts) {
        while (true) {
            String cardId = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }

            // 判断这个卡号是否重复：根据卡号去查询账户对象
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null) {
                return cardId;
            }
        }
    }

    /**
     * 用户业务界面
     * 查询用户信息，并展示
     *
     * @param account
     */
    public static void showAccount(Account account){
        System.out.println("================3-1:您的账号信息如下===================");
        System.out.println("卡号：" + account.getCardId());
        System.out.println("姓名：" + account.getUserName());
        System.out.println("余额："+ account.getMoney());
        System.out.println("最大取款额度："+ account.getQuotaMoney());
        System.out.println("======================================================");
        System.out.println();
    }

    public static void depositMoney(Account account, Scanner sc){
        System.out.println("====================3-1:存钱操作=====================");
        System.out.println("请输入您的存款金额：");
        double money = sc.nextDouble();

        account.setMoney(account.getMoney() + money);
        System.out.println("存款完成！");
        //存款完成后，重新展示账号信息
        showAccount(account);
    }


    /**
     * 共通
     * 判断这个卡号是否重复：根据卡号去查询账户对象
     *
     * @param cardId
     * @param accounts
     * @return
     */
    public static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }

}
