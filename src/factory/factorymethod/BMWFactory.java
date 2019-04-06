package factory.factorymethod;

/**
 * @author: 魏薏恩
 * @date: 2019/4/6 13:59
 * @description:
 */
public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }
}
