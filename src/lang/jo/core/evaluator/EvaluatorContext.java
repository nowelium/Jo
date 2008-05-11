package lang.jo.core.evaluator;

import lang.jo.JoObject;

/**
 * @author nowel
 *
 */
class EvaluatorContext {
    
    private JoObject current;
    
    public void setCurrent(JoObject current){
        this.current = current;
    }
    
    public JoObject getCurrent(){
        return current;
    }

}
