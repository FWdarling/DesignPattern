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
     * - 体重大于 200kg
     * @param athlete
     * @return boolean
     */
    public static boolean boxingSelector(Athlete athlete) {
        final FoodTypeSelector foodTypeSelector = new FoodTypeSelector(FoodType.CARNIVORE);
        final MassGreaterThanSelector massSelector = new MassGreaterThanSelector(200);
        System.out.println("                                        " +
                "[ foodTypeSelector() : 拳击比赛的参赛选手需要是肉食动物 ]");
        System.out.println("                                        " +
                "[ AbstractSelector : and() : 对两个规约做并运算 ]");
        System.out.println("                                        " +
                "[ massSelector() : 拳击比赛的参赛选手体重需要大于 200kg ]");
        System.out.println("                                        " +
                "[ AbstractSelector : test() : 测试是否符合规约 ]");
        return foodTypeSelector.and(massSelector).test(athlete);
    }
}
