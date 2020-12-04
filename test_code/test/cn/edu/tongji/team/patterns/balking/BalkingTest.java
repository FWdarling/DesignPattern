package cn.edu.tongji.team.test;

import cn.edu.tongji.team.model.beans.assemblyline.ConveyEquipment;
import cn.edu.tongji.team.util.UI;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BalkingTest {
    public static void main(String[] args){
        final ConveyEquipment conveyEquipment = new ConveyEquipment();

        // 此处使用ThreadPoolExecutor创建线程，并通过多线程访问同一输送设备参与调度
        // 核心线程数
        int corePoolSize = 3;
        // 最大线程数
        int maximumPoolSize = 6;
        // 超过corePoolSize, 线程数量的线程最大空闲时间
        long keepAliveTime = 2;
        // 以秒为时间单位
        TimeUnit unit = TimeUnit.SECONDS;
        // 创建工作队列，用于存放提交的等待执行任务
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(2);
        ThreadPoolExecutor threadPoolExecutor = null;
        try {
            // 创建线程池
            threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
                    maximumPoolSize,
                    keepAliveTime,
                    unit,
                    workQueue,
                    new ThreadPoolExecutor.AbortPolicy());

            // 循环提交任务
            for (int i = 0; i < 7; i++) {
                // 提交任务的索引
                int index = i + 1;
                threadPoolExecutor.submit(() -> {
                    // 线程打印输出
                    UI.printlnWithColor("--------------------", UI.Color.GREEN);
                    UI.printlnWithColor("此处是循环测试提交次数: " + index, UI.Color.BLUE);
                    try {
                        conveyEquipment.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                // 每个任务提交后休眠500ms再提交下一个任务，用于保证提交顺序
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            threadPoolExecutor.shutdown();
        }

    }
}
