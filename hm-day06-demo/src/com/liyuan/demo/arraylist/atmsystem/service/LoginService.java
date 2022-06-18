package com.liyuan.demo.arraylist.atmsystem.service;

import com.liyuan.demo.arraylist.atmsystem.pojo.Account;
import com.liyuan.demo.arraylist.atmsystem.util.AtmUtility;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-06-19 0:30
 */
public class LoginService {
    /**
     * 用户登录页面
     * @param accounts
     * @param sc
     */
    public static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("=================欢迎来到银行登录页面=====================");

        while (true) {
            System.out.println("请输入您的卡号：");
            String cardId = sc.next();
            Account account =  AtmUtility.getAccountByCardId(cardId,accounts);
            if(account!=null){

            }else{
                System.out.println("对不起！该账号不存在！");
            }
        }

    }
}
