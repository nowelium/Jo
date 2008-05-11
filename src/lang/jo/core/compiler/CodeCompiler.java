package lang.jo.core.compiler;

import lang.jo.core.Context;
import lang.jo.parser.JoParser;
import lang.jo.parser.Node;
import lang.jo.parser.ParseException;

/**
 * @author nowel
 *
 */
public class CodeCompiler {
    
    private JoParser parser;
    
    private Visitor visitor;
    
    private Context context;
    
    public CodeCompiler(JoParser parser){
        this.parser = parser;
        this.visitor = new StandardVisitor();
    }
    
    public CodeCompiler(JoParser parser, Visitor visitor){
        this.parser = parser;
        this.visitor = visitor;
    }
    
    public void compile() throws ParseException {
        Node node = parser.Expression();
        context = visitor.accept(node);
    }
    
    public Context getContext(){
        return context;
    }
    
}
