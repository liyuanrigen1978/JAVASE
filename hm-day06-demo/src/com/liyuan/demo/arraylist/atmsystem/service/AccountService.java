package com.liyuan.demo.arraylist.atmsystem.service;

import com.liyuan.demo.arraylist.atmsystem.pojo.Account;
import com.liyuan.demo.arraylist.atmsystem.util.AtmUtility;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-06-18 20:59
 */
public class AccountService {
    /**
     * 用户开户功能
     *
     * @param accounts
     * @param sc
     */
    public static void register(ArrayList<Account> accounts, Scanner sc) {

        System.out.println("================欢迎您进入到开户操作===================");


        // 1、录入用户账户信息
        System.out.println("请输入开户名称：");
        String name = sc.next();
        String password ="";
        while (true) {
            System.out.println("请输入开户密码：");
            password = sc.next();
            System.out.println("请输入确认密码：");
            String okPassword = sc.next();
            if (okPassword.equals(password)) {
                break;
            } else {
                System.out.println("两次密码必须一致！");
            }
        }

        System.out.println("请输入每次取款限额：");
        double quotaMoney = sc.nextDouble();
        //生成账户的卡号，卡号是8位数，并且不能和其他的账号重复
        String cardId = createCardId(accounts);
        //将设置的新用户信息封装到一个用户中去
        // 2、创建一个账户对象封装账户信息
        Account acc = new Account(cardId,name,password,quotaMoney);
//        acc.setCardId(cardId);
//        acc.setUserName(name);
//        acc.setPassWord(password);
//        acc.setQuotaMoney(quotaMoney);

        //将此用户信息存入到集合容器中去
        accounts.add(acc);
        System.out.println("恭喜您,"+acc.getUserName()+"先生/女士，您开户完成，您的卡号是：" + acc.getCardId());

    }

    /**
     * 用户开户功能(随机生成8位数的卡号，并且不能和其他的账号重复)
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
            Account acc = AtmUtility.getAccountByCardId(cardId, accounts);
            if (acc == null) {
                return cardId;
            }
        }
    }



}
