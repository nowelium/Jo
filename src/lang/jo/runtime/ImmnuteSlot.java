package lang.jo.runtime;

import lang.jo.JoBlock;
import lang.jo.JoSlot;
import lang.jo.core.annotation.Nullable;

/**
 * @author nowel
 */
public @Nullable(true) class ImmnuteSlot extends JoSlot {

    public ImmnuteSlot(JoBlock block) {
        super(block);
    }

    @Override
    public JoBlock getBlock() {
        return super.getBlock();
    }

    @Override
    public void setBlock(JoBlock block) {
        // no operation
    }

}
