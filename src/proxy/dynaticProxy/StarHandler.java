package proxy.dynaticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: 魏薏恩
 * @date: 2019/4/15 17:03
 * @description:
 */
public class StarHandler implements InvocationHandler {
    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        if (method.getName().equals("sing")) {
            object = method.invoke(realStar, args);
        } else {

        }
        return object;
    }
}
