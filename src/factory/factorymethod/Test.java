package factory.factorymethod;

/**
 * @author: 魏薏恩
 * @date: 2019/4/6 14:00
 * @description: 工厂方法模式
 * 不修改已有的类,增加新的工厂类实现扩展
 * 特点: 结构复杂度高,代码复杂度高,客户端编程难度高,理论上推荐使用,实际上使用少.
 */
public class Test {
    public static void main(String[] args) {
        createCar();
    }

    static void createCar() {
        Car audi = new AudiFactory().createCar();
        Car bmw = new BMWFactory().createCar();
        audi.run();
        bmw.run();
    }
}
