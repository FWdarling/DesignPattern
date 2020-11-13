package template;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:04 2020/11/13
 * @Modified By:
 **/
public interface OpenCeremony {
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
    public void openCeremonyProcess();

    /**
     openCeremonyPerform is a function that vary for the teams, each team have their own performance, therefore a unique
     class that extends OpenCeremony should be implemented. In the function, teams should realize their own method of
     performing.

     Args:

     Return Value:

     Example:


     **/
    public void openCeremonyPerform();
}
