package flyweight;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 17:16
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        ChessFlyWeight chessFlyWeight1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chessFlyWeight2 = ChessFlyWeightFactory.getChess("黑色");
        System.out.println(chessFlyWeight1);
        System.out.println(chessFlyWeight2);
        chessFlyWeight1.display(new Coordinate(1, 1));
        chessFlyWeight2.display(new Coordinate(2, 2));
    }
}
