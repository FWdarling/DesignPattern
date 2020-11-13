package callback;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:53 2020/11/13
 * @Modified By:
 **/
public interface Callback {
    /**
     callback is called when a process comes to an end. It will callback therefore to inform the caller. The call function
     is used to realize the specific process of a unique callback procedure.

     Args:

     Return Value:

     Example:
     >> Callback callback = new Callback();
     >> callback.call();
     **/
    public void call();
}
