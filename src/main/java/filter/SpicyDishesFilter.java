package filter;

import filter.entity.Dishes;
import filter.entity.Taste;

import java.util.ArrayList;

/**
 * description: 继承父类DishesFIlter，用于筛选辣味的菜品
 * date: 11/11/20 11:28 PM
 * author: fourwood
 */
public class SpicyDishesFilter implements DishesFilter{

    @Override
    public ArrayList<Dishes> filter(ArrayList<Dishes> dishes) {
        ArrayList<Dishes> spicyDishes = new ArrayList<Dishes>();
        for(Dishes dishes1 : dishes) {
            if(dishes1.getTaste().equals(Taste.spicy)) {
                spicyDishes.add(dishes1);
            }
        }
        return spicyDishes;
    }
}
