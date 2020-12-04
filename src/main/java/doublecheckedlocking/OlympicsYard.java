package doublecheckedlocking;

/**
 * Author: CINDY DENG
 * Date: 2020/11/12,22:24
 * Version: 1.0
 */
public class OlympicsYard {
    static OlympicsYard _instance;

    //Mutexes for double checked locking
    private final static Object _mutex = new Object();


    //静态方法获取OlympicsYard实例，若当前未完成初始化则调用init()进行初始化
    public static OlympicsYard getInstance() {

        if(_instance == null) {
            //若有多个线程同时发现当前_instance为null，可能出现多个进程同时通过if条件进入if()语句体内
            synchronized (_mutex){
                //避免多个进程重复初始化
                //双重确认 - double checked locking
                if(_instance == null){
                    System.out.println("动物运动会总场景初始化中");
                    //=================具体的初始化逻辑=================//
                    //待添加其他场景的初始化
                    _instance = OlympicsYard.init();
                    System.out.println("总场景OlympicsYard初始化成功！");
                }
            }
        }
        return _instance;
    }

    //初始化OlympicsYard对象
    public static OlympicsYard init() {
        OlympicsYard olympicsYard = new OlympicsYard();

        return olympicsYard;
    }


}
