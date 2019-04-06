package factory.abstractfactory;

/**
 * @author: 魏薏恩
 * @date: 2019/4/6 14:27
 * @description:
 */
public class LowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("低端启动");
    }

    @Override
    public void start() {
        System.out.println("低端速度");
    }
}
