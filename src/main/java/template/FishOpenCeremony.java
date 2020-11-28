package template;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:15 2020/11/13
 * @Modified By:
 **/
public class FishOpenCeremony extends DefaultOpenCeremony{

    /**
     openCeremonyPerform is a function that vary for the teams, each team have their own performance, therefore a unique
     class that extends OpenCeremony should be implemented. In the function, teams should realize their own method of
     performing.

     Args:

     Return Value:

     Example:


     **/
    @Override
    public void openCeremonyPerform(){
        System.out.println("鱼代表队表演了咸鱼翻身！\n");
    }
}
