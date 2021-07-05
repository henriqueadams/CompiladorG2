package parser;

// Generated from Lang.g4 by ANTLR 4.4

	import datastructures.Symbol;
	import datastructures.Variable;
	import datastructures.SymbolTable;
	import exceptions.SemanticException;
	import ast.Program;
	import ast.AbstractCommand;
	import ast.CommandLeitura;
	import ast.CommandEscrita;
	import ast.CommandAtribuicao;
	import ast.CommandDecisao;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, AP=9, 
		FP=10, SC=11, OP=12, ATTR=13, VIR=14, ACH=15, FCH=16, OPREL=17, ID=18, 
		NUMBER=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "AP", 
		"FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", "NUMBER", 
		"WS"
	};


		private int _tipo;
			private String _varName;
			private String _varValue;
			private SymbolTable symbolTable = new SymbolTable();
			private Symbol symbol;
			private Program program = new Program();
			private ArrayList<AbstractCommand> curThread;
			private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
			private String _readID;
			private String _writeID;
			private String _exprID;
			private String _exprContent;
			private String _exprDecision;
			private ArrayList<AbstractCommand> listaTrue;
			private ArrayList<AbstractCommand> listaFalse;
		
		public void verificaID(String id){
			if (!symbolTable.exists(id)){
				throw new SemanticException("Symbol "+id+" not declared");
			}
		}
		
		public void exibeComandos(){
			for (AbstractCommand c: program.getComandos()){
				System.out.println(c);
			}
		}
		
		public void generateCode(){
			program.generateTarget();
		}


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u00c5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00ac\n\22\3\23\3\23\7\23\u00b0\n\23\f\23\16\23\u00b3\13"+
		"\23\3\24\6\24\u00b6\n\24\r\24\16\24\u00b7\3\24\3\24\6\24\u00bc\n\24\r"+
		"\24\16\24\u00bd\5\24\u00c0\n\24\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26\3\2\b\5\2,-//\61\61\4\2>>@@\3\2c|\5\2\62;C\\c|\3\2\62;\5"+
		"\2\13\f\17\17\"\"\u00cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2"+
		"\2\5?\3\2\2\2\7K\3\2\2\2\tV\3\2\2\2\13b\3\2\2\2\rm\3\2\2\2\17x\3\2\2\2"+
		"\21\u0087\3\2\2\2\23\u0092\3\2\2\2\25\u0094\3\2\2\2\27\u0096\3\2\2\2\31"+
		"\u0098\3\2\2\2\33\u009a\3\2\2\2\35\u009c\3\2\2\2\37\u009e\3\2\2\2!\u00a0"+
		"\3\2\2\2#\u00ab\3\2\2\2%\u00ad\3\2\2\2\'\u00b5\3\2\2\2)\u00c1\3\2\2\2"+
		"+,\7r\2\2,-\7q\2\2-.\7t\2\2./\7J\2\2/\60\7q\2\2\60\61\7l\2\2\61\62\7g"+
		"\2\2\62\63\7G\2\2\63\64\7j\2\2\64\65\7U\2\2\65\66\7q\2\2\66\67\7R\2\2"+
		"\678\7g\2\289\7u\2\29:\7u\2\2:;\7q\2\2;<\7c\2\2<=\7n\2\2=>\7=\2\2>\4\3"+
		"\2\2\2?@\7q\2\2@A\7n\2\2AB\7q\2\2BC\7m\2\2CD\7k\2\2DE\7p\2\2EF\7j\2\2"+
		"FG\7q\2\2GH\7O\2\2HI\7g\2\2IJ\7w\2\2J\6\3\2\2\2KL\7g\2\2LM\7p\2\2MN\7"+
		"v\2\2NO\7c\2\2OP\7q\2\2PQ\7G\2\2QR\7n\2\2RS\7g\2\2ST\7G\2\2TU\7j\2\2U"+
		"\b\3\2\2\2VW\7e\2\2WX\7q\2\2XY\7t\2\2YZ\7v\2\2Z[\7c\2\2[\\\7R\2\2\\]\7"+
		"t\2\2]^\7c\2\2^_\7O\2\2_`\7k\2\2`a\7o\2\2a\n\3\2\2\2bc\7p\2\2cd\7w\2\2"+
		"de\7p\2\2ef\7e\2\2fg\7c\2\2gh\7P\2\2hi\7g\2\2ij\7o\2\2jk\7X\2\2kl\7k\2"+
		"\2l\f\3\2\2\2mn\7x\2\2no\7q\2\2op\7w\2\2pq\7N\2\2qr\7j\2\2rs\7g\2\2st"+
		"\7W\2\2tu\7u\2\2uv\7c\2\2vw\7t\2\2w\16\3\2\2\2xy\7c\2\2yz\7e\2\2z{\7g"+
		"\2\2{|\7t\2\2|}\7v\2\2}~\7q\2\2~\177\7O\2\2\177\u0080\7k\2\2\u0080\u0081"+
		"\7|\2\2\u0081\u0082\7g\2\2\u0082\u0083\7t\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7x\2\2\u0085\u0086\7k\2\2\u0086\20\3\2\2\2\u0087\u0088\7j\2\2\u0088"+
		"\u0089\7q\2\2\u0089\u008a\7t\2\2\u008a\u008b\7c\2\2\u008b\u008c\7F\2\2"+
		"\u008c\u008d\7q\2\2\u008d\u008e\7U\2\2\u008e\u008f\7j\2\2\u008f\u0090"+
		"\7q\2\2\u0090\u0091\7y\2\2\u0091\22\3\2\2\2\u0092\u0093\7*\2\2\u0093\24"+
		"\3\2\2\2\u0094\u0095\7+\2\2\u0095\26\3\2\2\2\u0096\u0097\7=\2\2\u0097"+
		"\30\3\2\2\2\u0098\u0099\t\2\2\2\u0099\32\3\2\2\2\u009a\u009b\7?\2\2\u009b"+
		"\34\3\2\2\2\u009c\u009d\7.\2\2\u009d\36\3\2\2\2\u009e\u009f\7}\2\2\u009f"+
		" \3\2\2\2\u00a0\u00a1\7\177\2\2\u00a1\"\3\2\2\2\u00a2\u00ac\t\3\2\2\u00a3"+
		"\u00a4\7@\2\2\u00a4\u00ac\7?\2\2\u00a5\u00a6\7>\2\2\u00a6\u00ac\7?\2\2"+
		"\u00a7\u00a8\7?\2\2\u00a8\u00ac\7?\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ac"+
		"\7?\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab"+
		"\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac$\3\2\2\2\u00ad\u00b1\t\4\2\2"+
		"\u00ae\u00b0\t\5\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2&\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b6\t\6\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bf\3\2\2\2\u00b9\u00bb\7\60\2\2\u00ba"+
		"\u00bc\t\6\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0(\3\2\2\2\u00c1\u00c2\t\7\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c3\u00c4\b\25\2\2\u00c4*\3\2\2\2\t\2\u00ab\u00af\u00b1\u00b7\u00bd"+
		"\u00bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}