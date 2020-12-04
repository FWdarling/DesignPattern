package transferobject;

/**
 * 消息返回体
 */
public class Response {
    private Integer status;
    private String msg;
    private Object obj;

    /**
     * 构造函数
     * @param status
     * @param msg
     * @param obj
     */
    Response(Integer status, String msg, Object obj) {
        this.msg = msg;
        this.status = status;
        this.obj = obj;
    }

    /**
     * 设置返回体，封装返回的信息
     * @param status
     * @param msg
     * @param obj
     * @return
     */
    public static Response ok(Integer status, String msg, Object obj) {
        return new Response(status, msg, obj);
    }

    /**
     * 获取status
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取msg
     * @return
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置msg
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取obj
     * @return
     */
    public Object getObj() {
        return obj;
    }

    /**
     * 设置obj
     * @param obj
     */
    public void setObj(Object obj) {
        this.obj = obj;
    }
}
