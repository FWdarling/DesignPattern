package memento;

/**
 * description: 管理者(Caretaker),对备忘录进行管理，能够访问或暂存备忘录
 * data: 11/13/20 17:28 PM
 * author: cjsmt
 */
public class MemoManager {
    private EntryFormMemo entryFormMemo;

    public void setEntryFormMemo(EntryFormMemo entryFormMemo) {
        this.entryFormMemo = entryFormMemo;
    }

    public EntryFormMemo getEntryFormMemo() {
        return entryFormMemo;
    }
}
