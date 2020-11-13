package template;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:18 2020/11/13
 * @Modified By:
 **/
public class DogOpenCeremony extends DefaltOpenCeremony implements OpenCeremony{
    @Override
    public void OpenCeremonyPerform(){
        System.out.println("狗代表队表演了蜀犬吠日！\n");
    }
}
