import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        TinyCLexer lexer = new TinyCLexer(CharStreams.fromFileName("./tests/example6.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TinyCParser parser = new TinyCParser(tokens);
        ParserRuleContext ctx = parser.program();

        GraphFlowVisitor visitor = new GraphFlowVisitor();
        visitor.visit(ctx);

        for(Map.Entry<String,List<GraphFlow>> gf : visitor.getFunctionGraphFlow().entrySet()) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Função: " + gf.getKey());
            System.out.println("------------------COPY CONTENT INSIDE------------------");
            for(GraphFlow g :  gf.getValue()) {
                if(g.getBeginNode().equals("start")) {
                    System.out.println(g.getBeginNode() + " -> " + "\"" + g.getEndNode() + "\"" + ";");
                }
                else if(g.getEndNode().equals("end")) {
                    System.out.println("\""+ g.getBeginNode() + "\"" + " -> " + g.getEndNode() + ";");
                }
                else {
                    System.out.println("\""+ g.getBeginNode() + "\"" + " -> " + "\"" + g.getEndNode() + "\"" + ";");
                }
            }
            System.out.println("-------------------------------------------------------");
        }
    }
}