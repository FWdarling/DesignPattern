package transferobject;

import java.util.ArrayList;

/**
 * 用于处理查询逻辑
 */
public class QuerySystem {
    ArrayList<PersonalInformation> informations = new ArrayList<PersonalInformation>();

    //开始查询
    public Response doQuery(PersonalInformation info) {
        boolean flag = false;
        //消息返回体
        Response response = null;

        for (PersonalInformation tmp: informations) {
            //根据参赛编号查找是否已经存在此人的信息
            if (tmp.getEntryNumber() == info.getEntryNumber()) {
                flag = true;
                response = Response.ok(200, "found", tmp );
                break;
            }
            //不存在此个人信息就存储
        }
        if(!flag) {
            informations.add(info);
            response = Response.ok(200, "created", info );
        }
        return response;
    }

    //查询入口
    public void query(PersonalInformation personalInformation, QuerySystem querySystem) {
        Response result = querySystem.doQuery(personalInformation);
        PersonalInformation obj = (PersonalInformation)result.getObj();
        System.out.println("===================");
        if(result.getMsg().equals("found")) {
            System.out.printf("%s : %d has already been saved!\n", obj.getName(), obj.getEntryNumber());
        } else {
            System.out.printf("%s : %d has been created!\n", obj.getName(), obj.getEntryNumber());
            System.out.printf("Gge : %d\n", obj.getAge());
            System.out.printf("Gender : %s\n", obj.getGender());
            System.out.printf("EntryNumber : %d\n", obj.getEntryNumber());
            System.out.printf("SportEvents : %s\n", obj.getSportEvents().toString());
        }
        System.out.println("===================");
    }
}
