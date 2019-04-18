package decorator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 14:00
 * @description:
 */
public class CommonCar implements Car {
    public CommonCar() {
        System.out.println("car is complete");
    }

    @Override
    public void move() {
        System.out.println("car car");
    }
}
