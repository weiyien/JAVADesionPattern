package prototype;

import java.util.Date;

/**
 * @author: 魏薏恩
 * @date: 2019/4/6 16:54
 * @description:
 */
public class CarClone implements Cloneable {
    private String name;
    private Date date;

    public CarClone() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CarClone{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
