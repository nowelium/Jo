package lang.jo.core;

import lang.jo.JoObject;

public class State {
    
    private JoObject self;
    
    private Message message;

    public JoObject getSelf() {
        return self;
    }

    public void setSelf(JoObject self) {
        this.self = self;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
    
}
