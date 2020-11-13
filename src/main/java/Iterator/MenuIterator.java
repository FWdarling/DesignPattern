package iterator;

public interface MenuIterator<T>{
    /**
     * 由两种iterator继承
     * @return
     */
    public abstract boolean HasNext();
    public abstract Object Next();
}
