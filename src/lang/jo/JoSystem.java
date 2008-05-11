package lang.jo;

import java.io.PrintStream;

import lang.jo.runtime.Slots;

public class JoSystem extends JoObject {

    protected static final Slots slot = new Slots();
    
    static {
        slot.put("print", new JoSlot(new PrintMethod(Line.NONE, System.out)));
        slot.put("println", new JoSlot(new PrintMethod(Line.NEW_LINE, System.out)));
    }
    
    public JoSystem(){
        super();
    }
    
    @Override
    public Slots allSlots(){
        return slot;
    }
    
    public static enum Line {
        NONE,
        NEW_LINE(System.getProperty("line.separator"));
        
        private String lineseparator;
        private Line(){
        }
        private Line(String lineseparator){
            this.lineseparator = lineseparator;
        }
        public void append(PrintStream stream){
            if(lineseparator != null){
                stream.print(lineseparator);
            }
        }
    }
    
    protected static class PrintMethod extends JoMethod {
        private Line line;
        private PrintStream stream;
        public PrintMethod(Line line, PrintStream stream){
            this.line = line;
            this.stream = stream;
        }
        @Override
        public JoObject call(JoObject object, JoArguments arguments) {
            stream.print(object);
            line.append(stream);
            return object;
        }
    }
    
}
