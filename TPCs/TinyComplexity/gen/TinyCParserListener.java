// Generated from /Users/rafaelsilva/Desktop/TinyC/src/TinyCParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyCParser}.
 */
public interface TinyCParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TinyCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TinyCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TinyCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TinyCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TinyCParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TinyCParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(TinyCParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(TinyCParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(TinyCParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(TinyCParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(TinyCParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(TinyCParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(TinyCParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(TinyCParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(TinyCParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(TinyCParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(TinyCParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(TinyCParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(TinyCParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(TinyCParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracedStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBracedStmt(TinyCParser.BracedStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracedStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBracedStmt(TinyCParser.BracedStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(TinyCParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(TinyCParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(TinyCParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(TinyCParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(TinyCParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link TinyCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(TinyCParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TinyCParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TinyCParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(TinyCParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(TinyCParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void enterParen_expr(TinyCParser.Paren_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void exitParen_expr(TinyCParser.Paren_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TinyCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TinyCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumTest}
	 * labeled alternative in {@link TinyCParser#test}.
	 * @param ctx the parse tree
	 */
	void enterSumTest(TinyCParser.SumTestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumTest}
	 * labeled alternative in {@link TinyCParser#test}.
	 * @param ctx the parse tree
	 */
	void exitSumTest(TinyCParser.SumTestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumLtTest}
	 * labeled alternative in {@link TinyCParser#test}.
	 * @param ctx the parse tree
	 */
	void enterSumLtTest(TinyCParser.SumLtTestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumLtTest}
	 * labeled alternative in {@link TinyCParser#test}.
	 * @param ctx the parse tree
	 */
	void exitSumLtTest(TinyCParser.SumLtTestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumTerm}
	 * labeled alternative in {@link TinyCParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSumTerm(TinyCParser.SumTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumTerm}
	 * labeled alternative in {@link TinyCParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSumTerm(TinyCParser.SumTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumMinusTerm}
	 * labeled alternative in {@link TinyCParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSumMinusTerm(TinyCParser.SumMinusTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumMinusTerm}
	 * labeled alternative in {@link TinyCParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSumMinusTerm(TinyCParser.SumMinusTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPlusTerm}
	 * labeled alternative in {@link TinyCParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSumPlusTerm(TinyCParser.SumPlusTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPlusTerm}
	 * labeled alternative in {@link TinyCParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSumPlusTerm(TinyCParser.SumPlusTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ids}
	 * labeled alternative in {@link TinyCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterIds(TinyCParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ids}
	 * labeled alternative in {@link TinyCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitIds(TinyCParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TinyCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterInt(TinyCParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TinyCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitInt(TinyCParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParanExpr}
	 * labeled alternative in {@link TinyCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterParanExpr(TinyCParser.ParanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParanExpr}
	 * labeled alternative in {@link TinyCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitParanExpr(TinyCParser.ParanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TinyCParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TinyCParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyCParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(TinyCParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyCParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(TinyCParser.IntegerContext ctx);
}