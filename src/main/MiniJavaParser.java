// Generated from MiniJava.g4 by ANTLR 4.4

    package main;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'new'", "'return'", "'class'", "';'", "'['", "'void'", 
		"'String'", "'='", "'}'", "']'", "'public'", "'static'", "'else'", "'('", 
		"')'", "','", "'.'", "'extends'", "'true'", "'false'", "'System.out.println'", 
		"'&&'", "'<'", "'-'", "'+'", "'*'", "'!'", "'while'", "'if'", "INTARRAYTYPE", 
		"'boolean'", "'int'", "'{'", "'this'", "'length'", "INTEGER_LITERAL", 
		"IDENTIFIER", "ESPACOS", "COMENTARIO1LINHA", "COMETARIONLINHAS"
	};
	public static final int
		RULE_goal = 0, RULE_mainclass = 1, RULE_classdeclaration = 2, RULE_vardeclaration = 3, 
		RULE_methoddeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expression = 7, 
		RULE_identifier = 8;
	public static final String[] ruleNames = {
		"goal", "mainclass", "classdeclaration", "vardeclaration", "methoddeclaration", 
		"type", "statement", "expression", "identifier"
	};

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public ClassdeclarationContext classdeclaration(int i) {
			return getRuleContext(ClassdeclarationContext.class,i);
		}
		public List<ClassdeclarationContext> classdeclaration() {
			return getRuleContexts(ClassdeclarationContext.class);
		}
		public MainclassContext mainclass() {
			return getRuleContext(MainclassContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); mainclass();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(19); classdeclaration();
				}
				}
				setState(24);
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

	public static class MainclassContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ABRECHAVES() { return getTokens(MiniJavaParser.ABRECHAVES); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ABRECHAVES(int i) {
			return getToken(MiniJavaParser.ABRECHAVES, i);
		}
		public MainclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainclassContext mainclass() throws RecognitionException {
		MainclassContext _localctx = new MainclassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(T__14);
			setState(26); identifier();
			setState(27); match(ABRECHAVES);
			setState(28); match(T__6);
			setState(29); match(T__5);
			setState(30); match(T__11);
			setState(31); match(T__17);
			setState(32); match(T__3);
			setState(33); match(T__10);
			setState(34); match(T__12);
			setState(35); match(T__7);
			setState(36); identifier();
			setState(37); match(T__2);
			setState(38); match(ABRECHAVES);
			setState(39); statement();
			setState(40); match(T__8);
			setState(41); match(T__8);
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

	public static class ClassdeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public VardeclarationContext vardeclaration(int i) {
			return getRuleContext(VardeclarationContext.class,i);
		}
		public MethoddeclarationContext methoddeclaration(int i) {
			return getRuleContext(MethoddeclarationContext.class,i);
		}
		public TerminalNode ABRECHAVES() { return getToken(MiniJavaParser.ABRECHAVES, 0); }
		public List<VardeclarationContext> vardeclaration() {
			return getRuleContexts(VardeclarationContext.class);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public TerminalNode EXTENDS() { return getToken(MiniJavaParser.EXTENDS, 0); }
		public List<MethoddeclarationContext> methoddeclaration() {
			return getRuleContexts(MethoddeclarationContext.class);
		}
		public ClassdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdeclarationContext classdeclaration() throws RecognitionException {
		ClassdeclarationContext _localctx = new ClassdeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(T__14);
			setState(44); identifier();
			setState(47);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(45); match(EXTENDS);
				setState(46); identifier();
				}
			}

			setState(49); match(ABRECHAVES);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTARRAYTYPE) | (1L << BOOLEAN) | (1L << INT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(50); vardeclaration();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(56); methoddeclaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); match(T__8);
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

	public static class VardeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVardeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVardeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVardeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclarationContext vardeclaration() throws RecognitionException {
		VardeclarationContext _localctx = new VardeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); type();
			setState(65); identifier();
			setState(66); match(T__13);
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

	public static class MethoddeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public VardeclarationContext vardeclaration(int i) {
			return getRuleContext(VardeclarationContext.class,i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode ABRECHAVES() { return getToken(MiniJavaParser.ABRECHAVES, 0); }
		public List<VardeclarationContext> vardeclaration() {
			return getRuleContexts(VardeclarationContext.class);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethoddeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethoddeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethoddeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethoddeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethoddeclarationContext methoddeclaration() throws RecognitionException {
		MethoddeclarationContext _localctx = new MethoddeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methoddeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(T__6);
			setState(69); type();
			setState(70); identifier();
			setState(71); match(T__3);
			setState(83);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTARRAYTYPE) | (1L << BOOLEAN) | (1L << INT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(72); type();
				setState(73); identifier();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(74); match(T__1);
					setState(75); type();
					setState(76); identifier();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85); match(T__2);
			setState(86); match(ABRECHAVES);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87); vardeclaration();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << WHILE) | (1L << IF) | (1L << ABRECHAVES) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(93); statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99); match(T__15);
			setState(100); expression(0);
			setState(101); match(T__13);
			setState(102); match(T__8);
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
		public TerminalNode BOOLEAN() { return getToken(MiniJavaParser.BOOLEAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public TerminalNode INTARRAYTYPE() { return getToken(MiniJavaParser.INTARRAYTYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case INTARRAYTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(INTARRAYTYPE);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(BOOLEAN);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); match(INT);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); identifier();
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniJavaParser.IF, 0); }
		public TerminalNode PRINT() { return getToken(MiniJavaParser.PRINT, 0); }
		public TerminalNode ABRECHAVES() { return getToken(MiniJavaParser.ABRECHAVES, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode WHILE() { return getToken(MiniJavaParser.WHILE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); match(ABRECHAVES);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << WHILE) | (1L << IF) | (1L << ABRECHAVES) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(111); statement();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117); match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); match(IF);
				setState(119); match(T__3);
				setState(120); expression(0);
				setState(121); match(T__2);
				setState(122); statement();
				setState(123); match(T__4);
				setState(124); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); match(WHILE);
				setState(127); match(T__3);
				setState(128); expression(0);
				setState(129); match(T__2);
				setState(130); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132); match(PRINT);
				setState(133); match(T__3);
				setState(134); expression(0);
				setState(135); match(T__2);
				setState(136); match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138); identifier();
				setState(139); match(T__9);
				setState(140); expression(0);
				setState(141); match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143); identifier();
				setState(144); match(T__12);
				setState(145); expression(0);
				setState(146); match(T__7);
				setState(147); match(T__9);
				setState(148); expression(0);
				setState(149); match(T__13);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(MiniJavaParser.INTEGER_LITERAL, 0); }
		public TerminalNode FALSE() { return getToken(MiniJavaParser.FALSE, 0); }
		public TerminalNode TIMES() { return getToken(MiniJavaParser.TIMES, 0); }
		public TerminalNode TRUE() { return getToken(MiniJavaParser.TRUE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode THIS() { return getToken(MiniJavaParser.THIS, 0); }
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public TerminalNode NOT() { return getToken(MiniJavaParser.NOT, 0); }
		public TerminalNode LESSTHAN() { return getToken(MiniJavaParser.LESSTHAN, 0); }
		public TerminalNode AND() { return getToken(MiniJavaParser.AND, 0); }
		public TerminalNode PLUS() { return getToken(MiniJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniJavaParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LENGTH() { return getToken(MiniJavaParser.LENGTH, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(154); match(NOT);
				setState(155); expression(2);
				}
				break;
			case 2:
				{
				setState(156); match(INTEGER_LITERAL);
				}
				break;
			case 3:
				{
				setState(157); match(TRUE);
				}
				break;
			case 4:
				{
				setState(158); match(FALSE);
				}
				break;
			case 5:
				{
				setState(159); identifier();
				}
				break;
			case 6:
				{
				setState(160); match(THIS);
				}
				break;
			case 7:
				{
				setState(161); match(T__16);
				setState(162); match(INT);
				setState(163); match(T__12);
				setState(164); expression(0);
				setState(165); match(T__7);
				}
				break;
			case 8:
				{
				setState(167); match(T__16);
				setState(168); identifier();
				setState(169); match(T__3);
				setState(170); match(T__2);
				}
				break;
			case 9:
				{
				setState(172); match(T__3);
				setState(173); expression(0);
				setState(174); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(179);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << LESSTHAN) | (1L << MINUS) | (1L << PLUS) | (1L << TIMES))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(180); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(182); match(T__12);
						setState(183); expression(0);
						setState(184); match(T__7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(187); match(T__0);
						setState(188); match(LENGTH);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(190); match(T__0);
						setState(191); identifier();
						setState(192); match(T__3);
						setState(201);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__3) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << THIS) | (1L << INTEGER_LITERAL) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(193); expression(0);
							setState(198);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__1) {
								{
								{
								setState(194); match(T__1);
								setState(195); expression(0);
								}
								}
								setState(200);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(203); match(T__2);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(IDENTIFIER);
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
		case 7: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\7\4"+
		"\66\n\4\f\4\16\49\13\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13\6\5"+
		"\6V\n\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\7\6a\n\6\f\6\16\6d\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\7\bs\n\b\f\b\16"+
		"\bv\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u009a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c7\n\t"+
		"\f\t\16\t\u00ca\13\t\5\t\u00cc\n\t\3\t\3\t\7\t\u00d0\n\t\f\t\16\t\u00d3"+
		"\13\t\3\n\3\n\3\n\2\3\20\13\2\4\6\b\n\f\16\20\22\2\3\3\2\31\35\u00ec\2"+
		"\24\3\2\2\2\4\33\3\2\2\2\6-\3\2\2\2\bB\3\2\2\2\nF\3\2\2\2\fn\3\2\2\2\16"+
		"\u0099\3\2\2\2\20\u00b2\3\2\2\2\22\u00d4\3\2\2\2\24\30\5\4\3\2\25\27\5"+
		"\6\4\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3"+
		"\2\2\2\32\30\3\2\2\2\33\34\7\6\2\2\34\35\5\22\n\2\35\36\7$\2\2\36\37\7"+
		"\16\2\2\37 \7\17\2\2 !\7\t\2\2!\"\7\3\2\2\"#\7\21\2\2#$\7\n\2\2$%\7\b"+
		"\2\2%&\7\r\2\2&\'\5\22\n\2\'(\7\22\2\2()\7$\2\2)*\5\16\b\2*+\7\f\2\2+"+
		",\7\f\2\2,\5\3\2\2\2-.\7\6\2\2.\61\5\22\n\2/\60\7\25\2\2\60\62\5\22\n"+
		"\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\67\7$\2\2\64\66\5\b\5\2"+
		"\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28=\3\2\2\29\67\3\2"+
		"\2\2:<\5\n\6\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2"+
		"\2\2@A\7\f\2\2A\7\3\2\2\2BC\5\f\7\2CD\5\22\n\2DE\7\7\2\2E\t\3\2\2\2FG"+
		"\7\16\2\2GH\5\f\7\2HI\5\22\n\2IU\7\21\2\2JK\5\f\7\2KR\5\22\n\2LM\7\23"+
		"\2\2MN\5\f\7\2NO\5\22\n\2OQ\3\2\2\2PL\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3"+
		"\2\2\2SV\3\2\2\2TR\3\2\2\2UJ\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\22\2\2X\\"+
		"\7$\2\2Y[\5\b\5\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]b\3\2\2\2"+
		"^\\\3\2\2\2_a\5\16\b\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2"+
		"\2db\3\2\2\2ef\7\5\2\2fg\5\20\t\2gh\7\7\2\2hi\7\f\2\2i\13\3\2\2\2jo\7"+
		"!\2\2ko\7\"\2\2lo\7#\2\2mo\5\22\n\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3"+
		"\2\2\2o\r\3\2\2\2pt\7$\2\2qs\5\16\b\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu"+
		"\3\2\2\2uw\3\2\2\2vt\3\2\2\2w\u009a\7\f\2\2xy\7 \2\2yz\7\21\2\2z{\5\20"+
		"\t\2{|\7\22\2\2|}\5\16\b\2}~\7\20\2\2~\177\5\16\b\2\177\u009a\3\2\2\2"+
		"\u0080\u0081\7\37\2\2\u0081\u0082\7\21\2\2\u0082\u0083\5\20\t\2\u0083"+
		"\u0084\7\22\2\2\u0084\u0085\5\16\b\2\u0085\u009a\3\2\2\2\u0086\u0087\7"+
		"\30\2\2\u0087\u0088\7\21\2\2\u0088\u0089\5\20\t\2\u0089\u008a\7\22\2\2"+
		"\u008a\u008b\7\7\2\2\u008b\u009a\3\2\2\2\u008c\u008d\5\22\n\2\u008d\u008e"+
		"\7\13\2\2\u008e\u008f\5\20\t\2\u008f\u0090\7\7\2\2\u0090\u009a\3\2\2\2"+
		"\u0091\u0092\5\22\n\2\u0092\u0093\7\b\2\2\u0093\u0094\5\20\t\2\u0094\u0095"+
		"\7\r\2\2\u0095\u0096\7\13\2\2\u0096\u0097\5\20\t\2\u0097\u0098\7\7\2\2"+
		"\u0098\u009a\3\2\2\2\u0099p\3\2\2\2\u0099x\3\2\2\2\u0099\u0080\3\2\2\2"+
		"\u0099\u0086\3\2\2\2\u0099\u008c\3\2\2\2\u0099\u0091\3\2\2\2\u009a\17"+
		"\3\2\2\2\u009b\u009c\b\t\1\2\u009c\u009d\7\36\2\2\u009d\u00b3\5\20\t\4"+
		"\u009e\u00b3\7\'\2\2\u009f\u00b3\7\26\2\2\u00a0\u00b3\7\27\2\2\u00a1\u00b3"+
		"\5\22\n\2\u00a2\u00b3\7%\2\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\7#\2\2\u00a5"+
		"\u00a6\7\b\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00a8\7\r\2\2\u00a8\u00b3\3"+
		"\2\2\2\u00a9\u00aa\7\4\2\2\u00aa\u00ab\5\22\n\2\u00ab\u00ac\7\21\2\2\u00ac"+
		"\u00ad\7\22\2\2\u00ad\u00b3\3\2\2\2\u00ae\u00af\7\21\2\2\u00af\u00b0\5"+
		"\20\t\2\u00b0\u00b1\7\22\2\2\u00b1\u00b3\3\2\2\2\u00b2\u009b\3\2\2\2\u00b2"+
		"\u009e\3\2\2\2\u00b2\u009f\3\2\2\2\u00b2\u00a0\3\2\2\2\u00b2\u00a1\3\2"+
		"\2\2\u00b2\u00a2\3\2\2\2\u00b2\u00a3\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2"+
		"\u00ae\3\2\2\2\u00b3\u00d1\3\2\2\2\u00b4\u00b5\f\17\2\2\u00b5\u00b6\t"+
		"\2\2\2\u00b6\u00d0\5\20\t\20\u00b7\u00b8\f\16\2\2\u00b8\u00b9\7\b\2\2"+
		"\u00b9\u00ba\5\20\t\2\u00ba\u00bb\7\r\2\2\u00bb\u00d0\3\2\2\2\u00bc\u00bd"+
		"\f\r\2\2\u00bd\u00be\7\24\2\2\u00be\u00d0\7&\2\2\u00bf\u00c0\f\f\2\2\u00c0"+
		"\u00c1\7\24\2\2\u00c1\u00c2\5\22\n\2\u00c2\u00cb\7\21\2\2\u00c3\u00c8"+
		"\5\20\t\2\u00c4\u00c5\7\23\2\2\u00c5\u00c7\5\20\t\2\u00c6\u00c4\3\2\2"+
		"\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\7\22\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00b4\3"+
		"\2\2\2\u00cf\u00b7\3\2\2\2\u00cf\u00bc\3\2\2\2\u00cf\u00bf\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\21\3\2\2"+
		"\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5\23\3\2\2\2\22\30\61\67"+
		"=RU\\bnt\u0099\u00b2\u00c8\u00cb\u00cf\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}