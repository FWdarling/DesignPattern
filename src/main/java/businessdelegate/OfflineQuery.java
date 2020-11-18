package businessdelegate;

public class OfflineQuery implements QueryService {
    @Override
    public void lookUp() {
        System.out.println("=================");
        System.out.println("开始进行线下查询成绩!");
        System.out.println("=================");
    }
}
