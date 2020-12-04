package template;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:13 2020/11/13
 * @Modified By:
 **/
public class BearOpenCeremony extends DefaultOpenCeremony{

    /**
     openCeremonyPerform is a function that vary for the teams, each team have their own performance, therefore a unique
     class that extends OpenCeremony should be implemented. In the function, teams should realize their own method of
     performing.

     Args:

     Return Value:

     Example:


     **/
    @Override
    public void openCeremonyPerform() {
        System.out.println("熊代表队表演了老熊蹭树！\n");
    }
}
