// Generated from C:/Users/Admin/Desktop/Universidade/Mestrado/PLC/GCS/BinaryGrammar/src\BinaryGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BinaryGrammarParser}.
 */
public interface BinaryGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BinaryGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(BinaryGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinaryGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(BinaryGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BinaryGrammarParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBit(BinaryGrammarParser.BitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinaryGrammarParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBit(BinaryGrammarParser.BitContext ctx);
}