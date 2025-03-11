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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, INTEGER=26, BOOLEAN=27, FLOAT=28, STRING=29, ID=30, ONELINECOMMENT=31, 
		MULTILINECOMMENT=32, WHITESPACES=33;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_nonDcl = 2, RULE_blockStmt = 3, 
		RULE_ifStatement = 4, RULE_whileStatement = 5, RULE_forStatement = 6, 
		RULE_forInit = 7, RULE_transferenceStmt = 8, RULE_varDcl = 9, RULE_expressionStmt = 10, 
		RULE_printStmt = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "nonDcl", "blockStmt", "ifStatement", "whileStatement", 
			"forStatement", "forInit", "transferenceStmt", "varDcl", "expressionStmt", 
			"printStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'while'", 
			"'for'", "'break'", "'continue'", "'return'", "'var'", "'='", "'-'", 
			"'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'print('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INTEGER", "BOOLEAN", "FLOAT", "STRING", "ID", "ONELINECOMMENT", 
			"MULTILINECOMMENT", "WHITESPACES"
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113978164L) != 0)) {
				{
				{
				setState(24);
				stmt();
				}
				}
				setState(29);
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
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__4:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__14:
			case T__24:
			case INTEGER:
			case BOOLEAN:
			case FLOAT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				nonDcl();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				varDcl();
				setState(32);
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
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public TransferenceStmtContext transferenceStmt() {
			return getRuleContext(TransferenceStmtContext.class,0);
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
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__14:
			case INTEGER:
			case BOOLEAN:
			case FLOAT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				expressionStmt(0);
				setState(37);
				match(T__0);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				printStmt();
				setState(40);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				blockStmt();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				ifStatement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				whileStatement();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				forStatement();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				transferenceStmt();
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
			setState(49);
			match(T__1);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113978164L) != 0)) {
				{
				{
				setState(50);
				stmt();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
			setState(58);
			match(T__3);
			setState(59);
			match(T__4);
			setState(60);
			expressionStmt(0);
			setState(61);
			match(T__5);
			setState(62);
			nonDcl();
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(63);
				match(T__6);
				setState(64);
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
			setState(67);
			match(T__7);
			setState(68);
			match(T__4);
			setState(69);
			expressionStmt(0);
			setState(70);
			match(T__5);
			setState(71);
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
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ForStatementContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public NonDclContext nonDcl() {
			return getRuleContext(NonDclContext.class,0);
		}
		public ForStmtContext(ForStatementContext ctx) { copyFrom(ctx); }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forStatement);
		try {
			_localctx = new ForStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__8);
			setState(74);
			match(T__4);
			setState(75);
			forInit();
			setState(76);
			expressionStmt(0);
			setState(77);
			match(T__0);
			setState(78);
			expressionStmt(0);
			setState(79);
			match(T__5);
			setState(80);
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
	public static class ForInitContext extends ParserRuleContext {
		public VarDclContext varDcl() {
			return getRuleContext(VarDclContext.class,0);
		}
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(82);
				varDcl();
				}
				break;
			case T__4:
			case T__14:
			case INTEGER:
			case BOOLEAN:
			case FLOAT:
			case STRING:
			case ID:
				{
				setState(83);
				expressionStmt(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(86);
			match(T__0);
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
	public static class TransferenceStmtContext extends ParserRuleContext {
		public TransferenceStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transferenceStmt; }
	 
		public TransferenceStmtContext() { }
		public void copyFrom(TransferenceStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends TransferenceStmtContext {
		public ContinueStmtContext(TransferenceStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends TransferenceStmtContext {
		public BreakStmtContext(TransferenceStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends TransferenceStmtContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public ReturnStmtContext(TransferenceStmtContext ctx) { copyFrom(ctx); }
	}

	public final TransferenceStmtContext transferenceStmt() throws RecognitionException {
		TransferenceStmtContext _localctx = new TransferenceStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transferenceStmt);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__9);
				setState(89);
				match(T__0);
				}
				break;
			case T__10:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__10);
				setState(91);
				match(T__0);
				}
				break;
			case T__11:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(T__11);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2080407584L) != 0)) {
					{
					setState(93);
					expressionStmt(0);
					}
				}

				setState(96);
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
		enterRule(_localctx, 18, RULE_varDcl);
		int _la;
		try {
			_localctx = new VariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__12);
			setState(100);
			match(ID);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(101);
				match(T__13);
				setState(102);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expressionStmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(106);
				match(T__14);
				setState(107);
				expressionStmt(12);
				}
				break;
			case 2:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(ID);
				setState(109);
				match(T__13);
				setState(110);
				expressionStmt(7);
				}
				break;
			case 3:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(INTEGER);
				}
				break;
			case 4:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(T__4);
				setState(117);
				expressionStmt(0);
				setState(118);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(122);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(123);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						expressionStmt(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(125);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(126);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__17) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						expressionStmt(11);
						}
						break;
					case 3:
						{
						_localctx = new GreaterLessContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(128);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(129);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						expressionStmt(10);
						}
						break;
					case 4:
						{
						_localctx = new EqualContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(131);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(132);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(133);
						expressionStmt(9);
						}
						break;
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 22, RULE_printStmt);
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__24);
			setState(140);
			expressionStmt(0);
			setState(141);
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
		case 10:
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
		"\u0004\u0001!\u0090\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00020\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007U\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b_\b\b\u0001\b\u0003\bb\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\th\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\ny\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0087\b\n\n\n\f\n\u008a\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0001\u0014\f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0004\u0001"+
		"\u0000\u0010\u0011\u0002\u0000\u000f\u000f\u0012\u0012\u0001\u0000\u0013"+
		"\u0016\u0001\u0000\u0017\u0018\u009d\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0002\"\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u0006"+
		"1\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000"+
		"\u0000\fI\u0001\u0000\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010"+
		"a\u0001\u0000\u0000\u0000\u0012c\u0001\u0000\u0000\u0000\u0014x\u0001"+
		"\u0000\u0000\u0000\u0016\u008b\u0001\u0000\u0000\u0000\u0018\u001a\u0003"+
		"\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e#\u0003\u0004\u0002\u0000\u001f \u0003\u0012\t"+
		"\u0000 !\u0005\u0001\u0000\u0000!#\u0001\u0000\u0000\u0000\"\u001e\u0001"+
		"\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000\u0000#\u0003\u0001\u0000"+
		"\u0000\u0000$%\u0003\u0014\n\u0000%&\u0005\u0001\u0000\u0000&0\u0001\u0000"+
		"\u0000\u0000\'(\u0003\u0016\u000b\u0000()\u0005\u0001\u0000\u0000)0\u0001"+
		"\u0000\u0000\u0000*0\u0003\u0006\u0003\u0000+0\u0003\b\u0004\u0000,0\u0003"+
		"\n\u0005\u0000-0\u0003\f\u0006\u0000.0\u0003\u0010\b\u0000/$\u0001\u0000"+
		"\u0000\u0000/\'\u0001\u0000\u0000\u0000/*\u0001\u0000\u0000\u0000/+\u0001"+
		"\u0000\u0000\u0000/,\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/.\u0001\u0000\u0000\u00000\u0005\u0001\u0000\u0000\u000015\u0005\u0002"+
		"\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"68\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0005\u0003\u0000"+
		"\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0005"+
		"\u0005\u0000\u0000<=\u0003\u0014\n\u0000=>\u0005\u0006\u0000\u0000>A\u0003"+
		"\u0004\u0002\u0000?@\u0005\u0007\u0000\u0000@B\u0003\u0004\u0002\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000"+
		"\u0000CD\u0005\b\u0000\u0000DE\u0005\u0005\u0000\u0000EF\u0003\u0014\n"+
		"\u0000FG\u0005\u0006\u0000\u0000GH\u0003\u0004\u0002\u0000H\u000b\u0001"+
		"\u0000\u0000\u0000IJ\u0005\t\u0000\u0000JK\u0005\u0005\u0000\u0000KL\u0003"+
		"\u000e\u0007\u0000LM\u0003\u0014\n\u0000MN\u0005\u0001\u0000\u0000NO\u0003"+
		"\u0014\n\u0000OP\u0005\u0006\u0000\u0000PQ\u0003\u0004\u0002\u0000Q\r"+
		"\u0001\u0000\u0000\u0000RU\u0003\u0012\t\u0000SU\u0003\u0014\n\u0000T"+
		"R\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VW\u0005\u0001\u0000\u0000W\u000f\u0001\u0000\u0000\u0000XY\u0005"+
		"\n\u0000\u0000Yb\u0005\u0001\u0000\u0000Z[\u0005\u000b\u0000\u0000[b\u0005"+
		"\u0001\u0000\u0000\\^\u0005\f\u0000\u0000]_\u0003\u0014\n\u0000^]\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`b\u0005\u0001\u0000\u0000aX\u0001\u0000\u0000\u0000aZ\u0001\u0000\u0000"+
		"\u0000a\\\u0001\u0000\u0000\u0000b\u0011\u0001\u0000\u0000\u0000cd\u0005"+
		"\r\u0000\u0000dg\u0005\u001e\u0000\u0000ef\u0005\u000e\u0000\u0000fh\u0003"+
		"\u0014\n\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0013"+
		"\u0001\u0000\u0000\u0000ij\u0006\n\uffff\uffff\u0000jk\u0005\u000f\u0000"+
		"\u0000ky\u0003\u0014\n\flm\u0005\u001e\u0000\u0000mn\u0005\u000e\u0000"+
		"\u0000ny\u0003\u0014\n\u0007oy\u0005\u001a\u0000\u0000py\u0005\u001b\u0000"+
		"\u0000qy\u0005\u001c\u0000\u0000ry\u0005\u001d\u0000\u0000sy\u0005\u001e"+
		"\u0000\u0000tu\u0005\u0005\u0000\u0000uv\u0003\u0014\n\u0000vw\u0005\u0006"+
		"\u0000\u0000wy\u0001\u0000\u0000\u0000xi\u0001\u0000\u0000\u0000xl\u0001"+
		"\u0000\u0000\u0000xo\u0001\u0000\u0000\u0000xp\u0001\u0000\u0000\u0000"+
		"xq\u0001\u0000\u0000\u0000xr\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000"+
		"\u0000xt\u0001\u0000\u0000\u0000y\u0088\u0001\u0000\u0000\u0000z{\n\u000b"+
		"\u0000\u0000{|\u0007\u0000\u0000\u0000|\u0087\u0003\u0014\n\f}~\n\n\u0000"+
		"\u0000~\u007f\u0007\u0001\u0000\u0000\u007f\u0087\u0003\u0014\n\u000b"+
		"\u0080\u0081\n\t\u0000\u0000\u0081\u0082\u0007\u0002\u0000\u0000\u0082"+
		"\u0087\u0003\u0014\n\n\u0083\u0084\n\b\u0000\u0000\u0084\u0085\u0007\u0003"+
		"\u0000\u0000\u0085\u0087\u0003\u0014\n\t\u0086z\u0001\u0000\u0000\u0000"+
		"\u0086}\u0001\u0000\u0000\u0000\u0086\u0080\u0001\u0000\u0000\u0000\u0086"+
		"\u0083\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u0015\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\u0019\u0000\u0000\u008c\u008d\u0003\u0014\n\u0000\u008d\u008e"+
		"\u0005\u0006\u0000\u0000\u008e\u0017\u0001\u0000\u0000\u0000\f\u001b\""+
		"/5AT^agx\u0086\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}