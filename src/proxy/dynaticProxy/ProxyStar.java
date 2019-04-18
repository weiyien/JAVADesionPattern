package proxy.dynaticProxy;

/**
 * @author: 魏薏恩
 * @date: 2019/4/15 17:39
 * @description:
 */
public class ProxyStar implements Star {
    private StarHandler starHandler;

    public ProxyStar(StarHandler starHandler) {
        this.starHandler = starHandler;
    }

    @Override
    public void confer() throws Throwable {
        starHandler.invoke(this, this.getClass().getMethod("confer"), null);
    }

    @Override
    public void signContract() throws Throwable {
        starHandler.invoke(this, this.getClass().getMethod("signContract"), null);
    }

    @Override
    public void sing() throws Throwable {
        starHandler.invoke(this, this.getClass().getMethod("sing"), null);
    }

    @Override
    public void bookTicket() throws Throwable {
        starHandler.invoke(this, this.getClass().getMethod("bookTicket"), null);
    }

    @Override
    public void collectMoney() throws Throwable {
        starHandler.invoke(this, this.getClass().getMethod("collectMoney"), null);
    }
}
