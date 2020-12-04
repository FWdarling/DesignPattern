package doublecheckedlocking;

import org.junit.Test;


/**
 * Author: CINDY DENG
 * Date: 2020/11/12,22:57
 * Version: 1.0
 */
public class DoubleCheckedLockingTest {


    @Test
    public void test(){
        System.out.println("---------------- [Pattern] DoubleCheckedLocking ----------------");
        MyThread[] threads = new MyThread[10];
        for(int i = 0;i<10;i++){
            threads[i] = new MyThread(i);
        }

        for(MyThread thread : threads){

            thread.run();
        }
        System.out.println("------------------------ END ------------------------");
    }
}
