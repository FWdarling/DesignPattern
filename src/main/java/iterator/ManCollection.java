package iterator;


import iterator.Aggregate;
import iterator.MenuIterator;
import iterator.SportsManIterator;
import iterator.entity.SportsMan;

public class ManCollection implements Aggregate {
    private SportsMan[] men;
    private int last = 0;
    //last用来指向数组的最后一个元素。

    public ManCollection(int maxsize) {
        this.men = new SportsMan[maxsize];
    }

    public SportsMan getManAt(int index) {
        return men[index];
    }

    public void appendMan(SportsMan man) {
        this.men[last] = man;
        last++;
    }

    /**
     * 返回数组索引的最后一位
     * @return
     */
    public int getLength() {
        return last;
    }

    //类似标准iterator返回一个迭代器。
    public MenuIterator iterator() {
        return new SportsManIterator(this);
    }

}
