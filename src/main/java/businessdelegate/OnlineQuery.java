package businessdelegate;

public class OnlineQuery implements QueryService {
    @Override
    public void lookUp() {
        System.out.println("=================");
        System.out.println("开始进行线上查询成绩!");
        System.out.println("=================");
    }
}
