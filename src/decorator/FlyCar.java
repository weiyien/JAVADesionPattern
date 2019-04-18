package decorator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 13:56
 * @description:
 */
public class FlyCar extends SuperCar {
    public FlyCar(Car car) {
        super(car);
        System.out.println("flycar is complete");
    }

    public void fly() {
        System.out.println("car fly");
    }

    @Override
    public void move() {
        super.move();
        this.fly();
    }
}
