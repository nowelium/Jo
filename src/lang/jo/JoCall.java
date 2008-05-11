package lang.jo;

import lang.jo.runtime.Slots;

public class JoCall extends JoObject {
    
    private JoMessage message;
    
    public JoCall(){
        super();
    }
    
    public JoCall(JoMessage message){
        this.message = message;
    }

    public JoMessage getMessage() {
        return message;
    }

    public void setMessage(JoMessage message) {
        this.message = message;
    }
    
    public static JoCall create(JoMessage message){
        return new JoCall(message);
    }

    @Override
    public Slots allSlots() {
        return null;
    }
}
