package strategy;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 19:06
 * @description: 负责和具体的策略交互 策略和客户端分离,使得算法可以独立于客户端发生变化
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void getPrice(double price) {
        System.out.println("报价" + strategy.getPrice(price));
    }
}
