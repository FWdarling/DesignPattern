package balking;

import entity.Vest;

import java.util.ArrayList;
import java.util.Random;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/23,10:58
 * Version: 1.0
 */
public class ChangeThread extends Thread{
    //模拟运动员线程 -- 1.use 2.save

    //volatile修饰符用来保证其它线程读取的总是该变量的最新的值
    public volatile boolean exit = false;

    private ArrayList<Vest> vestArrayList;
    private Random random=new Random();
    //初始化
    public ChangeThread(String name, ArrayList<Vest> vestArrayList){
        super(name);//线程名称
        this.vestArrayList = vestArrayList;
    }

    //重写run()方法，对vestArrayList里面的每个Vest对象进行使用，并间隔一段时间后调用回收接口。
    //（若此时该背心已经被其他线程回收，则save()操作内不会有任何实际动作。
    @Override
    public void run(){
        try {
            while (!exit){
                int k=0;
                for (Vest i:vestArrayList) {
                    k++;
                    i.use("Player No."+k);
                    Thread.sleep(random.nextInt(1000));//模拟某些运动员没有及时回收背心
                    i.save(); //模拟有运动员去主动回收背心
                }
                exit = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
