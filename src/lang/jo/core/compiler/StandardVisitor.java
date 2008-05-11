package lang.jo.core.compiler;

import lang.jo.core.Context;
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
class StandardVisitor implements Visitor, JoParserVisitor {
    
    public Context accept(Node node){
        return (Context) node.jjtAccept(this, null);
    }
    
    public Context acceptChild(Node node, int index){
        return accept(node.jjtGetChild(index));
    }
    
    public Context acceptChildren(Node node) {
        int n = node.jjtGetNumChildren();
        for(int i = 0; i < n; ++i){
            acceptChild(node, i);
        }
        return null;
    }
    
    private Context compile(SimpleNode node, Object data){
        NodeCompiler compiler = NodeCompilerFactory.getCompiler(node);
        return compiler.compile(this, node);
    }
    
    public Object visit(SimpleNode node, Object data) {
        return null;
    }

    public Object visit(JoNodeExpression node, Object data) {
        return compile(node, data);
    }

    public Object visit(JoNodeMessage node, Object data) {
        return compile(node, data);
    }

    public Object visit(JoNodeArgument node, Object data) {
        return compile(node, data);
    }

    public Object visit(JoNodeIdentifier node, Object data) {
        return compile(node, data);
    }

    public Object visit(JoNodeNumber node, Object data) {
        return compile(node, data);
    }

    public Object visit(JoNodeOperator node, Object data) {
        return compile(node, data);
    }

    public Object visit(JoNodeQuote node, Object data) {
        return compile(node, data);
    }

}
