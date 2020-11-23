package transferobject;

import java.util.ArrayList;

/**
 * 用于处理查询逻辑
 */
public class QuerySystem {
    ArrayList<PersonalInformation> informations = new ArrayList<PersonalInformation>();

    public Response query(PersonalInformation info) {
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
}
