package com.itheima.d3_charset;

import java.util.Arrays;

/**
 * @author liyuan_start
 * @create 2022-08-08 9:54
 */
public class TestExer {
    public static void main(String[] args) throws Exception {
        String name = "abc我爱你中国";
        byte[] bytes = name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        String rs = new String(bytes, "GBK");
        System.out.println(rs);


    }
}
