package mediator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 15:44
 * @description:
 */
public class Market implements Department {
    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("跑市场");
    }

    @Override
    public void outAction() {
        System.out.println("要钱");
        mediator.command("finacial");
    }
}
