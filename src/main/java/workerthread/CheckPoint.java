/**
 * Worker Thread
 * 线程池模式
 */
package workerthread;

import java.util.Arrays;

/**
 * 检查点，可以接收运动员的请求和保存志愿者线程
 */
public class CheckPoint {

    private final static int MAX_REQUEST = 100;

    private final Request[] requestQueue;
    private final VolunteerThread[] volunteerPool;
    private int head;
    private int tail;
    private int count;

    /**
     * 构造检查点
     * @param volunteers int 使用参数志愿者数量
     */
    public CheckPoint(int volunteers) {
        this.requestQueue = new Request[MAX_REQUEST];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
        this.volunteerPool = new VolunteerThread[volunteers];
        this.init();
    }

    /**
     * 初始化线程池
     */
    private void init() {
        for (int i = 0; i < volunteerPool.length; i++) {
            volunteerPool[i] = new VolunteerThread("Volunteer-" + i, this);
        }
    }

    /**
     * 启动所有志愿者线程
     */
    public void startVolunteer() {
        Arrays.asList(volunteerPool).forEach(VolunteerThread::start);
    }

    /**
     * 结束所有志愿者线程
     */
    public void stopVolunteer() {
        Arrays.asList(volunteerPool).forEach(VolunteerThread::stop);
    }

    /**
     * 运动员新建请求
     * @param request
     */
    public synchronized void put(Request request) {
        while (count >= requestQueue.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.requestQueue[tail] = request;
        this.tail = (tail + 1) % requestQueue.length;
        this.count++;
        this.notifyAll();
    }

    /**
     * 志愿者接受请求
     * @return
     */
    public synchronized Request take() {
        while (count <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Request request = this.requestQueue[head];
        this.head = (this.head + 1) % this.requestQueue.length;
        this.count--;
        this.notifyAll();
        return request;
    }
}
