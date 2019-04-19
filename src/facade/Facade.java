package facade;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 16:37
 * @description:
 */
public class Facade {
    public void say() {
        new UnName1().say();
        new UnName2().say();
    }
}
