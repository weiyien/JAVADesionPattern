package factory.abstractfactory;

/**
 * @author: 魏薏恩
 * @date: 2019/4/6 14:29
 * @description:
 */
public class HighCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new HighEngine();
    }
}
