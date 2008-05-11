package lang.jo;

import java.util.List;

public class JoList<T> extends JoEnumerator<T> {
    
    public JoList(){
        super(null);
    }

    public JoList(List<T> list) {
        super(list);
    }
}
