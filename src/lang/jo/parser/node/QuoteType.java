package lang.jo.parser.node;

public enum QuoteType implements NodeType {
    BackQuote("`"),
    SingleQuote("'"),
    DoubleQuote("\""),
    TriQuote("\"\"\"");

    private String quote;
    private QuoteType(String quote){
        this.quote = quote;
    }
    public String quote(){
        return quote;
    }
}
