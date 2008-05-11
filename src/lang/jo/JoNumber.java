package lang.jo;

import java.math.BigDecimal;

import lang.jo.runtime.Slots;

public class JoNumber extends JoObject {

    private BigDecimal number;
    
    protected static final Slots slot = new Slots();
    static {
        slot.put("+", new JoSlot(new AddMethod()));
        slot.put("-", new JoSlot(new SubtractMethod()));
        slot.put("*", new JoSlot(new MultiplyMethod()));
        slot.put("/", new JoSlot(new DivideMethod()));
    }
    
    public JoNumber(){
        super();
    }
    
    public JoNumber(BigDecimal number){
        super();
        this.number = number;
    }
    
    @Override
    public Slots allSlots(){
        return slot;
    }
    
    protected BigDecimal getNumber(){
        return this.number;
    }
    
    public String toString(){
        return number != null ? number.toString() : "null";
    }
    
    private static class AddMethod extends JoMethod {
        @Override
        public JoObject call(JoObject object, JoArguments parameter){
            BigDecimal target = ((JoNumber) object).getNumber();
            JoNumber arg0 = (JoNumber) parameter.get(0);
            BigDecimal result = target.add(arg0.getNumber());
            return new JoNumber(result);
        }
    }
    
    private static class SubtractMethod extends JoMethod {
        @Override
        public JoObject call(JoObject object, JoArguments parameter){
            BigDecimal target = ((JoNumber) object).getNumber();
            JoNumber arg0 = (JoNumber) parameter.get(0);
            BigDecimal result = target.subtract(arg0.getNumber());
            return new JoNumber(result);
        }
    }
    
    private static class MultiplyMethod extends JoMethod {
        @Override
        public JoObject call(JoObject object, JoArguments parameter){
            BigDecimal target = ((JoNumber) object).getNumber();
            JoNumber arg0 = (JoNumber) parameter.get(0);
            BigDecimal result = target.multiply(arg0.getNumber());
            return new JoNumber(result);
        }
    }
    
    private static class DivideMethod extends JoMethod {
        @Override
        public JoObject call(JoObject object, JoArguments parameter){
            BigDecimal target = ((JoNumber) object).getNumber();
            JoNumber arg0 = (JoNumber) parameter.get(0);
            BigDecimal result = target.divide(arg0.getNumber());
            return new JoNumber(result);
        }
    }
    
}
