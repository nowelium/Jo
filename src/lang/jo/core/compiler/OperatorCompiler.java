package lang.jo.core.compiler;

import lang.jo.core.Context;
import lang.jo.core.Message;
import lang.jo.parser.SimpleNode;

/**
 * @author nowel
 *
 */
public class OperatorCompiler implements NodeCompiler {
    public Context compile(Visitor visitor, SimpleNode node) {
        Message message = new Message();
        message.setName(node.getNodeValue());
        
        Context context = new Context();
        context.setMessage(message);
        return context;
    }
}
