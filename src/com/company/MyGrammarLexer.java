// Generated from C:/Users/Danny/IdeaProjects/CMPE152_Parser/src/com/company\MyGrammar.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, OR=24, ID=25, 
		NUM=26, REAL=27, TRUE=28, FALSE=29, INT=30, FLOAT=31, BOOL=32, INC=33, 
		DEC=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "OR", "ID", "NUM", 
			"REAL", "TRUE", "FALSE", "INT", "FLOAT", "BOOL", "INC", "DEC", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'if'", "'('", "')'", "'else'", "'while'", 
			"'do'", "'for'", "'break'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'+'", "'-'", "'*'", "'/'", "'||'", null, null, null, null, null, 
			"'int'", "'float'", "'bool'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"OR", "ID", "NUM", "REAL", "TRUE", "FALSE", "INT", "FLOAT", "BOOL", "INC", 
			"DEC", "WS"
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00df\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\6\32\u0090"+
		"\n\32\r\32\16\32\u0091\3\33\5\33\u0095\n\33\3\33\3\33\5\33\u0099\n\33"+
		"\3\33\3\33\7\33\u009d\n\33\f\33\16\33\u00a0\13\33\5\33\u00a2\n\33\3\34"+
		"\5\34\u00a5\n\34\3\34\6\34\u00a8\n\34\r\34\16\34\u00a9\3\34\3\34\7\34"+
		"\u00ae\n\34\f\34\16\34\u00b1\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u00ba\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00c2\n\36\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3"+
		"$\6$\u00da\n$\r$\16$\u00db\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\7\4\2C\\c|\3\2\62"+
		"\62\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\2\u00e9\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2"+
		"\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rT\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2"+
		"\23]\3\2\2\2\25c\3\2\2\2\27f\3\2\2\2\31j\3\2\2\2\33p\3\2\2\2\35s\3\2\2"+
		"\2\37v\3\2\2\2!y\3\2\2\2#{\3\2\2\2%~\3\2\2\2\'\u0080\3\2\2\2)\u0083\3"+
		"\2\2\2+\u0085\3\2\2\2-\u0087\3\2\2\2/\u0089\3\2\2\2\61\u008b\3\2\2\2\63"+
		"\u008f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a4\3\2\2\29\u00b9\3\2\2\2;\u00c1"+
		"\3\2\2\2=\u00c3\3\2\2\2?\u00c7\3\2\2\2A\u00cd\3\2\2\2C\u00d2\3\2\2\2E"+
		"\u00d5\3\2\2\2G\u00d9\3\2\2\2IJ\7}\2\2J\4\3\2\2\2KL\7\177\2\2L\6\3\2\2"+
		"\2MN\7=\2\2N\b\3\2\2\2OP\7?\2\2P\n\3\2\2\2QR\7k\2\2RS\7h\2\2S\f\3\2\2"+
		"\2TU\7*\2\2U\16\3\2\2\2VW\7+\2\2W\20\3\2\2\2XY\7g\2\2YZ\7n\2\2Z[\7u\2"+
		"\2[\\\7g\2\2\\\22\3\2\2\2]^\7y\2\2^_\7j\2\2_`\7k\2\2`a\7n\2\2ab\7g\2\2"+
		"b\24\3\2\2\2cd\7f\2\2de\7q\2\2e\26\3\2\2\2fg\7h\2\2gh\7q\2\2hi\7t\2\2"+
		"i\30\3\2\2\2jk\7d\2\2kl\7t\2\2lm\7g\2\2mn\7c\2\2no\7m\2\2o\32\3\2\2\2"+
		"pq\7(\2\2qr\7(\2\2r\34\3\2\2\2st\7?\2\2tu\7?\2\2u\36\3\2\2\2vw\7#\2\2"+
		"wx\7?\2\2x \3\2\2\2yz\7>\2\2z\"\3\2\2\2{|\7>\2\2|}\7?\2\2}$\3\2\2\2~\177"+
		"\7@\2\2\177&\3\2\2\2\u0080\u0081\7@\2\2\u0081\u0082\7?\2\2\u0082(\3\2"+
		"\2\2\u0083\u0084\7-\2\2\u0084*\3\2\2\2\u0085\u0086\7/\2\2\u0086,\3\2\2"+
		"\2\u0087\u0088\7,\2\2\u0088.\3\2\2\2\u0089\u008a\7\61\2\2\u008a\60\3\2"+
		"\2\2\u008b\u008c\7~\2\2\u008c\u008d\7~\2\2\u008d\62\3\2\2\2\u008e\u0090"+
		"\t\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\64\3\2\2\2\u0093\u0095\7/\2\2\u0094\u0093\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00a2\t\3\2\2\u0097\u0099"+
		"\7/\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009e\t\4\2\2\u009b\u009d\t\5\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1\u0098\3\2\2\2\u00a2\66\3\2\2"+
		"\2\u00a3\u00a5\7/\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7"+
		"\3\2\2\2\u00a6\u00a8\t\5\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00af\13"+
		"\2\2\2\u00ac\u00ae\t\5\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\u00b3\t\4\2\2\u00b38\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6"+
		"\7t\2\2\u00b6\u00b7\7w\2\2\u00b7\u00ba\7g\2\2\u00b8\u00ba\7\63\2\2\u00b9"+
		"\u00b4\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba:\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc"+
		"\u00bd\7c\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7u\2\2\u00bf\u00c2\7g\2\2"+
		"\u00c0\u00c2\7\62\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2<\3"+
		"\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		">\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"\u00cb\7c\2\2\u00cb\u00cc\7v\2\2\u00cc@\3\2\2\2\u00cd\u00ce\7d\2\2\u00ce"+
		"\u00cf\7q\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7n\2\2\u00d1B\3\2\2\2\u00d2"+
		"\u00d3\7-\2\2\u00d3\u00d4\7-\2\2\u00d4D\3\2\2\2\u00d5\u00d6\7/\2\2\u00d6"+
		"\u00d7\7/\2\2\u00d7F\3\2\2\2\u00d8\u00da\t\6\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\b$\2\2\u00deH\3\2\2\2\16\2\u0091\u0094\u0098\u009e\u00a1"+
		"\u00a4\u00a9\u00af\u00b9\u00c1\u00db\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}