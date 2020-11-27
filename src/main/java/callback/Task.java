package callback;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:31 2020/11/13
 * @Modified By:
 **/
public abstract class Task {
    public void executer(Callback callback){
        exec();
        if(callback != null){
            System.out.println("                                        " +
                    "[ Callback : callback() : 调用回调函数 ]");
            callback.call();
        }
    }


    /**
     exec is an abstract function to be defined by users, in the callback design patterns. The process is mainly devides into
     2 parts, first part is to finish a defined action which is implemented in exec. After finishing the exec function, then
     the callback procedure will be called, and conduct the callback actions.

     Args:

     Return Value:

     Example:
     >> exec();
     >> callback();
     **/
    abstract void exec();
}
