package com.liyuan.type;

/**
 * @author liyuan_start
 * @create 2022-06-11 1:05
 */
public class TypeDemo02 {
    public static void main(String[] args) {
        //目标：掌握表达式的自动类型转换的规则。
        byte a = 10;
        int b = 20;
        double c = 1.0;
        double rs = a + b + c;
        System.out.println(rs);

        double rs2 = a + b - 2.3;
        System.out.println(rs2);

        // 面试题
        //byte,short,char都是用int来进行计算的，所以要用int类型来转换
        byte i = 100;
        byte j = 120;
        int k = i + j;
        System.out.println(k);

    }
}
