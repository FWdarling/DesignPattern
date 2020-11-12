package MVC;

import Iterator.SportsMan;

public class SportsManController {

    private SportsManView view;
    private SportsMan model;

    public SportsManController(SportsMan _model,SportsManView _view){
        view=_view;
        model=_model;
    }

    public void SetManName(String name)
    {
        model.ModifyName(name);
    }

    public void SetManAge(int age)
    {
        model.ModifyAge(age);
    }

    public String GetManName()
    {
        return model.GetName();
    }

    public int GetManAge()
    {
        return model.GetAge();
    }

    public void PrintDetails(String name,int age)
    {
        view.printSportsManDetails(name,age);
    }


}
