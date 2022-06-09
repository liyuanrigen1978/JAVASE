package com.liyuan.literal;

/**
 * @author liyuan_start
 * @create 2022-06-10 1:09
 */
public class LiteralDemo {


    public static void main(String[] args) {
        // 目标：掌握数据在程序中的书写格式
        // 1、整数
        System.out.println(66);
        System.out.println(-23);

        // 2、小数
        System.out.println(88.8);

        // 3、字符：必须单引号围起来，有且仅能有一个字符
        System.out.println('总');
        System.out.println('0');
        //\n这是换行 特殊字符
        System.out.print('\n');
        //\t这是空格 特殊字符
        System.out.println('\t');

        // 4、字符串：必须双引号围起来，内容可以随意
        //System.out.println("");
        System.out.println("中国我爱你");

        // 5、布尔类型：true false
        System.out.println(true);
        System.out.println(false);
        // 6、空类型 null (以后再详细说明！)
    }
}
