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
    public MakerThread(String name, Table table, long seed){
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    @Override
    public void run(){
        try{
            while(true){
                Thread.sleep(random.nextInt(1000));
                String water = "[" + getName() + "放置的" + "矿泉水 No." + nextId() +"]";
                table.put(water);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static synchronized int nextId(){
        return id++;
    }
}
