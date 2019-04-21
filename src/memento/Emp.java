package memento;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 13:22
 * @description:
 */
public class Emp {
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public EmpMemento empMemento() {
        return new EmpMemento(this);
    }

    public void recovery(EmpMemento empMemento) {
        this.name = empMemento.getName();
        this.value = empMemento.getValue();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
