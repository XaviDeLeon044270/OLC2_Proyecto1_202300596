// Generated from /home/xavi-13/Escritorio/OLC2_Proyecto1_202300596/api/grammars/Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, INTEGER=17, 
		BOOLEAN=18, FLOAT=19, STRING=20, ID=21, WS=22;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_variableDcl = 2, RULE_expressionStmt = 3, 
		RULE_printStmt = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "variableDcl", "expressionStmt", "printStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'var'", "'='", "'-'", "'*'", "'/'", "'+'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='", "'('", "')'", "'print('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INTEGER", "BOOLEAN", "FLOAT", "STRING", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4145172L) != 0)) {
				{
				{
				setState(10);
				stmt();
				}
				}
				setState(15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public VariableDclContext variableDcl() {
			return getRuleContext(VariableDclContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__13:
			case INTEGER:
			case BOOLEAN:
			case FLOAT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				expressionStmt(0);
				setState(17);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				variableDcl();
				setState(20);
				match(T__0);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				printStmt();
				setState(23);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDclContext extends ParserRuleContext {
		public VariableDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDcl; }
	 
		public VariableDclContext() { }
		public void copyFrom(VariableDclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends VariableDclContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public VariableDeclarationContext(VariableDclContext ctx) { copyFrom(ctx); }
	}

	public final VariableDclContext variableDcl() throws RecognitionException {
		VariableDclContext _localctx = new VariableDclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDcl);
		int _la;
		try {
			_localctx = new VariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__1);
			setState(28);
			match(ID);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(29);
				match(T__2);
				setState(30);
				expressionStmt(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
	 
		public ExpressionStmtContext() { }
		public void copyFrom(ExpressionStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ExpressionStmtContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public AssignmentContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ExpressionStmtContext {
		public TerminalNode INTEGER() { return getToken(LanguageParser.INTEGER, 0); }
		public IntegerContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ExpressionStmtContext {
		public TerminalNode FLOAT() { return getToken(LanguageParser.FLOAT, 0); }
		public FloatContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ExpressionStmtContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public IdentifierContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExpressionStmtContext {
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public MulDivContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExpressionStmtContext {
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public AddSubContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualContext extends ExpressionStmtContext {
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public EqualContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExpressionStmtContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public ParensContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterLessContext extends ExpressionStmtContext {
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public GreaterLessContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegateContext extends ExpressionStmtContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public NegateContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpressionStmtContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public StringContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ExpressionStmtContext {
		public TerminalNode BOOLEAN() { return getToken(LanguageParser.BOOLEAN, 0); }
		public BooleanContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		return expressionStmt(0);
	}

	private ExpressionStmtContext expressionStmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, _parentState);
		ExpressionStmtContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressionStmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(34);
				match(T__3);
				setState(35);
				expressionStmt(12);
				}
				break;
			case 2:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(ID);
				setState(37);
				match(T__2);
				setState(38);
				expressionStmt(7);
				}
				break;
			case 3:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(INTEGER);
				}
				break;
			case 4:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(T__13);
				setState(45);
				expressionStmt(0);
				setState(46);
				match(T__14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(50);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(51);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(52);
						expressionStmt(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(53);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(54);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						expressionStmt(11);
						}
						break;
					case 3:
						{
						_localctx = new GreaterLessContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(56);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(57);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(58);
						expressionStmt(10);
						}
						break;
					case 4:
						{
						_localctx = new EqualContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(59);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(60);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						expressionStmt(9);
						}
						break;
					}
					} 
				}
				setState(66);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends ParserRuleContext {
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	 
		public PrintStmtContext() { }
		public void copyFrom(PrintStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends PrintStmtContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public PrintContext(PrintStmtContext ctx) { copyFrom(ctx); }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStmt);
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__15);
			setState(68);
			expressionStmt(0);
			setState(69);
			match(T__14);
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
		case 3:
			return expressionStmt_sempred((ExpressionStmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStmt_sempred(ExpressionStmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016H\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00031\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003?\b\u0003\n\u0003\f\u0003"+
		"B\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0000\u0001\u0006\u0005\u0000\u0002\u0004\u0006\b\u0000\u0004\u0001\u0000"+
		"\u0005\u0006\u0002\u0000\u0004\u0004\u0007\u0007\u0001\u0000\b\u000b\u0001"+
		"\u0000\f\rQ\u0000\r\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000"+
		"\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000"+
		"\bC\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000"+
		"\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0006\u0003\u0000"+
		"\u0011\u0012\u0005\u0001\u0000\u0000\u0012\u001a\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0003\u0004\u0002\u0000\u0014\u0015\u0005\u0001\u0000\u0000"+
		"\u0015\u001a\u0001\u0000\u0000\u0000\u0016\u0017\u0003\b\u0004\u0000\u0017"+
		"\u0018\u0005\u0001\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019"+
		"\u0010\u0001\u0000\u0000\u0000\u0019\u0013\u0001\u0000\u0000\u0000\u0019"+
		"\u0016\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0005\u0002\u0000\u0000\u001c\u001f\u0005\u0015\u0000\u0000\u001d"+
		"\u001e\u0005\u0003\u0000\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0005\u0001\u0000"+
		"\u0000\u0000!\"\u0006\u0003\uffff\uffff\u0000\"#\u0005\u0004\u0000\u0000"+
		"#1\u0003\u0006\u0003\f$%\u0005\u0015\u0000\u0000%&\u0005\u0003\u0000\u0000"+
		"&1\u0003\u0006\u0003\u0007\'1\u0005\u0011\u0000\u0000(1\u0005\u0012\u0000"+
		"\u0000)1\u0005\u0013\u0000\u0000*1\u0005\u0014\u0000\u0000+1\u0005\u0015"+
		"\u0000\u0000,-\u0005\u000e\u0000\u0000-.\u0003\u0006\u0003\u0000./\u0005"+
		"\u000f\u0000\u0000/1\u0001\u0000\u0000\u00000!\u0001\u0000\u0000\u0000"+
		"0$\u0001\u0000\u0000\u00000\'\u0001\u0000\u0000\u00000(\u0001\u0000\u0000"+
		"\u00000)\u0001\u0000\u0000\u00000*\u0001\u0000\u0000\u00000+\u0001\u0000"+
		"\u0000\u00000,\u0001\u0000\u0000\u00001@\u0001\u0000\u0000\u000023\n\u000b"+
		"\u0000\u000034\u0007\u0000\u0000\u00004?\u0003\u0006\u0003\f56\n\n\u0000"+
		"\u000067\u0007\u0001\u0000\u00007?\u0003\u0006\u0003\u000b89\n\t\u0000"+
		"\u00009:\u0007\u0002\u0000\u0000:?\u0003\u0006\u0003\n;<\n\b\u0000\u0000"+
		"<=\u0007\u0003\u0000\u0000=?\u0003\u0006\u0003\t>2\u0001\u0000\u0000\u0000"+
		">5\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000"+
		"\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000A\u0007\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"CD\u0005\u0010\u0000\u0000DE\u0003\u0006\u0003\u0000EF\u0005\u000f\u0000"+
		"\u0000F\t\u0001\u0000\u0000\u0000\u0006\r\u0019\u001f0>@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}