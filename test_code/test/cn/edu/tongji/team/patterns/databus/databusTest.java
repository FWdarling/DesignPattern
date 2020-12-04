package cn.edu.tongji.team.test;

import cn.edu.tongji.team.patterns.databus.DataBus;
import cn.edu.tongji.team.patterns.databus.datatype.ManagerPersonalData;
import cn.edu.tongji.team.patterns.databus.datatype.MessageData;
import cn.edu.tongji.team.patterns.databus.datatype.WorkData;
import cn.edu.tongji.team.patterns.databus.member.DisplayCardMember;
import cn.edu.tongji.team.patterns.databus.member.ManagerOfficeMember;
import cn.edu.tongji.team.patterns.databus.member.WorkerMember;

/**
 * description: Data bus Test
 * date: 12/4/20 10:40 PM
 * author: Ming
 */
public class databusTest {
    public static void main(String[] args) {
        DataBus bus = DataBus.getInstance();
        //创建相应的对象并且完成注册
        DisplayCardMember displayCardMember1 = new DisplayCardMember("车间1");
        DisplayCardMember displayCardMember2 = new DisplayCardMember("车间2");
        ManagerOfficeMember managerOfficeMember = new ManagerOfficeMember("经理");
        WorkerMember workerMember1 = new WorkerMember("小红");
        WorkerMember workerMember2 = new WorkerMember("小明");
        bus.register(displayCardMember1);
        bus.register(displayCardMember2);
        bus.register(managerOfficeMember);
        bus.register(workerMember1);
        bus.register(workerMember2);

        //进行各种信息的广播
        MessageData messageData = new MessageData("车间正在开放");
        bus.broadcast(messageData);
        System.out.println("------------------------------");
        WorkData workData = new WorkData("生产100个德芙巧克力");
        bus.broadcast(workData);
        System.out.println("------------------------------");
        ManagerPersonalData managerPersonalData = new ManagerPersonalData("工人正在工作", 10000);
        bus.broadcast(managerPersonalData);

    }
}
