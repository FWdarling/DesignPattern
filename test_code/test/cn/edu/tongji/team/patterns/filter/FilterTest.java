package cn.edu.tongji.team.patterns.filter;

import cn.edu.tongji.team.patterns.filter.AndFilter;
import cn.edu.tongji.team.patterns.filter.FerreroFilter;
import cn.edu.tongji.team.patterns.filter.OrFilter;
import cn.edu.tongji.team.patterns.filter.OrdinaryFilter;
import cn.edu.tongji.team.model.beans.chocolate.*;
import cn.edu.tongji.team.util.UI;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * description: FilterTest
 * date: 12/4
 * author: Li
 */
// 过滤器模式
public class FilterTest {

    @Test
    public void FilterTest()
    {
        List<Chocolate> chocolates = new ArrayList<>();
        chocolates.add(new Dove());
        chocolates.add(new Ferrero());
        chocolates.add(new Hershey());
        chocolates.add(new Dove(ChocolateType.Deluxe));
        chocolates.add(new Ferrero(ChocolateType.Deluxe));
        chocolates.add(new Hershey(ChocolateType.Premium));
        List<Chocolate> ferreros = new FerreroFilter().filter(chocolates);
        UI.printlnWithColor("过滤品牌为Ferrero的巧克力", UI.Color.BLUE);
        batchPrint(ferreros);
        List<Chocolate> ordinarys = new OrdinaryFilter().filter(chocolates);
        UI.printlnWithColor("过滤类型为普通的巧克力", UI.Color.BLUE);
        batchPrint(ordinarys);
        List<Chocolate> ferreroAndOrdinary = new AndFilter(new FerreroFilter(), new OrdinaryFilter()).filter(chocolates);
        UI.printWithColor("过滤品牌为Ferrero并且类型为普通的巧克力\n", UI.Color.BLUE);
        batchPrint(ferreroAndOrdinary);
        List<Chocolate> ferreroOrOrdinary = new OrFilter(new FerreroFilter(), new OrdinaryFilter()).filter(chocolates);
        UI.printWithColor("过滤品牌为Ferrero或者类型为普通的巧克力\n", UI.Color.BLUE);
        batchPrint(ferreroOrOrdinary);
    }
    public static void batchPrint(List<?> list){
        for(int i = 0; i < list.size(); i++) System.out.println(list.get(i).toString());
    }
}

