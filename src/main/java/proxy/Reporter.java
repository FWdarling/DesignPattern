package proxy;

/**
 * 记者类
 */
public class Reporter {
//    记者名字
    private String name;

    /**
     * 构造方法
     * @param name 名字
     */
    public Reporter(String name) {
        this.name = name;
    }

    /**
     * 采访
     * @param athleteProxy 代理类
     * @param interviewee 采访运动员名称
     * @param questions 提问列表
     * @throws InterruptedException 异常
     */
    public void interview(AthleteProxy athleteProxy, String interviewee, String[] questions) throws InterruptedException {
        athleteProxy.interview(this.name, interviewee, questions);
    }
}
