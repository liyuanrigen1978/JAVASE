package com.itheima.d1_date;

import java.util.Date;

/**
 * @author liyuan_start
 * @create 2022-07-01 1:38
 */
public class DateDemo1Exer {
    public static void main(String[] args) {
        // 1、创建一个Date类的对象：代表系统此刻日期时间对象
        Date date = new Date();
        System.out.println(date);

        // 2、获取时间毫秒值,指的是从1970/1/1 00:00:00走到此刻的总的毫秒数
        long time = date.getTime();
        System.out.println(time);
        System.out.println("----------------------------");


        //3,计算出当前时间往后走1小时121秒之后的时间是多少
        Date d1 = new Date();
        System.out.println(d1);


        long time2 = System.currentTimeMillis();
        time2 += (60*60 + 121) * 1000;
        //把时间毫秒值转换成对应的日期对象。
        //Date date1 = new Date(time2);
        //System.out.println(date1);
        Date d2 = new Date();
        d2.setTime(time2);
        System.out.println(d2);

    }
}
