package strategy;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 19:04
 * @description:
 */
public class NewFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("新少量用户");
        return price;
    }
}
