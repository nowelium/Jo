package lang.jo;

import lang.jo.runtime.Slots;

public class JoBoolean extends JoObject {
    
    private Boolean bool;
    
    private static final JoBoolean TRUE = new JoBoolean(Boolean.TRUE);
    
    private static final JoBoolean FALSE = new JoBoolean(Boolean.FALSE);
    
    private static final Slots slots = new Slots();
    static {
        slots.put("?", new JoSlot(new BooleanValueMethod()));
    }
    
    public JoBoolean(){
        super();
    }
    
    public JoBoolean(Boolean bool){
        this.bool = bool;
    }

    @Override
    public Slots allSlots() {
        return slots;
    }
    
    public Boolean toBoolean(){
        return bool;
    }
    
    public boolean booleanValue(){
        return bool.booleanValue();
    }
    
    protected static class BooleanValueMethod extends JoMethod {
        @Override
        public JoObject call(JoObject object, JoArguments arguments) {
            JoBoolean joBoolean = (JoBoolean) object;
            if(joBoolean.booleanValue()){
                return JoBoolean.TRUE;
            }
            return JoBoolean.FALSE;
        }
    }
}
