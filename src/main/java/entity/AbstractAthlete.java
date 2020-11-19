package entity;

/**
 * 抽象运动员类
 * 用于派生实际运动员类和空运动员类
 * 拥有一个成员变量：运动员名
 * 拥有一个方法：play，用于打印答到上场
 */
public class AbstractAthlete {
    protected String name;

    public String getName() {
        return name;
    }

    /**
     * 答到上场方法
     * 打印运动员名，以及声明自己已经上场
     */
    public void play(){
        System.out.println(name + "到！现在上场！");
    }
}
