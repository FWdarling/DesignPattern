package cn.edu.tongji.team.patterns.objectpool;

import cn.edu.tongji.team.model.beans.assemblyline.ProcessEquipment;
import cn.edu.tongji.team.model.beans.assemblyline.ProcessEquipmentPool;
import cn.edu.tongji.team.model.beans.cocoa.Cocoa;
import cn.edu.tongji.team.model.beans.cocoa.CocoaBeansType;
import cn.edu.tongji.team.model.beans.cocoa.ImpureCocoa;
import cn.edu.tongji.team.model.beans.cocoa.MouldyCocoa;
import org.junit.Test;

/**
 * description: ObjectPoolTest
 * date: 12/3/20 6:59 PM
 * author: fourwood
 */
public class ObjectPoolTest {

    @Test
    public void objectPoolTest() {
        ProcessEquipmentPool pool1 = new ProcessEquipmentPool();

        ProcessEquipment equip1 = pool1.checkOut();
        ProcessEquipment equip2 = pool1.checkOut();
        Cocoa cocoa1 = new ImpureCocoa(CocoaBeansType.AmericanCocoa);
        equip1.work(CocoaBeansType.AmericanCocoa, cocoa1);
        Cocoa cocoa2 = new MouldyCocoa(CocoaBeansType.AfricanCocoa);
        equip2.work(CocoaBeansType.AfricanCocoa, cocoa2);

        pool1.checkIn(equip1);

    }
}
