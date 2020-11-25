package doublecheckedlocking;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/25,15:44
 * Version: 1.0
 */
public class MyThread implements Runnable{
    private OlympicsYard _yard;
    private int _id;
    MyThread(int id){
        _id = id;
    }
    @Override
    public void run() {
        //重写线程run方法
        System.out.println("线程 " + _id + " 启动");
        _yard = OlympicsYard.getInstance();
        System.out.println("线程 "+ _id +" 获取了OlympicsYard实例");
        System.out.println("-- (正在模拟完成某些任务) --");
        System.out.println("线程 "+ _id + " 任务完成，线程结束");
    }
}
