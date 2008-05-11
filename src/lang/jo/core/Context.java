package lang.jo.core;

import lang.jo.JoObject;

/**
 * @author nowel
 */
public class Context {
    
    private JoObject self;
    
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public JoObject getSelf() {
        return self;
    }

    public void setSelf(JoObject self) {
        this.self = self;
    }
    
    public String toString(){
        return "context {self: " + self + ", message: " + message + "}";
    }
}