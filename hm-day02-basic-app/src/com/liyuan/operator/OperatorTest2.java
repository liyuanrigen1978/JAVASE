package com.liyuan.operator;

/**
 * @author liyuan_start
 * @create 2022-06-11 1:24
 */
public class OperatorTest2 {
    public static void main(String[] args) {
        // 需求：拆分3位数，把个位、十位、百位分别输出
        int data = 567;

        int ge = data % 10;
        System.out.println(ge);

        int shi = data/10%10;
        System.out.println(shi);

        int bai = data / 100;
        System.out.println(bai);


    }
}
