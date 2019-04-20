package templatemethod;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 19:20
 * @description:
 */
public abstract class TemplateMethod {
    private void takeNumber() {
        System.out.println("取号码");
    }

    private void evaluate() {
        System.out.println("评价");
    }

    public abstract void transact();

    public final void process() {
        takeNumber();
        transact();
        evaluate();
    }
}
