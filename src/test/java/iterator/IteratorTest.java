package iterator;


import entity.SportsMan;
import org.junit.Test;

public class IteratorTest {

    @Test
    public void iteratortest() {

        System.out.println("---------------- [Pattern] Iterator ----------------");

        ManCollection manCollection=new ManCollection(5);
        manCollection.appendMan(new SportsMan("Healy",20));
        manCollection.appendMan(new SportsMan("Gerald ",21));
        manCollection.appendMan(new SportsMan("Trice ",56));
        manCollection.appendMan(new SportsMan("Yennefa ",45));
        manCollection.appendMan(new SportsMan("Kant ",18));

        MenuIterator it=manCollection.iterator();
        /**
         * 迭代器遍历一个collection输出相关信息
         */
        while (it.hasNext()) {
            SportsMan man = (SportsMan) it.next();
            System.out.println("姓名"+man.getName()+"年龄"+man.getAge());
        }

        System.out.println("------------------------ END ------------------------");

    }
}
