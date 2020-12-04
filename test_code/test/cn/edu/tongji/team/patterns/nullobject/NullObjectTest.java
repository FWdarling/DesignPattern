package cn.edu.tongji.team.patterns.nullobject;

import cn.edu.tongji.team.model.beans.cocoa.*;
import org.junit.Test;

/**
 * description: NullObjectTest
 * date: 12/04/20 17:10 PM
 * author: cjsmt
 */
public class NullObjectTest {
    @Test
    public void nullObjectTest() {
        CocoaWarehouse warehouse = new CocoaWarehouse();
        for(CocoaBeansType t : CocoaBeansType.values()) {
            if(t != CocoaBeansType.Null) {
                warehouse.findCocoaByType(t).showFormula();
            }
        }
    }
}
