// Generated from C:/Users/Admin/Desktop/Universidade/Mestrado/PLC/GCS/BinaryGrammar/src\BinaryGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BinaryGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BinaryGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BinaryGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(BinaryGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BinaryGrammarParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit(BinaryGrammarParser.BitContext ctx);
}