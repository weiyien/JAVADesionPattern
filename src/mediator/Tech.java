package mediator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 15:39
 * @description:
 */
public class Tech implements Department {
    private Mediator mediator;

    public Tech(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("tech", this);
    }

    @Override
    public void selfAction() {
        System.out.println("写代码");
    }

    @Override
    public void outAction() {
        System.out.println("要钱");
        mediator.command("finacial");
    }
}
