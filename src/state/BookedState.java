package state;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 10:26
 * @description:
 */
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("已预定");
    }
}
