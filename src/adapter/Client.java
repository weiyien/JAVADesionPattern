package adapter;

/**
 * @author: 魏薏恩
 * @date: 2019/4/15 14:35
 * @description: 客户端类
 */
public class Client {
    public void request(Target target) {
        target.handleRequest();
    }

    public static void main(String[] args) {
        Target target = new Adapter();
        new Client().request(target);
        Adaptee adaptee = new Adaptee();
        Target target1 = new Adapter2(adaptee);
        new Client().request(target1);
    }
}
