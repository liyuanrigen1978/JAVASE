package com.itheima.d4_byte_stream;

import java.io.FileInputStream;

/**
 * @author liyuan_start
 * @create 2022-08-08 10:14
 */
public class FileInputStreamDemo01Exer {

    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("hm-day19-file-io-app\\src\\com\\itheima\\data.txt");
        //int b1 = is.read();
        //System.out.println(b1);

        //这种写法一旦遇到中文，就会出现乱码
        int b;
        while ((b=is.read())!=-1){
            System.out.print((char)b);

        }

    }


}

