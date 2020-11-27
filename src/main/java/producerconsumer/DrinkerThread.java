package producerconsumer;

import entity.Table;

import java.util.Random;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/23,19:25
 * Version: 1.0
 */
public class DrinkerThread extends Thread{
    private final Random random;
    private final Table table;
    private static int id = 0;

    //实例化一个名为name的DrinkerThread，传入table实例，设定随机数种子seed
    public DrinkerThread(String name, Table table, long seed){
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    //重写run方法，根据当前业务逻辑设定线程运行的任务
    @Override
    public void run(){
        try{
            while (id<6){
                String water = table.take();
                Thread.sleep(random.nextInt(1000));
                nextId();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    //用于id的增加控制和获取id
    private static synchronized int nextId(){
        return id++;
    }
}
