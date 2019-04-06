package builder;

/**
 * @author: 魏薏恩
 * @date: 2019/4/6 15:47
 * @description:
 */
public class Car {
    private String engine;
    private String seat;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void run() {
        System.out.println(toString() + " run.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
