package template;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:07 2020/11/13
 * @Modified By:
 **/
public class DefaltOpenCeremony implements OpenCeremony{

    @Override
    public void OpenCeremonyProcess() {
        System.out.println("代表队进入体育场\n");
        System.out.println("代表队向运动场内观众致意\n");
        System.out.println("代表队走过半场来到最后一个直道\n");
        System.out.println("代表队停止等待前方代表队表演\n");
        System.out.println("代表队到达主席台\n");
        OpenCeremonyPerform();
        System.out.println("代表队走出运动场！\n\n");
    }

    @Override
    public void OpenCeremonyPerform(){
        System.out.println("clapping\n");
    }
}
