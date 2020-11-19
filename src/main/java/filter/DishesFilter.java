package filter;

import entity.Dishes;

import java.util.ArrayList;

/**
 * description: 过滤器抽象类
 * date: 11/11/20 11:18 PM
 * author: fourwood
 */
public interface DishesFilter {
    /**
     * description: 过滤抽象函数,由不同的需求子类去实现，过滤器模式使用
     * date: 11/11/20 11:25 PM 
     * author: fourwood 
     * 
     * @param dishes 要被过滤的菜品数组
     * @return java.util.ArrayList<entity.Dishes> 过滤出来的菜品数组
     */ 
    public abstract ArrayList<Dishes> filter(ArrayList<Dishes> dishes);
}
