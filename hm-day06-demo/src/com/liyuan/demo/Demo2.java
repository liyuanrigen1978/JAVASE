package com.liyuan.demo;

/**
 * @author liyuan_start
 * @create 2022-06-12 17:20
 */

/**
 * 需求：找出101-200之间的素数输出：
 * 素数是什么：如果除了1和它本身以外，不能被其他正整数整除，就叫素数。
 * <p>
 * 判断规则是：从2开始遍历到该数的一半的数据，看是否有数据可以整除它，有则不是素数，没有则是素数。
 */
public class Demo2 {

    public static void main(String[] args) {

        for (int i = 101; i <= 200; i++) {
            //设定一个判定值，假设这个数是素数
            boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    //不是素数
                    flag = false;
                    break;

                }
            }
            if(flag){
                System.out.print(i + "\t");
            }
        }


    }
}
