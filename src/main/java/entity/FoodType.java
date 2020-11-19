/**
 * @description 运动员的食物种类属性，区分食草和食肉动物
 */
package entity;

public enum FoodType {
    HERBIVORE("herbivore"), CARNIVORE("carnivore");
    private final String title;
    FoodType(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }
}
