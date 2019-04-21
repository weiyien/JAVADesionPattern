package memento;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 13:22
 * @description:
 */
public class CareTaker {
    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }

    private EmpMemento empMemento;

}
