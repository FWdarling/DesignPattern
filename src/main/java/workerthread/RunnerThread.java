package workerthread;

import java.util.Random;

/**
 * 运动员线程
 */
public class RunnerThread extends Thread {

    private static final Random random = new Random(System.currentTimeMillis());

    private final CheckPoint checkPoint;

    /**
     * 构造一个运动员线程
     * @param name String 运动员名字
     * @param checkPoint CheckPoint 请求所在补给点
     */
    public RunnerThread(String name, CheckPoint checkPoint) {
        super(name);
        this.checkPoint = checkPoint;
    }

    /**
     * 运动员线程启动
     * 发出补给请求
     */
    @Override
    public void run() {
        int times = random.nextInt(2);
        try {
            // 最多请求两次
            for (int i = 0; i <= times; i++) {
                Request request = new Request(getName(),i);
                this.checkPoint.put(request);
                Thread.sleep(random.nextInt(1000));
            }
        } catch (Exception e) {

        }
    }
}
