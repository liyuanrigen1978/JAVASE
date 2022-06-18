package com.liyuan.demo.verificationCode;

import java.util.Random;

/**
 *
 *
 * 验证码
 *
 * @author liyuan_start
 * @create 2022-06-18 16:13
 */
public class VerificationCode {

    public static void main(String[] args) {
        // 1、定义可能出现的字符信息
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code="";
        Random r = new Random();
        //取5位数的验证码
        for (int i = 1; i <=5 ; i++) {
            //随机生成一个索引数
            int index = r.nextInt(datas.length());
            char c = datas.charAt(index);
            code+=c;
        }
        System.out.println(code);

    }

}
