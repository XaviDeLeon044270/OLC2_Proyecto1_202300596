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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, TYPE=42, INTEGER=43, BOOLEAN=44, FLOAT=45, 
		STRING=46, RUNE=47, ID=48, ONELINECOMMENT=49, MULTILINECOMMENT=50, WHITESPACES=51;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_nonDeclaration = 2, RULE_printStmt = 3, 
		RULE_blockStmt = 4, RULE_ifStatement = 5, RULE_switchStatement = 6, RULE_switchCase = 7, 
		RULE_defaultCase = 8, RULE_whileStatement = 9, RULE_forStatement = 10, 
		RULE_forInit = 11, RULE_transferenceStmt = 12, RULE_variableDeclaration = 13, 
		RULE_functionDeclaration = 14, RULE_params = 15, RULE_structDeclaration = 16, 
		RULE_expressionStmt = 17, RULE_call = 18, RULE_args = 19, RULE_structAtribute = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "nonDeclaration", "printStmt", "blockStmt", "ifStatement", 
			"switchStatement", "switchCase", "defaultCase", "whileStatement", "forStatement", 
			"forInit", "transferenceStmt", "variableDeclaration", "functionDeclaration", 
			"params", "structDeclaration", "expressionStmt", "call", "args", "structAtribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'fmt.Println'", "'('", "','", "')'", "'{'", "'}'", "'if'", 
			"'else'", "'switch'", "'case'", "':'", "'default'", "'for'", "'break'", 
			"'continue'", "'return'", "'var'", "'='", "':='", "'func'", "'struct'", 
			"'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'&&'", "'||'", "'+='", "'-='", "'['", "']'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TYPE", "INTEGER", "BOOLEAN", "FLOAT", 
			"STRING", "RUNE", "ID", "ONELINECOMMENT", "MULTILINECOMMENT", "WHITESPACES"
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 554703648179532L) != 0)) {
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
		public NonDeclarationContext nonDeclaration() {
			return getRuleContext(NonDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
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
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				nonDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				structDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NonDeclarationContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
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
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public NonDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonDeclaration; }
	}

	public final NonDeclarationContext nonDeclaration() throws RecognitionException {
		NonDeclarationContext _localctx = new NonDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nonDeclaration);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				expressionStmt(0);
				setState(55);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				blockStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				switchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				transferenceStmt();
				setState(63);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				printStmt();
				setState(66);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends ParserRuleContext {
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__1);
			setState(71);
			match(T__2);
			setState(72);
			expressionStmt(0);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(73);
				match(T__3);
				setState(74);
				expressionStmt(0);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__4);
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__5);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 554703648179532L) != 0)) {
				{
				{
				setState(83);
				stmt();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(T__6);
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
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public List<NonDeclarationContext> nonDeclaration() {
			return getRuleContexts(NonDeclarationContext.class);
		}
		public NonDeclarationContext nonDeclaration(int i) {
			return getRuleContext(NonDeclarationContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__7);
			setState(92);
			match(T__2);
			setState(93);
			expressionStmt(0);
			setState(94);
			match(T__4);
			setState(95);
			nonDeclaration();
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(96);
				match(T__8);
				setState(97);
				nonDeclaration();
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
	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__9);
			setState(101);
			expressionStmt(0);
			setState(102);
			match(T__5);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(103);
				switchCase();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(109);
				defaultCase();
				}
			}

			setState(112);
			match(T__6);
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
	public static class SwitchCaseContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__10);
			setState(115);
			expressionStmt(0);
			setState(116);
			match(T__11);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 554703648179532L) != 0)) {
				{
				{
				setState(117);
				stmt();
				}
				}
				setState(122);
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
	public static class DefaultCaseContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defaultCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__12);
			setState(124);
			match(T__11);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 554703648179532L) != 0)) {
				{
				{
				setState(125);
				stmt();
				}
				}
				setState(130);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public NonDeclarationContext nonDeclaration() {
			return getRuleContext(NonDeclarationContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__13);
			setState(132);
			expressionStmt(0);
			setState(133);
			nonDeclaration();
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
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public NonDeclarationContext nonDeclaration() {
			return getRuleContext(NonDeclarationContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__13);
			setState(136);
			forInit();
			setState(137);
			expressionStmt(0);
			setState(138);
			match(T__0);
			setState(139);
			expressionStmt(0);
			setState(140);
			nonDeclaration();
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
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
		enterRule(_localctx, 22, RULE_forInit);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(143);
				expressionStmt(0);
				setState(144);
				match(T__0);
				}
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
		enterRule(_localctx, 24, RULE_transferenceStmt);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(T__16);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 554703641378824L) != 0)) {
					{
					setState(151);
					expressionStmt(0);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(LanguageParser.TYPE, 0); }
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__17);
				setState(157);
				match(ID);
				setState(158);
				match(TYPE);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(159);
					match(T__18);
					setState(160);
					expressionStmt(0);
					}
				}

				setState(163);
				match(T__0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(ID);
				setState(165);
				match(T__19);
				setState(166);
				expressionStmt(0);
				setState(167);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(LanguageParser.TYPE, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__20);
			setState(172);
			match(ID);
			setState(173);
			match(T__2);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(174);
				params();
				}
			}

			setState(177);
			match(T__4);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(178);
				match(TYPE);
				}
			}

			setState(181);
			blockStmt();
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
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ID);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(184);
				match(T__3);
				setState(185);
				match(ID);
				}
				}
				setState(190);
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
	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__21);
			setState(192);
			match(ID);
			setState(193);
			match(T__5);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==ID) {
				{
				{
				setState(194);
				variableDeclaration();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(T__6);
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
	public static class OrContext extends ExpressionStmtContext {
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public OrContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewStructContext extends ExpressionStmtContext {
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public List<StructAtributeContext> structAtribute() {
			return getRuleContexts(StructAtributeContext.class);
		}
		public StructAtributeContext structAtribute(int i) {
			return getRuleContext(StructAtributeContext.class,i);
		}
		public NewStructContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
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
	public static class ParensContext extends ExpressionStmtContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public ParensContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpressionStmtContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public StringContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ExpressionStmtContext {
		public TerminalNode INTEGER() { return getToken(LanguageParser.INTEGER, 0); }
		public IntegerContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ExpressionStmtContext {
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public AssignmentContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ExpressionStmtContext {
		public TerminalNode FLOAT() { return getToken(LanguageParser.FLOAT, 0); }
		public FloatContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubOperatorContext extends ExpressionStmtContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public AddSubOperatorContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModContext extends ExpressionStmtContext {
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public MulDivModContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ExpressionStmtContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public IdentifierContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
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
	public static class AndContext extends ExpressionStmtContext {
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public AndContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
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
	public static class BooleanContext extends ExpressionStmtContext {
		public TerminalNode BOOLEAN() { return getToken(LanguageParser.BOOLEAN, 0); }
		public BooleanContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuneContext extends ExpressionStmtContext {
		public TerminalNode RUNE() { return getToken(LanguageParser.RUNE, 0); }
		public RuneContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExpressionContext extends ExpressionStmtContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public CallExpressionContext(ExpressionStmtContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		return expressionStmt(0);
	}

	private ExpressionStmtContext expressionStmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, _parentState);
		ExpressionStmtContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expressionStmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(203);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				expressionStmt(18);
				}
				break;
			case 2:
				{
				_localctx = new AddSubOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(ID);
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__37) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				expressionStmt(9);
				}
				break;
			case 3:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(INTEGER);
				}
				break;
			case 4:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new RuneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(RUNE);
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new NewStructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(ID);
				setState(215);
				match(ID);
				setState(216);
				match(T__18);
				setState(217);
				match(T__5);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(218);
					structAtribute();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				match(T__6);
				}
				break;
			case 10:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					{
					setState(225);
					match(T__2);
					setState(226);
					expressionStmt(0);
					setState(227);
					match(T__4);
					}
					}
					break;
				case T__38:
					{
					{
					setState(229);
					match(T__38);
					setState(230);
					expressionStmt(0);
					setState(231);
					match(T__39);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(237);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(238);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						expressionStmt(17);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(240);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(241);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						expressionStmt(16);
						}
						break;
					case 3:
						{
						_localctx = new GreaterLessContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(243);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(244);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(245);
						expressionStmt(15);
						}
						break;
					case 4:
						{
						_localctx = new EqualContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(246);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(247);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(248);
						expressionStmt(14);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(249);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(250);
						match(T__34);
						setState(251);
						expressionStmt(13);
						}
						break;
					case 6:
						{
						_localctx = new OrContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(252);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(253);
						match(T__35);
						setState(254);
						expressionStmt(12);
						}
						break;
					case 7:
						{
						_localctx = new AssignmentContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(255);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(256);
						match(T__18);
						setState(257);
						expressionStmt(11);
						}
						break;
					case 8:
						{
						_localctx = new CallExpressionContext(new ExpressionStmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionStmt);
						setState(258);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(260); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(259);
								call();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(262); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class CallContext extends ParserRuleContext {
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	 
		public CallContext() { }
		public void copyFrom(CallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtributeAccessContext extends CallContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public AtributeAccessContext(CallContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionAccessContext extends CallContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionAccessContext(CallContext ctx) { copyFrom(ctx); }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_call);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new FunctionAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(T__2);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 554703641378824L) != 0)) {
					{
					setState(270);
					args();
					}
				}

				setState(273);
				match(T__4);
				}
				break;
			case T__40:
				_localctx = new AtributeAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__40);
				setState(275);
				match(ID);
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
	public static class ArgsContext extends ParserRuleContext {
		public List<ExpressionStmtContext> expressionStmt() {
			return getRuleContexts(ExpressionStmtContext.class);
		}
		public ExpressionStmtContext expressionStmt(int i) {
			return getRuleContext(ExpressionStmtContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			expressionStmt(0);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(279);
				match(T__3);
				setState(280);
				expressionStmt(0);
				}
				}
				setState(285);
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
	public static class StructAtributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public StructAtributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structAtribute; }
	}

	public final StructAtributeContext structAtribute() throws RecognitionException {
		StructAtributeContext _localctx = new StructAtributeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_structAtribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ID);
			setState(287);
			match(T__11);
			setState(288);
			expressionStmt(0);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(289);
				match(T__3);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expressionStmt_sempred((ExpressionStmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStmt_sempred(ExpressionStmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u0125\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0005\u0000"+
		",\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00015\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"E\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0005\u0004U\b\u0004\n\u0004\f\u0004X\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005c\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006i\b\u0006\n\u0006\f\u0006"+
		"l\t\u0006\u0001\u0006\u0003\u0006o\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007w\b\u0007\n\u0007"+
		"\f\u0007z\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u007f\b\b\n\b\f\b\u0082"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0093\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0099\b\f"+
		"\u0003\f\u009b\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a2"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00aa\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b0\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00b4\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00bb\b\u000f\n\u000f"+
		"\f\u000f\u00be\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00c4\b\u0010\n\u0010\f\u0010\u00c7\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00dc\b\u0011\n\u0011\f\u0011\u00df\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00ea\b\u0011\u0003\u0011\u00ec\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u0105"+
		"\b\u0011\u000b\u0011\f\u0011\u0106\u0005\u0011\u0109\b\u0011\n\u0011\f"+
		"\u0011\u010c\t\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0110\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0115\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u011a\b\u0013\n\u0013\f\u0013\u011d"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0123"+
		"\b\u0014\u0001\u0014\u0000\u0001\"\u0015\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0006"+
		"\u0001\u0000\u0017\u0018\u0001\u0000%&\u0001\u0000\u0019\u001b\u0002\u0000"+
		"\u0017\u0017\u001c\u001c\u0001\u0000\u001d \u0001\u0000!\"\u0143\u0000"+
		"-\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u0004D\u0001"+
		"\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000"+
		"\u0000\n[\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000\u000er\u0001"+
		"\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000\u0012\u0083\u0001\u0000"+
		"\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000\u0016\u0092\u0001\u0000"+
		"\u0000\u0000\u0018\u009a\u0001\u0000\u0000\u0000\u001a\u00a9\u0001\u0000"+
		"\u0000\u0000\u001c\u00ab\u0001\u0000\u0000\u0000\u001e\u00b7\u0001\u0000"+
		"\u0000\u0000 \u00bf\u0001\u0000\u0000\u0000\"\u00eb\u0001\u0000\u0000"+
		"\u0000$\u0114\u0001\u0000\u0000\u0000&\u0116\u0001\u0000\u0000\u0000("+
		"\u011e\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000"+
		"\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.\u0001\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u000005\u0003\u0004\u0002\u000015\u0003\u001a\r\u000025\u0003\u001c\u000e"+
		"\u000035\u0003 \u0010\u000040\u0001\u0000\u0000\u000041\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000043\u0001\u0000\u0000\u00005\u0003\u0001"+
		"\u0000\u0000\u000067\u0003\"\u0011\u000078\u0005\u0001\u0000\u00008E\u0001"+
		"\u0000\u0000\u00009E\u0003\b\u0004\u0000:E\u0003\n\u0005\u0000;E\u0003"+
		"\f\u0006\u0000<E\u0003\u0012\t\u0000=E\u0003\u0014\n\u0000>?\u0003\u0018"+
		"\f\u0000?@\u0005\u0001\u0000\u0000@E\u0001\u0000\u0000\u0000AB\u0003\u0006"+
		"\u0003\u0000BC\u0005\u0001\u0000\u0000CE\u0001\u0000\u0000\u0000D6\u0001"+
		"\u0000\u0000\u0000D9\u0001\u0000\u0000\u0000D:\u0001\u0000\u0000\u0000"+
		"D;\u0001\u0000\u0000\u0000D<\u0001\u0000\u0000\u0000D=\u0001\u0000\u0000"+
		"\u0000D>\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000E\u0005\u0001"+
		"\u0000\u0000\u0000FG\u0005\u0002\u0000\u0000GH\u0005\u0003\u0000\u0000"+
		"HM\u0003\"\u0011\u0000IJ\u0005\u0004\u0000\u0000JL\u0003\"\u0011\u0000"+
		"KI\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0005\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000"+
		"RV\u0005\u0006\u0000\u0000SU\u0003\u0002\u0001\u0000TS\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u0007\u0000\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0005\b\u0000\u0000\\"+
		"]\u0005\u0003\u0000\u0000]^\u0003\"\u0011\u0000^_\u0005\u0005\u0000\u0000"+
		"_b\u0003\u0004\u0002\u0000`a\u0005\t\u0000\u0000ac\u0003\u0004\u0002\u0000"+
		"b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u000b\u0001\u0000"+
		"\u0000\u0000de\u0005\n\u0000\u0000ef\u0003\"\u0011\u0000fj\u0005\u0006"+
		"\u0000\u0000gi\u0003\u000e\u0007\u0000hg\u0001\u0000\u0000\u0000il\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0003\u0010\b\u0000"+
		"nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0005\u0007\u0000\u0000q\r\u0001\u0000\u0000\u0000rs\u0005\u000b"+
		"\u0000\u0000st\u0003\"\u0011\u0000tx\u0005\f\u0000\u0000uw\u0003\u0002"+
		"\u0001\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u000f\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000{|\u0005\r\u0000\u0000|\u0080\u0005\f"+
		"\u0000\u0000}\u007f\u0003\u0002\u0001\u0000~}\u0001\u0000\u0000\u0000"+
		"\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u0011\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u000e\u0000\u0000\u0084"+
		"\u0085\u0003\"\u0011\u0000\u0085\u0086\u0003\u0004\u0002\u0000\u0086\u0013"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u000e\u0000\u0000\u0088\u0089"+
		"\u0003\u0016\u000b\u0000\u0089\u008a\u0003\"\u0011\u0000\u008a\u008b\u0005"+
		"\u0001\u0000\u0000\u008b\u008c\u0003\"\u0011\u0000\u008c\u008d\u0003\u0004"+
		"\u0002\u0000\u008d\u0015\u0001\u0000\u0000\u0000\u008e\u0093\u0003\u001a"+
		"\r\u0000\u008f\u0090\u0003\"\u0011\u0000\u0090\u0091\u0005\u0001\u0000"+
		"\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000"+
		"\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0093\u0017\u0001\u0000\u0000"+
		"\u0000\u0094\u009b\u0005\u000f\u0000\u0000\u0095\u009b\u0005\u0010\u0000"+
		"\u0000\u0096\u0098\u0005\u0011\u0000\u0000\u0097\u0099\u0003\"\u0011\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0094\u0001\u0000\u0000\u0000"+
		"\u009a\u0095\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000"+
		"\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0012\u0000\u0000"+
		"\u009d\u009e\u00050\u0000\u0000\u009e\u00a1\u0005*\u0000\u0000\u009f\u00a0"+
		"\u0005\u0013\u0000\u0000\u00a0\u00a2\u0003\"\u0011\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00aa\u0005\u0001\u0000\u0000\u00a4\u00a5\u0005"+
		"0\u0000\u0000\u00a5\u00a6\u0005\u0014\u0000\u0000\u00a6\u00a7\u0003\""+
		"\u0011\u0000\u00a7\u00a8\u0005\u0001\u0000\u0000\u00a8\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a9\u009c\u0001\u0000\u0000\u0000\u00a9\u00a4\u0001\u0000"+
		"\u0000\u0000\u00aa\u001b\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0015"+
		"\u0000\u0000\u00ac\u00ad\u00050\u0000\u0000\u00ad\u00af\u0005\u0003\u0000"+
		"\u0000\u00ae\u00b0\u0003\u001e\u000f\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0005\u0005\u0000\u0000\u00b2\u00b4\u0005*\u0000\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003\b\u0004\u0000\u00b6"+
		"\u001d\u0001\u0000\u0000\u0000\u00b7\u00bc\u00050\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0004\u0000\u0000\u00b9\u00bb\u00050\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u001f\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0016\u0000\u0000\u00c0\u00c1\u00050\u0000\u0000\u00c1\u00c5\u0005\u0006"+
		"\u0000\u0000\u00c2\u00c4\u0003\u001a\r\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0007\u0000"+
		"\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca\u00cb\u0006\u0011\uffff\uffff"+
		"\u0000\u00cb\u00cc\u0007\u0000\u0000\u0000\u00cc\u00ec\u0003\"\u0011\u0012"+
		"\u00cd\u00ce\u00050\u0000\u0000\u00ce\u00cf\u0007\u0001\u0000\u0000\u00cf"+
		"\u00ec\u0003\"\u0011\t\u00d0\u00ec\u0005+\u0000\u0000\u00d1\u00ec\u0005"+
		",\u0000\u0000\u00d2\u00ec\u0005-\u0000\u0000\u00d3\u00ec\u0005/\u0000"+
		"\u0000\u00d4\u00ec\u0005.\u0000\u0000\u00d5\u00ec\u00050\u0000\u0000\u00d6"+
		"\u00d7\u00050\u0000\u0000\u00d7\u00d8\u00050\u0000\u0000\u00d8\u00d9\u0005"+
		"\u0013\u0000\u0000\u00d9\u00dd\u0005\u0006\u0000\u0000\u00da\u00dc\u0003"+
		"(\u0014\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00ec\u0005\u0007\u0000\u0000\u00e1\u00e2\u0005\u0003"+
		"\u0000\u0000\u00e2\u00e3\u0003\"\u0011\u0000\u00e3\u00e4\u0005\u0005\u0000"+
		"\u0000\u00e4\u00ea\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\'\u0000\u0000"+
		"\u00e6\u00e7\u0003\"\u0011\u0000\u00e7\u00e8\u0005(\u0000\u0000\u00e8"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e1\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e5\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ca\u0001\u0000\u0000\u0000\u00eb\u00cd\u0001\u0000\u0000\u0000\u00eb"+
		"\u00d0\u0001\u0000\u0000\u0000\u00eb\u00d1\u0001\u0000\u0000\u0000\u00eb"+
		"\u00d2\u0001\u0000\u0000\u0000\u00eb\u00d3\u0001\u0000\u0000\u0000\u00eb"+
		"\u00d4\u0001\u0000\u0000\u0000\u00eb\u00d5\u0001\u0000\u0000\u0000\u00eb"+
		"\u00d6\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec"+
		"\u010a\u0001\u0000\u0000\u0000\u00ed\u00ee\n\u0010\u0000\u0000\u00ee\u00ef"+
		"\u0007\u0002\u0000\u0000\u00ef\u0109\u0003\"\u0011\u0011\u00f0\u00f1\n"+
		"\u000f\u0000\u0000\u00f1\u00f2\u0007\u0003\u0000\u0000\u00f2\u0109\u0003"+
		"\"\u0011\u0010\u00f3\u00f4\n\u000e\u0000\u0000\u00f4\u00f5\u0007\u0004"+
		"\u0000\u0000\u00f5\u0109\u0003\"\u0011\u000f\u00f6\u00f7\n\r\u0000\u0000"+
		"\u00f7\u00f8\u0007\u0005\u0000\u0000\u00f8\u0109\u0003\"\u0011\u000e\u00f9"+
		"\u00fa\n\f\u0000\u0000\u00fa\u00fb\u0005#\u0000\u0000\u00fb\u0109\u0003"+
		"\"\u0011\r\u00fc\u00fd\n\u000b\u0000\u0000\u00fd\u00fe\u0005$\u0000\u0000"+
		"\u00fe\u0109\u0003\"\u0011\f\u00ff\u0100\n\n\u0000\u0000\u0100\u0101\u0005"+
		"\u0013\u0000\u0000\u0101\u0109\u0003\"\u0011\u000b\u0102\u0104\n\u0011"+
		"\u0000\u0000\u0103\u0105\u0003$\u0012\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000"+
		"\u0000\u0108\u00ed\u0001\u0000\u0000\u0000\u0108\u00f0\u0001\u0000\u0000"+
		"\u0000\u0108\u00f3\u0001\u0000\u0000\u0000\u0108\u00f6\u0001\u0000\u0000"+
		"\u0000\u0108\u00f9\u0001\u0000\u0000\u0000\u0108\u00fc\u0001\u0000\u0000"+
		"\u0000\u0108\u00ff\u0001\u0000\u0000\u0000\u0108\u0102\u0001\u0000\u0000"+
		"\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b#\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010f\u0005\u0003\u0000\u0000"+
		"\u010e\u0110\u0003&\u0013\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		"\u0115\u0005\u0005\u0000\u0000\u0112\u0113\u0005)\u0000\u0000\u0113\u0115"+
		"\u00050\u0000\u0000\u0114\u010d\u0001\u0000\u0000\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0115%\u0001\u0000\u0000\u0000\u0116\u011b\u0003\""+
		"\u0011\u0000\u0117\u0118\u0005\u0004\u0000\u0000\u0118\u011a\u0003\"\u0011"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\'\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u00050\u0000\u0000\u011f\u0120\u0005\f\u0000\u0000\u0120"+
		"\u0122\u0003\"\u0011\u0000\u0121\u0123\u0005\u0004\u0000\u0000\u0122\u0121"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123)\u0001"+
		"\u0000\u0000\u0000\u001d-4DMVbjnx\u0080\u0092\u0098\u009a\u00a1\u00a9"+
		"\u00af\u00b3\u00bc\u00c5\u00dd\u00e9\u00eb\u0106\u0108\u010a\u010f\u0114"+
		"\u011b\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}