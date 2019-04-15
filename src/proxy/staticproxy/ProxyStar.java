package proxy.staticproxy;

/**
 * @author: 魏薏恩
 * @date: 2019/4/15 16:40
 * @description:
 */
public class ProxyStar implements Star {
    private Star realStar;

    public ProxyStar(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public void confer() {
        System.out.println("proxy confer");
    }

    @Override
    public void signContract() {
        System.out.println("proxy sign");
    }

    @Override
    public void sing() {
        realStar.sing();
    }

    @Override
    public void bookTicket() {
        System.out.println("proxy book");
    }

    @Override
    public void collectMoney() {
        System.out.println("proxy collect");
    }
}
