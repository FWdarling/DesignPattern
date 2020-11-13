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
            callback.call();
        }
    }
    abstract void exec();
}
