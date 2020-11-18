package abstractfactory.myapp;

import abstractfactory.framework.MaleResult;

/**
 * 男子跳远成绩单类
 */
public class MaleJumpingResult extends MaleResult {
    private double result;

    /**
     * 构造函数
     * 获取运动员姓名以及成绩，构造成绩单
     * 初始化变量，并根据成绩进行评级
     * @param name
     * @param result
     */
    public MaleJumpingResult(String name, double result){
        this.name = name;
        this.result = result;
        this.units = "m";

        if(result > 12){
            this.grade = "A";
        }
        else if(result > 9){
            this.grade = "B";
        }
        else if(result > 6){
            this.grade = "C";
        }
        else {
            this.grade = "D";
        }
    }

    /**
     * 打印成绩
     * 实现抽象方法，按跳远项目打印成绩单
     */
    @Override
    public void showResult(){
        System.out.println("Jumping result of " + name + "(MALE)");
        showAllGrade();
        System.out.println("You are " + result + units + " " + grade);
    }
}
