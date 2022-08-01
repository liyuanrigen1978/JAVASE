package com.itheima.d5_exception_javac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liyuan_start
 * @create 2022-07-30 18:43
 */
public class ExceptionDemoExer {
    public static void main(String[] args) throws ParseException {
        String date = "2015-01-12 10:23:21";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");

        //未处理的异常：java.text.ParseException
        //Unhandled exception: java.text.ParseException
        //两种办法，1：直接抛出异常 throws ParseException 2：try/catch
        Date d = sdf.parse(date);

        System.out.println(d);

    }
}
