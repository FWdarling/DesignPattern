package activeobject;
import command.*;

/**
 * 延迟命令是为某一种唤醒命令添加延迟的方式
 * 会不断添加到安保系统中进行循环，如果延迟时间足够则将唤醒命令
 * 添加到安保系统中，达到控制延迟效果
 */
public class SleepCommand implements Command {

    private Command _wakeupCommand=null;//当延迟结束执行的命令
    private SecuritySystem _system=null;//执行该命令的系统
    private long _sleepTime=0;//延迟的时间
    private long _startTime;//该延迟命令开始计时时间
    private boolean _started=false;//该延迟命令是否开始

    /**
     * 对延迟命令初始化
     * @param sleepTime 延迟的时间
     * @param system 执行该命令的系统
     * @param wakeupCommand 当延迟结束执行的唤醒命令
     */
    public SleepCommand(long sleepTime,SecuritySystem system,Command wakeupCommand){
        _wakeupCommand=wakeupCommand;
        _system=system;
        _sleepTime=sleepTime;
        _started=false;
    }

    /**
     * 延迟命令的执行
     */
    @Override
    public void execute(){
        //当前延迟指令还没有开始计算延迟
        if(!_started){
            _startTime=System.currentTimeMillis();
            _started=true;
            _system.addCommand(this);
        }
        //已经开始计算延迟
        else{
            //延迟时间未结束
            if(System.currentTimeMillis()-_startTime<_sleepTime){
                _system.addCommand(this);
            }
            //延迟时间已经结束
            else{
                _system.addCommand(_wakeupCommand);
            }
        }
    }
}
