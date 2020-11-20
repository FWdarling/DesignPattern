package specification;

import entity.FoodType;
import specification.selector.FoodTypeSelector;
import specification.selector.MassGreaterThanSelector;
import entity.Athlete;

public class SelectorDemo {
    /**
     * 测试规则：拳击比赛
     * 参赛选手需要满足：
     * - 是肉食动物
     * - 体重大于 300kg
     * @param athlete
     * @return boolean
     */
    public static boolean boxingSelector(Athlete athlete) {
        final FoodTypeSelector foodTypeSelector = new FoodTypeSelector(FoodType.CARNIVORE);
        final MassGreaterThanSelector massSelector = new MassGreaterThanSelector(200);
        return foodTypeSelector.and(massSelector).test(athlete);
    }
}
