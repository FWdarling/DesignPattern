package workerthread;

import java.util.Random;

/**
 * 志愿者线程
 */
public class VolunteerThread extends Thread {

    private static final Random random = new Random(System.currentTimeMillis());
    private final CheckPoint checkPoint;

    /**
     * 构造一个志愿者线程
     * @param name String 志愿者名
     * @param checkPoint CheckPoint 志愿者所在补给点
     */
    public VolunteerThread(String name, CheckPoint checkPoint) {
        super(name);
        this.checkPoint = checkPoint;
    }

    /**
     * 运动员线程启动
     * 接受补给请求
     */
    @Override
    public void run() {
        while (true) {
            checkPoint.take().execute();

            try {
                Thread.sleep(random.nextInt(1_000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
