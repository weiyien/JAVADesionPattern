package factory.abstractfactory;

/**
 * @author: 魏薏恩
 * @date: 2019/4/6 14:30
 * @description:抽象工厂类 不可以增加产品, 可以增加产品族
 */
public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new HighCarFactory();
        CarFactory carFactory1 = new LowCarFactory();
        Engine engine = carFactory.createEngine();
        Engine engine1 = carFactory1.createEngine();
        engine.run();
        engine.start();
        engine1.run();
        engine1.start();
    }
}
