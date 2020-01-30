import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        TinyCLexer lexer = new TinyCLexer(CharStreams.fromFileName("./tests/example5.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TinyCParser parser = new TinyCParser(tokens);
        ParserRuleContext ctx = parser.program();

        ComplexityVisitor visitor = new ComplexityVisitor();
        visitor.visit(ctx);

        for(Map.Entry<String,EdgesAndNodes> ed : visitor.getFunctionComplexity().entrySet()) {
            System.out.println("Nodes: " + ed.getValue().getNodes());
            System.out.println("Edges: " + ed.getValue().getEdges());
            System.out.print("Função: " + ed.getKey() + " <-> ");
            System.out.println("Complexidade: " + (ed.getValue().getEdges() - ed.getValue().getNodes() + 2));
        }
    }
}