package state;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 10:26
 * @description:
 */
public class UsingState implements State {
    @Override
    public void handle() {
        System.out.println("使用中");
    }
}
