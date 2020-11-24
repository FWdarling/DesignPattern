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
    public DrinkerThread(String name, Table table, long seed){
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    @Override
    public void run(){
        try{
            while (true){
                String water = table.take();
                Thread.sleep(random.nextInt(1000));
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
