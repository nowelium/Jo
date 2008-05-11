package lang.jo.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author nowel
 *
 */
public class Arguments implements Iterable<Context> {
    
    private List<Context> args = new ArrayList<Context>();
    
    public void add(Context context){
        args.add(context);
    }
    
    public Context get(int i){
        return args.get(i);
    }
    
    public int size(){
        return args.size();
    }

    public Iterator<Context> iterator() {
        return args.iterator();
    }
    
    public String toString(){
        StringBuffer buf = new StringBuffer();
        for(Iterator<Context> i = iterator(); i.hasNext();){
            buf.append(i.next());
            if(i.hasNext()){
                buf.append(", ");
            }
        }
        return buf.toString();
    }

}
