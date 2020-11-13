package Memento;

import Memento.entity.Event;
import Memento.entity.Species;

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

    public EventEntryForm(Event event) {
        this.event = event;
        athleteList = new Species[maxNum];
    }
    public boolean checkSafety() {
        /**
         * 检查虫子是否与鸟或青蛙同时存在
         */
        for (Species athlete1 : athleteList) {
            if (athlete1 == Species.Insect) {
                for (Species athlete2 : athleteList) {
                    if(athlete2 == Species.Bird || athlete2 == Species.Frog) {
                        return false;
                    }
                }
                break;
            }
        }
        /**
         * 检查猫是否与鱼或老鼠同时存在
         */
        for (Species athlete1 : athleteList) {
            if (athlete1 == Species.Cat) {
                for (Species athlete2 : athleteList) {
                    if (athlete2 == Species.Fish || athlete2 == Species.Mouse) {
                        return false;
                    }
                }
            }
        }
        /**
         *检查蛇是否与青蛙、老鼠、兔子、鹰同时存在
         */
        for (Species athlete1 : athleteList) {
            if (athlete1 == Species.Snack) {
                for (Species athlete2 : athleteList) {
                    if (athlete2 == Species.Frog || athlete2 == Species.Mouse ||
                            athlete2 == Species.Rabbit || athlete2 == Species.Eagle) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

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

    public String showAthleteList() {
        String str = "";
        for (Species athlete : athleteList) {
            str = str + athlete + " ";
        }
        return str;
    }

    public Species[] getAthleteList() {
        return athleteList;
    }

    public void setAthleteList(Species[] athleteList) {
        this.athleteList = athleteList;
    }

    public EntryFormMemo createMemo() {
        return new EntryFormMemo(athleteList, currentNum);
    }

    public  void restoreMemo(EntryFormMemo entryFormMemo) {
        setAthleteList(entryFormMemo.getAthleteList());
        currentNum = entryFormMemo.getCurrentNum();
    }
}
