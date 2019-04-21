package observer;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 11:52
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Observer observer1=new ObserverA();
        Observer observer2=new ObserverA();
        Observer observer3=new ObserverA();
        ConcreteSubject subject=new ConcreteSubject();
        subject.addObject(observer1);
        subject.addObject(observer2);
        subject.addObject(observer3);
        subject.setState(true);
        System.out.println(observer1.toString());
        System.out.println(observer2.toString());
        System.out.println(observer3.toString());
    }
}
