package iterator;

public interface MenuIterator<T>{
    /**
     * 由两种iterator继承
     * @return
     */


    public abstract boolean hasNext();
    public abstract Object next();


}
