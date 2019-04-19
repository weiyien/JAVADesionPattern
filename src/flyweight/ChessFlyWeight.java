package flyweight;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 17:04
 * @description: 享元类
 */
public interface ChessFlyWeight {
    void setColor(String color);

    String getColor();

    void display(Coordinate coordinate);
}
