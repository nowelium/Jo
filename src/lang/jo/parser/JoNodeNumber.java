/* Generated By:JJTree: Do not edit this line. JoNodeNumber.java */

package lang.jo.parser;

public class JoNodeNumber extends SimpleNode {
  public JoNodeNumber(int id) {
    super(id);
  }

  public JoNodeNumber(JoParser p, int id) {
    super(p, id);
  }

  public static Node jjtCreate(int id) {
      return new JoNodeNumber(id);
  }

  public static Node jjtCreate(JoParser p, int id) {
      return new JoNodeNumber(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(JoParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}