package MVC;


import Iterator.ManCollection;
import Iterator.MenuIterator;
import Iterator.SportsMan;
import org.junit.Test;

public class MVCTest {
    @Test
    public static void main(String []args)
    {
        ManCollection manCollection=new ManCollection(5);
        manCollection.appendMan(new SportsMan("Healy",20));
        manCollection.appendMan(new SportsMan("Gerald ",21));
        manCollection.appendMan(new SportsMan("Trice ",56));
        manCollection.appendMan(new SportsMan("Yennefa ",45));
        manCollection.appendMan(new SportsMan("Kant ",18));

        SportsMan man;
        SportsManView testView=new SportsManView();

        MenuIterator it=manCollection.iterator();

        while (it.HasNext()) {
            man = (SportsMan) it.Next();
            SportsManController testController=new SportsManController(man,testView);

            testController.PrintDetails(testController.GetManName(),testController.GetManAge());
        }

        MenuIterator its=manCollection.iterator();
        man = (SportsMan) its.Next();
        SportsManController testController=new SportsManController(man,testView);
        System.out.println("----------------");
        testController.PrintDetails(testController.GetManName(),testController.GetManAge());


        System.out.println("----------------");
        testController.SetManAge(56);
        testController.SetManName("HEARLY");

        testController.PrintDetails(testController.GetManName(),testController.GetManAge());

    }
}
