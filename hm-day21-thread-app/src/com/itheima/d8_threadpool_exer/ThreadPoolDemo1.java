package com.itheima.d8_threadpool_exer;

import java.util.concurrent.*;

/**
 * @author liyuan_start
 * @create 2022-10-22 16:02
 */
public class ThreadPoolDemo1 {

    public static void main(String[] args) {

        // 1、创建线程池对象
        /**
         public ThreadPoolExecutor(  int corePoolSize,    一：指定线程池的线程数量（核心线程）： corePoolSize
                                     int maximumPoolSize, 二：指定线程池可支持的最大线程数： maximumPoolSize
                                     long keepAliveTime,  三：指定临时线程的最大存活时间： keepAliveTime
                                     TimeUnit unit,       四：指定存活时间的单位(秒、分、时、天)： unit
                                     BlockingQueue<Runnable> workQueue,   五：指定任务队列： workQueue
                                     ThreadFactory threadFactory,   六：指定用哪个线程工厂创建线程： threadFactory
                                     RejectedExecutionHandler handler)  七：指定线程忙，任务满的时候，新任务来了怎么办： handler
         */
        ExecutorService pool = new ThreadPoolExecutor(3,
                                                5,
                                                6,
                                                    TimeUnit.SECONDS,
                                                    new ArrayBlockingQueue<>(5),
                                                    Executors.defaultThreadFactory(),
                                                    new ThreadPoolExecutor.AbortPolicy());


        // 2、给任务线程池处理。
        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);





    }


}
