package iterator;


import entity.SportsMan;

public class SportsManIterator implements MenuIterator<SportsMan>{

    private ManCollection sportsMan;
    private int index;

    /**
     * 构造函数
     * @param Shelf
     */
    public SportsManIterator(ManCollection Shelf) {
        this.sportsMan = Shelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < sportsMan.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        SportsMan man = sportsMan.getManAt(index);

        index++;
        return man;
    }

}
