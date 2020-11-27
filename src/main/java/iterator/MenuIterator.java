package iterator;

public interface MenuIterator<T>{
    /**
     * 由两种iterator继承
     * @return
     */

    /**
     * 判断是否有下一个元素
     * @return
     */
    public abstract boolean hasNext();

    /**
     * 返回集合中的下一个元素
     * @return
     */
    public abstract Object next();


}
