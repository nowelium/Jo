package lang.jo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import lang.jo.runtime.Slots;
import lang.jo.util.ClassUtils;

public class JoEnumerator<E> extends JoObject implements Iterable<E> {
    
    private List<E> list;
    
    protected static final Slots slot = new Slots();
    static {
        slot.put("each", new JoSlot(new EachMethod()));
    }
    
    public JoEnumerator(List<E> list){
        this.list = list;
    }
    
    public static <T extends JoObject> JoEnumerator<T> newInstance(Class<T> clazz, Set<?> set) {
        List<T> values = new ArrayList<T>();
        try {
            for(Object o: set){
                Constructor<T> ctor = ClassUtils.getConstructor(clazz, o.getClass());
                values.add(ClassUtils.newInstance(ctor, o));
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return new JoEnumerator<T>(values);
    }

    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public Slots allSlots() {
        return null;
    }
    
    private static class EachMethod extends JoMethod {

        @SuppressWarnings("unchecked")
        public JoObject call(JoObject object, JoArguments arguments) {
            JoEnumerator<? extends JoObject> enumerator = (JoEnumerator<? extends JoObject>) object;
            JoBlock block = arguments.get(0).getSlot("self").getBlock();
            
            JoObject lastObject = null;
            for(JoObject o: enumerator){
                try {
                    block.call(object, arguments);
                } finally {
                    lastObject = o;
                }
            }
            return lastObject;
        }

    }
    
}
