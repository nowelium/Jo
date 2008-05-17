package lang.jo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;

import lang.jo.core.Context;
import lang.jo.core.compiler.CodeCompiler;
import lang.jo.core.evaluator.Evaluator;
import lang.jo.core.evaluator.StandardEvaluator;
import lang.jo.core.exception.SyntaxErrorException;
import lang.jo.parser.JoParser;
import lang.jo.parser.ParseException;

public class Main {
    
    public static void main(String...args){
        StringBuffer buf = new StringBuffer();
        try {
            URL filePath = Main.class.getClassLoader().getResource(args[0]);
            FileReader input = new FileReader(filePath.getPath());
            BufferedReader reader = new BufferedReader(input);
            try {
                for(String line = reader.readLine(); line != null; line = reader.readLine()){
                    buf.append(line);
                }
            } finally {
                reader.close();
                input.close();
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        runMain(buf.toString());
    }
    
    public static void runMain(String code){
        try {
            StringReader reader = new StringReader(code);
            JoParser parser = new JoParser(reader);
            CodeCompiler compiler = new CodeCompiler(parser);
            compiler.compile();
            Context context = compiler.getContext();
            Evaluator evaluator = new StandardEvaluator();
            
            System.out.println("jo => " + evaluator.execute(context));
        } catch (ParseException e) {
            throw new SyntaxErrorException(e);
        }
    }
}
