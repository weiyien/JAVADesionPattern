package decorator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 13:55
 * @description:
 */
public class SuperCar implements Car {
    protected Car car;

    public SuperCar(Car car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
