package lang.jo;

import lang.jo.runtime.JoFeatureMethod;
import lang.jo.runtime.Slots;

public class JoString  extends JoObject {
    
    private String string;
    
    protected static final Slots slot = new Slots();
    
    static {
        JoSlot concatSlot = new JoSlot(new ConcatMethod());
        slot.put("+", concatSlot);
        slot.put("concat", concatSlot);
        slot.put("split", new JoSlot(new SplitMethod()));
        slot.put("upper", new JoSlot(new UpperMethod()));
        slot.put("lower", new JoSlot(new LowerMethod()));
    }
    
    public JoString(){
        super();
    }
    
    public JoString(Object object){
        this(object.toString());
    }
    
    public JoString(String string){
        super();
        this.string = string;
    }
    
    @Override
    public Slots allSlots(){
        return slot;
    }

    @Override
    public String toString(){
        return string;
    }
    
    private static class ConcatMethod extends JoMethod {
        @Override
        public JoObject call(JoObject object, JoArguments parameter){
            String target = ((JoString) object).toString();
            return new JoString(target.concat(parameter.get(0).toString()));
        }
    }
    
    private static class LowerMethod extends JoFeatureMethod {
        public LowerMethod(){
            super("String::lower");
        }
    }
    
    private static class UpperMethod extends JoFeatureMethod {
        public UpperMethod(){
            super("String::upper");
        }
    }
    
    private static class SplitMethod extends JoFeatureMethod {
        public SplitMethod(){
            super("String::split");
        }
    }
}
