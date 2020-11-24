package proxy;

import entity.Athlete;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Proxy测试类
 */
public class ProxyTest {
    @Test
    public void proxyTest() throws InterruptedException {
        System.out.println("---------------- [Pattern] Proxy ----------------");
//        定义运动员列表
        ArrayList<Athlete> athletes = new ArrayList<>();
//        加入运动员
        athletes.add(new Athlete("Jerry", "跑步"));
        athletes.add(new Athlete("泡泡", "游泳"));
        athletes.add(new Athlete("Tom", "跳高"));
//        运动员代理类，用运动员列表初始化
        AthleteProxy athleteProxy = new AthleteProxy(athletes);
//        记者类
        Reporter reporter = new Reporter("丽塔");
//        问题数组
        String[] questions = {"你是谁？", "你有信心获胜吗？", "你想对你的支持者说些什么？"};
//        采访
        reporter.interview(athleteProxy, "Jerry", questions);
        reporter.interview(athleteProxy, "泡泡", questions);
        reporter.interview(athleteProxy, "李华", questions);
        System.out.println("------------------------ END ------------------------");
    }
}
