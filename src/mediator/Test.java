package mediator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 15:37
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new Leader();
        Finacial finacial = new Finacial(mediator);
        Tech tech = new Tech(mediator);
        Market market = new Market(mediator);
        market.selfAction();
        market.outAction();
    }
}
