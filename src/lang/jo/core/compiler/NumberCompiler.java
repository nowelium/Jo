package lang.jo.core.compiler;

import java.math.BigDecimal;

import lang.jo.JoNumber;
import lang.jo.core.Context;
import lang.jo.core.Message;
import lang.jo.parser.SimpleNode;

/**
 * @author nowel
 *
 */
public class NumberCompiler implements NodeCompiler {
    public Context compile(Visitor visitor, SimpleNode node) {
        BigDecimal decimal = new BigDecimal(node.getNodeValue());
        JoNumber number = new JoNumber(decimal);
        
        Message message = new Message();
        message.setName(node.getNodeValue());

        Context context = new Context();
        context.setMessage(message);
        context.setSelf(number);
        return context;
    }
}
