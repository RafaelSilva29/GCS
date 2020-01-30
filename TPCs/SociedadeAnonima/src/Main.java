import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("BEGIN");
            SociedadeAnonimaLexer lexer = new SociedadeAnonimaLexer(CharStreams.fromFileName("/Users/rafaelsilva/Desktop/work_space/GCS-1920/SociedadeAnonima/tests/exemplo.txt"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SociedadeAnonimaParser parser = new SociedadeAnonimaParser(tokens);
            ParserRuleContext ctx = parser.empresa();
            System.out.println("END");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
