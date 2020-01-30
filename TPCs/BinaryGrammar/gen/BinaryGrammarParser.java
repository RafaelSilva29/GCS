// Generated from C:/Users/Admin/Desktop/Universidade/Mestrado/PLC/GCS/BinaryGrammar/src\BinaryGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BinaryGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ZERO=2, UM=3;
	public static final int
		RULE_number = 0, RULE_bit = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"number", "bit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'0'", "'1'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "ZERO", "UM"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BinaryGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BinaryGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NumberContext extends ParserRuleContext {
		public BitContext b1;
		public BitContext b2;
		public List<BitContext> bit() {
			return getRuleContexts(BitContext.class);
		}
		public BitContext bit(int i) {
			return getRuleContext(BitContext.class,i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BinaryGrammarListener ) ((BinaryGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BinaryGrammarListener ) ((BinaryGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BinaryGrammarVisitor ) return ((BinaryGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			((NumberContext)_localctx).b1 = bit(0);
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ZERO || _la==UM) {
				{
				{
				setState(5);
				((NumberContext)_localctx).b2 = bit(((NumberContext)_localctx).b1.totOut);
				((NumberContext)_localctx).b1.totOut = ((NumberContext)_localctx).b2.totOut;
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        System.out.println("Valor Decimal: " + ((NumberContext)_localctx).b1.totOut);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitContext extends ParserRuleContext {
		public double totIn;
		public double totOut;
		public TerminalNode UM() { return getToken(BinaryGrammarParser.UM, 0); }
		public TerminalNode ZERO() { return getToken(BinaryGrammarParser.ZERO, 0); }
		public BitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BitContext(ParserRuleContext parent, int invokingState, double totIn) {
			super(parent, invokingState);
			this.totIn = totIn;
		}
		@Override public int getRuleIndex() { return RULE_bit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BinaryGrammarListener ) ((BinaryGrammarListener)listener).enterBit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BinaryGrammarListener ) ((BinaryGrammarListener)listener).exitBit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BinaryGrammarVisitor ) return ((BinaryGrammarVisitor<? extends T>)visitor).visitBit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitContext bit(double totIn) throws RecognitionException {
		BitContext _localctx = new BitContext(_ctx, getState(), totIn);
		enterRule(_localctx, 2, RULE_bit);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UM:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(UM);
				 ((BitContext)_localctx).totOut =  (_localctx.totIn * 2) + 1; 
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(ZERO);
				 ((BitContext)_localctx).totOut =  _localctx.totIn * 2; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\30\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\5\3\26\n\3\3\3\2\2\4\2\4\2\2\2\27\2\6\3\2\2\2\4\25\3\2\2\2\6\f\5\4"+
		"\3\2\7\b\5\4\3\2\b\t\b\2\1\2\t\13\3\2\2\2\n\7\3\2\2\2\13\16\3\2\2\2\f"+
		"\n\3\2\2\2\f\r\3\2\2\2\r\17\3\2\2\2\16\f\3\2\2\2\17\20\b\2\1\2\20\3\3"+
		"\2\2\2\21\22\7\5\2\2\22\26\b\3\1\2\23\24\7\4\2\2\24\26\b\3\1\2\25\21\3"+
		"\2\2\2\25\23\3\2\2\2\26\5\3\2\2\2\4\f\25";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}