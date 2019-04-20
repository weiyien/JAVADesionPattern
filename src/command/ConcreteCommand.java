package command;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 18:30
 * @description:
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void handler() {
        receiver.action();
    }
}
