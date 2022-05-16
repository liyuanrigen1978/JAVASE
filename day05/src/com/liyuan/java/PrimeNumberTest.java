package com.liyuan.java;

/**
 * @author liyuan_start
 */
public class PrimeNumberTest {
    public static void main(String[] args) {

        boolean isFlag = true;//标识i是否被j除尽，一旦除尽，修改其值

        for(int i = 2;i <= 100;i++){//遍历100以内的自然数


            for(int j = 2;j < i;j++){//j:被i去除

                if(i % j == 0){ //i被j除尽
                    isFlag = false;
                }

            }
            //
            if(isFlag == true){
                System.out.println(i);
            }
            //重置isFlag
            isFlag = true;

        }
    }
}
