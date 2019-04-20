package strategy;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 19:04
 * @description:
 */
public class OldFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("老少量用户");
        return price * 0.9;
    }
}
