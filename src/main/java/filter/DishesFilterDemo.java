package filter;

import entity.Dishes;
import entity.Taste;

import java.util.ArrayList;

/**
 * description: 过滤器模式demo调用类
 * date: 11/12/20 12:00 AM
 * author: fourwood
 */
public class DishesFilterDemo {
    /*
     * description: 过滤器模式演示代码
     * date: 11/26/20 12:33 PM 
     * author: fourwood 
     * 
     * @param 
     * @return void
     */ 
    public static void dishesFilterTest() {
        ArrayList<Dishes> dishesArrayList = new ArrayList<Dishes>();
        System.out.println("                                        [ Dishes : Dishes() :  构造函数， 创建菜品]");
        System.out.println("开始创建菜单！");
        Dishes spicyDishes1 = new Dishes("辣子鸡", Taste.spicy);
        dishesArrayList.add(spicyDishes1);
        Dishes spicyDishes2 = new Dishes("麻婆豆腐", Taste.spicy);
        dishesArrayList.add(spicyDishes2);
        Dishes sourDishes1 = new Dishes("醋溜土豆丝", Taste.sour);
        dishesArrayList.add(sourDishes1);
        Dishes sourDishes2 = new Dishes("酸黄瓜", Taste.sour);
        dishesArrayList.add(sourDishes2);
        Dishes saltyDishes1 = new Dishes("蒜薹炒肉", Taste.salty);
        dishesArrayList.add(saltyDishes1);
        Dishes saltyDishes2 = new Dishes("红烧排骨", Taste.salty);
        dishesArrayList.add(saltyDishes2);
        Dishes sweetDishes1 = new Dishes("小蛋糕", Taste.sweet);
        dishesArrayList.add(sweetDishes1);
        Dishes sweetDishes2 = new Dishes("拔丝地瓜", Taste.sweet);
        dishesArrayList.add(sweetDishes2);

        System.out.println("                                        [ SpicyDishesFilter : filter() :  重载父类的抽象方法， 筛选辣的菜品]");
        System.out.println("开始生成辣的菜单！");
        SpicyDishesFilter spicyDishesFilter = new SpicyDishesFilter();
        ArrayList<Dishes> spicyDishes = spicyDishesFilter.filter(dishesArrayList);

        System.out.println("                                        [ SourDishesFilter : filter() :  重载父类的抽象方法， 筛选酸的菜品]");
        System.out.println("开始生成酸的菜单！");
        SourDishesFilter sourDishesFilter = new SourDishesFilter();
        ArrayList<Dishes> sourDishes = sourDishesFilter.filter(dishesArrayList);

        System.out.println("                                        [ SaltyDishesFilter : filter() :  重载父类的抽象方法， 筛选咸的菜品]");
        System.out.println("开始生成咸的菜单！");
        SaltyDishesFilter saltyDishesFilter = new SaltyDishesFilter();
        ArrayList<Dishes> saltyDishes = saltyDishesFilter.filter(dishesArrayList);

        System.out.println("                                        [ SweetDishesFilter : filter() :  重载父类的抽象方法， 筛选甜的菜品]");
        System.out.println("开始生成甜的菜单！");
        SweetDishesFilter sweetDishesFilter = new SweetDishesFilter();
        ArrayList<Dishes> sweetDishes = sweetDishesFilter.filter(dishesArrayList);

        System.out.println("辣口味菜品：");
        for(Dishes dishes : spicyDishes) System.out.println(dishes.getName() + "  " + dishes.getTaste().toString());
        System.out.println("\n酸口味菜品：");
        for(Dishes dishes : sourDishes) System.out.println(dishes.getName() + "  " + dishes.getTaste().toString());
        System.out.println("\n咸口味菜品：");
        for(Dishes dishes : saltyDishes) System.out.println(dishes.getName() + "  " + dishes.getTaste().toString());
        System.out.println("\n甜口味菜品：");
        for(Dishes dishes : sweetDishes) System.out.println(dishes.getName() + "  " + dishes.getTaste().toString());

    }
}
