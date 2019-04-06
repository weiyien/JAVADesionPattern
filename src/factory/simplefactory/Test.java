package factory.simplefactory;

/**
 * @author: 魏薏恩
 * @date: 2019/4/5 14:30
 * @description: 简单工厂模式
 * 某种程度不符合设计原则,但是实际使用的多
 * 特点: 结构复杂度低,代码复杂度低,客户端编程难度低,实际上使用多.
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
