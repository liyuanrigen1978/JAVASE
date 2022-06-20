package com.liyuan.demo.arraylist.atmsystem.ui;

import com.liyuan.demo.arraylist.atmsystem.pojo.Account;
import com.liyuan.demo.arraylist.atmsystem.service.AtmService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liyuan_start
 * @create 2022-06-18 20:58
 */
public class AtmView {
    //private static AtmService accountService = new AtmService();
    public static void main(String[] args) {
        //准备系统所需要的容器，用来存储用户对象
        ArrayList<Account> accounts = new ArrayList<>();

        //系统主页面
        mainView(accounts);
    }


    /**
     * 系统主页面
     */
    public static void mainView(ArrayList<Account> accounts) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=================欢迎来到银行系统==================");
            System.out.println("请输入您的操作");
            System.out.println("1 : 登录");
            System.out.println("2 : 开户");
            System.out.println("您可以开始输入命令了：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //登录
                    loginView(accounts, sc);
                    break;
                case 2:
                    //开户
                    registerView(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的操作不被支持");
                    System.out.println("=============================================");
                    System.out.println();
            }
        }
    }

    /**
     * 用户登录页面
     *
     * @param accounts
     * @param sc
     */
    public static void loginView(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("=================1:登录界面=====================");

        //先进行判断，必须存在用户才能进行登录操作
        if (accounts.size() == 0) {
            System.out.println("当前系统中无任何用户，请先进行注册操作！");
            System.out.println("=============================================");
            System.out.println();
            return;
        }

        //登录操作
        while (true) {
            System.out.println("请输入您的卡号：");
            String cardId = sc.next();
            Account account = AtmService.getAccountByCardId(cardId, accounts);
            if (account != null) {
                //用循环一直输对密码为止
                while (true) {
                    //用户输入密码
                    System.out.println("请输入登录密码：");
                    String password = sc.next();
                    //判断密码是否正确
                    if (account.getPassWord().equals(password)) {
                        //登录成功
                        System.out.println("欢迎你：" + account.getUserName() + "先生/女士进入系统，您可开始办理你的业务了!");
                        //展示登录后的用户业务操作页面
                        showUserControlView(sc, account,accounts);
                        return;
                    } else {
                        //登录失败
                        System.out.println("输入的密码有误，请重新输入密码！");
                        System.out.println("=============================================");
                        System.out.println();
                    }
                }
            } else {
                System.out.println("对不起！该账号不存在！");
                System.out.println("=============================================");
                System.out.println();
            }
        }

    }

    /**
     * 用户开户页面
     *
     * @param accounts
     * @param sc
     */
    public static void registerView(ArrayList<Account> accounts, Scanner sc) {

        System.out.println("================2:开户界面===================");


        // 1、录入用户账户信息
        System.out.println("请输入开户名称：");
        String name = sc.next();
        String password = "";
        while (true) {
            System.out.println("请输入开户密码：");
            password = sc.next();
            System.out.println("请输入确认密码：");
            String okPassword = sc.next();
            if (okPassword.equals(password)) {
                break;
            } else {
                System.out.println("两次密码必须一致！");
                System.out.println("=============================================");
                System.out.println();
            }
        }

        System.out.println("请输入每次取款限额：");
        double quotaMoney = sc.nextDouble();
        //生成账户的卡号，卡号是8位数，并且不能和其他的账号重复
        String cardId = AtmService.createCardId(accounts);
        //将设置的新用户信息封装到一个用户中去
        // 2、创建一个账户对象封装账户信息
        Account acc = new Account(cardId, name, password, quotaMoney);
//        acc.setCardId(cardId);
//        acc.setUserName(name);
//        acc.setPassWord(password);
//        acc.setQuotaMoney(quotaMoney);

        //将此用户信息存入到集合容器中去
        accounts.add(acc);
        System.out.println("恭喜您," + acc.getUserName() + "先生/女士，您开户完成，您的卡号是：" + acc.getCardId());
        System.out.println("=============================================");
        System.out.println();

    }


    /**
     * 用户操作界面
     * 查询用户，存款,取款,转账,修改密码,退出,,注销账户
     *
     * @param sc
     * @param account
     */
    private static void showUserControlView(Scanner sc, Account account,ArrayList<Account> accounts) {

        while (true) {
            System.out.println("================3:用户业务界面==================");
            System.out.println("1:查询用户");
            System.out.println("2:存款");
            System.out.println("3:取款");
            System.out.println("4:转账");
            System.out.println("5:修改密码");
            System.out.println("6:退出");
            System.out.println("7:注销账户");
            System.out.println("请输入您的操作：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询用户
                    showAccountView(account);
                    break;
                case 2:
                    //存款
                    depositMoneyView(account, sc);
                    break;
                case 3:
                    //取款
                    drawMoney(account, sc);
                    break;
                case 4:
                    //转账
                    break;
                case 5:
                    //修改密码
                    updatePassWordView(account,sc);
                    return;
                case 6:
                    //退出
                    exitView();
                    return;
                case 7:
                    //注销账户
                    cancellAccountView(account,accounts);
                    return;
                default:
                    System.out.println("您输入的操作命令有误，请重新输入！");
                    System.out.println("=============================================");
                    System.out.println();

            }
        }
    }

    /**
     * 用户业务界面
     * 1：查询用户信息，并展示
     *
     * @param account
     */
    public static void showAccountView(Account account) {
        System.out.println("================3-1:您的账号信息如下===================");
        System.out.println("卡号：" + account.getCardId());
        System.out.println("姓名：" + account.getUserName());
        System.out.println("余额：" + account.getMoney());
        System.out.println("最大取款额度：" + account.getQuotaMoney());
        System.out.println("======================================================");
        System.out.println();
    }

    /**
     * 用户业务界面
     * 2:存款操作
     *
     * @param account
     * @param sc
     */
    public static void depositMoneyView(Account account, Scanner sc) {
        System.out.println("====================3-2:存款界面=====================");
        System.out.println("请输入您的存款金额：");
        double money = sc.nextDouble();

        account.setMoney(account.getMoney() + money);
        System.out.println("存款完成！");
        //存款完成后，重新展示账号信息
        showAccountView(account);
    }


    /**
     * 用户业务界面
     * 3:取款操作
     *
     * @param account
     * @param sc
     */
    private static void drawMoney(Account account, Scanner sc) {
        System.out.println("====================3-3:存款界面=====================");
        //余额
        double balance = account.getMoney();
        //判断余额是否大于100
        if (balance >= 100) {
            while (true) {
                System.out.println("请您输入取钱的金额：");
                double drawMoney = sc.nextDouble();
                if (drawMoney > account.getQuotaMoney()) {
                    System.out.println("您当前取款金额超过了每次限额！");
                } else {
                    // 4、判断当前取钱金额是超过了账户的余额
                    if (drawMoney > balance) {
                        System.out.println("当前余额不足！当前余额是：" + balance);
                    } else {
                        // 更新账户余额
                        account.setMoney(balance - drawMoney);
                        System.out.println("您当前取钱完成，请拿走你的钱，当前剩余余额是：" + account.getMoney());
                        break;
                    }
                }
            }

        } else {
            System.out.println("您当前账户余额不足100元，存钱去吧！");
        }
    }

    /**
     * 用户业务界面
     * 5:修改密码
     *
     * @param account
     * @param sc
     */
    private static void updatePassWordView(Account account, Scanner sc) {
        while (true) {
            System.out.println("请输入当前登录密码：");
            String okPassWord = sc.next();
            if(account.getPassWord().equals(okPassWord)){
                while (true) {
                    System.out.println("请输入您的新密码");
                    String newPassWord = sc.next();
                    System.out.println("请再一次输入新密码");
                    String okNewPassWord = sc.next();
                    if(newPassWord.equals(okNewPassWord)){
                        account.setPassWord(newPassWord);
                        System.out.println("密码已经修改成功，请重新登录！");
                        return;
                    }else{
                        System.out.println("两次输入的密码不一致！请再一次输入！");
                    }
                }
            }else{
                System.out.println("您输入的密码有误！请重新输入正确的密码！");
            }
        }

    }

    /**
     * 用户业务界面
     * 6:退出操作
     */
    public static void exitView() {
        System.out.println("欢迎您下次再次光临！");
        System.out.println("=============================================");
        System.out.println();
    }

    /**
     * 用户业务界面
     * 7:注销账号
     *
     * @param account
     * @param accounts
     */
    private static void cancellAccountView(Account account, ArrayList<Account> accounts) {
        // 从集合对象中删除当前账户对象。
        accounts.remove(account);
        System.out.println("您的账户已经完成了销毁，您将不可以进行登录了！");
    }
}
