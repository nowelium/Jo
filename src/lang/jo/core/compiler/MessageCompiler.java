package lang.jo.core.compiler;

import lang.jo.core.Arguments;
import lang.jo.core.Context;
import lang.jo.core.Message;
import lang.jo.parser.SimpleNode;

/**
 * @author nowel
 *
 */
public class MessageCompiler implements NodeCompiler {
    public Context compile(Visitor visitor, SimpleNode node) {
        int size = node.jjtGetNumChildren();
        if(0 < size){
            // first message
            Context context = visitor.acceptChild(node, 0);
            Message message = context.getMessage();
            Arguments arguments = message.getArguments();
            
            // next messages
            for(int i = 1; i < size; ++i){
                arguments.add(visitor.acceptChild(node, i));
            }
            return context;
        }
        return null;
    }
}
