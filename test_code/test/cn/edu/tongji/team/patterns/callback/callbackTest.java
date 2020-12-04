package cn.edu.tongji.team.test;

import cn.edu.tongji.team.model.beans.chocolate.Chocolate;
import cn.edu.tongji.team.model.beans.chocolate.ChocolateType;
import cn.edu.tongji.team.model.beans.chocolate.Ferrero;
import cn.edu.tongji.team.patterns.callback.MoneyCallback;
import cn.edu.tongji.team.patterns.command.SellCommand;
import cn.edu.tongji.team.util.UI;

/**
 * description: CallbackTest
 * date: 12/4/20 10:40 PM
 * author: Ming
 */
public class callbackTest {
    public static void main(String[] args) {
        //设定参数
        int sellNum = 100;
        double unitPrice = 25.21;

        //获取一个费列罗巧克力实例
        Chocolate chocolate = new Ferrero(ChocolateType.Premium);
        SellCommand sellCommand = new SellCommand(chocolate, sellNum, unitPrice);
        //执行回调函数
        sellCommand.executeCallback(new MoneyCallback(sellNum * unitPrice));
    }
}
