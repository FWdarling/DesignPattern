package cn.edu.tongji.team.test.decorator;

import cn.edu.tongji.team.model.beans.cocoa.CocoaBeansType;
import cn.edu.tongji.team.model.beans.cocoa.ProcessableCocoa;
import cn.edu.tongji.team.model.beans.material.*;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void DecoratorTest() {
        RawMaterial nagisa = new ProcessableCocoa(CocoaBeansType.AfricanCocoa);
        nagisa = new Butter(-2, nagisa);
        nagisa = new Milk(5, nagisa);
        nagisa = new Sugar(10, nagisa);
        nagisa = new Raisin(10, nagisa);
        nagisa.showFormula();
    }
}
