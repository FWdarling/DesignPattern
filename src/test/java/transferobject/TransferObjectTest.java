package transferobject;

import entity.Cat;
import org.junit.Test;
import java.util.ArrayList;

public class TransferObjectTest {

    @Test
    public void transferObjectTest() {
        System.out.println("---------------- [Pattern] TransferObject ----------------");
        //录入个人信息
        ArrayList<String> sportEvents = new ArrayList<String>();
        sportEvents.add("baskerball");
        sportEvents.add("volleyball");
        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setAge(10);
        personalInformation.setEntryNumber(111);
        personalInformation.setGender("male");
        personalInformation.setName("Judy");
        personalInformation.setSportEvents(sportEvents);

        //新建运动员
        Cat Judy = new Cat(personalInformation);

        //创建查询对象
        QuerySystem querySystem = new QuerySystem();

        //进行查询
        querySystem.query(Judy.getPersonalInformation(), querySystem); //第一次查询不到创建
        querySystem.query(Judy.getPersonalInformation(), querySystem); //第二次查询到显示查询结果
        System.out.println("------------------------ END ------------------------");
    }
}
