package iterator;


import entity.SportsMan;

public class ManCollection implements Aggregate {
    private SportsMan[] men;
    private int last = 0;
    //last用来指向数组的最后一个元素。

    /**
     * 构造函数运动员集合
     * @param maxsize
     */
    public ManCollection(int maxsize) {
        this.men = new SportsMan[maxsize];
    }

    public SportsMan getManAt(int index) {
        return men[index];
    }

    /**
     * 添加运动员
     * @param man
     */
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

    /**
     * 类似标准iterator返回一个迭代器。
     * @return
     */
    public MenuIterator iterator() {
        return new SportsManIterator(this);
    }

}
