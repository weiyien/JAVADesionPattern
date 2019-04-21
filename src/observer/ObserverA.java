package observer;

import state.Context;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 11:46
 * @description:
 */
public class ObserverA implements Observer {
    private boolean state;

    @Override
    public void execute(Subject state) {
        this.state = ((ConcreteSubject) state).isState();
    }

    @Override
    public String toString() {
        return "ObserverA{" +
                "state=" + state +
                '}';
    }
}
