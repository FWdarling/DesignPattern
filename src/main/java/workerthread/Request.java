package workerthread;

/**
 * 补给请求
 */
public class Request {

    private final String name;
    private final int number;

    /**
     * 构造一个补给请求
     * @param name String 请求者线程（运动员）的名称
     * @param number int 请求编号
     */
    public Request(String name, int number) {
        this.name = name;
        this.number = number;
    }

    /**
     * 执行请求
     */
    public void execute(){
        System.out.println(Thread.currentThread().getName() + " executed " + this.toString());
    }

    /**
     * 用于打印输出
     * @return String
     */
    @Override
    public String toString() {
        return "Request=> " + "No." + number + "  Name." + name;
    }
}
