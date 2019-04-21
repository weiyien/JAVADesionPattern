package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 11:41
 * @description: 目标对象接口
 */
public class Subject {
    private List<Observer> list=new ArrayList<>();
    public void addObject(Observer observer){
        list.add(observer);
    }
    public void notifyObserver(){
        list.stream().forEach(observer -> observer.execute(this));
    }
}
