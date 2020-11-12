// Generated from /Users/tonywalmsley/work/num/grammar/antlr4/MODLLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MODLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NULL=2, TRUE=3, FALSE=4, COLON=5, EQUALS=6, STRUCT_SEP=7, ARR_SEP=8, 
		LBRAC=9, RBRAC=10, LSBRAC=11, RSBRAC=12, NUMBER=13, COMMENT=14, QUOTED=15, 
		STRING=16, HASH_PREFIX=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "NULL", "TRUE", "FALSE", "COLON", "EQUALS", "STRUCT_SEP", "ARR_SEP", 
			"LBRAC", "RBRAC", "LSBRAC", "RSBRAC", "NUMBER", "INT", "EXP", "COMMENT", 
			"INSIDE_COMMENT", "QUOTED", "INSIDE_QUOTES", "INSIDE_GRAVES", "STRING", 
			"UNRESERVED", "RESERVED_CHARS", "ESCAPED", "UNICODE", "HEX", "HASH_PREFIX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "':'", "'='", "';'", "','", "'('", "')'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NULL", "TRUE", "FALSE", "COLON", "EQUALS", "STRUCT_SEP", 
			"ARR_SEP", "LBRAC", "RBRAC", "LSBRAC", "RSBRAC", "NUMBER", "COMMENT", 
			"QUOTED", "STRING", "HASH_PREFIX"
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


	public MODLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MODLLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00fb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2;\n\2\r\2\16\2<\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5f\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\5\16y\n\16\3\16\3\16\3\16\6\16~\n\16\r\16\16\16\177"+
		"\5\16\u0082\n\16\3\16\5\16\u0085\n\16\3\17\3\17\3\17\7\17\u008a\n\17\f"+
		"\17\16\17\u008d\13\17\5\17\u008f\n\17\3\20\3\20\5\20\u0093\n\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\7\22\u009f\n\22\f\22\16\22"+
		"\u00a2\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00aa\n\23\f\23\16\23"+
		"\u00ad\13\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b4\n\23\3\24\3\24\3\25\7"+
		"\25\u00b9\n\25\f\25\16\25\u00bc\13\25\3\26\3\26\5\26\u00c0\n\26\3\26\3"+
		"\26\3\26\6\26\u00c5\n\26\r\26\16\26\u00c6\3\26\5\26\u00ca\n\26\3\26\6"+
		"\26\u00cd\n\26\r\26\16\26\u00ce\3\26\5\26\u00d2\n\26\3\26\3\26\6\26\u00d6"+
		"\n\26\r\26\16\26\u00d7\7\26\u00da\n\26\f\26\16\26\u00dd\13\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\5\31\u00e6\n\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u00ed\n\31\5\31\u00ef\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\2\37\2!\20#\2%\21\'\2)\2+\22-\2/\2\61\2\63\2\65\2\67"+
		"\23\3\2\r\5\2\13\f\17\17\"\"\3\2\62;\3\2\63;\4\2GGgg\4\2--//\4\2\f\f\17"+
		"\17\3\2$$\3\2bb\f\2\n\f\16\17\"\"$%*+<=??]_}}\177\u0080\t\2\61\61^^dd"+
		"hhppttvv\5\2\62;CHch\2\u0112\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2!\3\2\2\2\2%\3\2"+
		"\2\2\2+\3\2\2\2\2\67\3\2\2\2\3:\3\2\2\2\5K\3\2\2\2\7W\3\2\2\2\te\3\2\2"+
		"\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23o\3\2\2\2\25q\3\2"+
		"\2\2\27s\3\2\2\2\31u\3\2\2\2\33x\3\2\2\2\35\u008e\3\2\2\2\37\u0090\3\2"+
		"\2\2!\u0096\3\2\2\2#\u00a0\3\2\2\2%\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00ba"+
		"\3\2\2\2+\u00bf\3\2\2\2-\u00de\3\2\2\2/\u00e0\3\2\2\2\61\u00ee\3\2\2\2"+
		"\63\u00f0\3\2\2\2\65\u00f6\3\2\2\2\67\u00f8\3\2\2\29;\t\2\2\2:9\3\2\2"+
		"\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\b\2\2\2?\4\3\2\2\2@A\7\62"+
		"\2\2AB\7\62\2\2BL\7\62\2\2CD\7p\2\2DE\7w\2\2EF\7n\2\2FL\7n\2\2GH\7P\2"+
		"\2HI\7W\2\2IJ\7N\2\2JL\7N\2\2K@\3\2\2\2KC\3\2\2\2KG\3\2\2\2L\6\3\2\2\2"+
		"MN\7\62\2\2NX\7\63\2\2OP\7v\2\2PQ\7t\2\2QR\7w\2\2RX\7g\2\2ST\7V\2\2TU"+
		"\7T\2\2UV\7W\2\2VX\7G\2\2WM\3\2\2\2WO\3\2\2\2WS\3\2\2\2X\b\3\2\2\2YZ\7"+
		"\62\2\2Zf\7\62\2\2[\\\7h\2\2\\]\7c\2\2]^\7n\2\2^_\7u\2\2_f\7g\2\2`a\7"+
		"H\2\2ab\7C\2\2bc\7N\2\2cd\7U\2\2df\7G\2\2eY\3\2\2\2e[\3\2\2\2e`\3\2\2"+
		"\2f\n\3\2\2\2gh\7<\2\2h\f\3\2\2\2ij\7?\2\2j\16\3\2\2\2kl\7=\2\2l\20\3"+
		"\2\2\2mn\7.\2\2n\22\3\2\2\2op\7*\2\2p\24\3\2\2\2qr\7+\2\2r\26\3\2\2\2"+
		"st\7]\2\2t\30\3\2\2\2uv\7_\2\2v\32\3\2\2\2wy\7/\2\2xw\3\2\2\2xy\3\2\2"+
		"\2yz\3\2\2\2z\u0081\5\35\17\2{}\7\60\2\2|~\t\3\2\2}|\3\2\2\2~\177\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081{\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\5\37\20\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\34\3\2\2\2\u0086\u008f\7\62\2\2\u0087"+
		"\u008b\t\4\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u0087\3\2\2\2\u008f\36\3\2\2"+
		"\2\u0090\u0092\t\5\2\2\u0091\u0093\t\6\2\2\u0092\u0091\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5\35\17\2\u0095 \3\2\2\2\u0096"+
		"\u0097\7%\2\2\u0097\u0098\7%\2\2\u0098\u0099\3\2\2\2\u0099\u009a\5#\22"+
		"\2\u009a\u009b\3\2\2\2\u009b\u009c\b\21\2\2\u009c\"\3\2\2\2\u009d\u009f"+
		"\n\7\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1$\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00ab\7$\2\2\u00a4"+
		"\u00aa\5\'\24\2\u00a5\u00a6\7\u0080\2\2\u00a6\u00aa\7$\2\2\u00a7\u00a8"+
		"\7^\2\2\u00a8\u00aa\7$\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b4\7$\2\2\u00af"+
		"\u00b0\7b\2\2\u00b0\u00b1\5)\25\2\u00b1\u00b2\7b\2\2\u00b2\u00b4\3\2\2"+
		"\2\u00b3\u00a3\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4&\3\2\2\2\u00b5\u00b6"+
		"\n\b\2\2\u00b6(\3\2\2\2\u00b7\u00b9\n\t\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb*\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bd\u00be\7%\2\2\u00be\u00c0\7\"\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c5\5\61\31\2"+
		"\u00c2\u00c5\5-\27\2\u00c3\u00c5\5\67\34\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00db\3\2\2\2\u00c8\u00ca\7%\2\2\u00c9\u00c8\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00cd\7\"\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00d2\7%\2\2\u00d1\u00d0\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d6\5\61\31\2\u00d4\u00d6\5"+
		"-\27\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00c9\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		",\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\n\n\2\2\u00df.\3\2\2\2\u00e0"+
		"\u00e1\t\n\2\2\u00e1\60\3\2\2\2\u00e2\u00e5\7^\2\2\u00e3\u00e6\t\13\2"+
		"\2\u00e4\u00e6\5\63\32\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00ef\3\2\2\2\u00e7\u00e8\7^\2\2\u00e8\u00ef\5/\30\2\u00e9\u00ec\7\u0080"+
		"\2\2\u00ea\u00ed\5/\30\2\u00eb\u00ed\5\63\32\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ee\u00e7\3\2"+
		"\2\2\u00ee\u00e9\3\2\2\2\u00ef\62\3\2\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2"+
		"\5\65\33\2\u00f2\u00f3\5\65\33\2\u00f3\u00f4\5\65\33\2\u00f4\u00f5\5\65"+
		"\33\2\u00f5\64\3\2\2\2\u00f6\u00f7\t\f\2\2\u00f7\66\3\2\2\2\u00f8\u00f9"+
		"\7%\2\2\u00f9\u00fa\5+\26\2\u00fa8\3\2\2\2\37\2<KWex\177\u0081\u0084\u008b"+
		"\u008e\u0092\u00a0\u00a9\u00ab\u00b3\u00ba\u00bf\u00c4\u00c6\u00c9\u00ce"+
		"\u00d1\u00d5\u00d7\u00db\u00e5\u00ec\u00ee\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}