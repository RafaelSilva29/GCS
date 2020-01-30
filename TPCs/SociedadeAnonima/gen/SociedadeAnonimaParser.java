// Generated from /Users/rafaelsilva/Desktop/work_space/GCS-1920/SociedadeAnonima/src/SociedadeAnonima.g4 by ANTLR 4.7.2

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SociedadeAnonimaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, SC=27, COMMA=28, LPAREN=29, RPAREN=30, HI=31, SP=32, 
		BAR=33, AND=34, WORD=35, NUM=36, SEPARATOR=37;
	public static final int
		RULE_empresa = 0, RULE_sociedadeAnonimas = 1, RULE_sociedadeAnonima = 2, 
		RULE_nomeEmpresa = 3, RULE_localizacao = 4, RULE_cidade = 5, RULE_rua = 6, 
		RULE_objetivo = 7, RULE_ramo = 8, RULE_socios = 9, RULE_socio = 10, RULE_nome = 11, 
		RULE_capital = 12, RULE_cota = 13, RULE_papel = 14, RULE_funcionarios = 15, 
		RULE_funcionario = 16, RULE_numeroMecanografico = 17, RULE_dataNascimento = 18, 
		RULE_contactos = 19, RULE_contacto = 20, RULE_telemovel = 21, RULE_email = 22, 
		RULE_funcao = 23, RULE_entrada = 24, RULE_assembleiaGerais = 25, RULE_assembleiaGeral = 26, 
		RULE_listaSocios = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"empresa", "sociedadeAnonimas", "sociedadeAnonima", "nomeEmpresa", "localizacao", 
			"cidade", "rua", "objetivo", "ramo", "socios", "socio", "nome", "capital", 
			"cota", "papel", "funcionarios", "funcionario", "numeroMecanografico", 
			"dataNascimento", "contactos", "contacto", "telemovel", "email", "funcao", 
			"entrada", "assembleiaGerais", "assembleiaGeral", "listaSocios"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Nome Empresa: '", "'Cidade: '", "'Rua: '", "'Objetivo: '", "'AGRICULTURA'", 
			"'INDUSTRIA'", "'COMERCIO'", "'Socio: '", "'\u20AC'", "'%'", "'SOCIO'", 
			"'ADMINISTRADOR'", "'Funcionario: '", "'F'", "'Telemovel: '", "'Telefone: '", 
			"'Email: '", "'@'", "'.com'", "'GERENTE'", "'PRODUCAO'", "'ESCRITORIO'", 
			"'ARMAZEM'", "'AG: '", "'Presidente: '", "'Socios: '", "';'", "','", 
			"'['", "']'", "'-'", "'<->'", "'/'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "SC", "COMMA", "LPAREN", "RPAREN", "HI", "SP", "BAR", 
			"AND", "WORD", "NUM", "SEPARATOR"
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
	public String getGrammarFileName() { return "SociedadeAnonima.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    List<String> listSocios = new ArrayList<>();

	public SociedadeAnonimaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EmpresaContext extends ParserRuleContext {
		public SociedadeAnonimasContext sociedadeAnonimas;
		public SociosContext socios;
		public FuncionariosContext funcionarios;
		public TerminalNode LPAREN() { return getToken(SociedadeAnonimaParser.LPAREN, 0); }
		public SociedadeAnonimasContext sociedadeAnonimas() {
			return getRuleContext(SociedadeAnonimasContext.class,0);
		}
		public List<TerminalNode> SC() { return getTokens(SociedadeAnonimaParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(SociedadeAnonimaParser.SC, i);
		}
		public SociosContext socios() {
			return getRuleContext(SociosContext.class,0);
		}
		public FuncionariosContext funcionarios() {
			return getRuleContext(FuncionariosContext.class,0);
		}
		public AssembleiaGeraisContext assembleiaGerais() {
			return getRuleContext(AssembleiaGeraisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SociedadeAnonimaParser.RPAREN, 0); }
		public EmpresaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empresa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterEmpresa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitEmpresa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitEmpresa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmpresaContext empresa() throws RecognitionException {
		EmpresaContext _localctx = new EmpresaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_empresa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(LPAREN);
			setState(57);
			((EmpresaContext)_localctx).sociedadeAnonimas = sociedadeAnonimas();
			setState(58);
			match(SC);
			setState(59);
			((EmpresaContext)_localctx).socios = socios();
			setState(60);
			match(SC);
			setState(61);
			((EmpresaContext)_localctx).funcionarios = funcionarios();
			setState(62);
			match(SC);
			setState(63);
			assembleiaGerais();
			setState(64);
			match(RPAREN);

			            System.out.println("------------Informação Sócios-----------");
			            System.out.println("Número de Sócios: " + ((EmpresaContext)_localctx).socios.numSocios);
			            if(((EmpresaContext)_localctx).socios.cotaTotal != 100) {
			                System.out.println("Cotas erradas...");
			                System.out.println("Verificar por favor as cotas...");
			            } else {
			                System.out.println("Cotas certas !!!");
			            }
			                System.out.println("------------Informação Ramos------------");
			                System.out.println("Total Ramos: " + (((EmpresaContext)_localctx).sociedadeAnonimas.totalA + ((EmpresaContext)_localctx).sociedadeAnonimas.totalI + ((EmpresaContext)_localctx).sociedadeAnonimas.totalC));
			                System.out.println("Total AGRICULTURA: " + ((EmpresaContext)_localctx).sociedadeAnonimas.totalA);
			                System.out.println("Total INDUSTRIA: " + ((EmpresaContext)_localctx).sociedadeAnonimas.totalI);
			                System.out.println("Total COMERCIO: " + ((EmpresaContext)_localctx).sociedadeAnonimas.totalC);
			                System.out.println("----------Informações Adicionais--------");
			                if(((EmpresaContext)_localctx).socios.flagAdmin==1) {
			                    System.out.println("Falta adicionar um ADMINISTRADOR aos Sócios...");
			                }
			                if(((EmpresaContext)_localctx).funcionarios.flagGere==1) {
			                    System.out.println("Falta adicionar um GERENTE aos Funcionários...");
			                }
			                if(((EmpresaContext)_localctx).socios.flagAdmin!=1 && ((EmpresaContext)_localctx).funcionarios.flagGere!=1) {
			                    System.out.println("Nada a acrescentar !!!");
			                }
			        
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

	public static class SociedadeAnonimasContext extends ParserRuleContext {
		public String noEmp;
		public String ram;
		public int totalA;
		public int totalI;
		public int totalC;
		public SociedadeAnonimaContext sociedadeAnonima;
		public SociedadeAnonimasContext sociedadeAnonimas;
		public SociedadeAnonimaContext sociedadeAnonima() {
			return getRuleContext(SociedadeAnonimaContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SociedadeAnonimaParser.COMMA, 0); }
		public SociedadeAnonimasContext sociedadeAnonimas() {
			return getRuleContext(SociedadeAnonimasContext.class,0);
		}
		public SociedadeAnonimasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sociedadeAnonimas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterSociedadeAnonimas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitSociedadeAnonimas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitSociedadeAnonimas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SociedadeAnonimasContext sociedadeAnonimas() throws RecognitionException {
		SociedadeAnonimasContext _localctx = new SociedadeAnonimasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sociedadeAnonimas);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((SociedadeAnonimasContext)_localctx).sociedadeAnonima = sociedadeAnonima();

				                        ((SociedadeAnonimasContext)_localctx).noEmp =  ((SociedadeAnonimasContext)_localctx).sociedadeAnonima.noEmp;
				                        _localctx.totalA += ((SociedadeAnonimasContext)_localctx).sociedadeAnonima.totalA;
				                        _localctx.totalI += ((SociedadeAnonimasContext)_localctx).sociedadeAnonima.totalI;
				                        _localctx.totalC += ((SociedadeAnonimasContext)_localctx).sociedadeAnonima.totalC;
				                  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				((SociedadeAnonimasContext)_localctx).sociedadeAnonima = sociedadeAnonima();
				setState(71);
				match(COMMA);
				setState(72);
				((SociedadeAnonimasContext)_localctx).sociedadeAnonimas = sociedadeAnonimas();

				                         _localctx.totalA += ((SociedadeAnonimasContext)_localctx).sociedadeAnonima.totalA + ((SociedadeAnonimasContext)_localctx).sociedadeAnonimas.totalA;
				                         _localctx.totalI += ((SociedadeAnonimasContext)_localctx).sociedadeAnonima.totalI + ((SociedadeAnonimasContext)_localctx).sociedadeAnonimas.totalI;
				                         _localctx.totalC += ((SociedadeAnonimasContext)_localctx).sociedadeAnonima.totalC + ((SociedadeAnonimasContext)_localctx).sociedadeAnonimas.totalC;
				                  
				}
				break;
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

	public static class SociedadeAnonimaContext extends ParserRuleContext {
		public String noEmp;
		public String ram;
		public int totalA;
		public int totalI;
		public int totalC;
		public NomeEmpresaContext nomeEmpresa;
		public ObjetivoContext objetivo;
		public NomeEmpresaContext nomeEmpresa() {
			return getRuleContext(NomeEmpresaContext.class,0);
		}
		public LocalizacaoContext localizacao() {
			return getRuleContext(LocalizacaoContext.class,0);
		}
		public ObjetivoContext objetivo() {
			return getRuleContext(ObjetivoContext.class,0);
		}
		public SociedadeAnonimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sociedadeAnonima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterSociedadeAnonima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitSociedadeAnonima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitSociedadeAnonima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SociedadeAnonimaContext sociedadeAnonima() throws RecognitionException {
		SociedadeAnonimaContext _localctx = new SociedadeAnonimaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sociedadeAnonima);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((SociedadeAnonimaContext)_localctx).nomeEmpresa = nomeEmpresa();
			setState(78);
			localizacao();
			setState(79);
			((SociedadeAnonimaContext)_localctx).objetivo = objetivo();

			                        System.out.println("-----------Empresa Individual-----------");
			                        System.out.println("Nome Empresa: " + ((SociedadeAnonimaContext)_localctx).nomeEmpresa.noEmp);
			                        System.out.println("Ramo da empresa: " +  ((SociedadeAnonimaContext)_localctx).objetivo.ram);
			                        if (((SociedadeAnonimaContext)_localctx).objetivo.ram.equals("AGRICULTURA")) ((SociedadeAnonimaContext)_localctx).totalA =  1;
			                        if (((SociedadeAnonimaContext)_localctx).objetivo.ram.equals("INDUSTRIA")) ((SociedadeAnonimaContext)_localctx).totalI =  1;
			                        if (((SociedadeAnonimaContext)_localctx).objetivo.ram.equals("COMERCIO")) ((SociedadeAnonimaContext)_localctx).totalC =  1;
			                 
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

	public static class NomeEmpresaContext extends ParserRuleContext {
		public String noEmp;
		public Token WORD;
		public TerminalNode WORD() { return getToken(SociedadeAnonimaParser.WORD, 0); }
		public NomeEmpresaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeEmpresa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterNomeEmpresa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitNomeEmpresa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitNomeEmpresa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeEmpresaContext nomeEmpresa() throws RecognitionException {
		NomeEmpresaContext _localctx = new NomeEmpresaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nomeEmpresa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__0);
			setState(83);
			((NomeEmpresaContext)_localctx).WORD = match(WORD);

			               ((NomeEmpresaContext)_localctx).noEmp =  (((NomeEmpresaContext)_localctx).WORD!=null?((NomeEmpresaContext)_localctx).WORD.getText():null);
			            
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

	public static class LocalizacaoContext extends ParserRuleContext {
		public CidadeContext cidade() {
			return getRuleContext(CidadeContext.class,0);
		}
		public TerminalNode HI() { return getToken(SociedadeAnonimaParser.HI, 0); }
		public RuaContext rua() {
			return getRuleContext(RuaContext.class,0);
		}
		public LocalizacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localizacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterLocalizacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitLocalizacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitLocalizacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalizacaoContext localizacao() throws RecognitionException {
		LocalizacaoContext _localctx = new LocalizacaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_localizacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			cidade();
			setState(87);
			match(HI);
			setState(88);
			rua();
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

	public static class CidadeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SociedadeAnonimaParser.WORD, 0); }
		public CidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterCidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitCidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitCidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CidadeContext cidade() throws RecognitionException {
		CidadeContext _localctx = new CidadeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cidade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__1);
			setState(91);
			match(WORD);
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

	public static class RuaContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SociedadeAnonimaParser.WORD, 0); }
		public RuaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rua; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterRua(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitRua(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitRua(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuaContext rua() throws RecognitionException {
		RuaContext _localctx = new RuaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rua);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__2);
			setState(94);
			match(WORD);
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

	public static class ObjetivoContext extends ParserRuleContext {
		public String ram;
		public RamoContext ramo;
		public TerminalNode WORD() { return getToken(SociedadeAnonimaParser.WORD, 0); }
		public TerminalNode SP() { return getToken(SociedadeAnonimaParser.SP, 0); }
		public RamoContext ramo() {
			return getRuleContext(RamoContext.class,0);
		}
		public ObjetivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterObjetivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitObjetivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitObjetivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetivoContext objetivo() throws RecognitionException {
		ObjetivoContext _localctx = new ObjetivoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objetivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__3);
			setState(97);
			match(WORD);
			setState(98);
			match(SP);
			setState(99);
			((ObjetivoContext)_localctx).ramo = ramo();

			            ((ObjetivoContext)_localctx).ram =  ((ObjetivoContext)_localctx).ramo.ram;
			         
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

	public static class RamoContext extends ParserRuleContext {
		public String ram;
		public RamoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ramo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterRamo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitRamo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitRamo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RamoContext ramo() throws RecognitionException {
		RamoContext _localctx = new RamoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ramo);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__4);

				        ((RamoContext)_localctx).ram =  "AGRICULTURA";
				     
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__5);

				        ((RamoContext)_localctx).ram =  "INDUSTRIA";
				     
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(T__6);

				        ((RamoContext)_localctx).ram =  "COMERCIO";
				     
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

	public static class SociosContext extends ParserRuleContext {
		public int numSocios;
		public int cotaTotal;
		public int flagAdmin;
		public SocioContext socio;
		public SociosContext socios;
		public SocioContext socio() {
			return getRuleContext(SocioContext.class,0);
		}
		public SociosContext socios() {
			return getRuleContext(SociosContext.class,0);
		}
		public SociosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_socios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterSocios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitSocios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitSocios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SociosContext socios() throws RecognitionException {
		SociosContext _localctx = new SociosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_socios);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((SociosContext)_localctx).socio = socio();

				             _localctx.numSocios += ((SociosContext)_localctx).socio.num;
				             _localctx.cotaTotal += ((SociosContext)_localctx).socio.val;
				             ((SociosContext)_localctx).flagAdmin =  ((SociosContext)_localctx).socio.flagAdmin;
				       
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				((SociosContext)_localctx).socio = socio();
				setState(115);
				((SociosContext)_localctx).socios = socios();

				             _localctx.numSocios += ((SociosContext)_localctx).socio.num + ((SociosContext)_localctx).socios.numSocios;
				             _localctx.cotaTotal += ((SociosContext)_localctx).socio.val + ((SociosContext)_localctx).socios.cotaTotal;
				             ((SociosContext)_localctx).flagAdmin =  ((SociosContext)_localctx).socio.flagAdmin;
				       
				}
				break;
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

	public static class SocioContext extends ParserRuleContext {
		public int num;
		public int val;
		public int flagAdmin;
		public CotaContext cota;
		public PapelContext papel;
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SociedadeAnonimaParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SociedadeAnonimaParser.SP, i);
		}
		public CapitalContext capital() {
			return getRuleContext(CapitalContext.class,0);
		}
		public CotaContext cota() {
			return getRuleContext(CotaContext.class,0);
		}
		public PapelContext papel() {
			return getRuleContext(PapelContext.class,0);
		}
		public SocioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_socio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterSocio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitSocio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitSocio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SocioContext socio() throws RecognitionException {
		SocioContext _localctx = new SocioContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_socio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__7);
			setState(121);
			nome();
			setState(122);
			match(SP);
			setState(123);
			capital();
			setState(124);
			match(SP);
			setState(125);
			((SocioContext)_localctx).cota = cota();
			setState(126);
			match(SP);
			setState(127);
			((SocioContext)_localctx).papel = papel();

			            ((SocioContext)_localctx).val =  ((SocioContext)_localctx).cota.val;
			            ((SocioContext)_localctx).num =  1;
			            if(!((SocioContext)_localctx).papel.pap.equals("ADMINISTRADOR")) ((SocioContext)_localctx).flagAdmin =  1;
			      
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

	public static class NomeContext extends ParserRuleContext {
		public String nom;
		public Token WORD;
		public TerminalNode WORD() { return getToken(SociedadeAnonimaParser.WORD, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((NomeContext)_localctx).WORD = match(WORD);

			        ((NomeContext)_localctx).nom =  (((NomeContext)_localctx).WORD!=null?((NomeContext)_localctx).WORD.getText():null);
			     
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

	public static class CapitalContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SociedadeAnonimaParser.NUM, 0); }
		public CapitalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capital; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterCapital(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitCapital(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitCapital(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapitalContext capital() throws RecognitionException {
		CapitalContext _localctx = new CapitalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_capital);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(NUM);
			setState(134);
			match(T__8);
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

	public static class CotaContext extends ParserRuleContext {
		public int val;
		public Token NUM;
		public TerminalNode NUM() { return getToken(SociedadeAnonimaParser.NUM, 0); }
		public CotaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cota; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterCota(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitCota(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitCota(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CotaContext cota() throws RecognitionException {
		CotaContext _localctx = new CotaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cota);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((CotaContext)_localctx).NUM = match(NUM);
			setState(137);
			match(T__9);

			        ((CotaContext)_localctx).val =  Integer.parseInt((((CotaContext)_localctx).NUM!=null?((CotaContext)_localctx).NUM.getText():null));
			     
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

	public static class PapelContext extends ParserRuleContext {
		public String pap;
		public PapelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_papel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterPapel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitPapel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitPapel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PapelContext papel() throws RecognitionException {
		PapelContext _localctx = new PapelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_papel);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__10);

				            ((PapelContext)_localctx).pap =  "SOCIO";
				      
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__11);

				            ((PapelContext)_localctx).pap =  "ADMINISTRADOR";
				      
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

	public static class FuncionariosContext extends ParserRuleContext {
		public int flagGere;
		public FuncionarioContext funcionario;
		public List<FuncionarioContext> funcionario() {
			return getRuleContexts(FuncionarioContext.class);
		}
		public FuncionarioContext funcionario(int i) {
			return getRuleContext(FuncionarioContext.class,i);
		}
		public FuncionariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionarios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterFuncionarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitFuncionarios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitFuncionarios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionariosContext funcionarios() throws RecognitionException {
		FuncionariosContext _localctx = new FuncionariosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcionarios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				((FuncionariosContext)_localctx).funcionario = funcionario();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 );

			                ((FuncionariosContext)_localctx).flagGere =  ((FuncionariosContext)_localctx).funcionario.flagGere;
			             
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

	public static class FuncionarioContext extends ParserRuleContext {
		public int flagGere;
		public NomeContext nome;
		public NumeroMecanograficoContext numeroMecanografico;
		public FuncaoContext funcao;
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SociedadeAnonimaParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SociedadeAnonimaParser.SP, i);
		}
		public NumeroMecanograficoContext numeroMecanografico() {
			return getRuleContext(NumeroMecanograficoContext.class,0);
		}
		public DataNascimentoContext dataNascimento() {
			return getRuleContext(DataNascimentoContext.class,0);
		}
		public ContactosContext contactos() {
			return getRuleContext(ContactosContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public FuncionarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterFuncionario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitFuncionario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitFuncionario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionarioContext funcionario() throws RecognitionException {
		FuncionarioContext _localctx = new FuncionarioContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcionario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__12);
			setState(154);
			((FuncionarioContext)_localctx).nome = nome();
			setState(155);
			match(SP);
			setState(156);
			((FuncionarioContext)_localctx).numeroMecanografico = numeroMecanografico();
			setState(157);
			match(SP);
			setState(158);
			dataNascimento();
			setState(159);
			match(SP);
			setState(160);
			contactos();
			setState(161);
			match(SP);
			setState(162);
			((FuncionarioContext)_localctx).funcao = funcao();
			setState(163);
			match(SP);
			setState(164);
			entrada();

			                if(((FuncionarioContext)_localctx).funcao.func.equals("GERENTE")) ((FuncionarioContext)_localctx).flagGere =  1;
			                System.out.println("-------------Funcionário------------");
			                System.out.println("Nome: " + ((FuncionarioContext)_localctx).nome.nom);
			                System.out.println("ID: " + ((FuncionarioContext)_localctx).numeroMecanografico.id);
			                System.out.println("Funcão: " + ((FuncionarioContext)_localctx).funcao.func);
			            
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

	public static class NumeroMecanograficoContext extends ParserRuleContext {
		public String id;
		public Token NUM;
		public TerminalNode NUM() { return getToken(SociedadeAnonimaParser.NUM, 0); }
		public NumeroMecanograficoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeroMecanografico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterNumeroMecanografico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitNumeroMecanografico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitNumeroMecanografico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroMecanograficoContext numeroMecanografico() throws RecognitionException {
		NumeroMecanograficoContext _localctx = new NumeroMecanograficoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numeroMecanografico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__13);
			setState(168);
			((NumeroMecanograficoContext)_localctx).NUM = match(NUM);

			                        ((NumeroMecanograficoContext)_localctx).id =  "F" + (((NumeroMecanograficoContext)_localctx).NUM!=null?((NumeroMecanograficoContext)_localctx).NUM.getText():null);
			                    
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

	public static class DataNascimentoContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(SociedadeAnonimaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(SociedadeAnonimaParser.NUM, i);
		}
		public List<TerminalNode> BAR() { return getTokens(SociedadeAnonimaParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(SociedadeAnonimaParser.BAR, i);
		}
		public DataNascimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataNascimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterDataNascimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitDataNascimento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitDataNascimento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataNascimentoContext dataNascimento() throws RecognitionException {
		DataNascimentoContext _localctx = new DataNascimentoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dataNascimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(NUM);
			setState(172);
			match(BAR);
			setState(173);
			match(NUM);
			setState(174);
			match(BAR);
			setState(175);
			match(NUM);
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

	public static class ContactosContext extends ParserRuleContext {
		public List<ContactoContext> contacto() {
			return getRuleContexts(ContactoContext.class);
		}
		public ContactoContext contacto(int i) {
			return getRuleContext(ContactoContext.class,i);
		}
		public ContactosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contactos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterContactos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitContactos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitContactos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContactosContext contactos() throws RecognitionException {
		ContactosContext _localctx = new ContactosContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_contactos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				contacto();
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 || _la==T__15 );
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

	public static class ContactoContext extends ParserRuleContext {
		public TelemovelContext telemovel() {
			return getRuleContext(TelemovelContext.class,0);
		}
		public TerminalNode AND() { return getToken(SociedadeAnonimaParser.AND, 0); }
		public EmailContext email() {
			return getRuleContext(EmailContext.class,0);
		}
		public ContactoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contacto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterContacto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitContacto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitContacto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContactoContext contacto() throws RecognitionException {
		ContactoContext _localctx = new ContactoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_contacto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			telemovel();
			setState(183);
			match(AND);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(184);
				email();
				}
			}

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

	public static class TelemovelContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SociedadeAnonimaParser.NUM, 0); }
		public TelemovelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_telemovel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterTelemovel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitTelemovel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitTelemovel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TelemovelContext telemovel() throws RecognitionException {
		TelemovelContext _localctx = new TelemovelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_telemovel);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__14);
				setState(188);
				match(NUM);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(T__15);
				setState(190);
				match(NUM);
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

	public static class EmailContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(SociedadeAnonimaParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SociedadeAnonimaParser.WORD, i);
		}
		public EmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmailContext email() throws RecognitionException {
		EmailContext _localctx = new EmailContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_email);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__16);
			setState(194);
			match(WORD);
			setState(195);
			match(T__17);
			setState(196);
			match(WORD);
			setState(197);
			match(T__18);
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

	public static class FuncaoContext extends ParserRuleContext {
		public String func;
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_funcao);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(T__19);

				            ((FuncaoContext)_localctx).func =  "GERENTE";
				       
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__20);

				            ((FuncaoContext)_localctx).func =  "PRODUCAO";
				       
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(T__21);

				            ((FuncaoContext)_localctx).func =  "ESCRITORIO";
				       
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(T__22);

				            ((FuncaoContext)_localctx).func =  "ARMAZEM";
				       
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

	public static class EntradaContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(SociedadeAnonimaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(SociedadeAnonimaParser.NUM, i);
		}
		public List<TerminalNode> BAR() { return getTokens(SociedadeAnonimaParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(SociedadeAnonimaParser.BAR, i);
		}
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(NUM);
			setState(210);
			match(BAR);
			setState(211);
			match(NUM);
			setState(212);
			match(BAR);
			setState(213);
			match(NUM);
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

	public static class AssembleiaGeraisContext extends ParserRuleContext {
		public List<AssembleiaGeralContext> assembleiaGeral() {
			return getRuleContexts(AssembleiaGeralContext.class);
		}
		public AssembleiaGeralContext assembleiaGeral(int i) {
			return getRuleContext(AssembleiaGeralContext.class,i);
		}
		public AssembleiaGeraisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembleiaGerais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterAssembleiaGerais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitAssembleiaGerais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitAssembleiaGerais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssembleiaGeraisContext assembleiaGerais() throws RecognitionException {
		AssembleiaGeraisContext _localctx = new AssembleiaGeraisContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assembleiaGerais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				assembleiaGeral();
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__23 );
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

	public static class AssembleiaGeralContext extends ParserRuleContext {
		public Token NUM;
		public Token WORD;
		public TerminalNode NUM() { return getToken(SociedadeAnonimaParser.NUM, 0); }
		public List<TerminalNode> SP() { return getTokens(SociedadeAnonimaParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SociedadeAnonimaParser.SP, i);
		}
		public TerminalNode WORD() { return getToken(SociedadeAnonimaParser.WORD, 0); }
		public ListaSociosContext listaSocios() {
			return getRuleContext(ListaSociosContext.class,0);
		}
		public AssembleiaGeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembleiaGeral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterAssembleiaGeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitAssembleiaGeral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitAssembleiaGeral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssembleiaGeralContext assembleiaGeral() throws RecognitionException {
		AssembleiaGeralContext _localctx = new AssembleiaGeralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assembleiaGeral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__23);
			setState(221);
			((AssembleiaGeralContext)_localctx).NUM = match(NUM);
			setState(222);
			match(SP);
			setState(223);
			match(T__24);
			setState(224);
			((AssembleiaGeralContext)_localctx).WORD = match(WORD);
			setState(225);
			match(SP);
			setState(226);
			match(T__25);
			setState(227);
			listaSocios();

			                    System.out.println("------Informação Assembleia Geral-------");
			                    int flag  = 0;
			                    int numAG = Integer.parseInt((((AssembleiaGeralContext)_localctx).NUM!=null?((AssembleiaGeralContext)_localctx).NUM.getText():null));
			                    String pres = (((AssembleiaGeralContext)_localctx).WORD!=null?((AssembleiaGeralContext)_localctx).WORD.getText():null);
			                    for(String s : listSocios) {
			                        if(pres.equals(s)) flag = 1;
			                    }
			                    if(flag == 0) {
			                        System.out.println("Assembleia Geral válida !!!");
			                        System.out.println("AG Nº: " + numAG);
			                        System.out.println("Presidente: " + pres);
			                        for(String s : listSocios) {
			                            System.out.println("Membro: " + s);
			                        }

			                    } else {
			                        System.out.println("Assembleia Geral inválida...");
			                        System.out.println("Verificar por favor a lista de sócios...");
			                    }
			                    listSocios = new ArrayList<>();
			                
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

	public static class ListaSociosContext extends ParserRuleContext {
		public Token WORD;
		public TerminalNode WORD() { return getToken(SociedadeAnonimaParser.WORD, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SociedadeAnonimaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SociedadeAnonimaParser.COMMA, i);
		}
		public List<ListaSociosContext> listaSocios() {
			return getRuleContexts(ListaSociosContext.class);
		}
		public ListaSociosContext listaSocios(int i) {
			return getRuleContext(ListaSociosContext.class,i);
		}
		public ListaSociosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaSocios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).enterListaSocios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SociedadeAnonimaListener ) ((SociedadeAnonimaListener)listener).exitListaSocios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SociedadeAnonimaVisitor ) return ((SociedadeAnonimaVisitor<? extends T>)visitor).visitListaSocios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaSociosContext listaSocios() throws RecognitionException {
		ListaSociosContext _localctx = new ListaSociosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listaSocios);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((ListaSociosContext)_localctx).WORD = match(WORD);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(COMMA);
					setState(232);
					listaSocios();
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}

			                listSocios.add((((ListaSociosContext)_localctx).WORD!=null?((ListaSociosContext)_localctx).WORD.getText():null));
			            
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\no\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\5\20\u0093\n\20\3\21\6\21\u0096\n\21\r\21\16\21\u0097\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\6\25\u00b5\n\25\r\25"+
		"\16\25\u00b6\3\26\3\26\3\26\5\26\u00bc\n\26\3\27\3\27\3\27\3\27\5\27\u00c2"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00d2\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\6\33\u00db\n"+
		"\33\r\33\16\33\u00dc\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\7\35\u00ec\n\35\f\35\16\35\u00ef\13\35\3\35\3\35\3\35"+
		"\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2"+
		"\2\2\u00e5\2:\3\2\2\2\4M\3\2\2\2\6O\3\2\2\2\bT\3\2\2\2\nX\3\2\2\2\f\\"+
		"\3\2\2\2\16_\3\2\2\2\20b\3\2\2\2\22n\3\2\2\2\24x\3\2\2\2\26z\3\2\2\2\30"+
		"\u0084\3\2\2\2\32\u0087\3\2\2\2\34\u008a\3\2\2\2\36\u0092\3\2\2\2 \u0095"+
		"\3\2\2\2\"\u009b\3\2\2\2$\u00a9\3\2\2\2&\u00ad\3\2\2\2(\u00b4\3\2\2\2"+
		"*\u00b8\3\2\2\2,\u00c1\3\2\2\2.\u00c3\3\2\2\2\60\u00d1\3\2\2\2\62\u00d3"+
		"\3\2\2\2\64\u00da\3\2\2\2\66\u00de\3\2\2\28\u00e8\3\2\2\2:;\7\37\2\2;"+
		"<\5\4\3\2<=\7\35\2\2=>\5\24\13\2>?\7\35\2\2?@\5 \21\2@A\7\35\2\2AB\5\64"+
		"\33\2BC\7 \2\2CD\b\2\1\2D\3\3\2\2\2EF\5\6\4\2FG\b\3\1\2GN\3\2\2\2HI\5"+
		"\6\4\2IJ\7\36\2\2JK\5\4\3\2KL\b\3\1\2LN\3\2\2\2ME\3\2\2\2MH\3\2\2\2N\5"+
		"\3\2\2\2OP\5\b\5\2PQ\5\n\6\2QR\5\20\t\2RS\b\4\1\2S\7\3\2\2\2TU\7\3\2\2"+
		"UV\7%\2\2VW\b\5\1\2W\t\3\2\2\2XY\5\f\7\2YZ\7!\2\2Z[\5\16\b\2[\13\3\2\2"+
		"\2\\]\7\4\2\2]^\7%\2\2^\r\3\2\2\2_`\7\5\2\2`a\7%\2\2a\17\3\2\2\2bc\7\6"+
		"\2\2cd\7%\2\2de\7\"\2\2ef\5\22\n\2fg\b\t\1\2g\21\3\2\2\2hi\7\7\2\2io\b"+
		"\n\1\2jk\7\b\2\2ko\b\n\1\2lm\7\t\2\2mo\b\n\1\2nh\3\2\2\2nj\3\2\2\2nl\3"+
		"\2\2\2o\23\3\2\2\2py\3\2\2\2qr\5\26\f\2rs\b\13\1\2sy\3\2\2\2tu\5\26\f"+
		"\2uv\5\24\13\2vw\b\13\1\2wy\3\2\2\2xp\3\2\2\2xq\3\2\2\2xt\3\2\2\2y\25"+
		"\3\2\2\2z{\7\n\2\2{|\5\30\r\2|}\7\"\2\2}~\5\32\16\2~\177\7\"\2\2\177\u0080"+
		"\5\34\17\2\u0080\u0081\7\"\2\2\u0081\u0082\5\36\20\2\u0082\u0083\b\f\1"+
		"\2\u0083\27\3\2\2\2\u0084\u0085\7%\2\2\u0085\u0086\b\r\1\2\u0086\31\3"+
		"\2\2\2\u0087\u0088\7&\2\2\u0088\u0089\7\13\2\2\u0089\33\3\2\2\2\u008a"+
		"\u008b\7&\2\2\u008b\u008c\7\f\2\2\u008c\u008d\b\17\1\2\u008d\35\3\2\2"+
		"\2\u008e\u008f\7\r\2\2\u008f\u0093\b\20\1\2\u0090\u0091\7\16\2\2\u0091"+
		"\u0093\b\20\1\2\u0092\u008e\3\2\2\2\u0092\u0090\3\2\2\2\u0093\37\3\2\2"+
		"\2\u0094\u0096\5\"\22\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\21"+
		"\1\2\u009a!\3\2\2\2\u009b\u009c\7\17\2\2\u009c\u009d\5\30\r\2\u009d\u009e"+
		"\7\"\2\2\u009e\u009f\5$\23\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\5&\24\2\u00a1"+
		"\u00a2\7\"\2\2\u00a2\u00a3\5(\25\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\5\60"+
		"\31\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\5\62\32\2\u00a7\u00a8\b\22\1\2\u00a8"+
		"#\3\2\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\7&\2\2\u00ab\u00ac\b\23\1\2"+
		"\u00ac%\3\2\2\2\u00ad\u00ae\7&\2\2\u00ae\u00af\7#\2\2\u00af\u00b0\7&\2"+
		"\2\u00b0\u00b1\7#\2\2\u00b1\u00b2\7&\2\2\u00b2\'\3\2\2\2\u00b3\u00b5\5"+
		"*\26\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7)\3\2\2\2\u00b8\u00b9\5,\27\2\u00b9\u00bb\7$\2\2\u00ba"+
		"\u00bc\5.\30\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc+\3\2\2\2"+
		"\u00bd\u00be\7\21\2\2\u00be\u00c2\7&\2\2\u00bf\u00c0\7\22\2\2\u00c0\u00c2"+
		"\7&\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2-\3\2\2\2\u00c3\u00c4"+
		"\7\23\2\2\u00c4\u00c5\7%\2\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\7%\2\2\u00c7"+
		"\u00c8\7\25\2\2\u00c8/\3\2\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00d2\b\31\1"+
		"\2\u00cb\u00cc\7\27\2\2\u00cc\u00d2\b\31\1\2\u00cd\u00ce\7\30\2\2\u00ce"+
		"\u00d2\b\31\1\2\u00cf\u00d0\7\31\2\2\u00d0\u00d2\b\31\1\2\u00d1\u00c9"+
		"\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\61\3\2\2\2\u00d3\u00d4\7&\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\7&\2\2\u00d6"+
		"\u00d7\7#\2\2\u00d7\u00d8\7&\2\2\u00d8\63\3\2\2\2\u00d9\u00db\5\66\34"+
		"\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\65\3\2\2\2\u00de\u00df\7\32\2\2\u00df\u00e0\7&\2\2\u00e0"+
		"\u00e1\7\"\2\2\u00e1\u00e2\7\33\2\2\u00e2\u00e3\7%\2\2\u00e3\u00e4\7\""+
		"\2\2\u00e4\u00e5\7\34\2\2\u00e5\u00e6\58\35\2\u00e6\u00e7\b\34\1\2\u00e7"+
		"\67\3\2\2\2\u00e8\u00ed\7%\2\2\u00e9\u00ea\7\36\2\2\u00ea\u00ec\58\35"+
		"\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\b\35\1\2"+
		"\u00f19\3\2\2\2\rMnx\u0092\u0097\u00b6\u00bb\u00c1\u00d1\u00dc\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}