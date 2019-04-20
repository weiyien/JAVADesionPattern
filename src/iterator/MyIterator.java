package iterator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 14:59
 * @description: 迭代器接口
 */
public interface MyIterator {
    void first();

    void last();

    boolean hasNext();

    boolean isFirst();

    boolean isLast();

    void next();

    Object getCurrentObject();
}
