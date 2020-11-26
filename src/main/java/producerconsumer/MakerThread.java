package producerconsumer;

import entity.Table;

import java.util.Random;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/23,19:12
 * Version: 1.0
 */
public class MakerThread extends Thread{
    private final Random random;
    private final Table table;
    private static int id = 0;
    //实例化一个名为name的MakerThread，传入table实例，设定随机数种子seed
    public MakerThread(String name, Table table, long seed){
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    //重写run方法，根据当前业务逻辑设定线程运行的任务
    @Override
    public void run(){
        try{
            while(id<6){
                Thread.sleep(random.nextInt(1000));
                String water = "[" + getName() + "放置的" + "矿泉水 No." + nextId() +"]";
                table.put(water);
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
