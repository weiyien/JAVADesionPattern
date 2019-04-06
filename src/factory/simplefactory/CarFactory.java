package factory.simplefactory;

/**
 * @author: 魏薏恩
 * @date: 2019/4/5 14:27
 * @description: 汽车工厂类, 简单工厂模式(静态工厂模式)
 */
public class CarFactory {
    public static Car createCar(String type) {
        if ("BMW".equals(type)) {
            return createBMW();
        } else if ("Audi".equals(type)) {
            return createAudi();
        } else {
            return null;
        }
    }

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createBMW() {
        return new BMW();
    }
}
