package builder;

/**
 * @author: 魏薏恩
 * @date: 2019/4/6 15:48
 * @description:
 */
public class CLCarBuilder implements CarBuilder {

    @Override
    public String createSeat() {
        return "seat";
    }

    @Override
    public String createEngine() {
        return "engine";
    }
}
