package workerthread;

import org.junit.Test;

public class WorkerThreadTest {
    @Test
    public void WorkerThreadTest() {
        System.out.println("---------------- [Pattern] WorkerThread ----------------");

        final CheckPoint checkPoint = new CheckPoint(99);
        checkPoint.startVolunteer();

        RunnerThread t1 = new RunnerThread("Nemo", checkPoint);
        RunnerThread t2 = new RunnerThread("Four", checkPoint);
        RunnerThread t3 = new RunnerThread("Wood", checkPoint);

        // 开始并等待所有 Runner 线程结束
        try {
            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            // 手动结束所有的 Volunteer 线程
            checkPoint.stopVolunteer();
            System.out.println("------------------------ END ------------------------");
        }
    }
}
