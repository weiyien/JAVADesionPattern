package bridge;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 09:09
 * @description:
 */
public class ASUSComputer extends Computer {
    private Brand brand;

    public ASUSComputer(Brand brand) {
        super(brand);
        this.brand = brand;
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("电脑");
    }
}
