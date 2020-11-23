package producerconsumer;

import entity.Table;
import org.junit.Test;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/23,19:28
 * Version: 1.0
 */
public class ProducerConsumerTest {

    @Test
    public void producerConsumerTest() {
    //public static void main(String[] args) {
        //这行备注放这里主要是提醒多线程的test无法真正测试运行情况，最后写main函数需要注意。合并后删除本注释

        Table table = new Table(2);
        new MakerThread("MakerThread-1",table,31415).start();
        new MakerThread("MakerThread-2",table,12345).start();
        new DrinkerThread("DrinkerThread-2",table,33333).start();
        new DrinkerThread("DrinkerThread-1",table,76536).start();

        //需要一个终止线程的条件；
    }


}
