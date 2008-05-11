package lang.jo.core.compiler;

import lang.jo.parser.JoNodeArgument;
import lang.jo.parser.JoNodeExpression;
import lang.jo.parser.JoNodeIdentifier;
import lang.jo.parser.JoNodeMessage;
import lang.jo.parser.JoNodeNumber;
import lang.jo.parser.JoNodeOperator;
import lang.jo.parser.JoNodeQuote;
import lang.jo.parser.JoParserVisitor;
import lang.jo.parser.Node;
import lang.jo.parser.SimpleNode;

/**
 * @author nowel
 *
 */
public class NodeCompilerFactory implements JoParserVisitor {
    
    private static final NodeCompilerFactory self = new NodeCompilerFactory();
    
    private NodeCompilerFactory() {
        // no operation
    }
    
    public static NodeCompiler getCompiler(Node node) {
        return (NodeCompiler) node.jjtAccept(self, null);
    }

    public Object visit(SimpleNode node, Object data) {
        return null;
    }

    public Object visit(JoNodeExpression node, Object data) {
        return new ExpressionCompiler();
    }

    public Object visit(JoNodeMessage node, Object data) {
        return new MessageCompiler();
    }

    public Object visit(JoNodeArgument node, Object data) {
        return new ArgumentCompiler();
    }

    public Object visit(JoNodeIdentifier node, Object data) {
        return new IdentifierCompiler();
    }

    public Object visit(JoNodeNumber node, Object data) {
        return new NumberCompiler();
    }

    public Object visit(JoNodeOperator node, Object data) {
        return new OperatorCompiler();
    }

    public Object visit(JoNodeQuote node, Object data) {
        return new QuoteCompiler();
    }

}
