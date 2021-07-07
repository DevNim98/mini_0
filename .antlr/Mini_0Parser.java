// Generated from c:\dev\u005Cuni\2021-01\Compiladores\mini_0\Mini_0.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Mini_0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP_BOOL=1, OP_REL=2, COMMENT=3, LINE_COMMENT=4, NL=5, LITNUMERAL=6, LITSTRING=7, 
		LITCHAR=8, TRUE=9, FALSE=10, IF=11, ELSE=12, END=13, WHILE=14, LOOP=15, 
		FUN=16, RETURN=17, NEW=18, STRING=19, INT=20, CHAR=21, BOOL=22, AND=23, 
		OR=24, NOT=25, LESS=26, GREATER=27, LEFTPAREN=28, RIGHTPAREN=29, LEFTBRACKET=30, 
		RIGHTBRACKET=31, LEFTBRACE=32, RIGHTBRACE=33, PLUS=34, MINUS=35, STAR=36, 
		DIV=37, COMMA=38, COLON=39, GREATEREQUAL=40, LESSEQUAL=41, EQUAL=42, DIFFERENT=43, 
		DOT=44, ID=45, WS=46;
	public static final int
		RULE_programa = 0, RULE_comando = 1, RULE_listadecl = 2, RULE_decl = 3, 
		RULE_nl = 4, RULE_glbal = 5, RULE_funcion = 6, RULE_listaBloque = 7, RULE_bloque = 8, 
		RULE_listaComando = 9, RULE_params = 10, RULE_parametro = 11, RULE_tipobase = 12, 
		RULE_tipo = 13, RULE_var = 14, RULE_declvar = 15, RULE_cmdif = 16, RULE_cmdwhile = 17, 
		RULE_cmdasign = 18, RULE_llamada = 19, RULE_listaexp = 20, RULE_cmdreturn = 21, 
		RULE_op1 = 22, RULE_op2 = 23, RULE_exprAritmetica = 24, RULE_termAritmetico = 25, 
		RULE_factorAritmetico = 26, RULE_exprRelacional = 27, RULE_termRelacional = 28, 
		RULE_exp = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comando", "listadecl", "decl", "nl", "glbal", "funcion", 
			"listaBloque", "bloque", "listaComando", "params", "parametro", "tipobase", 
			"tipo", "var", "declvar", "cmdif", "cmdwhile", "cmdasign", "llamada", 
			"listaexp", "cmdreturn", "op1", "op2", "exprAritmetica", "termAritmetico", 
			"factorAritmetico", "exprRelacional", "termRelacional", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'true'", "'false'", 
			"'if'", "'else'", "'end'", "'while'", "'loop'", "'fun'", "'return'", 
			"'new'", "'string'", "'int'", "'char'", "'bool'", "'and'", "'or'", "'not'", 
			"'<'", "'>'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", 
			"'*'", "'/'", "','", "':'", "'>='", "'<='", "'='", "'<>'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP_BOOL", "OP_REL", "COMMENT", "LINE_COMMENT", "NL", "LITNUMERAL", 
			"LITSTRING", "LITCHAR", "TRUE", "FALSE", "IF", "ELSE", "END", "WHILE", 
			"LOOP", "FUN", "RETURN", "NEW", "STRING", "INT", "CHAR", "BOOL", "AND", 
			"OR", "NOT", "LESS", "GREATER", "LEFTPAREN", "RIGHTPAREN", "LEFTBRACKET", 
			"RIGHTBRACKET", "LEFTBRACE", "RIGHTBRACE", "PLUS", "MINUS", "STAR", "DIV", 
			"COMMA", "COLON", "GREATEREQUAL", "LESSEQUAL", "EQUAL", "DIFFERENT", 
			"DOT", "ID", "WS"
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
	public String getGrammarFileName() { return "Mini_0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Mini_0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public ListadeclContext listadecl() {
			return getRuleContext(ListadeclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Mini_0Parser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(Mini_0Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Mini_0Parser.NL, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(60);
				match(NL);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			listadecl();
			setState(67);
			match(EOF);
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

	public static class ComandoContext extends ParserRuleContext {
		public  tipoComando;
		public CmdifContext cmdif() {
			return getRuleContext(CmdifContext.class,0);
		}
		public CmdwhileContext cmdwhile() {
			return getRuleContext(CmdwhileContext.class,0);
		}
		public CmdasignContext cmdasign() {
			return getRuleContext(CmdasignContext.class,0);
		}
		public CmdreturnContext cmdreturn() {
			return getRuleContext(CmdreturnContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				cmdif();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				cmdwhile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				cmdasign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				cmdreturn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				llamada();
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

	public static class ListadeclContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ListadeclContext listadecl() {
			return getRuleContext(ListadeclContext.class,0);
		}
		public ListadeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadecl; }
	}

	public final ListadeclContext listadecl() throws RecognitionException {
		ListadeclContext _localctx = new ListadeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listadecl);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				decl();
				setState(77);
				listadecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				decl();
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

	public static class DeclContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public GlbalContext glbal() {
			return getRuleContext(GlbalContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				funcion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				glbal();
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

	public static class NlContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(Mini_0Parser.NL, 0); }
		public NlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nl; }
	}

	public final NlContext nl() throws RecognitionException {
		NlContext _localctx = new NlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(NL);
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

	public static class GlbalContext extends ParserRuleContext {
		public DeclvarContext declvar() {
			return getRuleContext(DeclvarContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public GlbalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glbal; }
	}

	public final GlbalContext glbal() throws RecognitionException {
		GlbalContext _localctx = new GlbalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_glbal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			declvar();
			setState(89);
			nl();
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(Mini_0Parser.FUN, 0); }
		public TerminalNode ID() { return getToken(Mini_0Parser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(Mini_0Parser.LEFTPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(Mini_0Parser.RIGHTPAREN, 0); }
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public ListaBloqueContext listaBloque() {
			return getRuleContext(ListaBloqueContext.class,0);
		}
		public TerminalNode END() { return getToken(Mini_0Parser.END, 0); }
		public TerminalNode COLON() { return getToken(Mini_0Parser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(FUN);
			setState(92);
			match(ID);
			setState(93);
			match(LEFTPAREN);
			setState(94);
			params();
			setState(95);
			match(RIGHTPAREN);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(96);
				match(COLON);
				setState(97);
				tipo();
				}
			}

			setState(100);
			nl();
			setState(101);
			listaBloque();
			setState(102);
			match(END);
			setState(103);
			nl();
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

	public static class ListaBloqueContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ListaBloqueContext listaBloque() {
			return getRuleContext(ListaBloqueContext.class,0);
		}
		public ListaBloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaBloque; }
	}

	public final ListaBloqueContext listaBloque() throws RecognitionException {
		ListaBloqueContext _localctx = new ListaBloqueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listaBloque);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				bloque();
				setState(107);
				listaBloque();
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

	public static class BloqueContext extends ParserRuleContext {
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public List<DeclvarContext> declvar() {
			return getRuleContexts(DeclvarContext.class);
		}
		public DeclvarContext declvar(int i) {
			return getRuleContext(DeclvarContext.class,i);
		}
		public ListaComandoContext listaComando() {
			return getRuleContext(ListaComandoContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloque);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					declvar();
					setState(112);
					nl();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				setState(119);
				listaComando();
				}
			}

			setState(122);
			nl();
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

	public static class ListaComandoContext extends ParserRuleContext {
		public ComandoContext cmd;
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public ListaComandoContext listaComando() {
			return getRuleContext(ListaComandoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ListaComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComando; }
	}

	public final ListaComandoContext listaComando() throws RecognitionException {
		ListaComandoContext _localctx = new ListaComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaComando);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((ListaComandoContext)_localctx).cmd = comando();
				setState(125);
				nl();
				setState(126);
				listaComando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				((ListaComandoContext)_localctx).cmd = comando();
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Mini_0Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Mini_0Parser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_params);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				parametro();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(132);
					match(COMMA);
					setState(133);
					parametro();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RIGHTPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Mini_0Parser.ID, 0); }
		public TerminalNode COLON() { return getToken(Mini_0Parser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
			setState(143);
			match(COLON);
			setState(144);
			tipo();
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

	public static class TipobaseContext extends ParserRuleContext {
		public  tipoDato;
		public TerminalNode INT() { return getToken(Mini_0Parser.INT, 0); }
		public TerminalNode BOOL() { return getToken(Mini_0Parser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(Mini_0Parser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(Mini_0Parser.STRING, 0); }
		public TipobaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipobase; }
	}

	public final TipobaseContext tipobase() throws RecognitionException {
		TipobaseContext _localctx = new TipobaseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipobase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TipoContext extends ParserRuleContext {
		public  tipoDato;
		public TipobaseContext tipobase() {
			return getRuleContext(TipobaseContext.class,0);
		}
		public TerminalNode LEFTBRACKET() { return getToken(Mini_0Parser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(Mini_0Parser.RIGHTBRACKET, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case INT:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				tipobase();
				}
				break;
			case LEFTBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(LEFTBRACKET);
				setState(150);
				match(RIGHTBRACKET);
				setState(151);
				tipo();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Mini_0Parser.ID, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LEFTBRACKET() { return getToken(Mini_0Parser.LEFTBRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(Mini_0Parser.RIGHTBRACKET, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		return var(0);
	}

	private VarContext var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarContext _localctx = new VarContext(_ctx, _parentState);
		VarContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_var, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(155);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var);
					setState(157);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(158);
					match(LEFTBRACKET);
					setState(159);
					exp();
					setState(160);
					match(RIGHTBRACKET);
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclvarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Mini_0Parser.ID, 0); }
		public TerminalNode COLON() { return getToken(Mini_0Parser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declvar; }
	}

	public final DeclvarContext declvar() throws RecognitionException {
		DeclvarContext _localctx = new DeclvarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(COLON);
			setState(169);
			tipo();
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

	public static class CmdifContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(Mini_0Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(Mini_0Parser.IF, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public List<ListaBloqueContext> listaBloque() {
			return getRuleContexts(ListaBloqueContext.class);
		}
		public ListaBloqueContext listaBloque(int i) {
			return getRuleContext(ListaBloqueContext.class,i);
		}
		public TerminalNode END() { return getToken(Mini_0Parser.END, 0); }
		public List<TerminalNode> ELSE() { return getTokens(Mini_0Parser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(Mini_0Parser.ELSE, i);
		}
		public CmdifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdif; }
	}

	public final CmdifContext cmdif() throws RecognitionException {
		CmdifContext _localctx = new CmdifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdif);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IF);
			setState(172);
			exp();
			setState(173);
			nl();
			setState(174);
			listaBloque();
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					match(ELSE);
					setState(176);
					match(IF);
					setState(177);
					exp();
					setState(178);
					nl();
					setState(179);
					listaBloque();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(186);
				match(ELSE);
				setState(187);
				nl();
				setState(188);
				listaBloque();
				}
			}

			setState(192);
			match(END);
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

	public static class CmdwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Mini_0Parser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public ListaBloqueContext listaBloque() {
			return getRuleContext(ListaBloqueContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(Mini_0Parser.LOOP, 0); }
		public CmdwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdwhile; }
	}

	public final CmdwhileContext cmdwhile() throws RecognitionException {
		CmdwhileContext _localctx = new CmdwhileContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(WHILE);
			setState(195);
			exp();
			setState(196);
			nl();
			setState(197);
			listaBloque();
			setState(198);
			match(LOOP);
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

	public static class CmdasignContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Mini_0Parser.EQUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CmdasignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdasign; }
	}

	public final CmdasignContext cmdasign() throws RecognitionException {
		CmdasignContext _localctx = new CmdasignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdasign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			var(0);
			setState(201);
			match(EQUAL);
			setState(202);
			exp();
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

	public static class LlamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Mini_0Parser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(Mini_0Parser.LEFTPAREN, 0); }
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(Mini_0Parser.RIGHTPAREN, 0); }
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_llamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ID);
			setState(205);
			match(LEFTPAREN);
			setState(206);
			listaexp();
			setState(207);
			match(RIGHTPAREN);
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

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Mini_0Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Mini_0Parser.COMMA, i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listaexp);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RIGHTPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LITNUMERAL:
			case LITSTRING:
			case LITCHAR:
			case NEW:
			case CHAR:
			case BOOL:
			case NOT:
			case LEFTPAREN:
			case MINUS:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				exp();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(211);
					match(COMMA);
					setState(212);
					exp();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class CmdreturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Mini_0Parser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CmdreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdreturn; }
	}

	public final CmdreturnContext cmdreturn() throws RecognitionException {
		CmdreturnContext _localctx = new CmdreturnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdreturn);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(RETURN);
				setState(221);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(RETURN);
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

	public static class Op1Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(Mini_0Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Mini_0Parser.MINUS, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(Mini_0Parser.STAR, 0); }
		public TerminalNode DIV() { return getToken(Mini_0Parser.DIV, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExprAritmeticaContext extends ParserRuleContext {
		public List<TermAritmeticoContext> termAritmetico() {
			return getRuleContexts(TermAritmeticoContext.class);
		}
		public TermAritmeticoContext termAritmetico(int i) {
			return getRuleContext(TermAritmeticoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public ExprAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAritmetica; }
	}

	public final ExprAritmeticaContext exprAritmetica() throws RecognitionException {
		ExprAritmeticaContext _localctx = new ExprAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exprAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			termAritmetico();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(230);
				op1();
				setState(231);
				termAritmetico();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermAritmeticoContext extends ParserRuleContext {
		public List<FactorAritmeticoContext> factorAritmetico() {
			return getRuleContexts(FactorAritmeticoContext.class);
		}
		public FactorAritmeticoContext factorAritmetico(int i) {
			return getRuleContext(FactorAritmeticoContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termAritmetico; }
	}

	public final TermAritmeticoContext termAritmetico() throws RecognitionException {
		TermAritmeticoContext _localctx = new TermAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_termAritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			factorAritmetico();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==DIV) {
				{
				{
				setState(239);
				op2();
				setState(240);
				factorAritmetico();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactorAritmeticoContext extends ParserRuleContext {
		public TerminalNode LITNUMERAL() { return getToken(Mini_0Parser.LITNUMERAL, 0); }
		public TerminalNode LITSTRING() { return getToken(Mini_0Parser.LITSTRING, 0); }
		public TerminalNode ID() { return getToken(Mini_0Parser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(Mini_0Parser.LEFTPAREN, 0); }
		public ExprAritmeticaContext exprAritmetica() {
			return getRuleContext(ExprAritmeticaContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(Mini_0Parser.RIGHTPAREN, 0); }
		public TerminalNode BOOL() { return getToken(Mini_0Parser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(Mini_0Parser.CHAR, 0); }
		public TerminalNode LITCHAR() { return getToken(Mini_0Parser.LITCHAR, 0); }
		public FactorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorAritmetico; }
	}

	public final FactorAritmeticoContext factorAritmetico() throws RecognitionException {
		FactorAritmeticoContext _localctx = new FactorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factorAritmetico);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITNUMERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(LITNUMERAL);
				}
				break;
			case LITSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(LITSTRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(ID);
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(LEFTPAREN);
				setState(251);
				exprAritmetica();
				setState(252);
				match(RIGHTPAREN);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				match(BOOL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(CHAR);
				}
				break;
			case LITCHAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
				match(LITCHAR);
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

	public static class ExprRelacionalContext extends ParserRuleContext {
		public List<TermRelacionalContext> termRelacional() {
			return getRuleContexts(TermRelacionalContext.class);
		}
		public TermRelacionalContext termRelacional(int i) {
			return getRuleContext(TermRelacionalContext.class,i);
		}
		public List<TerminalNode> OP_BOOL() { return getTokens(Mini_0Parser.OP_BOOL); }
		public TerminalNode OP_BOOL(int i) {
			return getToken(Mini_0Parser.OP_BOOL, i);
		}
		public ExprRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelacional; }
	}

	public final ExprRelacionalContext exprRelacional() throws RecognitionException {
		ExprRelacionalContext _localctx = new ExprRelacionalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exprRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			termRelacional();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_BOOL) {
				{
				{
				setState(260);
				match(OP_BOOL);
				setState(261);
				termRelacional();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermRelacionalContext extends ParserRuleContext {
		public List<ExprAritmeticaContext> exprAritmetica() {
			return getRuleContexts(ExprAritmeticaContext.class);
		}
		public ExprAritmeticaContext exprAritmetica(int i) {
			return getRuleContext(ExprAritmeticaContext.class,i);
		}
		public TerminalNode OP_REL() { return getToken(Mini_0Parser.OP_REL, 0); }
		public TermRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termRelacional; }
	}

	public final TermRelacionalContext termRelacional() throws RecognitionException {
		TermRelacionalContext _localctx = new TermRelacionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_termRelacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			exprAritmetica();
			setState(268);
			match(OP_REL);
			setState(269);
			exprAritmetica();
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Mini_0Parser.NEW, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(Mini_0Parser.LEFTBRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(Mini_0Parser.RIGHTBRACKET, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode LEFTPAREN() { return getToken(Mini_0Parser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(Mini_0Parser.RIGHTPAREN, 0); }
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public TerminalNode NOT() { return getToken(Mini_0Parser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(Mini_0Parser.MINUS, 0); }
		public ExprAritmeticaContext exprAritmetica() {
			return getRuleContext(ExprAritmeticaContext.class,0);
		}
		public ExprRelacionalContext exprRelacional() {
			return getRuleContext(ExprRelacionalContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exp);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(NEW);
				setState(272);
				match(LEFTBRACKET);
				setState(273);
				exp();
				setState(274);
				match(RIGHTBRACKET);
				setState(275);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(LEFTPAREN);
				setState(278);
				exp();
				setState(279);
				match(RIGHTPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				llamada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(NOT);
				setState(283);
				exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(MINUS);
				setState(285);
				exp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				exprAritmetica();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				exprRelacional();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return var_sempred((VarContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean var_sempred(VarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0125\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3"+
		"\4\3\4\5\4S\n\4\3\5\3\5\5\5W\n\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\be\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3"+
		"\n\3\n\7\nu\n\n\f\n\16\nx\13\n\3\n\5\n{\n\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0084\n\13\3\f\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f\3"+
		"\f\5\f\u008f\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u009b"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a5\n\20\f\20\16"+
		"\20\u00a8\13\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00b8\n\22\f\22\16\22\u00bb\13\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00c1\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00d8\n\26"+
		"\f\26\16\26\u00db\13\26\5\26\u00dd\n\26\3\27\3\27\3\27\5\27\u00e2\n\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00ec\n\32\f\32\16\32\u00ef"+
		"\13\32\3\33\3\33\3\33\3\33\7\33\u00f5\n\33\f\33\16\33\u00f8\13\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0104\n\34\3\35\3\35"+
		"\3\35\7\35\u0109\n\35\f\35\16\35\u010c\13\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0123\n\37\3\37\2\3\36 \2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<\2\5\3\2\25\30\3\2$%\3\2&\'\2\u012a\2"+
		"A\3\2\2\2\4L\3\2\2\2\6R\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16]\3"+
		"\2\2\2\20o\3\2\2\2\22v\3\2\2\2\24\u0083\3\2\2\2\26\u008e\3\2\2\2\30\u0090"+
		"\3\2\2\2\32\u0094\3\2\2\2\34\u009a\3\2\2\2\36\u009c\3\2\2\2 \u00a9\3\2"+
		"\2\2\"\u00ad\3\2\2\2$\u00c4\3\2\2\2&\u00ca\3\2\2\2(\u00ce\3\2\2\2*\u00dc"+
		"\3\2\2\2,\u00e1\3\2\2\2.\u00e3\3\2\2\2\60\u00e5\3\2\2\2\62\u00e7\3\2\2"+
		"\2\64\u00f0\3\2\2\2\66\u0103\3\2\2\28\u0105\3\2\2\2:\u010d\3\2\2\2<\u0122"+
		"\3\2\2\2>@\7\7\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2C"+
		"A\3\2\2\2DE\5\6\4\2EF\7\2\2\3F\3\3\2\2\2GM\5\"\22\2HM\5$\23\2IM\5&\24"+
		"\2JM\5,\27\2KM\5(\25\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2"+
		"\2M\5\3\2\2\2NO\5\b\5\2OP\5\6\4\2PS\3\2\2\2QS\5\b\5\2RN\3\2\2\2RQ\3\2"+
		"\2\2S\7\3\2\2\2TW\5\16\b\2UW\5\f\7\2VT\3\2\2\2VU\3\2\2\2W\t\3\2\2\2XY"+
		"\7\7\2\2Y\13\3\2\2\2Z[\5 \21\2[\\\5\n\6\2\\\r\3\2\2\2]^\7\22\2\2^_\7/"+
		"\2\2_`\7\36\2\2`a\5\26\f\2ad\7\37\2\2bc\7)\2\2ce\5\34\17\2db\3\2\2\2d"+
		"e\3\2\2\2ef\3\2\2\2fg\5\n\6\2gh\5\20\t\2hi\7\17\2\2ij\5\n\6\2j\17\3\2"+
		"\2\2kp\5\22\n\2lm\5\22\n\2mn\5\20\t\2np\3\2\2\2ok\3\2\2\2ol\3\2\2\2p\21"+
		"\3\2\2\2qr\5 \21\2rs\5\n\6\2su\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2v"+
		"w\3\2\2\2wz\3\2\2\2xv\3\2\2\2y{\5\24\13\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2"+
		"\2|}\5\n\6\2}\23\3\2\2\2~\177\5\4\3\2\177\u0080\5\n\6\2\u0080\u0081\5"+
		"\24\13\2\u0081\u0084\3\2\2\2\u0082\u0084\5\4\3\2\u0083~\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\25\3\2\2\2\u0085\u008a\5\30\r\2\u0086\u0087\7(\2"+
		"\2\u0087\u0089\5\30\r\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008f\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\27\3\2\2\2\u0090\u0091\7/\2\2\u0091\u0092\7)\2\2\u0092\u0093\5\34\17"+
		"\2\u0093\31\3\2\2\2\u0094\u0095\t\2\2\2\u0095\33\3\2\2\2\u0096\u009b\5"+
		"\32\16\2\u0097\u0098\7 \2\2\u0098\u0099\7!\2\2\u0099\u009b\5\34\17\2\u009a"+
		"\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009b\35\3\2\2\2\u009c\u009d\b\20\1"+
		"\2\u009d\u009e\7/\2\2\u009e\u00a6\3\2\2\2\u009f\u00a0\f\3\2\2\u00a0\u00a1"+
		"\7 \2\2\u00a1\u00a2\5<\37\2\u00a2\u00a3\7!\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u009f\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\37\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ab"+
		"\7)\2\2\u00ab\u00ac\5\34\17\2\u00ac!\3\2\2\2\u00ad\u00ae\7\r\2\2\u00ae"+
		"\u00af\5<\37\2\u00af\u00b0\5\n\6\2\u00b0\u00b9\5\20\t\2\u00b1\u00b2\7"+
		"\16\2\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\5<\37\2\u00b4\u00b5\5\n\6\2\u00b5"+
		"\u00b6\5\20\t\2\u00b6\u00b8\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b8\u00bb\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c0\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\7\16\2\2\u00bd\u00be\5\n\6\2\u00be\u00bf\5"+
		"\20\t\2\u00bf\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\7\17\2\2\u00c3#\3\2\2\2\u00c4\u00c5\7\20\2"+
		"\2\u00c5\u00c6\5<\37\2\u00c6\u00c7\5\n\6\2\u00c7\u00c8\5\20\t\2\u00c8"+
		"\u00c9\7\21\2\2\u00c9%\3\2\2\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc\7,\2"+
		"\2\u00cc\u00cd\5<\37\2\u00cd\'\3\2\2\2\u00ce\u00cf\7/\2\2\u00cf\u00d0"+
		"\7\36\2\2\u00d0\u00d1\5*\26\2\u00d1\u00d2\7\37\2\2\u00d2)\3\2\2\2\u00d3"+
		"\u00dd\3\2\2\2\u00d4\u00d9\5<\37\2\u00d5\u00d6\7(\2\2\u00d6\u00d8\5<\37"+
		"\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dc"+
		"\u00d4\3\2\2\2\u00dd+\3\2\2\2\u00de\u00df\7\23\2\2\u00df\u00e2\5<\37\2"+
		"\u00e0\u00e2\7\23\2\2\u00e1\u00de\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2-\3"+
		"\2\2\2\u00e3\u00e4\t\3\2\2\u00e4/\3\2\2\2\u00e5\u00e6\t\4\2\2\u00e6\61"+
		"\3\2\2\2\u00e7\u00ed\5\64\33\2\u00e8\u00e9\5.\30\2\u00e9\u00ea\5\64\33"+
		"\2\u00ea\u00ec\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\63\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f6\5\66\34\2\u00f1\u00f2\5\60\31\2\u00f2\u00f3\5\66\34\2\u00f3\u00f5"+
		"\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\65\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u0104\7\b\2"+
		"\2\u00fa\u0104\7\t\2\2\u00fb\u0104\7/\2\2\u00fc\u00fd\7\36\2\2\u00fd\u00fe"+
		"\5\62\32\2\u00fe\u00ff\7\37\2\2\u00ff\u0104\3\2\2\2\u0100\u0104\7\30\2"+
		"\2\u0101\u0104\7\27\2\2\u0102\u0104\7\n\2\2\u0103\u00f9\3\2\2\2\u0103"+
		"\u00fa\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00fc\3\2\2\2\u0103\u0100\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\67\3\2\2\2\u0105\u010a"+
		"\5:\36\2\u0106\u0107\7\3\2\2\u0107\u0109\5:\36\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b9\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010d\u010e\5\62\32\2\u010e\u010f\7\4\2\2\u010f\u0110"+
		"\5\62\32\2\u0110;\3\2\2\2\u0111\u0112\7\24\2\2\u0112\u0113\7 \2\2\u0113"+
		"\u0114\5<\37\2\u0114\u0115\7!\2\2\u0115\u0116\5\34\17\2\u0116\u0123\3"+
		"\2\2\2\u0117\u0118\7\36\2\2\u0118\u0119\5<\37\2\u0119\u011a\7\37\2\2\u011a"+
		"\u0123\3\2\2\2\u011b\u0123\5(\25\2\u011c\u011d\7\33\2\2\u011d\u0123\5"+
		"<\37\2\u011e\u011f\7%\2\2\u011f\u0123\5<\37\2\u0120\u0123\5\62\32\2\u0121"+
		"\u0123\58\35\2\u0122\u0111\3\2\2\2\u0122\u0117\3\2\2\2\u0122\u011b\3\2"+
		"\2\2\u0122\u011c\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123=\3\2\2\2\31ALRVdovz\u0083\u008a\u008e\u009a\u00a6"+
		"\u00b9\u00c0\u00d9\u00dc\u00e1\u00ed\u00f6\u0103\u010a\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}