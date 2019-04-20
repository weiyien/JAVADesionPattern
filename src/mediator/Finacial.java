package mediator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 15:38
 * @description:
 */
public class Finacial implements Department {
    private Mediator mediator;

    public Finacial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("finacial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱");
    }

    @Override
    public void outAction() {
        System.out.println("发钱");
    }
}
