// Generated from C:/Users/Danny/IdeaProjects/CMPE152_Parser/src/com/company\MyGrammar.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_decls = 2, RULE_decl = 3, RULE_type = 4, 
		RULE_stmts = 5, RULE_assign = 6, RULE_stmt = 7, RULE_allexpr = 8, RULE_andexpr = 9, 
		RULE_equal = 10, RULE_rel = 11, RULE_expr = 12, RULE_term = 13, RULE_incdecexpr = 14, 
		RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "decls", "decl", "type", "stmts", "assign", "stmt", 
			"allexpr", "andexpr", "equal", "rel", "expr", "term", "incdecexpr", "factor"
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

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			decls(0);
			setState(36);
			stmts(0);
			setState(37);
			match(T__1);
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

	public static class DeclsContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		return decls(0);
	}

	private DeclsContext decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclsContext _localctx = new DeclsContext(_ctx, _parentState);
		DeclsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decls);
					setState(40);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(41);
					decl();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			type();
			setState(48);
			match(ID);
			setState(49);
			match(T__2);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MyGrammarParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(MyGrammarParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) ) {
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

	public static class StmtsContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		return stmts(0);
	}

	private StmtsContext stmts(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtsContext _localctx = new StmtsContext(_ctx, _parentState);
		StmtsContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_stmts, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmts);
					setState(54);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(55);
					stmt();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public AllexprContext allexpr() {
			return getRuleContext(AllexprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(ID);
				setState(62);
				allexpr(0);
				setState(63);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(ID);
				setState(66);
				match(T__3);
				setState(67);
				allexpr(0);
				setState(68);
				match(T__2);
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

	public static class StmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AllexprContext allexpr() {
			return getRuleContext(AllexprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IncdecexprContext incdecexpr() {
			return getRuleContext(IncdecexprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__4);
				setState(74);
				match(T__5);
				setState(75);
				allexpr(0);
				setState(76);
				match(T__6);
				setState(77);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(T__4);
				setState(80);
				match(T__5);
				setState(81);
				allexpr(0);
				setState(82);
				match(T__6);
				setState(83);
				stmt();
				setState(84);
				match(T__7);
				setState(85);
				stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(T__8);
				setState(88);
				match(T__5);
				setState(89);
				allexpr(0);
				setState(90);
				match(T__6);
				setState(91);
				stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(T__9);
				setState(94);
				stmt();
				setState(95);
				match(T__8);
				setState(96);
				match(T__5);
				setState(97);
				allexpr(0);
				setState(98);
				match(T__6);
				setState(99);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(T__10);
				setState(102);
				match(T__5);
				setState(103);
				assign();
				setState(104);
				allexpr(0);
				setState(105);
				match(T__2);
				setState(106);
				incdecexpr();
				setState(107);
				match(T__6);
				setState(108);
				stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				match(T__11);
				setState(111);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(112);
				block();
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

	public static class AllexprContext extends ParserRuleContext {
		public AndexprContext andexpr() {
			return getRuleContext(AndexprContext.class,0);
		}
		public AllexprContext allexpr() {
			return getRuleContext(AllexprContext.class,0);
		}
		public TerminalNode OR() { return getToken(MyGrammarParser.OR, 0); }
		public AllexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAllexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAllexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAllexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllexprContext allexpr() throws RecognitionException {
		return allexpr(0);
	}

	private AllexprContext allexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AllexprContext _localctx = new AllexprContext(_ctx, _parentState);
		AllexprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_allexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(116);
			andexpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AllexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_allexpr);
					setState(118);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(119);
					match(OR);
					setState(120);
					andexpr(0);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class AndexprContext extends ParserRuleContext {
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public AndexprContext andexpr() {
			return getRuleContext(AndexprContext.class,0);
		}
		public AndexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAndexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAndexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAndexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndexprContext andexpr() throws RecognitionException {
		return andexpr(0);
	}

	private AndexprContext andexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexprContext _localctx = new AndexprContext(_ctx, _parentState);
		AndexprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_andexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			equal(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpr);
					setState(129);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(130);
					match(T__12);
					setState(131);
					equal(0);
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class EqualContext extends ParserRuleContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		return equal(0);
	}

	private EqualContext equal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualContext _localctx = new EqualContext(_ctx, _parentState);
		EqualContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_equal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138);
			rel();
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new EqualContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equal);
						setState(140);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(141);
						match(T__13);
						setState(142);
						rel();
						}
						break;
					case 2:
						{
						_localctx = new EqualContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equal);
						setState(143);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(144);
						match(T__14);
						setState(145);
						rel();
						}
						break;
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class RelContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rel);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				expr(0);
				setState(152);
				match(T__15);
				setState(153);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				expr(0);
				setState(156);
				match(T__16);
				setState(157);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				expr(0);
				setState(160);
				match(T__17);
				setState(161);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				expr(0);
				setState(164);
				match(T__18);
				setState(165);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(171);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
						match(T__19);
						setState(175);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						match(T__20);
						setState(178);
						term(0);
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(185);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(187);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(188);
						match(T__21);
						setState(189);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(190);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(191);
						match(T__22);
						setState(192);
						factor();
						}
						break;
					}
					} 
				}
				setState(197);
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

	public static class IncdecexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode INC() { return getToken(MyGrammarParser.INC, 0); }
		public TerminalNode DEC() { return getToken(MyGrammarParser.DEC, 0); }
		public IncdecexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incdecexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIncdecexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIncdecexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitIncdecexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncdecexprContext incdecexpr() throws RecognitionException {
		IncdecexprContext _localctx = new IncdecexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_incdecexpr);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(ID);
				setState(199);
				match(INC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(ID);
				setState(201);
				match(DEC);
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

	public static class FactorContext extends ParserRuleContext {
		public AllexprContext allexpr() {
			return getRuleContext(AllexprContext.class,0);
		}
		public IncdecexprContext incdecexpr() {
			return getRuleContext(IncdecexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode NUM() { return getToken(MyGrammarParser.NUM, 0); }
		public TerminalNode REAL() { return getToken(MyGrammarParser.REAL, 0); }
		public TerminalNode TRUE() { return getToken(MyGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MyGrammarParser.FALSE, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__5);
				setState(205);
				allexpr(0);
				setState(206);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				incdecexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				match(REAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(213);
				match(FALSE);
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
		case 2:
			return decls_sempred((DeclsContext)_localctx, predIndex);
		case 5:
			return stmts_sempred((StmtsContext)_localctx, predIndex);
		case 8:
			return allexpr_sempred((AllexprContext)_localctx, predIndex);
		case 9:
			return andexpr_sempred((AndexprContext)_localctx, predIndex);
		case 10:
			return equal_sempred((EqualContext)_localctx, predIndex);
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 13:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean decls_sempred(DeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean stmts_sempred(StmtsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean allexpr_sempred(AllexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andexpr_sempred(AndexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equal_sempred(EqualContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bI\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u0087\n\13\f\13\16\13\u008a\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u0095\n\f\f\f\16\f\u0098\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00b6\n\16\f\16\16\16\u00b9\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c4\n\17\f\17\16\17\u00c7"+
		"\13\17\3\20\3\20\3\20\3\20\5\20\u00cd\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00d9\n\21\3\21\2\t\6\f\22\24\26\32\34\22"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2 \"\2\u00e7\2\"\3\2\2"+
		"\2\4$\3\2\2\2\6)\3\2\2\2\b\61\3\2\2\2\n\65\3\2\2\2\f\67\3\2\2\2\16H\3"+
		"\2\2\2\20s\3\2\2\2\22u\3\2\2\2\24\u0080\3\2\2\2\26\u008b\3\2\2\2\30\u00aa"+
		"\3\2\2\2\32\u00ac\3\2\2\2\34\u00ba\3\2\2\2\36\u00cc\3\2\2\2 \u00d8\3\2"+
		"\2\2\"#\5\4\3\2#\3\3\2\2\2$%\7\3\2\2%&\5\6\4\2&\'\5\f\7\2\'(\7\4\2\2("+
		"\5\3\2\2\2).\b\4\1\2*+\f\3\2\2+-\5\b\5\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2"+
		"\2./\3\2\2\2/\7\3\2\2\2\60.\3\2\2\2\61\62\5\n\6\2\62\63\7\33\2\2\63\64"+
		"\7\5\2\2\64\t\3\2\2\2\65\66\t\2\2\2\66\13\3\2\2\2\67<\b\7\1\289\f\3\2"+
		"\29;\5\20\t\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\r\3\2\2\2><\3\2"+
		"\2\2?@\7\33\2\2@A\5\22\n\2AB\7\5\2\2BI\3\2\2\2CD\7\33\2\2DE\7\6\2\2EF"+
		"\5\22\n\2FG\7\5\2\2GI\3\2\2\2H?\3\2\2\2HC\3\2\2\2I\17\3\2\2\2Jt\5\16\b"+
		"\2KL\7\7\2\2LM\7\b\2\2MN\5\22\n\2NO\7\t\2\2OP\5\20\t\2Pt\3\2\2\2QR\7\7"+
		"\2\2RS\7\b\2\2ST\5\22\n\2TU\7\t\2\2UV\5\20\t\2VW\7\n\2\2WX\5\20\t\2Xt"+
		"\3\2\2\2YZ\7\13\2\2Z[\7\b\2\2[\\\5\22\n\2\\]\7\t\2\2]^\5\20\t\2^t\3\2"+
		"\2\2_`\7\f\2\2`a\5\20\t\2ab\7\13\2\2bc\7\b\2\2cd\5\22\n\2de\7\t\2\2ef"+
		"\7\5\2\2ft\3\2\2\2gh\7\r\2\2hi\7\b\2\2ij\5\16\b\2jk\5\22\n\2kl\7\5\2\2"+
		"lm\5\36\20\2mn\7\t\2\2no\5\20\t\2ot\3\2\2\2pq\7\16\2\2qt\7\5\2\2rt\5\4"+
		"\3\2sJ\3\2\2\2sK\3\2\2\2sQ\3\2\2\2sY\3\2\2\2s_\3\2\2\2sg\3\2\2\2sp\3\2"+
		"\2\2sr\3\2\2\2t\21\3\2\2\2uv\b\n\1\2vw\5\24\13\2w}\3\2\2\2xy\f\4\2\2y"+
		"z\7\32\2\2z|\5\24\13\2{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\23"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\b\13\1\2\u0081\u0082\5\26\f\2\u0082"+
		"\u0088\3\2\2\2\u0083\u0084\f\4\2\2\u0084\u0085\7\17\2\2\u0085\u0087\5"+
		"\26\f\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\25\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\b\f\1"+
		"\2\u008c\u008d\5\30\r\2\u008d\u0096\3\2\2\2\u008e\u008f\f\5\2\2\u008f"+
		"\u0090\7\20\2\2\u0090\u0095\5\30\r\2\u0091\u0092\f\4\2\2\u0092\u0093\7"+
		"\21\2\2\u0093\u0095\5\30\r\2\u0094\u008e\3\2\2\2\u0094\u0091\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\27\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0099\u009a\5\32\16\2\u009a\u009b\7\22\2\2\u009b"+
		"\u009c\5\32\16\2\u009c\u00ab\3\2\2\2\u009d\u009e\5\32\16\2\u009e\u009f"+
		"\7\23\2\2\u009f\u00a0\5\32\16\2\u00a0\u00ab\3\2\2\2\u00a1\u00a2\5\32\16"+
		"\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4\5\32\16\2\u00a4\u00ab\3\2\2\2\u00a5"+
		"\u00a6\5\32\16\2\u00a6\u00a7\7\25\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00ab"+
		"\3\2\2\2\u00a9\u00ab\5\32\16\2\u00aa\u0099\3\2\2\2\u00aa\u009d\3\2\2\2"+
		"\u00aa\u00a1\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\31"+
		"\3\2\2\2\u00ac\u00ad\b\16\1\2\u00ad\u00ae\5\34\17\2\u00ae\u00b7\3\2\2"+
		"\2\u00af\u00b0\f\5\2\2\u00b0\u00b1\7\26\2\2\u00b1\u00b6\5\34\17\2\u00b2"+
		"\u00b3\f\4\2\2\u00b3\u00b4\7\27\2\2\u00b4\u00b6\5\34\17\2\u00b5\u00af"+
		"\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\33\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\b\17\1"+
		"\2\u00bb\u00bc\5 \21\2\u00bc\u00c5\3\2\2\2\u00bd\u00be\f\5\2\2\u00be\u00bf"+
		"\7\30\2\2\u00bf\u00c4\5 \21\2\u00c0\u00c1\f\4\2\2\u00c1\u00c2\7\31\2\2"+
		"\u00c2\u00c4\5 \21\2\u00c3\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\35\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00cd\7#\2\2\u00ca\u00cb\7\33"+
		"\2\2\u00cb\u00cd\7$\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\37\3\2\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5\22\n\2\u00d0\u00d1\7\t\2"+
		"\2\u00d1\u00d9\3\2\2\2\u00d2\u00d9\5\36\20\2\u00d3\u00d9\7\33\2\2\u00d4"+
		"\u00d9\7\34\2\2\u00d5\u00d9\7\35\2\2\u00d6\u00d9\7\36\2\2\u00d7\u00d9"+
		"\7\37\2\2\u00d8\u00ce\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2"+
		"\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9!\3\2\2\2\21.<Hs}\u0088\u0094\u0096\u00aa\u00b5\u00b7\u00c3"+
		"\u00c5\u00cc\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}