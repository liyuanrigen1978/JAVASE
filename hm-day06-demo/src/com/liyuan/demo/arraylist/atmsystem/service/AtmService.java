package com.liyuan.demo.arraylist.atmsystem.service;

import com.liyuan.demo.arraylist.atmsystem.pojo.Account;

import java.util.ArrayList;
import java.util.Random;

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
