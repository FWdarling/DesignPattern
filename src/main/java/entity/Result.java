package entity;

/**
 * 成绩单类
 */
public abstract class Result {
    protected String name;
    protected String units;
    protected String grade;

    /**
     * 打印成绩单
     * 抽象方法，由子类（具体项目成绩单）实现，因为每个项目的打印格式不同
     * 展示所有评价等级，男子与女子评价等级不一样，所以由子类（男、女子成绩单）实现
     */
    public abstract void showResult();

    /**
     * 展示所有评价等级
     * 男子与女子评价等级不一样，所以由子类（男、女子成绩单）实现
     */
    public void showAllGrade(){
        return;
    };
}
