import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.io.*;

public class GraphFlowVisitor extends TinyCParserBaseVisitor<String> {

    private HashMap<String, List<GraphFlow>> functionGraphFlow;
    private List<GraphFlow> graphFlowList;

    public GraphFlowVisitor() {
        this.functionGraphFlow = new HashMap<String, List<GraphFlow>>();
        this.graphFlowList = new ArrayList<GraphFlow>();
    }

    public HashMap<String, List<GraphFlow>> getFunctionGraphFlow() {
        return this.functionGraphFlow;
    }

    @Override
    public String visitProgram(TinyCParser.ProgramContext ctx) {
        for(TinyCParser.DeclarationContext decl : ctx.declaration()) {
            visit(decl);
        }

        return null;
    }


    @Override
    public String visitDeclaration(TinyCParser.DeclarationContext ctx) {
        if(ctx.functionDecl() != null) {
            visit(ctx.functionDecl());
        }

        return null;
    }

    @Override
    public String visitFunctionDecl(TinyCParser.FunctionDeclContext ctx) {
        String functionName = ctx.STRING().getText();
        String func = "";
        func = visit(ctx.body());
        String [] auxFunc = func.split("\\:");
        String [] cond = new String [auxFunc.length/2];
        boolean flagS=true;
        int i,j=0;

        for(i=0; i<auxFunc.length; i+=2,j++) {
            cond[j] = auxFunc[i+1];
        }

        for(i=0,j=0; i<auxFunc.length; i+=2,j++) {
            switch(auxFunc[i]) {
                case ("if"): if(flagS) {
                                flagS=false;
                                graphFlowList.add(new GraphFlow("start",cond[j]));
                                graphFlowList.add(new GraphFlow(cond[j],"inside_if" + cond[j]));
                            }

                            if(auxFunc.length>2 && j<cond.length-1) {
                                graphFlowList.add(new GraphFlow(cond[j], cond[j+1]));
                                graphFlowList.add(new GraphFlow("inside_if" + cond[j], cond[j+1]));
                                graphFlowList.add(new GraphFlow(cond[j+1], "inside_if" + cond[j+1]));
                            }

                            if(auxFunc.length-i<=2) {
                                graphFlowList.add(new GraphFlow("inside_if" + cond[j],"end"));
                                graphFlowList.add(new GraphFlow(cond[j],"end"));
                            }
                            break;
                case ("ifelse"): if(flagS) {
                                    flagS=false;
                                    graphFlowList.add(new GraphFlow("start",cond[j]));
                                    graphFlowList.add(new GraphFlow(cond[j],"inside_if" + cond[j]));
                                    graphFlowList.add(new GraphFlow(cond[j],"inside_else"+ cond[j]));
                                }

                                if(auxFunc.length>2 && j<cond.length-1) {
                                    graphFlowList.add(new GraphFlow("inside_if" + cond[j], cond[j+1]));
                                    graphFlowList.add(new GraphFlow("inside_else" + cond[j], cond[j+1]));
                                    graphFlowList.add(new GraphFlow(cond[j+1], "inside_if" + cond[j+1]));
                                    graphFlowList.add(new GraphFlow(cond[j+1], "inside_else" + cond[j+1]));
                                }

                                if(auxFunc.length-i<=2) {
                                    graphFlowList.add(new GraphFlow("inside_if" + cond[j] ,"end"));
                                    graphFlowList.add(new GraphFlow("inside_else" + cond[j],"end"));
                                }
                                break;
                case ("while"): if(flagS) {
                                    flagS=false;
                                    graphFlowList.add(new GraphFlow("start","while"+ cond[j]));
                                    graphFlowList.add(new GraphFlow("while" + cond[j],"inside_while"));
                                    graphFlowList.add(new GraphFlow("inside_while","while" + cond[j]));
                                }

                                // meter aqui mais de um while

                                if(auxFunc.length-i<=2) {
                                    graphFlowList.add(new GraphFlow("while"+cond[j],"end"));
                                }
                                break;
                case ("dowhile"): if(flagS) {
                                    flagS=false;
                                    graphFlowList.add(new GraphFlow("start","enter_doWhile" + cond[j]));
                                    graphFlowList.add(new GraphFlow("enter_doWhile" + cond[j], "do_while" + cond[j]));
                                    graphFlowList.add(new GraphFlow("do_while" + cond[j],"enter_doWhile" + cond[j]));
                                 }

                                 // meter aqui mais de um doWhile

                                 if(auxFunc.length-i<=2) {
                                    graphFlowList.add(new GraphFlow("do_while" + cond[j],"end"));
                                 }
                                 break;
            }
        }


        functionGraphFlow.put(functionName, graphFlowList);
        graphFlowList =  new ArrayList<GraphFlow>();

        return null;
    }

