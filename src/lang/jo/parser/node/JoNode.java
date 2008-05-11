package lang.jo.parser.node;

import lang.jo.parser.Token;

public class JoNode {
    
    private Token token;
    
    private String nodeValue;
    
    private NodeType nodeType;

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }
    
}
