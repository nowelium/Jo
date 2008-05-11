package lang.jo;

import lang.jo.runtime.Slots;

public abstract class JoPrototype {

    private Slots slots = new Slots();
    
    protected JoPrototype(){
        super();
        Slots childSlot = allSlots();
        if(childSlot != null && childSlot != slots){
            slots.putAll(childSlot);
        }
    }
    
    public abstract Slots allSlots();

    public abstract JoObject createClone();
    
    public JoSlot getSlot(String slotName) {
        return slots.get(slotName);
    }

    public JoSlot setSlot(String slotName, JoSlot slotObject) {
        return slots.put(slotName, slotObject);
    }
    
    public JoSlot setSlot(String slotName, JoObject ioObject){
        return setSlot(slotName, new JoSlot(JoBlock.createReturnSelf(ioObject)));
    }
    
    public boolean hasSlot(String slotName){
        return slots.containsKey(slotName);
    }
    
    public JoSlot createSlot(String slotName, JoObject slotObject){
        return createSlot(slotName, JoBlock.createReturnSelf(slotObject));
    }
    
    public JoSlot createSlot(String slotName, JoBlock ioBlock){
        JoSlot slot = new JoSlot();
        slot.setBlock(ioBlock);
        return createSlot(slotName, slot);
    }
    
    public JoSlot createSlot(String slotName, JoSlot slotObject){
        setSlot(slotName, slotObject);
        return slotObject;
    }
    
}
