package cn.edu.tongji.team.patterns.command;

import cn.edu.tongji.team.model.beans.chocolate.*;
import cn.edu.tongji.team.model.beans.cocoa.Cocoa;
import cn.edu.tongji.team.model.beans.cocoa.CocoaBeansType;
import cn.edu.tongji.team.model.beans.cocoa.ImpureCocoa;
import cn.edu.tongji.team.model.beans.cocoa.ProcessableCocoa;
import cn.edu.tongji.team.model.beans.material.Butter;
import cn.edu.tongji.team.model.beans.material.Ingredient;
import cn.edu.tongji.team.model.beans.material.RawMaterial;
import cn.edu.tongji.team.model.beans.worker.WorkerType;
import org.junit.Test;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/12/5,0:22
 * Version: 1.0
 */
public class CommandTest {
    @Test
    public void Test(){

        //测试代码
        RawMaterial material = new ProcessableCocoa(CocoaBeansType.AsianCocoa);
        Ingredient ingredient = new Butter(5, material);
        PurchaseCommand purchaseCommand = new PurchaseCommand(ingredient, 5);
        purchaseCommand.execute();


        Cocoa cocoa = new ImpureCocoa(CocoaBeansType.AmericanCocoa);
        ProcessCommand processCommand = new ProcessCommand(cocoa);
        processCommand.execute();


        Chocolate chocolate = new Dove(ChocolateType.Deluxe);
        Chocolate chocolatee = new Ferrero(ChocolateType.Deluxe);
        Chocolate chocolateee = new Hershey(ChocolateType.Deluxe);
        BoxCommand boxCommand = new BoxCommand(chocolate);
        boxCommand.execute();
        boxCommand = new BoxCommand(chocolatee);
        boxCommand.execute();
        boxCommand = new BoxCommand(chocolateee);
        boxCommand.execute();


        Chocolate chocolate1 = new Dove(ChocolateType.Premium);
        Chocolate chocolate2 = new Ferrero(ChocolateType.Premium);
        Chocolate chocolate3 = new Hershey(ChocolateType.Premium);
        SellCommand sellCommand = new SellCommand(chocolate1, 100, 24.88);
        sellCommand.execute();
        sellCommand = new SellCommand(chocolate2, 100, 32.88);
        sellCommand.execute();
        sellCommand = new SellCommand(chocolate3, 100, 38.66);
        sellCommand.execute();


        WorkCommand workCommand = new WorkCommand(WorkerType.Engineer, "Cindy-Test-1");
        workCommand.execute();
        workCommand = new WorkCommand(WorkerType.Manager, "Test-2");
        workCommand.execute();
        workCommand = new WorkCommand(WorkerType.ProductionWorker, "Test-3");
        workCommand.execute();
        workCommand = new WorkCommand(WorkerType.MaintenanceWorker, "Test-4");
        workCommand.execute();
    }
}
