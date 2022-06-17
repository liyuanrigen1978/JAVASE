package com.liyuan.demo;

/**
 * @author liyuan_start
 * @create 2022-06-18 1:34
 */
public class DelArrey {

    public static void main(String[] args) {
        String delStr = "c";
        String[] str = {"a","b","c","d","e"};
        //OUT:
        for (int i= 0;i<str.length;i++) {
            if(str[i].equals(delStr)){
                for (int j = i; j < str.length -1 ; j++) {
                    str[j] = str[j+1];
                }
                str[str.length-1]= null;
                //break OUT;
                break;
            }
        }


        for (int i = 0; i < str.length -1 ; i++) {
            System.out.println(str[i]);
        }

    }
}
