package cn.edu.tongji.team.test;

import cn.edu.tongji.team.model.beans.chocolate.Chocolate;
import cn.edu.tongji.team.model.beans.chocolate.ChocolateBrand;
import cn.edu.tongji.team.patterns.dao.ChocolateDao;
import cn.edu.tongji.team.patterns.dao.ChocolateDaoImpl;

/**
 * description: DataObjectAccessTest
 * date: 12/4/20 10:40 PM
 * author: Ming
 */
public class daoTest {
    public static void main(String[] args) {
        //生成daoImplement
        ChocolateDao chocolateDao = new ChocolateDaoImpl();
        final String path = "./dao.impl";
        //测试创建文件
        chocolateDao.createChocolate(path, ChocolateBrand.Ferrero);
        //测试读取文件
        Chocolate chocolate = chocolateDao.getChocolate(path);
        System.out.println(chocolate);
        //测试删除文件
        chocolateDao.deleteChocolate(path);
    }
}
