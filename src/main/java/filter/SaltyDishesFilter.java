package filter;

import filter.entity.Dishes;
import filter.entity.Taste;

import java.util.ArrayList;

/**
 * description: 继承父类DishesFIlter，用于筛选咸味的菜品
 * date: 11/11/20 11:36 PM
 * author: fourwood
 */
public class SaltyDishesFilter implements DishesFilter {

    @Override
    public ArrayList<Dishes> filter(ArrayList<Dishes> dishes) {
        ArrayList<Dishes> saltyDishes = new ArrayList<Dishes>();
        for(Dishes dishes1 : dishes) {
            if(dishes1.getTaste().equals(Taste.salty)) {
                saltyDishes.add(dishes1);
            }
        }
        return saltyDishes;
    }
}