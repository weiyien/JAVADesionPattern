package strategy;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 19:06
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        NewFewStrategy newFewStrategy = new NewFewStrategy();
        NewLotStrategy newLotStrategy = new NewLotStrategy();
        Context context1 = new Context(newFewStrategy);
        Context context2 = new Context(newLotStrategy);
        context1.getPrice(1000);
        context2.getPrice(1000);
    }
}
