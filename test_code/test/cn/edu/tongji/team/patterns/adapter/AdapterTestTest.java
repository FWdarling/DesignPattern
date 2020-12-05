package cn.edu.tongji.team.patterns.adapter;

import cn.edu.tongji.team.model.beans.cocoa.*;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/12/3,21:05
 * Version: 1.0
 */
public class AdapterTestTest{
    @Test
    public void Test(){
        CocoaProcessWorkshop workshop = new CocoaProcessWorkshop();
        workshop.process(new ProcessableCocoa(CocoaBeansType.AfricanCocoa));
        workshop.process(new ImpureCocoa(CocoaBeansType.AmericanCocoa));
        AdapterCollection collection = new AdapterCollection();
        ImpureCocoa impureCocoa = new ImpureCocoa(CocoaBeansType.AsianCocoa);
        WetCocoa wetCocoa = new WetCocoa(CocoaBeansType.AmericanCocoa);
        MouldyCocoa mouldyCocoa = new MouldyCocoa(CocoaBeansType.AfricanCocoa);
        CocoaAdapter adapter2 = collection.getAdapter(wetCocoa);
        CocoaAdapter adapter1 = collection.getAdapter(impureCocoa);
        CocoaAdapter adapter4 = collection.getAdapter(wetCocoa);
        CocoaAdapter adapter5 = collection.getAdapter(impureCocoa);
        CocoaAdapter adapter3 = collection.getAdapter(mouldyCocoa);
        adapter1.handle(impureCocoa).processCocoa();
        adapter2.handle(wetCocoa).processCocoa();
        adapter3.handle(mouldyCocoa).processCocoa();
        adapter5.handle(impureCocoa).processCocoa();
        adapter4.handle(wetCocoa).processCocoa();
    }

}