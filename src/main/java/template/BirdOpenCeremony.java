package template;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:17 2020/11/13
 * @Modified By:
 **/
public class BirdOpenCeremony extends DefaltOpenCeremony implements OpenCeremony{

    @Override
    public void OpenCeremonyPerform(){
        System.out.println("鸟代表队表演了老鹰捉小鸡！\n");
    }
}
