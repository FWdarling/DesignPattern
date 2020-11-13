package iterator;


import iterator.entity.ManCollection;
import iterator.entity.SportsMan;

public class SportsManIterator implements MenuIterator<SportsMan>{

    private ManCollection sportsMan;
    private int index;

    public SportsManIterator(ManCollection Shelf) {
        this.sportsMan = Shelf;
        this.index = 0;
    }

    @Override
    public boolean HasNext() {
        if (index < sportsMan.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object Next() {
        SportsMan man = sportsMan.getManAt(index);

        index++;
        return man;
    }

}
