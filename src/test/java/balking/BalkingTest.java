package balking;

import entity.Vest;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/23,14:07
 * Version: 1.0
 */
public class BalkingTest {

    @Test
    public void balkingTest(){
        System.out.println("---------------- [Pattern] Balking ----------------");
        ArrayList<Vest> vestArrayList = new ArrayList<Vest>();
        for (int i = 0; i < 10; i++) {
            Vest vest = new Vest(i);
            vestArrayList.add(vest);
        }

        ChangeThread changeThread = new ChangeThread("Athlete",vestArrayList);
        SaveThread saveThread = new SaveThread("Saver",vestArrayList);
        try{
            changeThread.start();
            saveThread.start();
            changeThread.join();
            saveThread.join();
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("------------------------ END ------------------------");
    }
}
