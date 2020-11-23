package pipeline;

/**
 * description: 管道中各阶段的公共接口，
 * date: 11/23/20 00:04 AM
 * author: cjsmt
 * @param <I> 输入类型
 * @param <O> 输出类型
 */
public interface Sort<I, O> {
    O process(I input);
}
