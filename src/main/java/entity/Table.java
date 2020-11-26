package entity;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/23,19:02
 * Version: 1.0
 */
public class Table {
    private final String[] buffer;
    private int tail;
    private int head;
    private int count;

    //初始化
    public Table(int count){
        this.buffer = new String[count];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    //放置矿泉水
    public synchronized void put(String water) throws InterruptedException{
        System.out.println(Thread.currentThread().getName() +"放置"+ water);
        while (count>=buffer.length){
            wait();
        }
        buffer[tail] = water;
        tail = (tail + 1)%buffer.length;
        count ++;
        notifyAll();
    }

    //拿取矿泉水
    public synchronized String take() throws InterruptedException{
        while(count<=0){
            wait();
        }
        String water = buffer[head];
        head = (head + 1) % buffer.length;
        count--;
        notifyAll();
        System.out.println(Thread.currentThread().getName()+"拿走了"+water);
        return water;
    }

}
