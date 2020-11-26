package MVC;

import iterator.ManCollection;
import iterator.MenuIterator;
import entity.SportsMan;
import org.junit.Test;

public class MVCTest {
    @Test
    public void MVCtest()
    {

        System.out.println("---------------- [Pattern] MVC ----------------");

        ManCollection manCollection=new ManCollection(5);
        manCollection.appendMan(new SportsMan("Healy",20));
        manCollection.appendMan(new SportsMan("Gerald ",21));
        manCollection.appendMan(new SportsMan("Trice ",56));
        manCollection.appendMan(new SportsMan("Yennefa ",45));
        manCollection.appendMan(new SportsMan("Kant ",18));

        SportsMan man;
        SportsManView testView=new SportsManView();

        MenuIterator it=manCollection.iterator();

        while (it.hasNext()) {
            /**
             * 利用controller来遍历所有的运动员，并且用View来打印输出运动员的信息。
             */
            man = (SportsMan) it.next();
            SportsManController testController=new SportsManController(man,testView);

            testController.printDetails(testController.getManName(),testController.getManAge());
        }

        MenuIterator its=manCollection.iterator();
        man = (SportsMan) its.next();
        SportsManController testController=new SportsManController(man,testView);
        System.out.println("----------------");
        /**
         * 利用controller来改变对应运动员的信息。
         */
        testController.printDetails(testController.getManName(),testController.getManAge());


        System.out.println("----------------");
        testController.setManAge(56);
        testController.setManName("HEARLY");

        testController.printDetails(testController.getManName(),testController.getManAge());

        System.out.println("------------------------ END ------------------------");

    }
}
