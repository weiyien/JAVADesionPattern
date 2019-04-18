package proxy.dynaticProxy;

import java.lang.reflect.Proxy;

/**
 * @author: 魏薏恩
 * @date: 2019/4/15 17:06
 * @description:
 */
public class Client {
    public static void main(String[] args) throws Throwable {
        Star realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);
        Star proxyStar = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
        proxyStar.confer();
        proxyStar.signContract();
        proxyStar.bookTicket();
        proxyStar.sing();
        proxyStar.collectMoney();
        Star proxyStar1 = new ProxyStar(starHandler);
        proxyStar1.confer();
        proxyStar1.signContract();
        proxyStar1.bookTicket();
        proxyStar1.sing();
        proxyStar1.collectMoney();
    }
}
