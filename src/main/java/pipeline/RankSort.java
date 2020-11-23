package pipeline;

/**
 * description: 管道类，用于进行奖牌的排序
 * date: 11/23/20 00:21 AM
 * author: cjsmt
 * @param <I>
 * @param <O>
 */
public class RankSort<I, O> {
    private final Sort<I, O> currentSort;

    RankSort(Sort<I, O> currentSort){
        this.currentSort = currentSort;
    }

    <K> RankSort<I, K> addSort(Sort<O, K> newSort) {
        return new RankSort<>(input -> newSort.process(currentSort.process(input)));
    }

    O execute(I input){
        return currentSort.process(input);
    }
}
