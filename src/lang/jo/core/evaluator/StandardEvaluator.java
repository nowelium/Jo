package lang.jo.core.evaluator;

import lang.jo.JoArguments;
import lang.jo.JoCall;
import lang.jo.JoMessage;
import lang.jo.JoObject;
import lang.jo.JoSlot;
import lang.jo.core.Arguments;
import lang.jo.core.Context;
import lang.jo.core.Message;

/**
 * @author nowel
 *
 */
public class StandardEvaluator implements Evaluator {
    
    //
    // 1) hoge -> "eval"::(ioMethod: self)
    // 2) hoge + -> "+"::ioMethod(self:hoge)
    // 3) + foo -> "+foo"::ioMethod(self:hoge, arguments:foo)
    // 4) foo -> eval
    // 5) ==> foo
    //
    // 自分(a) -> 次(b)
    // 自分(b) -> 次(c)
    // 自分(c) -> 次(result)
    //
    
    public JoObject execute(Context context) {
        return eval(context);
    }
    
    protected JoObject eval(Context context){
        JoObject JoObject = context.getSelf();
        if(null == JoObject){
            return null;
        }
        
        Message message = context.getMessage();
        Arguments arguments = message.getArguments();
        
        if(0 < arguments.size()){
            JoArguments args = new JoArguments();
            for(int i = 1; i < arguments.size(); ++i){
                args.add(eval(arguments.get(i)));
            }
            Context arg0 = arguments.get(0);
            JoMessage JoMessage = createMessage(arg0.getMessage());
            JoMessage.setArguments(args);
            
            JoCall JoCall = new JoCall();
            JoCall.setMessage(JoMessage);
            return JoObject.call(JoCall);
        }
        return JoObject;
    }
    
    protected JoObject getSelf(JoObject JoObject){
        JoSlot slot = JoObject.getSlot("self");
        return slot.getBlock().call(JoObject, null);
    }
    
    protected JoCall createCall(Context context){
        JoCall JoCall = new JoCall();
        JoCall.setMessage(createMessage(context.getMessage()));
        return JoCall;
    }
    
    protected JoMessage createMessage(Message message){
        JoMessage JoMessage = new JoMessage();
        JoMessage.setName(message.getName());
        JoMessage.setArguments(createArguments(message.getArguments()));
        return JoMessage;
    }
    
    protected JoArguments createArguments(Arguments args){
        JoArguments JoArguments = new JoArguments();
        for(Context c: args){
            JoArguments.add(eval(c));
        }
        return JoArguments;
    }
}
