package balking;

import entity.Vest;

import java.util.ArrayList;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/23,10:58
 * Version: 1.0
 */
public class SaveThread extends Thread{
    //职责：定期收集背心
    //模拟专门回收背心的体育场工作人员

    //volatile修饰符用来保证其它线程读取的总是该变量的最新的值
    public volatile boolean exit = false;

    private ArrayList<Vest> vestArrayList; //当前所有需要收集的背心

    //初始化
    public SaveThread(String name, ArrayList<Vest> vestArrayList){
        super(name);//线程名称
        this.vestArrayList = vestArrayList;
    }

    //重写run()，模拟工作人员行为，设定工作人员每隔1s依次进行一件衣服的回收。
    //（若此时该背心已经被其他线程回收，则save()操作内不会有任何实际动作。
    @Override
    public void run(){
        try {
            while(!exit){
                for (Vest i:vestArrayList) {
                    i.save();
                    Thread.sleep(1000); //工作人员每隔1s钟收集1件背心
                }
                exit = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
