package builder;

/**
 * @author: 魏薏恩
 * @date: 2019/4/6 16:09
 * @description: 构造器模式
 * 需要创建的对象比较复杂,且需要有其他依赖项目顺序执行时使用
 */
public class Test {
    public static void main(String[] args) {
        CLCarDirector clCarDirector = new CLCarDirector();
        CLCarBuilder clCarBuilder = new CLCarBuilder();
        clCarDirector.setCarBuilder(clCarBuilder);
        Car car = clCarDirector.directCar();
        car.run();
    }
}
