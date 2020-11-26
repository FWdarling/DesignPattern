package transferobject;

/**
 * 消息返回体
 */
public class Response {
    private Integer status;
    private String msg;
    private Object obj;

    Response(Integer status, String msg, Object obj) {
        this.msg = msg;
        this.status = status;
        this.obj = obj;
    }

    public static Response ok(Integer status, String msg, Object obj) {
        return new Response(status, msg, obj);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
