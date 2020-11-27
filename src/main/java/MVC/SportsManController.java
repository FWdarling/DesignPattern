package MVC;

import entity.SportsMan;

public class SportsManController {

    private SportsManView view;
    private SportsMan model;

    public SportsManController(SportsMan model,SportsManView view){
        this.view=view;
        this.model=model;
    }

    public void setManName(String name)
    {
        model.modifyName(name);
    }

    public void setManAge(int age)
    {
        model.modifyAge(age);
    }

    public String getManName()
    {
        return model.getName();
    }

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
