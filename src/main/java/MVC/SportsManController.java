package MVC;

import entity.SportsMan;

public class SportsManController {

    private SportsManView view;
    private SportsMan model;

    /**
     * 构造函数
     * @param model
     * @param view
     */
    public SportsManController(SportsMan model,SportsManView view){
        this.view=view;
        this.model=model;
    }

    /**
     * setter
     * @param name
     */
    public void setManName(String name)
    {
        model.modifyName(name);
    }

    /**
     * setter
     * @param age
     */
    public void setManAge(int age)
    {
        model.modifyAge(age);
    }

    /**
     * getter
     * @return
     */
    public String getManName()
    {
        return model.getName();
    }

    /**
     * getter
     * @return
     */
    public int getManAge()
    {
        return model.getAge();
    }

    /**
     * 打印运动员相关信息
     * @param name
     * @param age
     */
    public void printDetails(String name,int age)
    {
        view.printSportsManDetails(name,age);
    }


}
