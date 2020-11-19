package entity;

/**
 * description: 记录物种的枚举类，彼此之间包含一定的食物链关系，在运动会报名时，存在食物链关系的物种不能报名参与同一个项目
 * data: 11/13/20 14:39 PM
 * author: cjsmt
 */
public enum Species {
    Bird, Insect, Cat, Fish, Mouse, Snack, Frog, Rabbit, Eagle,
//    鸟吃虫子，青蛙吃虫子，猫吃鱼和老鼠，蛇吃青蛙和兔子和老鼠，鹰吃蛇
}
