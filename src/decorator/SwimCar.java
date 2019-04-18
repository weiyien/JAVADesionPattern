package decorator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 13:58
 * @description:
 */
public class SwimCar extends SuperCar {
    public SwimCar(Car car) {
        super(car);
        System.out.println("swimcar is complete");
    }

    public void swim() {
        System.out.println("car swim");
    }

    @Override
    public void move() {
        super.move();
        this.swim();
    }
}
