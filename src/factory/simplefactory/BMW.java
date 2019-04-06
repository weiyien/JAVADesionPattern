package factory.simplefactory;

/**
 * @author: 魏薏恩
 * @date: 2019/4/5 14:27
 * @description:
 */
public class BMW implements Car {
    @Override
    public void run() {
        System.out.println("BMW running.");
    }
}
