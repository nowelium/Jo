package lang.jo;

public class JoBlock {

    private JoObject scope;
    
    public JoObject getScope() {
        return scope;
    }

    public void setScope(JoObject scope) {
        this.scope = scope;
    }

    public JoObject call(JoObject object, JoArguments arguments) {
        return object;
    }

    public static JoBlock createReturnSelf(JoObject object) {
        JoBlock block = new JoBlock(){
            @Override
            public JoObject call(JoObject arg0, JoArguments arg1){
                return getScope();
            }
        };
        block.setScope(object);
        return block;
    }
    
}
