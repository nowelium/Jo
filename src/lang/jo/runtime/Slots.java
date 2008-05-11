package lang.jo.runtime;

import java.util.HashMap;

import lang.jo.JoEnumerator;
import lang.jo.JoSlot;
import lang.jo.JoString;

public class Slots extends HashMap<String, JoSlot> {

    private static final long serialVersionUID = -6275725774028916910L;
    
    public JoEnumerator<JoString> slotNames(){
        return JoEnumerator.newInstance(JoString.class, keySet());
    }
}
