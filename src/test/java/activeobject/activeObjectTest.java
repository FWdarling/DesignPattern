package activeobject;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.junit.Test;

/**
 * @Author Amonkey00
 * @Description: ActiveObject模式代码测试
 **/
public class activeObjectTest {
    @Test
    public void activeObjectTest() {
        System.out.println("---------------- [Pattern] ActiveObject ----------------");
        SecuritySystem system = new SecuritySystem();
        Alarm carnivoreAreaAlarm = new Alarm(2000, "肉食动物区警报", system);
        Alarm herbivoreAreaAlarm = new Alarm(5000, "草食动物区警报", system);

        system.addAlarm(carnivoreAreaAlarm);
        system.addAlarm(herbivoreAreaAlarm);
        Alarm.ShutCommand shutCommand = new Alarm.ShutCommand();
        system.addCommand(new SleepCommand(10100, system, shutCommand));
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
        System.out.println("安保系统于"+df.format(new Date())+"开启");
        system.run();
        System.out.println("------------------------ END ------------------------");
    }
}
