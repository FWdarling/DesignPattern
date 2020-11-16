package doublecheckedlocking;

import animalolympicsyard.OlympicsYard;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Author: CINDY DENG
 * Date: 2020/11/12,22:57
 * Version: 1.0
 */
public class DoubleCheckedLockingTest {
    private OlympicsYard _yard;
    class MyThread implements Runnable{
        private int _id;
        MyThread(int id){
            _id = id;
        }
        @Override
        public void run() {
            System.out.println("线程 " + _id + " 启动");
            //确保农场并且只初始化了一次
            assertTrue(_yard == null || OlympicsYard.getInstance() == _yard);
            _yard = OlympicsYard.getInstance();
            System.out.println("线程 "+ _id +" 获取了OlympicsYard实例，完成使命，被结束了");
        }
    }

    @Test
    public void test(){
        MyThread[] threads = new MyThread[10];
        for(int i = 0;i<10;i++){
            threads[i] = new MyThread(i);
        }

        for(MyThread thread : threads){
            thread.run();
        }
    }
}
