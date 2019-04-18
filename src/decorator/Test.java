package decorator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 13:59
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Car car = new CommonCar();
        car.move();
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        SwimCar swimCar = new SwimCar(car);
        swimCar.move();
        SwimCar swimCar1 = new SwimCar(flyCar);
        swimCar1.move();
        System.out.println("====");
        SwimCar swimCar2 = new SwimCar(new FlyCar(new CommonCar()));
        swimCar2.move();
    }
}
