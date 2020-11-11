package Proxy;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * 运动员代理类，在疫情期间举办的运动会不能让记者和运动员直接接触，而运动员也没有太多时间被采访
 * 因此代理会将采访的前期工作和后续安排准备好，并将收集到的问题交给运动员本人进行回答
 */
public class AthleteProxy {
    //    代理类负责代理的真实运动员列表
    private final ArrayList<AnimalAthlete> animalAthletes;

    /**
     * 设置运动员
     *
     * @param animalAthletes 运动员列表
     */
    public AthleteProxy(ArrayList<AnimalAthlete> animalAthletes) {
        this.animalAthletes = animalAthletes;
    }

    /**
     * 准备录制场地
     *
     * @param interviewee 被采访者
     * @throws InterruptedException 抛出异常
     */
    private void prepareSpace(String interviewee) throws InterruptedException {
        System.out.println("Preparing answering space for " + interviewee + " ...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Finished.");
    }

    /**
     * 准备录制设备
     *
     * @param interviewer 被采访者
     * @throws InterruptedException 抛出异常
     */
    private void prepareEquipment(String interviewer) throws InterruptedException {
        System.out.println("Preparing recording equipments for " + interviewer + " ...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Finished.");
    }

    /**
     * 发布采访
     *
     * @param interviewee 被采访者
     * @throws InterruptedException 抛出异常
     */
    private void publishRecord(String interviewee) throws InterruptedException {
        System.out.println("Publishing the answers of " + interviewee + " ...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Finished.");
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
        AnimalAthlete animalAthlete = null;
//        查找欲采访运动员是否在本代理类中
        for (AnimalAthlete athlete : animalAthletes
        ) {
            if (athlete.getName().equals(interviewee)) {
                animalAthlete = athlete;
                break;
            }
        }
//        未找到运动员，采访中断
        if (animalAthlete == null) {
            System.out.println("Ooops, you've got a wrong name: " + interviewee);
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

