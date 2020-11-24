package command;
import entity.*;
public class AnnounceCommand implements Command{
    //保存裁判和运动员信息
    private Referee _referee;
    private Athlete _athlete;


    public AnnounceCommand(Referee referee,Athlete athlete){
        _referee=referee;_athlete=athlete;
    }

    @Override
    public void execute(){
        System.out.println("裁判"+_referee.getName()+"向运动员"+ _athlete.getName()+"发令起跑");
        _athlete.start();
    }
}
