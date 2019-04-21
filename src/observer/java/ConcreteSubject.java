package observer.java;

import java.util.Observable;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 12:57
 * @description:
 */
public class ConcreteSubject extends Observable {
    private boolean state;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }

}
