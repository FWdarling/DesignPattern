package cn.edu.tongji.team.patterns.servant;

import cn.edu.tongji.team.model.beans.grade.*;
import cn.edu.tongji.team.model.beans.worker.Engineer;
import cn.edu.tongji.team.model.beans.worker.MaintenanceWorker;
import cn.edu.tongji.team.model.beans.worker.Manager;
import cn.edu.tongji.team.model.beans.worker.ProductionWorker;
import cn.edu.tongji.team.patterns.servant.WorkServant;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * description: ServantTest
 * date: 12/3/20 6:16 PM
 * author: fourwood
 */
public class ServantTest {
    @Test
    public  void servantTest() {

        ProductionWorker worker1=new ProductionWorker("流水线工人");
        Engineer worker2=new Engineer("工程师");
        Manager worker3=new Manager("管理者");
        MaintenanceWorker worker4 = new MaintenanceWorker("修理工");
        List<Grade> gradeList = new ArrayList<>();
        gradeList.add(new Apprentice(worker1));
        gradeList.add(new Journeyman(worker2));
        gradeList.add(new Junior(worker3));
        gradeList.add(new Senior(worker4));
        WorkServant workservant = new WorkServant();
        for (Grade grade : gradeList) {
            workservant.work(grade);
        }
    }
}
