package Proxy;

public class Reporter {
    private String name;

    public Reporter(String name) {
        this.name = name;
    }

    public void interview(AthleteProxy athleteProxy, String interviewee, String[] questions) throws InterruptedException {
        athleteProxy.interview(this.name, interviewee, questions);
    }
}
