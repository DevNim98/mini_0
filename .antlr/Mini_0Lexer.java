// Generated from c:\dev\u005Cuni\2021-01\Compiladores\mini_0\Mini_0.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Mini_0Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OP_BOOL", "OP_REL", "COMMENT", "LINE_COMMENT", "NL", "LITNUMERAL", "LITSTRING", 
			"LITCHAR", "TRUE", "FALSE", "IF", "ELSE", "END", "WHILE", "LOOP", "FUN", 
			"RETURN", "NEW", "STRING", "INT", "CHAR", "BOOL", "AND", "OR", "NOT", 
			"LESS", "GREATER", "LEFTPAREN", "RIGHTPAREN", "LEFTBRACKET", "RIGHTBRACKET", 
			"LEFTBRACE", "RIGHTBRACE", "PLUS", "MINUS", "STAR", "DIV", "COMMA", "COLON", 
			"GREATEREQUAL", "LESSEQUAL", "EQUAL", "DIFFERENT", "DOT", "ID", "WS"
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


	public Mini_0Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mini_0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0135\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\5\2b\n\2\3\3\3\3\3\3\3\3\3\3\5\3i\n"+
		"\3\3\4\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\5\3\5\3\6\6\6\u0085\n\6\r\6\16"+
		"\6\u0086\3\7\6\7\u008a\n\7\r\7\16\7\u008b\3\7\3\7\3\7\3\7\6\7\u0092\n"+
		"\7\r\7\16\7\u0093\5\7\u0096\n\7\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u009e\n\b"+
		"\r\b\16\b\u009f\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\7.\u012a\n."+
		"\f.\16.\u012d\13.\3/\6/\u0130\n/\r/\16/\u0131\3/\3/\3p\2\60\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\13\4\2\f\f\17\17\3\2\62;\5\2\62;CH"+
		"ch\4\2\13\f^^\5\2\62;C\\c|\6\2\"\"\62;C\\c|\5\2C\\aac|\6\2\62;C\\aac|"+
		"\5\2\13\13\17\17\"\"\2\u0146\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\3a\3\2\2\2\5h\3\2\2\2\7j\3\2\2\2\tx\3\2\2\2\13\u0084\3\2\2"+
		"\2\r\u0095\3\2\2\2\17\u0097\3\2\2\2\21\u00a3\3\2\2\2\23\u00ad\3\2\2\2"+
		"\25\u00b2\3\2\2\2\27\u00b8\3\2\2\2\31\u00bb\3\2\2\2\33\u00c0\3\2\2\2\35"+
		"\u00c4\3\2\2\2\37\u00ca\3\2\2\2!\u00cf\3\2\2\2#\u00d3\3\2\2\2%\u00da\3"+
		"\2\2\2\'\u00de\3\2\2\2)\u00e5\3\2\2\2+\u00e9\3\2\2\2-\u00ee\3\2\2\2/\u00f3"+
		"\3\2\2\2\61\u00f7\3\2\2\2\63\u00fa\3\2\2\2\65\u00fe\3\2\2\2\67\u0100\3"+
		"\2\2\29\u0102\3\2\2\2;\u0104\3\2\2\2=\u0106\3\2\2\2?\u0108\3\2\2\2A\u010a"+
		"\3\2\2\2C\u010c\3\2\2\2E\u010e\3\2\2\2G\u0110\3\2\2\2I\u0112\3\2\2\2K"+
		"\u0114\3\2\2\2M\u0116\3\2\2\2O\u0118\3\2\2\2Q\u011a\3\2\2\2S\u011d\3\2"+
		"\2\2U\u0120\3\2\2\2W\u0122\3\2\2\2Y\u0125\3\2\2\2[\u0127\3\2\2\2]\u012f"+
		"\3\2\2\2_b\5/\30\2`b\5\61\31\2a_\3\2\2\2a`\3\2\2\2b\4\3\2\2\2ci\5Q)\2"+
		"di\5\67\34\2ei\5\65\33\2fi\5S*\2gi\5W,\2hc\3\2\2\2hd\3\2\2\2he\3\2\2\2"+
		"hf\3\2\2\2hg\3\2\2\2i\6\3\2\2\2jk\7\61\2\2kl\7,\2\2lp\3\2\2\2mo\13\2\2"+
		"\2nm\3\2\2\2or\3\2\2\2pq\3\2\2\2pn\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7,\2"+
		"\2tu\7\61\2\2uv\3\2\2\2vw\b\4\2\2w\b\3\2\2\2xy\7\61\2\2yz\7\61\2\2z~\3"+
		"\2\2\2{}\n\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\b\5\2\2\u0082\n\3\2\2\2\u0083\u0085"+
		"\7\f\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\f\3\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0096"+
		"\3\2\2\2\u008d\u008e\7\62\2\2\u008e\u008f\7z\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u0092\t\4\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0089\3\2\2\2\u0095"+
		"\u008d\3\2\2\2\u0096\16\3\2\2\2\u0097\u009d\7$\2\2\u0098\u009e\t\5\2\2"+
		"\u0099\u009a\7\u00e4\2\2\u009a\u009b\7\u20ae\2\2\u009b\u009e\7\uffff\2"+
		"\2\u009c\u009e\t\6\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\7$\2\2\u00a2\20\3\2\2\2\u00a3\u00a9\7)\2\2"+
		"\u00a4\u00aa\t\5\2\2\u00a5\u00a6\7\u00e4\2\2\u00a6\u00a7\7\u20ae\2\2\u00a7"+
		"\u00aa\7\uffff\2\2\u00a8\u00aa\t\7\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5"+
		"\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7)\2\2\u00ac"+
		"\22\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7w\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\24\3\2\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\26\3\2\2\2\u00b8"+
		"\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba\30\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf\32\3\2\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7f\2\2\u00c3\34\3\2\2\2\u00c4"+
		"\u00c5\7y\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7n\2\2"+
		"\u00c8\u00c9\7g\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7"+
		"q\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7r\2\2\u00ce \3\2\2\2\u00cf\u00d0"+
		"\7h\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7p\2\2\u00d2\"\3\2\2\2\u00d3\u00d4"+
		"\7t\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7w\2\2\u00d7"+
		"\u00d8\7t\2\2\u00d8\u00d9\7p\2\2\u00d9$\3\2\2\2\u00da\u00db\7p\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7y\2\2\u00dd&\3\2\2\2\u00de\u00df\7u\2\2\u00df"+
		"\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2"+
		"\u00e3\u00e4\7i\2\2\u00e4(\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2"+
		"\2\u00e7\u00e8\7v\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7"+
		"j\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7t\2\2\u00ed,\3\2\2\2\u00ee\u00ef"+
		"\7d\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7n\2\2\u00f2"+
		".\3\2\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7f\2\2\u00f6"+
		"\60\3\2\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7t\2\2\u00f9\62\3\2\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7v\2\2\u00fd\64\3\2\2\2\u00fe"+
		"\u00ff\7>\2\2\u00ff\66\3\2\2\2\u0100\u0101\7@\2\2\u01018\3\2\2\2\u0102"+
		"\u0103\7*\2\2\u0103:\3\2\2\2\u0104\u0105\7+\2\2\u0105<\3\2\2\2\u0106\u0107"+
		"\7]\2\2\u0107>\3\2\2\2\u0108\u0109\7_\2\2\u0109@\3\2\2\2\u010a\u010b\7"+
		"}\2\2\u010bB\3\2\2\2\u010c\u010d\7\177\2\2\u010dD\3\2\2\2\u010e\u010f"+
		"\7-\2\2\u010fF\3\2\2\2\u0110\u0111\7/\2\2\u0111H\3\2\2\2\u0112\u0113\7"+
		",\2\2\u0113J\3\2\2\2\u0114\u0115\7\61\2\2\u0115L\3\2\2\2\u0116\u0117\7"+
		".\2\2\u0117N\3\2\2\2\u0118\u0119\7<\2\2\u0119P\3\2\2\2\u011a\u011b\7@"+
		"\2\2\u011b\u011c\7?\2\2\u011cR\3\2\2\2\u011d\u011e\7>\2\2\u011e\u011f"+
		"\7?\2\2\u011fT\3\2\2\2\u0120\u0121\7?\2\2\u0121V\3\2\2\2\u0122\u0123\7"+
		">\2\2\u0123\u0124\7@\2\2\u0124X\3\2\2\2\u0125\u0126\7\60\2\2\u0126Z\3"+
		"\2\2\2\u0127\u012b\t\b\2\2\u0128\u012a\t\t\2\2\u0129\u0128\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\\\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012e\u0130\t\n\2\2\u012f\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\b/\2\2\u0134^\3\2\2\2\21\2ahp~\u0086\u008b\u0093\u0095\u009d\u009f"+
		"\u00a9\u0129\u012b\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}