package com.itheima.d8_threadpool_exer;

/**
 * @author liyuan_start
 * @create 2022-10-22 16:16
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出了：Helloworld ==>" + i);
        }
    }
}
