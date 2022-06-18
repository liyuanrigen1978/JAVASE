package com.liyuan.demo.arraylist.atmsystem.util;

import com.liyuan.demo.arraylist.atmsystem.pojo.Account;

import java.util.ArrayList;

/**
 * @author liyuan_start
 * @create 2022-06-19 0:34
 */
public class AtmUtility {
    /**
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
