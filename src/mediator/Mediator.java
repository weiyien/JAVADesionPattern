package mediator;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 15:36
 * @description:
 */
public interface Mediator {
    void register(String name, Department department);

    void command(String name);
}
