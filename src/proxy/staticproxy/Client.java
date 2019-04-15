package proxy.staticproxy;

/**
 * @author: 魏薏恩
 * @date: 2019/4/15 16:42
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        Star proxyStar = new ProxyStar(realStar);
        proxyStar.confer();
        proxyStar.signContract();
        proxyStar.bookTicket();
        proxyStar.sing();
        proxyStar.collectMoney();
    }
}
