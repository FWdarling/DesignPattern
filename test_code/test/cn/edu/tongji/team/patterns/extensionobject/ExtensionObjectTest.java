package cn.edu.tongji.team.patterns.extensionobject;

import cn.edu.tongji.team.patterns.extensionobject.DiscardExtension;
import cn.edu.tongji.team.patterns.extensionobject.RecycleExtension;
import cn.edu.tongji.team.model.beans.chocolate.MustinessChocolate;
import cn.edu.tongji.team.model.beans.chocolate.WormChocolate;
import org.junit.Test;

/**
 * description: ExtensionObjectTest
 * date: 12/4
 * author: Li
 */
public class ExtensionObjectTest {
    @Test
    public void ExtensionObjectTest()
    {
        MustinessChocolate mustinessChocolate=new MustinessChocolate();  //发霉的巧克力
        WormChocolate wormChocolate=new WormChocolate();    //生虫的巧克力

        DiscardExtension discardExtension = wormChocolate.GetExtension("discard");  //生虫的巧克力采用丢弃的处理方法
        RecycleExtension recycleExtension=mustinessChocolate.GetExtension("recycle");  //发霉的巧克力采取回收利用的处理方法

        //进行变质巧克力的处理
        discardExtension.handleMethod();
        recycleExtension.handleMethod();
    }
}
