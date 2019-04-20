package command;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 18:28
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoke invoke = new Invoke();
        invoke.setCommand(command);
        invoke.call();
    }
}
