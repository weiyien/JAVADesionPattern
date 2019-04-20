package iterator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 15:05
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        MyAggregate myAggregate = new MyAggregate();
        myAggregate.addObject("aa");
        myAggregate.addObject("bb");
        myAggregate.addObject("cc");
        MyIterator myIterator = myAggregate.generateAggregate();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.getCurrentObject());
            myIterator.next();
        }
    }
}
