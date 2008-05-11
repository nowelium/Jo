package lang.jo.core.compiler;

import lang.jo.core.Context;
import lang.jo.parser.Node;

/**
 * @author nowel
 *
 */
public interface Visitor {
    public Context accept(Node node);
    public Context acceptChild(Node node, int index);
    public Context acceptChildren(Node node);
}
