package lang.jo.runtime;

import lang.jo.JoArguments;
import lang.jo.JoMethod;
import lang.jo.JoObject;

public class JoFeatureMethod extends JoMethod {
    
    private String name;
    
    public JoFeatureMethod(String name){
        this.name = name;
    }

    @Override
    public JoObject call(JoObject object, JoArguments arguments) {
        throw new NoSuchMethodError("no such method: " + name);
    }
}
