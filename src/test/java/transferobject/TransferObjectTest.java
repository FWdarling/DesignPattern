package transferobject;

import entity.Cat;
import org.junit.Test;

import java.util.ArrayList;

public class TransferObjectTest {

    @Test
    public void transferObjectTest() {
        ArrayList<String> sportEvents = new ArrayList<String>();
        sportEvents.add("baskerball");
        sportEvents.add("volleyball");

        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setAge(10);
        personalInformation.setEntryNumber(111);
        personalInformation.setGender("male");
        personalInformation.setName("Judy");
        personalInformation.setSportEvents(sportEvents);

        QuerySystem querySystem = new QuerySystem();
        Cat Judy = new Cat(personalInformation, querySystem);

        Judy.query(); //第一次查询不到创建
        Judy.query(); //第二次查询到显示查询结果
    }
}
