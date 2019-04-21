package observer;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 11:49
 * @description:
 */
public class ConcreteSubject extends Subject {
    private boolean state;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
        this.notifyObserver();
    }

}
