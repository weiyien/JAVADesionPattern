package adapter;

/**
 * @author: 魏薏恩
 * @date: 2019/4/15 14:34
 * @description: 适配器
 */
public class Adapter2 implements Target {
    private Adaptee adaptee;

    @Override
    public void handleRequest() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }
}
