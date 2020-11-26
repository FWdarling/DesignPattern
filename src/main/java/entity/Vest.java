package entity;

import java.io.IOException;
import java.io.Writer;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/23,10:43
 * Version: 1.0
 */
public class Vest {
    private int ID;
    private String userName; //当前被分配给谁使用
    private boolean changed;  //flag-是否修改过


    //初始化
    public Vest(int ID) {
        this.ID = ID;
        this.userName = null;
        this.changed = false;
    }

    //某个运动员使用该背心，修改使用状态和详细信息
    //本demo中将运动员使用过程进行抽象，忽略具体使用过程所需要的时长
    public synchronized void use(String newUserName){
        //content = newContent;
        System.out.println("运动员 "+newUserName+"使用"+ID+"号背心");
        userName = newUserName;
        changed = true;
    }

    //若使用过该背心，则将该背心回收
    public synchronized void save(){
        if (!changed){
            //若观察到该背心被其他人回收到体育器材室了
            return;
        }
        doSave(); //回收vest
        changed = false;
    }

    // -- 将号码背心回收到体育器材室
    private void doSave(){
        System.out.println(Thread.currentThread().getName() + " 将"+ ID +"号背心放回到体育器材室。");
    }
}
