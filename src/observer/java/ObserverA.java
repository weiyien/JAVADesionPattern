package observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 12:58
 * @description:
 */
public class ObserverA implements Observer {
    private boolean state;
    @Override
    public void update(Observable o, Object arg) {
        this.state= ((ConcreteSubject) o).isState();
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
