package activeobject;
import command.*;

import java.util.ArrayList;


public class SecuritySystem {
    private ArrayList<Command> _cmdList=new ArrayList<>();

    /**
     * 向安保系统增加基础命令
     * @param cmd
     */
    public void addCommand(Command cmd){
        _cmdList.add(cmd);
    }

    /**
     * 向安保系统增加警报命令快捷函数
     * @param alarm
     */
    public void addAlarm(Alarm alarm){
        _cmdList.add(new SleepCommand(alarm.getGapTime(),
                alarm.getSystem(),
                alarm));
    }

    /**
     * 运行安保系统
     */
    public void run(){
        while(!_cmdList.isEmpty()){
            Command nowCmd=(Command)_cmdList.get(0);
            _cmdList.remove(0);
            nowCmd.execute();
        }
    }

}
