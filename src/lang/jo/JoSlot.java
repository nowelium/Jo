package lang.jo;

import lang.jo.core.annotation.Nullable;

public @Nullable class JoSlot {

    private JoBlock block;
    
    public JoSlot(){
        super();
    }
    
    public JoSlot(JoBlock block){
        this.block = block;
    }
    
    public JoBlock getBlock() {
        return block;
    }

    public void setBlock(JoBlock block) {
        this.block = block;
    }
    
}
