package observer.java;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 13:02
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();
        ObserverA observerA1=new ObserverA();
        ObserverA observerA2=new ObserverA();
        ObserverA observerA3=new ObserverA();
        subject.addObserver(observerA1);
        subject.addObserver(observerA2);
        subject.addObserver(observerA3);
        subject.setState(true);
        System.out.println(observerA1.isState());
        System.out.println(observerA2.isState());
        System.out.println(observerA3.isState());
    }
}
