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
        System.out.println("---------------- [Pattern] Producer-Customer ----------------");

        Table table = new Table(2);
        MakerThread m1 = new MakerThread("MakerThread-1",table,31415);
        MakerThread m2 = new MakerThread("MakerThread-2",table,12345);
        DrinkerThread d1 = new DrinkerThread("DrinkerThread-2",table,33333);
        DrinkerThread d2 = new DrinkerThread("DrinkerThread-1",table,76536);

        try{
            m1.start();
            m2.start();
            d1.start();
            d2.start();
            m1.join();
            m2.join();
            d1.join();
            d2.join();
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("------------------------ END ------------------------");
    }


}
