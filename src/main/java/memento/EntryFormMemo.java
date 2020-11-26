package memento;

import entity.Species;

/**
 * description: 备忘录(memento),用于存储报名表状态
 * data: 11/13/20 17:28 PM
 * author: cjsmt
 */
public class EntryFormMemo {
    private Species[] athleteList;
    private int currentNum;

    public EntryFormMemo(Species[] athleteList, int currentNum) {
        this.athleteList = athleteList;
        this.currentNum = currentNum;
    }

    public Species[] getAthleteList() {
        return athleteList;
    }

    public int getCurrentNum() {
        return currentNum;
    }

}
