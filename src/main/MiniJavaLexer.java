// Generated from MiniJava.g4 by ANTLR 4.4

    package main;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, EXTENDS=19, TRUE=20, FALSE=21, PRINT=22, AND=23, LESSTHAN=24, 
		MINUS=25, PLUS=26, TIMES=27, NOT=28, WHILE=29, IF=30, INTARRAYTYPE=31, 
		BOOLEAN=32, INT=33, ABRECHAVES=34, THIS=35, LENGTH=36, INTEGER_LITERAL=37, 
		IDENTIFIER=38, ESPACOS=39, COMENTARIO1LINHA=40, COMETARIONLINHAS=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "EXTENDS", "TRUE", "FALSE", "PRINT", "AND", "LESSTHAN", "MINUS", 
		"PLUS", "TIMES", "NOT", "WHILE", "IF", "INTARRAYTYPE", "BOOLEAN", "INT", 
		"ABRECHAVES", "THIS", "LENGTH", "INTEGER_LITERAL", "IDENTIFIER", "ESPACOS", 
		"COMENTARIO1LINHA", "COMETARIONLINHAS"
	};


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0135\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \7 \u00de\n \f \16"+
		" \u00e1\13 \3 \3 \7 \u00e5\n \f \16 \u00e8\13 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\6"+
		"&\u0107\n&\r&\16&\u0108\3\'\6\'\u010c\n\'\r\'\16\'\u010d\3(\6(\u0111\n"+
		"(\r(\16(\u0112\3(\3(\3)\3)\3)\3)\3)\3)\7)\u011d\n)\f)\16)\u0120\13)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3*\7*\u012c\n*\f*\16*\u012f\13*\3*\3*\3*\3*"+
		"\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\t\3\2\"\"\3\2\62;\6\2\62;C\\aa"+
		"c|\5\2\13\f\17\17\"\"\t\2\13\13\17\17\"\')\60<B]_aa\3\2\f\f\b\2\13\f\17"+
		"\17\"\60<B]_aa\u013f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5Z\3\2\2\2\7^\3\2\2\2\te\3\2\2\2\13k\3"+
		"\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21t\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\177"+
		"\3\2\2\2\31\u0081\3\2\2\2\33\u0088\3\2\2\2\35\u008f\3\2\2\2\37\u0094\3"+
		"\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u00a4"+
		"\3\2\2\2+\u00a9\3\2\2\2-\u00af\3\2\2\2/\u00c2\3\2\2\2\61\u00c5\3\2\2\2"+
		"\63\u00c7\3\2\2\2\65\u00c9\3\2\2\2\67\u00cb\3\2\2\29\u00cd\3\2\2\2;\u00cf"+
		"\3\2\2\2=\u00d5\3\2\2\2?\u00d8\3\2\2\2A\u00eb\3\2\2\2C\u00f3\3\2\2\2E"+
		"\u00f7\3\2\2\2G\u00f9\3\2\2\2I\u00fe\3\2\2\2K\u0106\3\2\2\2M\u010b\3\2"+
		"\2\2O\u0110\3\2\2\2Q\u0116\3\2\2\2S\u0125\3\2\2\2UV\7o\2\2VW\7c\2\2WX"+
		"\7k\2\2XY\7p\2\2Y\4\3\2\2\2Z[\7p\2\2[\\\7g\2\2\\]\7y\2\2]\6\3\2\2\2^_"+
		"\7t\2\2_`\7g\2\2`a\7v\2\2ab\7w\2\2bc\7t\2\2cd\7p\2\2d\b\3\2\2\2ef\7e\2"+
		"\2fg\7n\2\2gh\7c\2\2hi\7u\2\2ij\7u\2\2j\n\3\2\2\2kl\7=\2\2l\f\3\2\2\2"+
		"mn\7]\2\2n\16\3\2\2\2op\7x\2\2pq\7q\2\2qr\7k\2\2rs\7f\2\2s\20\3\2\2\2"+
		"tu\7U\2\2uv\7v\2\2vw\7t\2\2wx\7k\2\2xy\7p\2\2yz\7i\2\2z\22\3\2\2\2{|\7"+
		"?\2\2|\24\3\2\2\2}~\7\177\2\2~\26\3\2\2\2\177\u0080\7_\2\2\u0080\30\3"+
		"\2\2\2\u0081\u0082\7r\2\2\u0082\u0083\7w\2\2\u0083\u0084\7d\2\2\u0084"+
		"\u0085\7n\2\2\u0085\u0086\7k\2\2\u0086\u0087\7e\2\2\u0087\32\3\2\2\2\u0088"+
		"\u0089\7u\2\2\u0089\u008a\7v\2\2\u008a\u008b\7c\2\2\u008b\u008c\7v\2\2"+
		"\u008c\u008d\7k\2\2\u008d\u008e\7e\2\2\u008e\34\3\2\2\2\u008f\u0090\7"+
		"g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\36"+
		"\3\2\2\2\u0094\u0095\7*\2\2\u0095 \3\2\2\2\u0096\u0097\7+\2\2\u0097\""+
		"\3\2\2\2\u0098\u0099\7.\2\2\u0099$\3\2\2\2\u009a\u009b\7\60\2\2\u009b"+
		"&\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7z\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7u\2\2"+
		"\u00a3(\3\2\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7w\2"+
		"\2\u00a7\u00a8\7g\2\2\u00a8*\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7"+
		"c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae,"+
		"\3\2\2\2\u00af\u00b0\7U\2\2\u00b0\u00b1\7{\2\2\u00b1\u00b2\7u\2\2\u00b2"+
		"\u00b3\7v\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7\60\2"+
		"\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba"+
		"\7\60\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7p\2\2"+
		"\u00c1.\3\2\2\2\u00c2\u00c3\7(\2\2\u00c3\u00c4\7(\2\2\u00c4\60\3\2\2\2"+
		"\u00c5\u00c6\7>\2\2\u00c6\62\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8\64\3\2\2"+
		"\2\u00c9\u00ca\7-\2\2\u00ca\66\3\2\2\2\u00cb\u00cc\7,\2\2\u00cc8\3\2\2"+
		"\2\u00cd\u00ce\7#\2\2\u00ce:\3\2\2\2\u00cf\u00d0\7y\2\2\u00d0\u00d1\7"+
		"j\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4<"+
		"\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7h\2\2\u00d7>\3\2\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7v\2\2\u00db\u00df\3\2\2\2\u00dc"+
		"\u00de\t\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e6\7]\2\2\u00e3\u00e5\t\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ea\7_\2\2\u00ea@\3\2\2\2\u00eb\u00ec\7d\2\2\u00ec"+
		"\u00ed\7q\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0\u00f1\7c\2\2\u00f1\u00f2\7p\2\2\u00f2B\3\2\2\2\u00f3\u00f4\7k\2"+
		"\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7v\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7"+
		"}\2\2\u00f8F\3\2\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7j\2\2\u00fb\u00fc"+
		"\7k\2\2\u00fc\u00fd\7u\2\2\u00fdH\3\2\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100"+
		"\7g\2\2\u0100\u0101\7p\2\2\u0101\u0102\7i\2\2\u0102\u0103\7v\2\2\u0103"+
		"\u0104\7j\2\2\u0104J\3\2\2\2\u0105\u0107\t\3\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109L\3\2\2\2"+
		"\u010a\u010c\t\4\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010eN\3\2\2\2\u010f\u0111\t\5\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b(\2\2\u0115P\3\2\2\2\u0116\u0117"+
		"\7\61\2\2\u0117\u0118\7\61\2\2\u0118\u011e\3\2\2\2\u0119\u011d\5M\'\2"+
		"\u011a\u011d\5K&\2\u011b\u011d\t\6\2\2\u011c\u0119\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\t\7"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b)\2\2\u0124R\3\2\2\2\u0125\u0126"+
		"\7\61\2\2\u0126\u0127\7,\2\2\u0127\u012d\3\2\2\2\u0128\u012c\5M\'\2\u0129"+
		"\u012c\5K&\2\u012a\u012c\t\b\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2"+
		"\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7,\2\2\u0131"+
		"\u0132\7\61\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b*\2\2\u0134T\3\2\2\2"+
		"\f\2\u00df\u00e6\u0108\u010d\u0112\u011c\u011e\u012b\u012d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}