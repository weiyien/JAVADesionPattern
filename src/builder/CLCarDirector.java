package builder;

/**
 * @author: 魏薏恩
 * @date: 2019/4/6 15:48
 * @description:
 */
public class CLCarDirector implements CarDirector {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    @Override
    public Car directCar() {
        String engine = carBuilder.createEngine();
        String seat = carBuilder.createSeat();
        Car car = new Car();
        car.setEngine(engine);
        car.setSeat(seat);
        return car;
    }
}
