package memento;

/**
 * @author: 魏薏恩
 * @date: 2019/4/21 13:22
 * @description:
 */
public class EmpMemento {
    private String name;
    private String value;

    public EmpMemento(Emp e) {
        this.name = e.getName();
        this.value = e.getValue();
    }

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
}
