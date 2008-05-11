package lang.jo.core.compiler;

import lang.jo.JoString;
import lang.jo.core.Context;
import lang.jo.core.Message;
import lang.jo.parser.SimpleNode;

/**
 * @author nowel
 *
 */
public class IdentifierCompiler implements NodeCompiler {
    public Context compile(Visitor visitor, SimpleNode node) {
        Message message = new Message();
        message.setName(node.getNodeValue());
        
        Context context = new Context();
        context.setMessage(message);
        context.setSelf(new JoString(node.getNodeValue()));
        return context;
    }
}
