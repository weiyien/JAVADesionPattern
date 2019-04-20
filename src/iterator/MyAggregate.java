package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 15:01
 * @description: 聚合对象
 */
public class MyAggregate {

    private List<Object> list = new ArrayList<>();

    public MyIterator generateAggregate() {
        return new ConcreteMyAggregate();
    }

    public void addObject(Object object) {
        list.add(object);
    }

    private class ConcreteMyAggregate implements MyIterator {
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void last() {
            cursor = list.size();
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size();
        }

        @Override
        public void next() {
            if (cursor != list.size()) {
                cursor++;
            }
        }

        @Override
        public Object getCurrentObject() {
            return list.get(cursor);
        }
    }
}
