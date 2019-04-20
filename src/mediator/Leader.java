package mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 15:45
 * @description:
 */
public class Leader implements Mediator {
    private Map<String, Department> map = new HashMap<>();

    @Override
    public void register(String name, Department department) {
        map.put(name, department);
    }

    @Override
    public void command(String name) {
        map.get(name).selfAction();
    }
}
