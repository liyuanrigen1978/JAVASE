package com.liyuan.loop;



/*

什么时候用for循环，什么时候用while循环？
    功能上是完全一样的，for能解决的while也能解决，反之亦然。
    使用规范是：知道循环几次：使用for；不知道循环几次建议使用：while。

 */

public class WhileDemo5 {
    public static void main(String[] args) {
        // 目标：学会使用while循环，并理解它的流程
        int i = 0;
        while (i < 3){
            System.out.println("Hello World");
            i++;
        }
        System.out.println("----------------------");
        int j = 0;
//        while (j < 3){
//            //死循环
//            System.out.println("Hello World");
//        }
    }
}
