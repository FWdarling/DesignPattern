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
        ArrayList<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete("Bunny","rabbit"));
        athletes.add(new Athlete("Bubble","golden fish"));
        athletes.add(new Athlete("Tom","cat"));
        AthleteProxy athleteProxy = new AthleteProxy(athletes);
        Reporter reporter = new Reporter("Henry");
        String[] questions = {"How are you?", "How old are you?", "Can you win?"};
        reporter.interview(athleteProxy,"Bubble",questions);
        reporter.interview(athleteProxy,"Bunny",questions);
        reporter.interview(athleteProxy,"Jerry",questions);
        System.out.println("------------------------ END ------------------------");
    }
}
