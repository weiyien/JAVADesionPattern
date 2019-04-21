package memento;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 13:22
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        Emp emp=new Emp();
        emp.setName("1");
        emp.setValue("1");
        System.out.println(emp.toString());
        careTaker.setEmpMemento(emp.empMemento());
        emp.setValue("2");
        System.out.println(emp.toString());
        emp.recovery(careTaker.getEmpMemento());
        System.out.println(emp.toString());
    }
}
