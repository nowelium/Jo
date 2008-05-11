package lang.jo;

import java.util.Collection;

import lang.jo.core.annotation.Nullable;
import lang.jo.runtime.ImmnuteSlot;
import lang.jo.runtime.Slots;
import lang.jo.util.ClassUtils;

public class JoObject extends JoPrototype {
    private static Object lock = new Object();
    private static JoObject INSTANCE = null;
    
    protected static final Slots objectSlot = new Slots();
    static {
        objectSlot.put("=", new JoSlot(new AssignMethod()));
        // TODO: hieralcal tree?
        objectSlot.put("Object", createReturnSelfSlot(getInstance()));
        objectSlot.put("Number", createReturnSelfSlot(JoNumber.class));
        objectSlot.put("String", createReturnSelfSlot(JoString.class));
        objectSlot.put("List", createReturnSelfSlot(JoList.class));
        objectSlot.put("Call", createReturnSelfSlot(JoCall.class));
        objectSlot.put("System", createReturnSelfSlot(JoSystem.class));
    }
    
    public JoObject() {
        super();
        createSlot("self", this);
        createSlot("clone", new CloneMethod(this));
    }
    
    public static JoObject ioClone(){
        return objectSlot.get("clone").getBlock().call(null, null);
    }
    
    public static JoObject ioSelf(){
        return getInstance();
    }
    
    @Override
    public Slots allSlots() {
        return null;
    }

    @Override
    public JoObject createClone() {
        return this;
    }

    public JoObject call(JoCall call){
        JoMessage message = call.getMessage();
        String slotName = message.getName();
        if(hasSlot(slotName)){
            return call(getSlot(slotName), message.getArguments());
        }
        
        Collection<JoSlot> values = objectSlot.values();
        for(JoSlot _slot: values){
            Class<? extends JoSlot> clazz = _slot.getClass();
            if(!clazz.isAnnotationPresent(Nullable.class)){
                continue;
            }
            Nullable nullable = clazz.getAnnotation(Nullable.class);
            if(!nullable.value()){
                continue;
            }
            
            JoObject child = _slot.getBlock().call(null, null);
            if(child.hasSlot(slotName)){
                return call(child.getSlot(slotName), message.getArguments());
            }
        }
        throw new NoSuchMethodError(slotName);
    }
    
    public JoObject call(JoSlot slot, JoArguments args){
        return call(slot.getBlock(), args);
    }
    
    public JoObject call(JoBlock block, JoArguments args){
        return block.call(this, args);
    }
    
    private static JoObject getInstance(){
        synchronized(lock){
            if(INSTANCE == null){
                INSTANCE = new JoObject();
            }
            return INSTANCE;
        }
    }
    
    protected static JoSlot createReturnSelfSlot(Class<? extends JoObject> ioClass){
        try {
            return createReturnSelfSlot(ClassUtils.newInstance(ioClass));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    protected static JoSlot createReturnSelfSlot(JoObject object) {
        return new ImmnuteSlot(JoBlock.createReturnSelf(object));
    }
    
    private static class AssignMethod extends JoMethod {
        @Override
        public JoObject call(JoObject object, JoArguments parameter){
            object.setSlot(object.toString(), parameter.get(0));
            return object;
        }
    }
    
    private static class CloneMethod extends JoMethod {
        private JoObject self;
        public CloneMethod(JoObject ioObject){
            self = ioObject;
        }

        @Override
        public JoObject call(JoObject object, JoArguments arguments) {
            return self.createClone();
        }

    }
}
