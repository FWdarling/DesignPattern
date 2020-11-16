package template;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:07 2020/11/13
 * @Modified By:
 **/
public abstract class DefaultOpenCeremony{
    /**
     Open Ceremony is a fixed procedure except the performance of different teams. Teams from all areas perform the
     most typical program of their regions and nations.

     Therefore we can generalize the open ceremony into 2 main parts, the performance and the rest. All teams act the
     same during the other part than the perform which we can make it a template.

     Args:

     Return Value:

     Example:
     >> OpenCeremony openceremony = new OpenCeremony();
     >> openceremony.openCeremonyProcess();
     **/

    public void openCeremonyProcess() {
        System.out.println("代表队进入体育场\n");
        System.out.println("代表队向运动场内观众致意\n");
        System.out.println("代表队走过半场来到最后一个直道\n");
        System.out.println("代表队停止等待前方代表队表演\n");
        System.out.println("代表队到达主席台\n");
        openCeremonyPerform();
        System.out.println("代表队走出运动场！\n\n");
    }

    /**
     openCeremonyPerform is a function that vary for the teams, each team have their own performance, therefore a unique
     class that extends OpenCeremony should be implemented. In the function, teams should realize their own method of
     performing.

     Args:

     Return Value:

     Example:


     **/
    public abstract void openCeremonyPerform();
}
