package activeobject;
import command.*;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * 警报命令代表唤醒时相应警报会进行报告，
 * 可以作为延迟命令的唤醒命令加入到安保系统中
 */
public class Alarm implements Command {

    private long _gapTime;//警报间隔报告时间ms
    private String _alarmName;
    private static boolean _stop=false;//警报系统开启和关闭状态
    private static SecuritySystem _system=null;//所有的警报都在同一个安保系统下运行

    /**
     * 警报命令初始化
     * @param gapTime 警报间隔报告时间ms
     * @param alarmName 警报名称
     * @param system 运行的安保系统
     */
    public Alarm(long gapTime,String alarmName,SecuritySystem system){
        _gapTime=gapTime;
        _alarmName=alarmName;
        _system=system;
    }

    /**
     * 获取私有成员信息
     */
    public long getGapTime(){return _gapTime;}
    public SecuritySystem getSystem(){return _system;}

    /**
     * 警报命令的执行
     */
    @Override
    public void execute(){
        //如果安保系统正在工作且执行到报告
        if(!_stop){
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
            System.out.println(_alarmName+" 于"+df.format(new Date())+"进行报告....");
            //重新将本指令添加延迟后加入到安保系统中
            _system.addCommand(new SleepCommand(_gapTime,_system,this));
        }
        else{
            System.out.println("警报 "+_alarmName+"关闭，停止工作");
        }
    }

    /**
     * 调用关闭警报命令，可以让警报处于关闭状态
     */
    public static class ShutCommand implements Command{
        @Override
        public void execute(){
            System.out.println("关闭警报命令执行");
            Alarm._stop=true;
        }
    }
}
