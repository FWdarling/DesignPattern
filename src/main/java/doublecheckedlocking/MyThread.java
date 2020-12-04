package doublecheckedlocking;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/25,15:44
 * Version: 1.0
 */
public class MyThread implements Runnable{
    private OlympicsYard _yard;
    private int _id;
    //构造函数
    public MyThread(int id){
        _id = id;
    }

    //重写线程run方法，启动线程并调用getInstance()获取OlympicsYard实例
    @Override
    public void run() {
        System.out.println("线程 " + _id + " 启动");
        _yard = OlympicsYard.getInstance();
        System.out.println("线程 "+ _id +" 获取了OlympicsYard实例");
        System.out.println("-- (正在模拟完成某些任务) --");
        System.out.println("线程 "+ _id + " 任务完成，线程结束");
    }
}
