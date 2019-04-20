package command;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 18:26
 * @description: 调用者
 */
public class Invoke {


    private Command command;

    public void call() {
        command.handler();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
