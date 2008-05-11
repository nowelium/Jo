package lang.jo;

public class JoMessage extends JoObject {

    private String name;
    
    private JoArguments arguments;
    
    public JoMessage(){
        super();
    }
    
    public JoMessage(String name, JoArguments arguments){
        this.name = name;
        this.arguments = arguments;
    }

    public JoArguments getArguments() {
        return arguments;
    }

    public void setArguments(JoArguments arguments) {
        this.arguments = arguments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static JoMessage create(String name, JoArguments args){
        return new JoMessage(name, args);
    }
}
