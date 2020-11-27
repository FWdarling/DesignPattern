package specification.selector;

import entity.Athlete;
import entity.FoodType;

/**
 * 食物属性选择类
 */
public class FoodTypeSelector extends AbstractSelector<Athlete> {

    private final FoodType foodType;

    public FoodTypeSelector(FoodType f) {
        this.foodType = f;
    }

    /**
     * @description 测试运动员是否符合规定的食肉/食草属性
     * @param t Athlete
     * @return boolean
     */
    @Override
    public boolean test(Athlete t) {
        boolean result = t.getFoodType().equals(foodType);
        if (result) {
            System.out.println("Check passed! "+ t.getName() +" is a " + foodType + " animal" );
        }
        else {
            System.out.println("Check failed! "+ t.getName() +" is not a " + foodType + " animal" );
        }
        return result;
    }
}
