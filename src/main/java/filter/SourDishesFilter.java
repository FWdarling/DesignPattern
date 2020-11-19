package filter;

import entity.Dishes;
import entity.Taste;

import java.util.ArrayList;

/**
 * description: 继承父类DishesFIlter，用于筛选酸味的菜品
 * date: 11/11/20 11:35 PM
 * author: fourwood
 */
public class SourDishesFilter implements DishesFilter {

    @Override
    public ArrayList<Dishes> filter(ArrayList<Dishes> dishes) {
        ArrayList<Dishes> sourDishes = new ArrayList<Dishes>();
        for(Dishes dishes1 : dishes) {
            if(dishes1.getTaste().equals(Taste.sour)) {
                sourDishes.add(dishes1);
            }
        }
        return sourDishes;
    }
}