package lang.jo.core.exception;

import lang.jo.parser.ParseException;

public class SyntaxErrorException extends RuntimeException {

    private static final long serialVersionUID = 5833806445617409342L;

    private ParseException cause;
    
    public SyntaxErrorException(ParseException e){
        cause = e;
    }

    @Override
    public String getMessage(){
        return cause.getMessage();
    }
    
    @Override
    public void printStackTrace() {
        cause.printStackTrace();
    }
    
}
