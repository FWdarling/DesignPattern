package proxy;

import proxy.entity.AnimalAthlete;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Proxy测试类
 */
public class ProxyTest {
    @Test
    public void proxyTest() throws InterruptedException {
        System.out.println("------------------");
        System.out.println("This is Proxy Test");
        System.out.println("------------------");
        ArrayList<AnimalAthlete> animalAthletes = new ArrayList<>();
        animalAthletes.add(new AnimalAthlete("Bunny","rabbit"));
        animalAthletes.add(new AnimalAthlete("Bubble","golden fish"));
        animalAthletes.add(new AnimalAthlete("Tom","cat"));
        AthleteProxy athleteProxy = new AthleteProxy(animalAthletes);
        Reporter reporter = new Reporter("Henry");
        String[] questions = {"How are you?", "How old are you?", "Can you win?"};
        reporter.interview(athleteProxy,"Bubble",questions);
        reporter.interview(athleteProxy,"Bunny",questions);
        reporter.interview(athleteProxy,"Jerry",questions);
    }
}
