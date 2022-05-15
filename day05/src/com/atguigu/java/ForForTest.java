package com.atguigu.java;

/**
 * @author liyuan_start
 * @create 2022-05-15 17:44
 */
public class ForForTest {
    public static void main(String[] args) {

        //******
        //System.out.println("******");
        for(int i = 1;i <= 6;i++){
            System.out.print('*');
        }

        System.out.println("\n");

        /*
         ******
         ******
         ******
         ******
         */
        for(int j = 1;j <= 4;j++ ){
            for(int i = 1;i <= 6;i++){
                System.out.print('*');
            }
            System.out.println();
        }

        /*			i(行号)		j(*的个数)
         *			1			1
         **			2			2
         ***			3			3
         ****		4			4
         *****		5			5
         */

        for(int i = 1;i <= 5;i++){//控制行数
            for(int j = 1;j <= i;j++){//控制列数
                System.out.print("*");

            }
            System.out.println();
        }

        /*			i(行号)		j(*的个数)   规律：i + j = 5 换句话说：j = 5 - i;
         ****		1			4
         ***			2			3
         **			3			2
         *			4			1
         */

        for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= 5 - i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
