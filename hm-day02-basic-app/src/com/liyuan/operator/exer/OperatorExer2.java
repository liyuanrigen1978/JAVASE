package com.liyuan.operator.exer;

import org.junit.Test;

/**
 * @author liyuan_start
 * @create 2022-06-11 15:15
 */


public class OperatorExer2 {

    /*
    ## 题目1(训练)

    身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：

​	儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2

​	女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2

    现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？

     */
    @Test
    public void Test1() {
        double father = 177;
        double mather = 165;

        int boy = (int) ((father + mather) * 1.08 / 2);
        int girl = (int) ((father * 0.923 + mather) / 2);
        System.out.println(boy);
        System.out.println(girl);

    }


    /*
    求三个整数的最大值

    需求：定义三个整数，找出最大值并打印在控制台。

        1用三元运算符获取前两个整数的最大值，并用临时变量保存起来。
            num1 > num2 ? num1 : num2;
        2用三元运算符，让临时最大值，和第三个整数，进行比较，并记录结果。
            temp > num3 ? temp : num3;
        3输出结果
     */
    @Test
    public void Test() {

        int a = 11111;
        int b = 2222;
        int c = 353535;

        int temp = a > b ? a : b;
        int lastTemp = temp > c ? temp : c;

        System.out.println(lastTemp);

    }

}
