package prototype;

import java.util.Date;

/**
 * @author: 魏薏恩
 * @date: 2019/4/6 16:58
 * @description: 原型模式,
 * todo 为什么浅复制和深复制结果一样呢??
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        testCarClone();
        testCarDeepClone();
    }

    public static void testCarClone() throws CloneNotSupportedException {
        CarClone carClone = new CarClone();
        carClone.setDate(new Date());
        carClone.setName("car1");
        CarClone carClone1 = (CarClone) carClone.clone();
        System.out.println(carClone.toString());
        System.out.println(carClone1.toString());
        carClone.setDate(new Date(123123123123L));
        System.out.println(carClone.toString());
        System.out.println(carClone1.toString());
    }

    public static void testCarDeepClone() throws CloneNotSupportedException {
        CarDeepClone carDeepClone = new CarDeepClone();
        carDeepClone.setDate(new Date());
        carDeepClone.setName("car1");
        CarDeepClone carDeepClone1 = (CarDeepClone) carDeepClone.clone();
        System.out.println(carDeepClone.toString());
        System.out.println(carDeepClone1.toString());
        carDeepClone.setDate(new Date(123123123123L));
        System.out.println(carDeepClone.toString());
        System.out.println(carDeepClone1.toString());
    }
}