    @Override
    public String visitBody(TinyCParser.BodyContext ctx) {
        String str = "";
        for(TinyCParser.StatementContext st : ctx.statement()) {
           str += visit(st);
           str += ":";
        }
        return str;
    }

    @Override
    public String visitIfStmt(TinyCParser.IfStmtContext ctx) {
        String str = "if:";
        str += visit(ctx.paren_expr());
        //str += visit(ctx.statement());
        return str;
    }

    @Override
    public String visitIfElseStmt(TinyCParser.IfElseStmtContext ctx) {
        String str = "ifelse:";
        str += visit(ctx.paren_expr());
        return str;
    }

    @Override
    public String visitWhileStmt(TinyCParser.WhileStmtContext ctx) {
        String str = "while:";
        str += visit(ctx.paren_expr());
        return str;
    }

    @Override
    public String visitDoWhileStmt(TinyCParser.DoWhileStmtContext ctx) {
        String str = "dowhile:";
        str += visit(ctx.paren_expr());
        return str;
    }

    @Override
    public String visitBracedStmt(TinyCParser.BracedStmtContext ctx) {
        String str = "{}:";
        for(TinyCParser.StatementContext st : ctx.statement()){
            str += visit(st);
        }
        return str;
    }

    @Override
    public String visitExprStmt(TinyCParser.ExprStmtContext ctx) {
        return "";
    }

    @Override
    public String visitAssignStmt(TinyCParser.AssignStmtContext ctx) {
        return "";
    }

    @Override
    public String visitEmptyStmt(TinyCParser.EmptyStmtContext ctx) {
        return "";
    }

    @Override
    public String visitParen_expr(TinyCParser.Paren_exprContext ctx) {
        String res = "";
        res += visit(ctx.expr());
        return res;
    }

    @Override
    public String visitExpr(TinyCParser.ExprContext ctx) {
        String res = "";
        if(ctx.test() != null) {
            res += "(";
            res += visit(ctx.test());
            res += ")";
        }
        return res;
    }

    @Override
    public String visitSumTest(TinyCParser.SumTestContext ctx) {
        String res = "";
        res += visit(ctx.sum());
        return res;
    }

    @Override
    public String visitSumLtTest(TinyCParser.SumLtTestContext ctx) {
        String res = "";
        res += visit(ctx.sum(0)) + "<" + visit(ctx.sum(1));
        return res;
    }

    @Override
    public String visitSumTerm(TinyCParser.SumTermContext ctx) {
        String res = "";
        res += visit(ctx.term());
        return res;
    }

    @Override
    public String visitSumPlusTerm(TinyCParser.SumPlusTermContext ctx) {
        String res = "";
        res += visit(ctx.sum()) + "+" + visit(ctx.term());
        return res;
    }

    @Override
    public String visitSumMinusTerm(TinyCParser.SumMinusTermContext ctx) {
        String res = "";
        res += visit(ctx.sum()) + "-" + visit(ctx.term());
        return res;
    }

    @Override
    public String visitIds(TinyCParser.IdsContext ctx) {
        String res = "";
        res += visit(ctx.id());
        return  res;
    }

    @Override
    public String visitId(TinyCParser.IdContext ctx) {
        String res = "";
        res = ctx.STRING().getText();
        return res;
    }

    @Override
    public String visitInteger(TinyCParser.IntegerContext ctx) {
        String res = "";
        res = ctx.INT().toString();
        return res;
    }
}
