package cn.edu.tongji.team.patterns.bridge;

import cn.edu.tongji.team.model.beans.grade.Apprentice;
import cn.edu.tongji.team.model.beans.grade.Grade;
import cn.edu.tongji.team.model.beans.grade.Journeyman;
import cn.edu.tongji.team.model.beans.grade.Junior;
import cn.edu.tongji.team.model.beans.worker.Engineer;
import cn.edu.tongji.team.model.beans.worker.Manager;
import cn.edu.tongji.team.model.beans.worker.ProductionWorker;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/12/4,19:27
 * Version: 1.0
 */
public class BridgeTest {
    @Test
    public void Test() {
        List<Grade> gradeList = new ArrayList<>();
        gradeList.add(new Apprentice(new ProductionWorker("Apprentice 1 - Production Worker -for testing")));
        gradeList.add(new Journeyman(new Engineer("JourneyMan1- Engineer-for testing")));
        gradeList.add(new Junior(new Manager("Junior1- Manager - for testing")));
        gradeList.add(new Junior(new Engineer("Junior2- Engineer - for testing")));
        for (Grade grade : gradeList) {
            grade.work();
        }
    }
}