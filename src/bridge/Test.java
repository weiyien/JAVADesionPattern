package bridge;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 09:10
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Brand brand = new ASUSBrand();
        Computer computer = new ASUSComputer(brand);
        computer.sale();
    }
}
