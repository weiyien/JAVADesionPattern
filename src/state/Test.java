package state;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 10:28
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Context context=new Context();
        State state=new FreeState();
        context.setState(state);
        State usingState=new UsingState();
        context.setState(usingState);
    }
}
