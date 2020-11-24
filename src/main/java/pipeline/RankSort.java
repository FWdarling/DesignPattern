package pipeline;

/**
 * description: 管道类，用于进行奖牌的排序
 * date: 11/23/20 00:21 AM
 * author: cjsmt
 * @param <I> 输入管道类型名
 * @param <O> 输出管道类型名
 */
public class RankSort<I, O> {
    private final Sort<I, O> currentSort;

    /**
     * description:构造函数，初始化管道类
     * @param currentSort
     */
    RankSort(Sort<I, O> currentSort){
        this.currentSort = currentSort;
    }

    /**
     * description:添加后续阶段类，用点方法调用
     * @param newSort
     * @param <K>
     * @return
     */
    <K> RankSort<I, K> addSort(Sort<O, K> newSort) {
        return new RankSort<>(input -> newSort.process(currentSort.process(input)));
    }

    O execute(I input){
        return currentSort.process(input);
    }
}
