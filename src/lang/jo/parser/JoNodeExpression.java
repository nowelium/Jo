/* Generated By:JJTree: Do not edit this line. JoNodeExpression.java */

package lang.jo.parser;

public class JoNodeExpression extends SimpleNode {
  public JoNodeExpression(int id) {
    super(id);
  }

  public JoNodeExpression(JoParser p, int id) {
    super(p, id);
  }

  public static Node jjtCreate(int id) {
      return new JoNodeExpression(id);
  }

  public static Node jjtCreate(JoParser p, int id) {
      return new JoNodeExpression(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(JoParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
