/* Generated By:JJTree&JavaCC: Do not edit this line. JoParser.java */
package lang.jo.parser;
import lang.jo.parser.node.QuoteType;
public class JoParser/*@bgen(jjtree)*/implements JoParserTreeConstants, JoParserConstants {/*@bgen(jjtree)*/
  protected JJTJoParserState jjtree = new JJTJoParserState();public void jjtreeOpenNodeScope(Node node) {
    }
    public void jjtreeCloseNodeScope(Node node) {
    }

// 文法の定義
  final public Node Expression() throws ParseException {
    trace_call("Expression");
    try {
 /*@bgen(jjtree) Expression */
  JoNodeExpression jjtn000 = (JoNodeExpression)JoNodeExpression.jjtCreate(this, JJTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
      try {
        if (jj_2_1(2147483647)) {
          label_1:
          while (true) {
            Message();
            switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
            case OPERATOR:
            case WCPAD:
            case IDENTIFIER:
            case NUMBER:
            case BACKQUOTES:
            case SINGLEQUOTES:
            case DOUBLEQUOTES:
            case TRIQUOTES:
              ;
              break;
            default:
              jj_la1[0] = jj_gen;
              break label_1;
            }
          }
                                        jjtree.closeNodeScope(jjtn000, true);
                                        jjtc000 = false;
                                        jjtreeCloseNodeScope(jjtn000);
        {if (true) return jjtn000;}
        } else {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case SCTPAD:
            jj_consume_token(SCTPAD);
            break;
          case 0:
            jj_consume_token(0);
            break;
          default:
            jj_la1[1] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
      } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
        jjtreeCloseNodeScope(jjtn000);
      }
      }
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("Expression");
    }
  }

  final public Node Message() throws ParseException {
    trace_call("Message");
    try {
 /*@bgen(jjtree) Message */
  JoNodeMessage jjtn000 = (JoNodeMessage)JoNodeMessage.jjtCreate(this, JJTMESSAGE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
      try {
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case WCPAD:
            ;
            break;
          default:
            jj_la1[2] = jj_gen;
            break label_2;
          }
          jj_consume_token(WCPAD);
        }
        Symbol();
        label_3:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case SCPAD:
            ;
            break;
          default:
            jj_la1[3] = jj_gen;
            break label_3;
          }
          jj_consume_token(SCPAD);
        }
        label_4:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case OPEN:
            ;
            break;
          default:
            jj_la1[4] = jj_gen;
            break label_4;
          }
          Arguments();
        }
                                                    jjtree.closeNodeScope(jjtn000, true);
                                                    jjtc000 = false;
                                                    jjtreeCloseNodeScope(jjtn000);
        {if (true) return jjtn000;}
      } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
      } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
        jjtreeCloseNodeScope(jjtn000);
      }
      }
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("Message");
    }
  }

  final public void Arguments() throws ParseException {
    trace_call("Arguments");
    try {
      jj_consume_token(OPEN);
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 0:
        case OPERATOR:
        case SCTPAD:
        case WCPAD:
        case IDENTIFIER:
        case NUMBER:
        case BACKQUOTES:
        case SINGLEQUOTES:
        case DOUBLEQUOTES:
        case TRIQUOTES:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_5;
        }
        Argument();
        label_6:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case COMMA:
            ;
            break;
          default:
            jj_la1[6] = jj_gen;
            break label_6;
          }
          jj_consume_token(COMMA);
          Argument();
        }
      }
      jj_consume_token(CLOSE);
    } finally {
      trace_return("Arguments");
    }
  }

  final public Node Argument() throws ParseException {
    trace_call("Argument");
    try {
 /*@bgen(jjtree) Argument */
  JoNodeArgument jjtn000 = (JoNodeArgument)JoNodeArgument.jjtCreate(this, JJTARGUMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
      try {
        label_7:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case WCPAD:
            ;
            break;
          default:
            jj_la1[7] = jj_gen;
            break label_7;
          }
          jj_consume_token(WCPAD);
        }
        Expression();
        label_8:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case WCPAD:
            ;
            break;
          default:
            jj_la1[8] = jj_gen;
            break label_8;
          }
          jj_consume_token(WCPAD);
        }
                 jjtree.closeNodeScope(jjtn000, true);
                 jjtc000 = false;
                 jjtreeCloseNodeScope(jjtn000);
        {if (true) return jjtn000;}
      } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
      } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
        jjtreeCloseNodeScope(jjtn000);
      }
      }
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("Argument");
    }
  }

  final public void Symbol() throws ParseException {
    trace_call("Symbol");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUMBER:
        Number();
        break;
      case IDENTIFIER:
        Identifier();
        break;
      case OPERATOR:
        Operator();
        break;
      case BACKQUOTES:
      case SINGLEQUOTES:
      case DOUBLEQUOTES:
      case TRIQUOTES:
        Quote();
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("Symbol");
    }
  }

  final public void Identifier() throws ParseException {
    trace_call("Identifier");
    try {
 /*@bgen(jjtree) Identifier */
  JoNodeIdentifier jjtn000 = (JoNodeIdentifier)JoNodeIdentifier.jjtCreate(this, JJTIDENTIFIER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);Token token;
      try {
        token = jj_consume_token(IDENTIFIER);
                           jjtree.closeNodeScope(jjtn000, true);
                           jjtc000 = false;
                           jjtreeCloseNodeScope(jjtn000);
        jjtn000.setNodeValue(token.image);
      } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
        jjtreeCloseNodeScope(jjtn000);
      }
      }
    } finally {
      trace_return("Identifier");
    }
  }

  final public void Number() throws ParseException {
    trace_call("Number");
    try {
 /*@bgen(jjtree) Number */
  JoNodeNumber jjtn000 = (JoNodeNumber)JoNodeNumber.jjtCreate(this, JJTNUMBER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);Token token;
      try {
        token = jj_consume_token(NUMBER);
                       jjtree.closeNodeScope(jjtn000, true);
                       jjtc000 = false;
                       jjtreeCloseNodeScope(jjtn000);
        jjtn000.setNodeValue(token.image);
      } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
        jjtreeCloseNodeScope(jjtn000);
      }
      }
    } finally {
      trace_return("Number");
    }
  }

  final public void Operator() throws ParseException {
    trace_call("Operator");
    try {
 /*@bgen(jjtree) Operator */
  JoNodeOperator jjtn000 = (JoNodeOperator)JoNodeOperator.jjtCreate(this, JJTOPERATOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);Token token;
      try {
        token = jj_consume_token(OPERATOR);
                         jjtree.closeNodeScope(jjtn000, true);
                         jjtc000 = false;
                         jjtreeCloseNodeScope(jjtn000);
        jjtn000.setNodeValue(token.image);
      } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
        jjtreeCloseNodeScope(jjtn000);
      }
      }
    } finally {
      trace_return("Operator");
    }
  }

  final public void Quote() throws ParseException {
    trace_call("Quote");
    try {
 /*@bgen(jjtree) Quote */
  JoNodeQuote jjtn000 = (JoNodeQuote)JoNodeQuote.jjtCreate(this, JJTQUOTE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);Token token;
      try {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case BACKQUOTES:
          token = jj_consume_token(BACKQUOTES);
                           jjtree.closeNodeScope(jjtn000, true);
                           jjtc000 = false;
                           jjtreeCloseNodeScope(jjtn000);
                          {
            jjtn000.setToken(token);
            String tokenImage = token.image;
            jjtn000.setNodeValue(tokenImage.substring(1, tokenImage.length() - 1));
            jjtn000.setNodeType(QuoteType.BackQuote);
    }
          break;
        case SINGLEQUOTES:
          token = jj_consume_token(SINGLEQUOTES);
                               jjtree.closeNodeScope(jjtn000, true);
                               jjtc000 = false;
                               jjtreeCloseNodeScope(jjtn000);
                              {
            jjtn000.setToken(token);
            String tokenImage = token.image;
            jjtn000.setNodeValue(tokenImage.substring(1, tokenImage.length() - 1));
            jjtn000.setNodeType(QuoteType.SingleQuote);
    }
          break;
        case DOUBLEQUOTES:
          token = jj_consume_token(DOUBLEQUOTES);
                               jjtree.closeNodeScope(jjtn000, true);
                               jjtc000 = false;
                               jjtreeCloseNodeScope(jjtn000);
                              {
            jjtn000.setToken(token);
            String tokenImage = token.image;
            jjtn000.setNodeValue(tokenImage.substring(1, tokenImage.length() - 1));
            jjtn000.setNodeType(QuoteType.DoubleQuote);
    }
          break;
        case TRIQUOTES:
          token = jj_consume_token(TRIQUOTES);
                            jjtree.closeNodeScope(jjtn000, true);
                            jjtc000 = false;
                            jjtreeCloseNodeScope(jjtn000);
                           {
            jjtn000.setToken(token);
            String tokenImage = token.image;
            jjtn000.setNodeValue(tokenImage.substring(3, tokenImage.length() - 3));
            jjtn000.setNodeType(QuoteType.TriQuote);
    }
          break;
        default:
          jj_la1[10] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
        jjtreeCloseNodeScope(jjtn000);
      }
      }
    } finally {
      trace_return("Quote");
    }
  }

  final private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  final private boolean jj_3R_9() {
    if (!jj_rescan) trace_call("Message(LOOKING AHEAD...)");
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_scan_token(27)) { jj_scanpos = xsp; break; }
    }
    if (jj_3R_10()) { if (!jj_rescan) trace_return("Message(LOOKAHEAD FAILED)"); return true; }
    while (true) {
      xsp = jj_scanpos;
      if (jj_scan_token(26)) { jj_scanpos = xsp; break; }
    }
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_11()) { jj_scanpos = xsp; break; }
    }
    { if (!jj_rescan) trace_return("Message(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  final private boolean jj_3_1() {
    if (jj_3R_9()) return true;
    return false;
  }

  final private boolean jj_3R_17() {
    if (!jj_rescan) trace_call("Number(LOOKING AHEAD...)");
    if (jj_scan_token(NUMBER)) { if (!jj_rescan) trace_return("Number(LOOKAHEAD FAILED)"); return true; }
    { if (!jj_rescan) trace_return("Number(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  final private boolean jj_3R_29() {
    Token xsp;
    if (jj_3R_30()) return true;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_30()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  final private boolean jj_3R_28() {
    if (!jj_rescan) trace_call("Expression(LOOKING AHEAD...)");
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_29()) {
    jj_scanpos = xsp;
    if (jj_scan_token(25)) {
    jj_scanpos = xsp;
    if (jj_scan_token(0)) { if (!jj_rescan) trace_return("Expression(LOOKAHEAD FAILED)"); return true; }
    }
    }
    { if (!jj_rescan) trace_return("Expression(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  final private boolean jj_3R_18() {
    if (!jj_rescan) trace_call("Identifier(LOOKING AHEAD...)");
    if (jj_scan_token(IDENTIFIER)) { if (!jj_rescan) trace_return("Identifier(LOOKAHEAD FAILED)"); return true; }
    { if (!jj_rescan) trace_return("Identifier(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  final private boolean jj_3R_25() {
    if (jj_scan_token(TRIQUOTES)) return true;
    return false;
  }

  final private boolean jj_3R_11() {
    if (jj_3R_16()) return true;
    return false;
  }

  final private boolean jj_3R_15() {
    if (jj_3R_20()) return true;
    return false;
  }

  final private boolean jj_3R_14() {
    if (jj_3R_19()) return true;
    return false;
  }

  final private boolean jj_3R_13() {
    if (jj_3R_18()) return true;
    return false;
  }

  final private boolean jj_3R_12() {
    if (jj_3R_17()) return true;
    return false;
  }

  final private boolean jj_3R_10() {
    if (!jj_rescan) trace_call("Symbol(LOOKING AHEAD...)");
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_12()) {
    jj_scanpos = xsp;
    if (jj_3R_13()) {
    jj_scanpos = xsp;
    if (jj_3R_14()) {
    jj_scanpos = xsp;
    if (jj_3R_15()) { if (!jj_rescan) trace_return("Symbol(LOOKAHEAD FAILED)"); return true; }
    }
    }
    }
    { if (!jj_rescan) trace_return("Symbol(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  final private boolean jj_3R_24() {
    if (jj_scan_token(DOUBLEQUOTES)) return true;
    return false;
  }

  final private boolean jj_3R_27() {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_26()) return true;
    return false;
  }

  final private boolean jj_3R_23() {
    if (jj_scan_token(SINGLEQUOTES)) return true;
    return false;
  }

  final private boolean jj_3R_26() {
    if (!jj_rescan) trace_call("Argument(LOOKING AHEAD...)");
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_scan_token(27)) { jj_scanpos = xsp; break; }
    }
    if (jj_3R_28()) { if (!jj_rescan) trace_return("Argument(LOOKAHEAD FAILED)"); return true; }
    while (true) {
      xsp = jj_scanpos;
      if (jj_scan_token(27)) { jj_scanpos = xsp; break; }
    }
    { if (!jj_rescan) trace_return("Argument(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  final private boolean jj_3R_20() {
    if (!jj_rescan) trace_call("Quote(LOOKING AHEAD...)");
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_22()) {
    jj_scanpos = xsp;
    if (jj_3R_23()) {
    jj_scanpos = xsp;
    if (jj_3R_24()) {
    jj_scanpos = xsp;
    if (jj_3R_25()) { if (!jj_rescan) trace_return("Quote(LOOKAHEAD FAILED)"); return true; }
    }
    }
    }
    { if (!jj_rescan) trace_return("Quote(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  final private boolean jj_3R_22() {
    if (jj_scan_token(BACKQUOTES)) return true;
    return false;
  }

  final private boolean jj_3R_30() {
    if (jj_3R_9()) return true;
    return false;
  }

  final private boolean jj_3R_21() {
    if (jj_3R_26()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_27()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  final private boolean jj_3R_16() {
    if (!jj_rescan) trace_call("Arguments(LOOKING AHEAD...)");
    if (jj_scan_token(OPEN)) { if (!jj_rescan) trace_return("Arguments(LOOKAHEAD FAILED)"); return true; }
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_21()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(CLOSE)) { if (!jj_rescan) trace_return("Arguments(LOOKAHEAD FAILED)"); return true; }
    { if (!jj_rescan) trace_return("Arguments(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  final private boolean jj_3R_19() {
    if (!jj_rescan) trace_call("Operator(LOOKING AHEAD...)");
    if (jj_scan_token(OPERATOR)) { if (!jj_rescan) trace_return("Operator(LOOKAHEAD FAILED)"); return true; }
    { if (!jj_rescan) trace_return("Operator(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  public JoParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  public Token token, jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  public boolean lookingAhead = false;
  private boolean jj_semLA;
  private int jj_gen;
  final private int[] jj_la1 = new int[11];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_0();
      jj_la1_1();
      jj_la1_2();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {0x48000002,0x2000001,0x8000000,0x4000000,0x0,0x4a000003,0x20000000,0x8000000,0x8000000,0x40000002,0x0,};
   }
   private static void jj_la1_1() {
      jj_la1_1 = new int[] {0x3c02,0x0,0x0,0x0,0x1000000,0x3c02,0x0,0x0,0x0,0x3c02,0x3c00,};
   }
   private static void jj_la1_2() {
      jj_la1_2 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[1];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  public JoParser(java.io.InputStream stream) {
     this(stream, null);
  }
  public JoParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new JoParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public JoParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new JoParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public JoParser(JoParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public void ReInit(JoParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      trace_token(token, "");
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  final private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    } else {
      trace_scan(jj_scanpos, kind);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }

  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
      trace_token(token, " (in getNextToken)");
    return token;
  }

  final public Token getToken(int index) {
    Token t = lookingAhead ? jj_scanpos : token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.Vector<int[]> jj_expentries = new java.util.Vector<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Enumeration e = jj_expentries.elements(); e.hasMoreElements();) {
        int[] oldentry = (int[])(e.nextElement());
        if (oldentry.length == jj_expentry.length) {
          exists = true;
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.addElement(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[65];
    for (int i = 0; i < 65; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 11; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 65; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  private int trace_indent = 0;
  private boolean trace_enabled = true;

  final public void enable_tracing() {
    trace_enabled = true;
  }

  final public void disable_tracing() {
    trace_enabled = false;
  }

  final private void trace_call(String s) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Call:   " + s);
    }
    trace_indent = trace_indent + 2;
  }

  final private void trace_return(String s) {
    trace_indent = trace_indent - 2;
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Return: " + s);
    }
  }

  final private void trace_token(Token t, String where) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Consumed token: <" + tokenImage[t.kind]);
      if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
        System.out.print(": \"" + t.image + "\"");
      }
      System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
    }
  }

  final private void trace_scan(Token t1, int t2) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Visited token: <" + tokenImage[t1.kind]);
      if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
        System.out.print(": \"" + t1.image + "\"");
      }
      System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
    }
  }

  final private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 1; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  final private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
