package memento;

import java.util.*;

import entity.Athlete;
import entity.Event;
import entity.Species;

/**
 *description: 发起者(originator),用户记录当前项目报名表状态,报名表表项为动物物种,为避免天敌动物相互吃掉而存在的设计模式。
 *data: 11/13/20 14:39 PM
 * author: cjsmt
 */
public class EventEntryForm {
    private Event event;
    private Species[] athleteList;
    private int currentNum = 0;
    private int maxNum = 10;
    private Species[] dangerSpecies = {Species.Insect, Species.Cat, Species.Snack};
    private Map predationMap = new HashMap();


    /**
     * description:构造函数，向捕食映射表中添加互相具有捕食关系的物种类别
     * @param event 预报名运动项目
     */
    public EventEntryForm(Event event) {
        this.event = event;
        athleteList = new Species[maxNum];
        predationMap.put(Species.Insect, new Species[]{Species.Bird, Species.Frog});
        predationMap.put(Species.Cat, new Species[]{Species.Fish, Species.Mouse});
        predationMap.put(Species.Snack, new Species[]{Species.Mouse, Species.Frog, Species.Rabbit, Species.Eagle});
    }

    /**
     * description: 检查运动员报名表中有无相互捕食的选手同时存在
     * @return
     */
    public boolean checkSafety() {
        for (Species athlete1 : athleteList) {
            if (Arrays.asList(dangerSpecies).contains(athlete1)) {
                for (Species athlete2 : athleteList) {
                    if(Arrays.asList(predationMap.get(athlete1)).contains(athlete2)) {
                        return false;
                    }
                }
                break;
            }
        }
        return true;
    }

    /**
     * description: 向运动员报名表中添加运动员，这里指添加其物种类别
     * @param candidate 参赛选手所属物种
     */
    public void addAthlete(Species candidate) {
        if(currentNum < maxNum){
            Species[] tempList = new Species[10];
            for (int i = 0; i < athleteList.length; i++) {
                tempList[i] = athleteList[i];
            }
            tempList[currentNum] = candidate;
            athleteList = tempList;
            currentNum += 1;
        }
    }

    /**
     * description: 用于从备忘录中恢复运动员报名表信息
     * @param entryFormMemo 备忘录
     */
    public void restoreMemo(EntryFormMemo entryFormMemo) {
        setAthleteList(entryFormMemo.getAthleteList());
        currentNum = entryFormMemo.getCurrentNum();
    }

    /**
     * description: 用于处理运动员报名操作
     * @param entryFormMemo 备忘录，一旦报名表不安全，将从备忘录中恢复报名表信息
     * @param athlete 运动员
     */
    public void processRegistration(EntryFormMemo entryFormMemo, Athlete athlete) {
        this.addAthlete(athlete.getSpecies());  //修改状态
        System.out.println("Dear sir, your application has been submitted, please wait for the security check.");
        if (!this.checkSafety()){  //如果不安全
            this.restoreMemo(entryFormMemo);  //恢复状态
            System.out.println("Not Safe! Your registration has failed. " +
                    "The current EventEntryForm is " + this.showAthleteList());
        }else {
            System.out.println("Congratulations! Your registration is successful. " +
                    "The current EventEntryForm is " + this.showAthleteList());
        }
    }

    public String showAthleteList() {
        String str = "";
        for (Species athlete : athleteList) {
            str = str + athlete + " ";
        }
        return str;
    }

    public void setAthleteList(Species[] athleteList) {
        this.athleteList = athleteList;
    }

    /**
     * description:生成记载当前运动员报名表信息的备忘录
     * @return
     */
    public EntryFormMemo createMemo() {
        return new EntryFormMemo(athleteList, currentNum);
    }

}
