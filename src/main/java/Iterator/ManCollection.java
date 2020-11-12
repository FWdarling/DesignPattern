package Iterator;


public class ManCollection implements Aggregate{
    private SportsMan[] men;
    private int last = 0;

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
    public int getLength() {
        return last;
    }
    public MenuIterator iterator() {
        return new SportsManIterator(this);
    }

}
