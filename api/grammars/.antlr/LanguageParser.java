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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, INTEGER=22, BOOLEAN=23, FLOAT=24, 
		STRING=25, ID=26, ONELINECOMMENT=27, MULTILINECOMMENT=28, WHITESPACES=29;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_nonDcl = 2, RULE_blockStmt = 3, 
		RULE_ifStatement = 4, RULE_whileStatement = 5, RULE_varDcl = 6, RULE_expressionStmt = 7, 
		RULE_printStmt = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "nonDcl", "blockStmt", "ifStatement", "whileStatement", 
			"varDcl", "expressionStmt", "printStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'while'", 
			"'var'", "'='", "'-'", "'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'print('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "INTEGER", 
			"BOOLEAN", "FLOAT", "STRING", "ID", "ONELINECOMMENT", "MULTILINECOMMENT", 
			"WHITESPACES"
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132123444L) != 0)) {
				{
				{
				setState(18);
				stmt();
				}
				}
				setState(23);
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
		public NonDclContext nonDcl() {
			return getRuleContext(NonDclContext.class,0);
		}
		public VarDclContext varDcl() {
			return getRuleContext(VarDclContext.class,0);
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
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__4:
			case T__7:
			case T__10:
			case T__20:
			case INTEGER:
			case BOOLEAN:
			case FLOAT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				nonDcl();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				varDcl();
				setState(26);
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
	public static class NonDclContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public NonDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonDcl; }
	}

	public final NonDclContext nonDcl() throws RecognitionException {
		NonDclContext _localctx = new NonDclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nonDcl);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__10:
			case INTEGER:
			case BOOLEAN:
			case FLOAT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				expressionStmt(0);
				setState(31);
				match(T__0);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				printStmt();
				setState(34);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				blockStmt();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				ifStatement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				whileStatement();
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
	public static class BlockStmtContext extends ParserRuleContext {
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
	 
		public BlockStmtContext() { }
		public void copyFrom(BlockStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends BlockStmtContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(BlockStmtContext ctx) { copyFrom(ctx); }
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockStmt);
		int _la;
		try {
			_localctx = new BlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__1);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132123444L) != 0)) {
				{
				{
				setState(42);
				stmt();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends IfStatementContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public List<NonDclContext> nonDcl() {
			return getRuleContexts(NonDclContext.class);
		}
		public NonDclContext nonDcl(int i) {
			return getRuleContext(NonDclContext.class,i);
		}
		public IfStmtContext(IfStatementContext ctx) { copyFrom(ctx); }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		try {
			_localctx = new IfStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__3);
			setState(51);
			match(T__4);
			setState(52);
			expressionStmt(0);
			setState(53);
			match(T__5);
			setState(54);
			nonDcl();
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(55);
				match(T__6);
				setState(56);
				nonDcl();
				}
				break;
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
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends WhileStatementContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public NonDclContext nonDcl() {
			return getRuleContext(NonDclContext.class,0);
		}
		public WhileStmtContext(WhileStatementContext ctx) { copyFrom(ctx); }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		try {
			_localctx = new WhileStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__7);
			setState(60);
			match(T__4);
			setState(61);
			expressionStmt(0);
			setState(62);
			match(T__5);
			setState(63);
			nonDcl();
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
	public static class VarDclContext extends ParserRuleContext {
		public VarDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDcl; }
	 
		public VarDclContext() { }
		public void copyFrom(VarDclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends VarDclContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public VariableDeclarationContext(VarDclContext ctx) { copyFrom(ctx); }
	}

	public final VarDclContext varDcl() throws RecognitionException {
		VarDclContext _localctx = new VarDclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDcl);
		int _la;
		try {
			_localctx = new VariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__8);
			setState(66);
			match(ID);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(67);
				match(T__9);
				setState(68);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expressionStmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72);
				match(T__10);
				setState(73);
				expressionStmt(12);
				}
				break;
			case 2:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(ID);
				setState(75);
				match(T__9);
				setState(76);
				expressionStmt(7);
				}
				break;
			case 3:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(INTEGER);
				}
				break;
			case 4:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(T__4);
				setState(83);
				expressionStmt(0);
				setState(84);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(88);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(89);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						expressionStmt(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(91);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(92);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						expressionStmt(11);
						}
						break;
					case 3:
						{
						_localctx = new GreaterLessContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(94);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(95);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						expressionStmt(10);
						}
						break;
					case 4:
						{
						_localctx = new EqualContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(97);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(98);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						expressionStmt(9);
						}
						break;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 16, RULE_printStmt);
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__20);
			setState(106);
			expressionStmt(0);
			setState(107);
			match(T__5);
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
		case 7:
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
		"\u0004\u0001\u001dn\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001d"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0005\u0003,\b\u0003\n\u0003\f\u0003/\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006F\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007W\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007e\b\u0007\n\u0007"+
		"\f\u0007h\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0000\u0001"+
		"\u000e\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0004\u0001\u0000"+
		"\f\r\u0002\u0000\u000b\u000b\u000e\u000e\u0001\u0000\u000f\u0012\u0001"+
		"\u0000\u0013\u0014x\u0000\u0015\u0001\u0000\u0000\u0000\u0002\u001c\u0001"+
		"\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006)\u0001\u0000"+
		"\u0000\u0000\b2\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\fA"+
		"\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000\u0000\u0010i\u0001\u0000"+
		"\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000"+
		"\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0001\u0001\u0000"+
		"\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u001d\u0003\u0004"+
		"\u0002\u0000\u0019\u001a\u0003\f\u0006\u0000\u001a\u001b\u0005\u0001\u0000"+
		"\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u0018\u0001\u0000\u0000"+
		"\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001d\u0003\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0003\u000e\u0007\u0000\u001f \u0005\u0001\u0000\u0000"+
		" (\u0001\u0000\u0000\u0000!\"\u0003\u0010\b\u0000\"#\u0005\u0001\u0000"+
		"\u0000#(\u0001\u0000\u0000\u0000$(\u0003\u0006\u0003\u0000%(\u0003\b\u0004"+
		"\u0000&(\u0003\n\u0005\u0000\'\u001e\u0001\u0000\u0000\u0000\'!\u0001"+
		"\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"\'&\u0001\u0000\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)-\u0005\u0002"+
		"\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000\u0000,/\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005\u0003\u0000"+
		"\u00001\u0007\u0001\u0000\u0000\u000023\u0005\u0004\u0000\u000034\u0005"+
		"\u0005\u0000\u000045\u0003\u000e\u0007\u000056\u0005\u0006\u0000\u0000"+
		"69\u0003\u0004\u0002\u000078\u0005\u0007\u0000\u00008:\u0003\u0004\u0002"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\t\u0001\u0000"+
		"\u0000\u0000;<\u0005\b\u0000\u0000<=\u0005\u0005\u0000\u0000=>\u0003\u000e"+
		"\u0007\u0000>?\u0005\u0006\u0000\u0000?@\u0003\u0004\u0002\u0000@\u000b"+
		"\u0001\u0000\u0000\u0000AB\u0005\t\u0000\u0000BE\u0005\u001a\u0000\u0000"+
		"CD\u0005\n\u0000\u0000DF\u0003\u000e\u0007\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000F\r\u0001\u0000\u0000\u0000GH\u0006\u0007\uffff"+
		"\uffff\u0000HI\u0005\u000b\u0000\u0000IW\u0003\u000e\u0007\fJK\u0005\u001a"+
		"\u0000\u0000KL\u0005\n\u0000\u0000LW\u0003\u000e\u0007\u0007MW\u0005\u0016"+
		"\u0000\u0000NW\u0005\u0017\u0000\u0000OW\u0005\u0018\u0000\u0000PW\u0005"+
		"\u0019\u0000\u0000QW\u0005\u001a\u0000\u0000RS\u0005\u0005\u0000\u0000"+
		"ST\u0003\u000e\u0007\u0000TU\u0005\u0006\u0000\u0000UW\u0001\u0000\u0000"+
		"\u0000VG\u0001\u0000\u0000\u0000VJ\u0001\u0000\u0000\u0000VM\u0001\u0000"+
		"\u0000\u0000VN\u0001\u0000\u0000\u0000VO\u0001\u0000\u0000\u0000VP\u0001"+
		"\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000"+
		"Wf\u0001\u0000\u0000\u0000XY\n\u000b\u0000\u0000YZ\u0007\u0000\u0000\u0000"+
		"Ze\u0003\u000e\u0007\f[\\\n\n\u0000\u0000\\]\u0007\u0001\u0000\u0000]"+
		"e\u0003\u000e\u0007\u000b^_\n\t\u0000\u0000_`\u0007\u0002\u0000\u0000"+
		"`e\u0003\u000e\u0007\nab\n\b\u0000\u0000bc\u0007\u0003\u0000\u0000ce\u0003"+
		"\u000e\u0007\tdX\u0001\u0000\u0000\u0000d[\u0001\u0000\u0000\u0000d^\u0001"+
		"\u0000\u0000\u0000da\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u000f\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u0015\u0000\u0000jk\u0003"+
		"\u000e\u0007\u0000kl\u0005\u0006\u0000\u0000l\u0011\u0001\u0000\u0000"+
		"\u0000\t\u0015\u001c\'-9EVdf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}