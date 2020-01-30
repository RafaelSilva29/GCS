import java.util.HashMap;

public class ComplexityVisitor extends TinyCParserBaseVisitor<EdgesAndNodes> {

    private HashMap<String, EdgesAndNodes> functionComplexity;

    public ComplexityVisitor() {
        this.functionComplexity =  new HashMap<String, EdgesAndNodes>();
    }

    public HashMap<String, EdgesAndNodes> getFunctionComplexity() {
        return this.functionComplexity;
    }

    @Override
    public EdgesAndNodes visitProgram(TinyCParser.ProgramContext ctx) {
        for(TinyCParser.DeclarationContext decl : ctx.declaration()) {
            visit(decl);
        }

        return null;
    }


    @Override
    public EdgesAndNodes visitDeclaration(TinyCParser.DeclarationContext ctx) {
        if(ctx.functionDecl() != null) {
            visit(ctx.functionDecl());
        }

        return null;
    }


    @Override
    public EdgesAndNodes visitFunctionDecl(TinyCParser.FunctionDeclContext ctx) {
       String functionName = ctx.STRING().getText();

       EdgesAndNodes edgesAndNodes = visit(ctx.body());

       functionComplexity.put(functionName,edgesAndNodes);

       return null;
    }


    @Override
    public EdgesAndNodes visitBody(TinyCParser.BodyContext ctx) {
        EdgesAndNodes edgesAndNodesGlobal = new EdgesAndNodes(0,1);

        for(TinyCParser.StatementContext st : ctx.statement()) {
            EdgesAndNodes statementEdgesAndNodes = visit(st);
            edgesAndNodesGlobal.sum(statementEdgesAndNodes);
        }

        EdgesAndNodes end = new EdgesAndNodes(1,1);
        edgesAndNodesGlobal.sum(end);

        return edgesAndNodesGlobal;
    }

    @Override
    public EdgesAndNodes visitEmptyStmt(TinyCParser.EmptyStmtContext ctx) {
        EdgesAndNodes emptyEdgesAndNodes = new EdgesAndNodes(1,1);
        return  emptyEdgesAndNodes;
    }

    @Override
    public EdgesAndNodes visitExprStmt(TinyCParser.ExprStmtContext ctx) {
        EdgesAndNodes exprEdgesAndNodes = new EdgesAndNodes(1,1);
        return exprEdgesAndNodes;
    }

    @Override
    public EdgesAndNodes visitAssignStmt(TinyCParser.AssignStmtContext ctx) {
        EdgesAndNodes assignEdgesAndNodes = new EdgesAndNodes(1,1);
        return  assignEdgesAndNodes;
    }

    @Override
    public EdgesAndNodes visitBracedStmt(TinyCParser.BracedStmtContext ctx) {
        EdgesAndNodes edgesAndNodesGlobal = new EdgesAndNodes();

        for(TinyCParser.StatementContext st : ctx.statement()) {
            EdgesAndNodes statementEdgesAndNodes = visit(st);
            edgesAndNodesGlobal.sum(statementEdgesAndNodes);
        }

        return edgesAndNodesGlobal;
    }

    @Override
    public EdgesAndNodes visitIfStmt(TinyCParser.IfStmtContext ctx) {
        EdgesAndNodes edgesAndNodesGlobal = new EdgesAndNodes(2,1);

        EdgesAndNodes statementEdgesAndNodes = visit(ctx.statement());
        edgesAndNodesGlobal.sum(statementEdgesAndNodes);

        return edgesAndNodesGlobal;
    }


    @Override
    public EdgesAndNodes visitIfElseStmt(TinyCParser.IfElseStmtContext ctx) {
        EdgesAndNodes edgesAndNodesGlobal = new EdgesAndNodes(2,1);

        EdgesAndNodes statementIfEdgesAndNodes = visit(ctx.statement(0));
        EdgesAndNodes statementElseEdgesAndNodes = visit(ctx.statement(1));

        edgesAndNodesGlobal.sum(statementIfEdgesAndNodes);
        edgesAndNodesGlobal.sum(statementElseEdgesAndNodes);

        return edgesAndNodesGlobal;
    }

    @Override
    public EdgesAndNodes visitWhileStmt(TinyCParser.WhileStmtContext ctx) {
        EdgesAndNodes edgesAndNodesGlobal = new EdgesAndNodes(2,1);
        EdgesAndNodes whileEdgesAndNodes = visit(ctx.statement());

        edgesAndNodesGlobal.sum( whileEdgesAndNodes);

        return  edgesAndNodesGlobal;
    }

    @Override
    public EdgesAndNodes visitDoWhileStmt(TinyCParser.DoWhileStmtContext ctx) {
        EdgesAndNodes edgesAndNodesGlobal = new EdgesAndNodes(2,1);
        EdgesAndNodes doWhileEdgesAndNodes = visit(ctx.statement());

        edgesAndNodesGlobal.sum(doWhileEdgesAndNodes);

        return  edgesAndNodesGlobal;
    }
}
