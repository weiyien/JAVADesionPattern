package proxy.dynaticProxy;

/**
 * @author: 魏薏恩
 * @date: 2019/4/15 16:38
 * @description:
 */
public class RealStar implements Star {

    @Override
    public void confer() {
        System.out.println("real confer");
    }

    @Override
    public void signContract() {
        System.out.println("real sign");
    }

    @Override
    public void sing() {
        System.out.println("real sing");
    }

    @Override
    public void bookTicket() {
        System.out.println("real booking");
    }

    @Override
    public void collectMoney() {
        System.out.println("real collect");
    }
}
