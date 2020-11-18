package abstractfactory.myapp;

import abstractfactory.framework.FemaleResult;

/**
 * 女子跳远成绩类
 */
public class FemaleJumpingResult extends FemaleResult {
    private double result;

    /**
     * 构造函数
     * 获取运动员姓名以及成绩，构造成绩单
     * 初始化变量，并根据成绩进行评级
     * @param name
     * @param result
     */
    public FemaleJumpingResult(String name, double result){
        this.name = name;
        this.result = result;
        this.units = "m";

        if(result > 10){
            this.grade = "A";
        }
        else if(result > 7){
            this.grade = "B";
        }
        else if(result > 4){
            this.grade = "C";
        }
        else {
            this.grade = "D";
        }
    }

    /**
     * 打印成绩单
     */
    @Override
    public void showResult(){
        System.out.println("Jumping result of " + name + "(FEMALE)");
        showAllGrade();
        System.out.println("You are " + result + units + " " + grade);
    }
}
