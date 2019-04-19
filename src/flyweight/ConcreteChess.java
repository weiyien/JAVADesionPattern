package flyweight;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 17:11
 * @description: 享元具体类
 */
public class ConcreteChess implements ChessFlyWeight {
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("颜色" + this.color + ",位置:" + coordinate.getX() + ":" + coordinate.getY());
    }
}
