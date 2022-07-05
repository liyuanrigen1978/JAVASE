package com.itheima.d2_simpledateformat;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
    目标：SimpleDateFormat简单日期格式化类的使用
    格式化时间
    解析时间

 */
public class SimpleDateFormatDemo01Exer {
    public static void main(String[] args) {
       Date d = new Date();
       System.out.println(d);

       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
       String sdfStr = sdf.format(d);

       System.out.println(sdfStr);


       long time = System.currentTimeMillis() + (121 * 1000);
       String sdfStr1 = sdf.format(time);
        System.out.println(sdfStr1);





    }
}
