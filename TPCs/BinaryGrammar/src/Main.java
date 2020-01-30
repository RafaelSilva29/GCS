import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BinaryGrammarLexer lexer;
            lexer = new BinaryGrammarLexer(CharStreams.fromFileName("C:\\Users\\Admin\\Desktop\\Universidade\\Mestrado\\PLC\\GCS\\BinaryGrammar\\Testes\\test1.txt"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BinaryGrammarParser parser = new BinaryGrammarParser(tokens);
            ParserRuleContext ctx = parser.number();
            System.out.println("END");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
