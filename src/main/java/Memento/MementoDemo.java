package Memento;

import Memento.entity.Athlete;
import Memento.entity.Event;
import Memento.entity.Species;

/**
 * description: 备忘录模式(Memento)调用类
 * data: 11/13/20 17:25 PM
 * author: cjsmt
 */
public class MementoDemo {
    public static void main(String[] args) {
        EventEntryForm eventEntryForm = new EventEntryForm(Event.RUN);
        MemoManager memoManager = new MemoManager();
        Athlete athlete1 = new Athlete("niao", Species.Bird);
        Athlete athlete2 = new Athlete("chongzi", Species.Insect);
        Athlete athlete3 = new Athlete("qiuqiu", Species.Cat);

        memoManager.setEntryFormMemo(eventEntryForm.createMemo());  //创建备忘录
        eventEntryForm.addAthlete(athlete1.getSpecies());  //修改状态
        if (!eventEntryForm.checkSafety()){  //如果不安全
            eventEntryForm.restoreMemo(memoManager.getEntryFormMemo());  //恢复状态
            System.out.println("Not Safe! The current EventEntryForm is " + eventEntryForm.showAthleteList());
        }else {
            System.out.println("The current EventEntryForm is " + eventEntryForm.showAthleteList());
        }

        memoManager.setEntryFormMemo(eventEntryForm.createMemo());  //创建备忘录
        eventEntryForm.addAthlete(athlete2.getSpecies());  //修改状态
        if (!eventEntryForm.checkSafety()){  //如果不安全
            eventEntryForm.restoreMemo(memoManager.getEntryFormMemo());  //恢复状态
            System.out.println("Not Safe! The current EventEntryForm is " + eventEntryForm.showAthleteList());
        }else {
            System.out.println("The current EventEntryForm is " + eventEntryForm.showAthleteList());
        }

        memoManager.setEntryFormMemo(eventEntryForm.createMemo());  //创建备忘录
        eventEntryForm.addAthlete(athlete3.getSpecies());  //修改状态
        if (!eventEntryForm.checkSafety()){  //如果不安全
            eventEntryForm.restoreMemo(memoManager.getEntryFormMemo());  //恢复状态
            System.out.println("Not Safe! The current EventEntryForm is " + eventEntryForm.showAthleteList());
        }else {
            System.out.println("The current EventEntryForm is " + eventEntryForm.showAthleteList());
        }
    }
}
