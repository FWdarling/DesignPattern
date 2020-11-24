package proxy;

import entity.Athlete;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * 运动员代理类，在疫情期间举办的运动会不能让记者和运动员直接接触，而运动员也没有太多时间被采访
 * 因此代理会将采访的前期工作和后续安排准备好，并将录制好的记者提问播放给运动员本人进行回答
 * 回答时由代理录制采访视频
 */
public class AthleteProxy {
    //    代理类负责代理的真实运动员列表
    private final ArrayList<Athlete> athletes;

    /**
     * 设置运动员
     *
     * @param athletes 运动员列表
     */
    public AthleteProxy(ArrayList<Athlete> athletes) {
        this.athletes = athletes;
    }

    /**
     * 准备录制场地
     *
     * @param interviewee 被采访者
     * @throws InterruptedException 抛出异常
     */
    private void prepareSpace(String interviewee) throws InterruptedException {
        System.out.println("正在为运动员" + interviewee + "准备录制场地...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("准备完毕");
    }

    /**
     * 准备录制设备
     *
     * @param interviewer 被采访者
     * @throws InterruptedException 抛出异常
     */
    private void prepareEquipment(String interviewer) throws InterruptedException {
        System.out.println("正在为记者" + interviewer + "录制采访问题...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("录制完毕");
    }

    /**
     * 发布采访
     *
     * @param interviewee 被采访者
     * @throws InterruptedException 抛出异常
     */
    private void publishRecord(String interviewee) throws InterruptedException {
        System.out.println("正在发布" + interviewee + "的采访视频...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("————完成————");
    }

    /**
     * 采访过程
     *
     * @param interviewer 采访者
     * @param interviewee 被采访者
     * @param questions   问题列表
     * @throws InterruptedException 异常
     */
    public void interview(String interviewer, String interviewee, String[] questions) throws InterruptedException {
        Athlete animalAthlete = null;
//        查找欲采访运动员是否在本代理类中
        for (Athlete athlete : athletes
        ) {
            if (athlete.getName().equals(interviewee)) {
                animalAthlete = athlete;
                break;
            }
        }
//        未找到运动员，采访中断
        if (animalAthlete == null) {
            System.out.println("抱歉，并没有名为" + interviewee + "的运动员");
            return;
        }
//        进行采访前期准备
        this.prepareSpace(interviewee);
        this.prepareEquipment(interviewer);
//        录制采访
        animalAthlete.interview(questions);
//        发布采访
        this.publishRecord(interviewee);
    }
}

