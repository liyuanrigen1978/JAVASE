package com.liyuan.demo.arraylist.atmsystem.ui;

import com.liyuan.demo.arraylist.atmsystem.pojo.Account;
import com.liyuan.demo.arraylist.atmsystem.service.AccountService;
import com.liyuan.demo.arraylist.atmsystem.service.LoginService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-06-18 20:58
 */
public class AtmView {
    //private static AccountService accountService = new AccountService();
    public static void main(String[] args) {
        //准备系统所需要的容器，用来存储用户对象
        ArrayList<Account> accounts = new ArrayList<>();

        //系统主页面
        mainView(accounts);
    }


    /**
     * 系统主页面
     */
    public static void mainView(ArrayList<Account> accounts){

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("=================欢迎来到银行系统==================");
            System.out.println("请输入您的操作");
            System.out.println("1 : 登录");
            System.out.println("2 : 开户");
            System.out.println("您可以开始输入命令了：");
            int command = sc.nextInt();
            switch(command){
                case 1:
                    //登录
                    LoginService.login(accounts,sc);
                    break;
                case 2:
                    //开户
                    AccountService.register(accounts,sc);
                    break;
                default:
                    System.out.println("您输入的操作不被支持");
            }
        }
    }
}
