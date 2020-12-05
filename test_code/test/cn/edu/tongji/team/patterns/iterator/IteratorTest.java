package iterator;

import cn.edu.tongji.team.model.beans.workshop.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:44 2020/12/3
 * @Modified By:
 **/


public class IteratorTest {
    static List<Workshop> workshopList;
    @Test
    public void iteratorTest(){
        Workshop1 workshop1=new Workshop1();
        Workshop2 workshop2=new Workshop2();

        System.out.println("workshop1 测试\n");
        Iterator iterator=workshop1.createIterator();
        while(iterator.hasNext()){
            WorkshopWorker worker=(WorkshopWorker)iterator.next();
            System.out.println(worker.getName()+":"+worker.getDesc());
        }

        System.out.println("\n\nworkshop2 测试\n");
        iterator=workshop2.createIterator();
        while(iterator.hasNext()){
            WorkshopWorker worker=(WorkshopWorker)iterator.next();
            System.out.println(worker.getName()+":"+worker.getDesc());
        }

    }
}
