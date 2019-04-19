package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 17:04
 * @description: 享元工厂
 */
public class ChessFlyWeightFactory {
    private static Map<String, ChessFlyWeight> chessFlyWeightHashMap = new HashMap<>();

    public static ChessFlyWeight getChess(String color) {
        if (chessFlyWeightHashMap.containsKey(color)) {
            return chessFlyWeightHashMap.get(color);
        } else {
            ChessFlyWeight chessFlyWeight = new ConcreteChess(color);
            chessFlyWeightHashMap.put(color, chessFlyWeight);
            return chessFlyWeight;
        }
    }
}
