package iterator;


public interface Aggregate {
    /**
     * 运行时根据具体的类来确定对应的迭代器
     * @return
     */
    public MenuIterator iterator();
}
