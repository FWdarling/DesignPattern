package animalOlympicsYard;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:24
 * @Version: 1.0
 */
public class OlympicsYard {
    static OlympicsYard _instance;

    //Mutexes for double checked locking
    private final static Object _mutex = new Object();


    public static OlympicsYard getInstance() {
        if(_instance == null) {
            //当多个线程同时发现instance为null时，除了第一个线程/进程，所有线程/进程只能到达这里
            synchronized (_mutex){
                //当第一个进程结束初始化后，所有进程来到这里发现已经初始化，直接返回
                //这样就避免了多个进程进行多次初始化
                if(_instance == null){
                    System.out.println("=== 双重检查锁 Double Checked Locking 模式===");
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

    public static OlympicsYard init() {
        OlympicsYard olympicsYard = new OlympicsYard();

        //其他初始化操作
        return olympicsYard;
    }


}
