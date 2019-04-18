package bridge;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 09:08
 * @description:
 */
public class Computer {
    private Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void sale() {
        brand.sale();
    }
}
