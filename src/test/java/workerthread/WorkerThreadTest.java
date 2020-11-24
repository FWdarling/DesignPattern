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

        t1.start();
        t2.start();
        t3.start();

        // 等待所有线程结束
        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (Exception e) {

        }
        System.out.println("------------------------ END ------------------------");
    }
}
