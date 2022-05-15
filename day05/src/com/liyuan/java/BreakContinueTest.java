package com.liyuan.java;

/**
 * @author liyuan_start
 * @create 2022-05-15 17:43
 */
public class BreakContinueTest {
    public static void main(String[] args) {

        for(int i = 1;i <= 10;i++){

            if(i % 4 == 0){
                break;//123
            }
            System.out.print(i);
        }

        System.out.println("\n");
        //******************************

        label:for(int i = 1;i <= 4;i++){

            for(int j = 1;j <= 10;j++){

                if(j % 4 == 0){
                    //break;//默认跳出包裹此关键字最近的一层循环。
                    //continue;

                    //break label;//结束指定标识的一层循环结构
                    continue label;//结束指定标识的一层循环结构当次循环
                }

                System.out.print(j);
            }

            System.out.println();
        }
    }
}
