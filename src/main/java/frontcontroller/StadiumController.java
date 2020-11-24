package frontcontroller;
import entity.ScoreBoard;
import builder.*;
import entity.Stadium;

public class StadiumController {

    private StadiumDirector model;
    private StadiumView view;


    public StadiumController(StadiumDirector model, StadiumView view)
    {
        this.model=model;
        this.view=view;
    }



    public void printDetails()
    {
        model.getStadium();
        //由于Constractor中已经提供了该方法,View基本无用
        //view.showStadium("","",1,2,3,4);
    }


}
