package lang.jo.core.compiler;

import lang.jo.core.Context;
import lang.jo.parser.SimpleNode;

/**
 * @author nowel
 */
public interface NodeCompiler {
    public Context compile(Visitor visitor, SimpleNode node); 
}
