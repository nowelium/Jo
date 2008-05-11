package lang.jo.core;

/**
 * @author nowel
 *
 */
public class Message {
    
    private String name;
    
    private Arguments arguments = new Arguments();
    
    private Message next;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }
    
    public Message getNext() {
        return next;
    }

    public void setNext(Message next) {
        this.next = next;
    }

    public String toString(){
        return "{name: " + name + ", arguments: " + arguments + "}";
    }

}
