package lang.jo.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import lang.jo.JoObject;

public class ClassUtils {
    
    public static <T extends JoObject> Constructor<T> getConstructor(Class<T> target, Class<?>...constructorTypes) throws SecurityException, NoSuchMethodException {
        return target.getConstructor(constructorTypes);
    }
    
    public static <T extends JoObject> T newInstance(Constructor<T> constructor, Object...args) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return constructor.newInstance(args);
    }
    
    public static <T extends JoObject> T newInstance(Class<T> ioClass) throws InstantiationException, IllegalAccessException {
        return ioClass.newInstance();
    }

}
