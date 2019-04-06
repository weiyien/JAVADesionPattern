package factory.simplefactory;

/**
 * @author: 魏薏恩
 * @date: 2019/4/5 14:30
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        testCommon();
        testFactory();
    }

    // 一般请情况
    public static void testCommon() {
        Car audi = new Audi();
        Car bmw = new BMW();
        audi.run();
        bmw.run();
    }

    // 简单工厂模式
    public static void testFactory() {
        Car audi = CarFactory.createCar("Audi");
        Car bmw = CarFactory.createCar("BMW");
        audi.run();
        bmw.run();
    }
}
