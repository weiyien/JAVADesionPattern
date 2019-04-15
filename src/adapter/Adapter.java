package adapter;

/**
 * @author: 魏薏恩
 * @date: 2019/4/15 14:34
 * @description: 适配器
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void handleRequest() {
        request();
    }
}
