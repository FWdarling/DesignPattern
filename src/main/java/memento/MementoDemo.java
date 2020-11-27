package memento;

import entity.Athlete;
import entity.Event;
import entity.Species;

/**
 * description: 备忘录模式(memento)调用类
 * data: 11/13/20 17:25 PM
 * author: cjsmt
 */
public class MementoDemo {

    public static void mementoTest(){
        EventEntryForm eventEntryForm = new EventEntryForm(Event.RUN);
        MemoManager memoManager = new MemoManager();
        Athlete athlete1 = new Athlete("niao", Species.Bird);
        Athlete athlete2 = new Athlete("chongzi", Species.Insect);
        Athlete athlete3 = new Athlete("qiuqiu", Species.Cat);


        System.out.println("                                        [ EventEntryForm : createMemo() : 发起者生成记载当前运动员报名表信息的备忘录 ]");
        System.out.println("                                        [ MemoManager : setEntryFormMemo(EntryFormMemo) : 管理者存储刚刚新创建的备忘录 ]");
        System.out.println("                                        [ MemoManager : getEntryFormMemo() : 管理者返回存储的备忘录 ]");
        System.out.println("                                        [ EventEntryForm : processRegistration(EntryFormMemo, Athlete) : 处理运动员报名 ]");
        System.out.println("                                        [ EventEntryForm : addAthlete(Species) : 将运动员添加到运动员报名表当中 ]");
        System.out.println("                                        [ EventEntryForm : checkSafety() : 检查运动员报名表中有无相互捕食的选手同时存在 ]");
        System.out.println("                                        [ EventEntryForm : restoreMemo(EntryFormMemo) : 如果不安全，从备忘录中恢复运动员报名表信息 ]");
        System.out.println("                                        [ EventEntryForm : showAthleteList() : 打印运动员报名表]");

        memoManager.setEntryFormMemo(eventEntryForm.createMemo());  //创建备忘录
        eventEntryForm.processRegistration(memoManager.getEntryFormMemo(), athlete1);  //处理报名

        memoManager.setEntryFormMemo(eventEntryForm.createMemo());  //创建备忘录
        eventEntryForm.processRegistration(memoManager.getEntryFormMemo(), athlete2);  //处理报名

        memoManager.setEntryFormMemo(eventEntryForm.createMemo());  //创建备忘录
        eventEntryForm.processRegistration(memoManager.getEntryFormMemo(), athlete3);  //处理报名

    }
}
