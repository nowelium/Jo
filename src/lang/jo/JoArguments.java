package lang.jo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JoArguments  implements Iterable<JoObject> {
    
    private List<JoObject> args = new ArrayList<JoObject>();
    
    public void add(JoObject object){
        args.add(object);
    }
    
    public JoObject get(int i){
        return args.get(i);
    }
    
    public int size(){
        return args.size();
    }

    public Iterator<JoObject> iterator() {
        return args.iterator();
    }
    
    public static JoArguments create(JoObject...objects){
        JoArguments args = new JoArguments();
        for(JoObject o: objects){
            args.add(o);
        }
        return args;
    }

}
