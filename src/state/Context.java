package state;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 10:27
 * @description: 状态维护类
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
        System.out.println("修改状态");
        state.handle();
    }

}
