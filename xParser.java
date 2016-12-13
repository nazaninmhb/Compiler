// Generated from x.g4 by ANTLR 4.5.3

  import java.util.*;
  import java.lang.Object;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, CONST_NUM=42, CONST_CHAR=43, CONST_STR=44, 
		CONST_FUNC=45, ID=46, SLC=47, MLC=48, WS=49;
	public static final int
		RULE_program = 0, RULE_fordecl = 1, RULE_type_fordecl = 2, RULE_func_fordecl = 3, 
		RULE_funcdef = 4, RULE_typedef = 5, RULE_vardef = 6, RULE_type = 7, RULE_block = 8, 
		RULE_statement = 9, RULE_other_stm = 10, RULE_if_stm = 11, RULE_if_stm_else = 12, 
		RULE_expr = 13, RULE_expr_assign = 14, RULE_expr_or = 15, RULE_expr_or_tmp = 16, 
		RULE_expr_and = 17, RULE_expr_and_tmp = 18, RULE_expr_eq = 19, RULE_expr_eq_tmp = 20, 
		RULE_expr_cmp = 21, RULE_expr_cmp_tmp = 22, RULE_expr_add = 23, RULE_expr_add_tmp = 24, 
		RULE_expr_mult = 25, RULE_expr_mult_tmp = 26, RULE_expr_un = 27, RULE_expr_mem = 28, 
		RULE_expr_mem_tmp = 29, RULE_expr_other = 30, RULE_while_stm = 31, RULE_foreach_stm = 32, 
		RULE_return_stm = 33, RULE_break_stm = 34;
	public static final String[] ruleNames = {
		"program", "fordecl", "type_fordecl", "func_fordecl", "funcdef", "typedef", 
		"vardef", "type", "block", "statement", "other_stm", "if_stm", "if_stm_else", 
		"expr", "expr_assign", "expr_or", "expr_or_tmp", "expr_and", "expr_and_tmp", 
		"expr_eq", "expr_eq_tmp", "expr_cmp", "expr_cmp_tmp", "expr_add", "expr_add_tmp", 
		"expr_mult", "expr_mult_tmp", "expr_un", "expr_mem", "expr_mem_tmp", "expr_other", 
		"while_stm", "foreach_stm", "return_stm", "break_stm"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'typedef'", "'('", "':'", "','", "')'", "'$'", "'as'", "'='", 
		"'['", "']'", "'list'", "'of'", "'<'", "'*'", "'->'", "'>'", "'string'", 
		"'char'", "'int'", "'void'", "'{'", "'}'", "'if'", "'else'", "'||'", "'&&'", 
		"'=='", "'!='", "'+'", "'-'", "'/'", "'!'", "'#'", "'.'", "'nil'", "'while'", 
		"'foreach'", "'in'", "'return'", "'break'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "CONST_NUM", "CONST_CHAR", "CONST_STR", 
		"CONST_FUNC", "ID", "SLC", "MLC", "WS"
	};
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
	public String getGrammarFileName() { return "x.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    void print(String str){
	        System.out.println(str);
	    }
	    void error (String str, int line) {
	      System.out.println("line " + line + " : " +  str);
	    }
	    int num = 0;
	    ScopeHandler handler = new ScopeHandler();
	    Env currEnv = new RootEnv(null,0);
	    RootEnv root = (RootEnv) currEnv;
	    boolean isCorrect = true;

	public xParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<FordeclContext> fordecl() {
			return getRuleContexts(FordeclContext.class);
		}
		public FordeclContext fordecl(int i) {
			return getRuleContext(FordeclContext.class,i);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public List<TypedefContext> typedef() {
			return getRuleContexts(TypedefContext.class);
		}
		public TypedefContext typedef(int i) {
			return getRuleContext(TypedefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(70);
					fordecl();
					setState(71);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(73);
					vardef();
					setState(74);
					match(T__0);
					}
					break;
				case 3:
					{
					setState(76);
					funcdef();
					}
					break;
				case 4:
					{
					setState(77);
					typedef();
					setState(78);
					match(T__0);
					}
					break;
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ID))) != 0) );
			 if (!root.getMain()) {
			            isCorrect = false;
			            print("Main function must be defined");
			          }
			          root.functionisdefined();
			        
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

	public static class FordeclContext extends ParserRuleContext {
		public Func_fordeclContext func_fordecl() {
			return getRuleContext(Func_fordeclContext.class,0);
		}
		public Type_fordeclContext type_fordecl() {
			return getRuleContext(Type_fordeclContext.class,0);
		}
		public FordeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fordecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterFordecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitFordecl(this);
		}
	}

	public final FordeclContext fordecl() throws RecognitionException {
		FordeclContext _localctx = new FordeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fordecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			switch (_input.LA(1)) {
			case T__9:
			case T__11:
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case ID:
				{
				setState(86);
				func_fordecl();
				}
				break;
			case T__1:
				{
				setState(87);
				type_fordecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Type_fordeclContext extends ParserRuleContext {
		public Token type_name;
		public TerminalNode ID() { return getToken(xParser.ID, 0); }
		public Type_fordeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_fordecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterType_fordecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitType_fordecl(this);
		}
	}

	public final Type_fordeclContext type_fordecl() throws RecognitionException {
		Type_fordeclContext _localctx = new Type_fordeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_fordecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__1);
			setState(91);
			((Type_fordeclContext)_localctx).type_name = match(ID);
			print("type forward decleration: "+(((Type_fordeclContext)_localctx).type_name!=null?((Type_fordeclContext)_localctx).type_name.getText():null));
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

	public static class Func_fordeclContext extends ParserRuleContext {
		public Vector<Type> types;
		public TypeContext output;
		public Token func_name;
		public TypeContext t;
		public TypeContext t2;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(xParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(xParser.ID, i);
		}
		public Func_fordeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_fordecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterFunc_fordecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitFunc_fordecl(this);
		}
	}

	public final Func_fordeclContext func_fordecl() throws RecognitionException {
		Func_fordeclContext _localctx = new Func_fordeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_fordecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((Func_fordeclContext)_localctx).types =  new Vector<Type>();
			setState(95);
			((Func_fordeclContext)_localctx).output = type();
			setState(96);
			((Func_fordeclContext)_localctx).func_name = match(ID);
			setState(97);
			match(T__2);
			setState(117);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ID))) != 0)) {
				{
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(98);
					match(ID);
					setState(99);
					match(T__3);
					}
					break;
				}
				setState(102);
				((Func_fordeclContext)_localctx).t = type();
				_localctx.types.add(((Func_fordeclContext)_localctx).t.ty);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(104);
					match(T__4);
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(105);
						match(ID);
						setState(106);
						match(T__3);
						}
						break;
					}
					setState(109);
					((Func_fordeclContext)_localctx).t2 = type();
					_localctx.types.add(((Func_fordeclContext)_localctx).t2.ty); 
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(119);
			match(T__5);

			         if (!root.addIfNotExistForward(new Pair<String, Vector<Type> > ((((Func_fordeclContext)_localctx).func_name!=null?((Func_fordeclContext)_localctx).func_name.getText():null), _localctx.types), ((Func_fordeclContext)_localctx).output.ty)) {
			           isCorrect = false;
			           error("The " + ((Func_fordeclContext)_localctx).func_name + " function is already declared",0);
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

	public static class FuncdefContext extends ParserRuleContext {
		public boolean argExists;
		public Vector<Type> types;
		public Vector<String> inputs;
		public Vector<Variable> vars;
		public TypeContext output;
		public Token func_name;
		public Token ref;
		public Token inName;
		public TypeContext var;
		public Token inName2;
		public TypeContext var2;
		public BlockContext b;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(xParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(xParser.ID, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitFuncdef(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FuncdefContext)_localctx).types =  new Vector<Type>(); ((FuncdefContext)_localctx).inputs =  new Vector<String>();  ((FuncdefContext)_localctx).vars =  new Vector<Variable>(); ((FuncdefContext)_localctx).argExists =  false;
			setState(123);
			((FuncdefContext)_localctx).output = type();
			setState(124);
			((FuncdefContext)_localctx).func_name = match(ID);
			setState(125);
			match(T__2);
			setState(148);
			_la = _input.LA(1);
			if (_la==T__6 || _la==ID) {
				{
				((FuncdefContext)_localctx).argExists =  true;
				setState(128);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(127);
					((FuncdefContext)_localctx).ref = match(T__6);
					}
				}

				setState(130);
				((FuncdefContext)_localctx).inName = match(ID);
				setState(131);
				match(T__3);
				setState(132);
				((FuncdefContext)_localctx).var = type();
				_localctx.types.add(((FuncdefContext)_localctx).var.ty); _localctx.inputs.add((((FuncdefContext)_localctx).inName!=null?((FuncdefContext)_localctx).inName.getText():null)); _localctx.vars.add(new Variable((((FuncdefContext)_localctx).inName!=null?((FuncdefContext)_localctx).inName.getText():null), ((FuncdefContext)_localctx).var.ty,0)); 
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(134);
					match(T__4);
					setState(136);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(135);
						((FuncdefContext)_localctx).ref = match(T__6);
						}
					}

					setState(138);
					((FuncdefContext)_localctx).inName2 = match(ID);
					setState(139);
					match(T__3);
					setState(140);
					((FuncdefContext)_localctx).var2 = type();
					_localctx.types.add(((FuncdefContext)_localctx).var2.ty); _localctx.inputs.add((((FuncdefContext)_localctx).inName2!=null?((FuncdefContext)_localctx).inName2.getText():null)); _localctx.vars.add(new Variable((((FuncdefContext)_localctx).inName2!=null?((FuncdefContext)_localctx).inName2.getText():null), ((FuncdefContext)_localctx).var.ty,0)); 
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(150);
			match(T__5);

			      if ((((FuncdefContext)_localctx).func_name!=null?((FuncdefContext)_localctx).func_name.getText():null).equals("main")) {
			        if (!(((FuncdefContext)_localctx).output!=null?_input.getText(((FuncdefContext)_localctx).output.start,((FuncdefContext)_localctx).output.stop):null).equals("void")) {
			          isCorrect = false;
			          error("Output of main function must be void.", (((FuncdefContext)_localctx).func_name!=null?((FuncdefContext)_localctx).func_name.getLine():0));
			        }
			        if(_localctx.argExists) {
			          isCorrect = false;
			          error("Main function must not have arguments.", (((FuncdefContext)_localctx).func_name!=null?((FuncdefContext)_localctx).func_name.getLine():0));
			        }
			      }

			      if (!root.addIfNotExistFunc(new Pair<String, Vector<Type> > ((((FuncdefContext)_localctx).func_name!=null?((FuncdefContext)_localctx).func_name.getText():null), _localctx.types), _localctx.inputs, ((FuncdefContext)_localctx).output.ty)) {
			        isCorrect = false;
			        error("Function " + (((FuncdefContext)_localctx).func_name!=null?((FuncdefContext)_localctx).func_name.getText():null) + " is already defined.", (((FuncdefContext)_localctx).func_name!=null?((FuncdefContext)_localctx).func_name.getLine():0));
			      }
			    
			 num++; handler.push(currEnv); currEnv = new Env(handler.top(),num); currEnv.addIfNotExistVar(_localctx.vars); 
			print("funcdef");
			setState(154);
			((FuncdefContext)_localctx).b = block();
			 if((((FuncdefContext)_localctx).output!=null?_input.getText(((FuncdefContext)_localctx).output.start,((FuncdefContext)_localctx).output.stop):null).equals("void")) { //return type can be void, or null or it can have no type;
			                  if (((FuncdefContext)_localctx).b.ReturnTy != null ) //can be void?
			                    error("void function should not return type",((FuncdefContext)_localctx).b.reLine);
			                }
			                else if(!((FuncdefContext)_localctx).b.ReturnTy.equals(((FuncdefContext)_localctx).output.ty))
			                { error("mismatched return type expected " + ((FuncdefContext)_localctx).output.ty.getType() + " encountered " + ((FuncdefContext)_localctx).b.ReturnTy.getType() + ".",((FuncdefContext)_localctx).b.reLine );}
			      currEnv = handler.pop(); 
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

	public static class TypedefContext extends ParserRuleContext {
		public Type_fordeclContext type_fordecl() {
			return getRuleContext(Type_fordeclContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitTypedef(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			type_fordecl();
			setState(158);
			match(T__7);
			setState(159);
			type();
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

	public static class VardefContext extends ParserRuleContext {
		public Vector<Variable> variables;
		public boolean hasType;
		public TypeContext t;
		public Token var;
		public ExprContext e;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(xParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(xParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitVardef(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VardefContext)_localctx).variables =   new Vector<Variable>(); ((VardefContext)_localctx).hasType = false; print("vardef");
			setState(162);
			((VardefContext)_localctx).t = type();
			setState(163);
			((VardefContext)_localctx).var = match(ID);
			setState(168);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(164);
				match(T__8);
				setState(165);
				((VardefContext)_localctx).e = expr();
				((VardefContext)_localctx).hasType =  true;
				}
			}

			 //print(((VardefContext)_localctx).e.ty.getType());
			        if ((((VardefContext)_localctx).t!=null?_input.getText(((VardefContext)_localctx).t.start,((VardefContext)_localctx).t.stop):null).equals("void"))
			          error("Void can not be a variable type.", (((VardefContext)_localctx).var!=null?((VardefContext)_localctx).var.getLine():0));
			        else {
			          if (_localctx.hasType) {
			            if (((VardefContext)_localctx).t.ty.equals(((VardefContext)_localctx).e.ty))
			              _localctx.variables.add(new Variable((((VardefContext)_localctx).var!=null?((VardefContext)_localctx).var.getText():null), ((VardefContext)_localctx).t.ty,0));
			            else {
			              isCorrect = false;
			              error(" No viable conversion from " + ((VardefContext)_localctx).e.ty.getType() + " to " + ((VardefContext)_localctx).t.ty.getType(),(((VardefContext)_localctx).var!=null?((VardefContext)_localctx).var.getLine():0)); //Not SURE
			            }
			          }
			          else {
			            _localctx.variables.add(new Variable((((VardefContext)_localctx).var!=null?((VardefContext)_localctx).var.getText():null), ((VardefContext)_localctx).t.ty,0));
			          }
			        }
			        ((VardefContext)_localctx).hasType =  false;
			      
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(171);
				match(T__4);
				setState(172);
				((VardefContext)_localctx).var = match(ID);
				setState(177);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(173);
					match(T__8);
					setState(174);
					((VardefContext)_localctx).e = expr();
					 ((VardefContext)_localctx).hasType =  true;
					}
				}


				        if ((((VardefContext)_localctx).t!=null?_input.getText(((VardefContext)_localctx).t.start,((VardefContext)_localctx).t.stop):null).equals("void"))
				          error("Void can not be a variable type.", (((VardefContext)_localctx).var!=null?((VardefContext)_localctx).var.getLine():0));
				        else {
				          if (_localctx.hasType) {
				            if (((VardefContext)_localctx).t.ty.equals(((VardefContext)_localctx).e.ty))
				              _localctx.variables.add(new Variable((((VardefContext)_localctx).var!=null?((VardefContext)_localctx).var.getText():null), ((VardefContext)_localctx).t.ty,0));
				            else {
				              isCorrect = false;
				              error(" No viable conversion from " + ((VardefContext)_localctx).e.ty.getType() + " to " + ((VardefContext)_localctx).t.ty.getType(),(((VardefContext)_localctx).var!=null?((VardefContext)_localctx).var.getLine():0)); //Not SURE
				            }
				          }
				          else
				            _localctx.variables.add(new Variable((((VardefContext)_localctx).var!=null?((VardefContext)_localctx).var.getText():null), ((VardefContext)_localctx).t.ty,0));
				        }
				        ((VardefContext)_localctx).hasType =  false;
				      
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 currEnv.addIfNotExistVar(_localctx.variables); 
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
		public Type ty;
		public Vector<String> memids;
		public Vector<Type> mems;
		public String name;
		public String name2;
		public Type output;
		public boolean isVoid;
		public boolean canAdd;
		public Vector<Variable> input;
		public Token nam;
		public TypeContext t;
		public Token nam2;
		public TypeContext t2;
		public Token size;
		public Token o;
		public TypeContext t3;
		public List<TerminalNode> ID() { return getTokens(xParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(xParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode CONST_NUM() { return getToken(xParser.CONST_NUM, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(187);
				match(ID);
				}
				break;
			case T__9:
				{
				((TypeContext)_localctx).memids =  new Vector<String>(); ((TypeContext)_localctx).mems =  new Vector<Type>(); ((TypeContext)_localctx).name =  null;
				setState(189);
				match(T__9);
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(190);
					((TypeContext)_localctx).nam = match(ID);
					setState(191);
					match(T__3);
					((TypeContext)_localctx).name = (((TypeContext)_localctx).nam!=null?((TypeContext)_localctx).nam.getText():null);
					}
					break;
				}
				_localctx.memids.add(_localctx.name);
				setState(196);
				((TypeContext)_localctx).t = type();
				_localctx.mems.add(((TypeContext)_localctx).t.ty);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					((TypeContext)_localctx).name2 =  null;
					setState(199);
					match(T__4);
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(200);
						((TypeContext)_localctx).nam2 = match(ID);
						setState(201);
						match(T__3);
						((TypeContext)_localctx).name2 = (((TypeContext)_localctx).nam2!=null?((TypeContext)_localctx).nam2.getText():null);
						}
						break;
					}
					_localctx.memids.add(_localctx.name2);
					setState(206);
					((TypeContext)_localctx).t2 = type();
					_localctx.mems.add(((TypeContext)_localctx).t2.ty);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(T__10);
				 ((TypeContext)_localctx).ty =  new ListType(_localctx.mems, _localctx.memids, "list");
				}
				break;
			case T__11:
				{
				setState(217);
				match(T__11);
				setState(218);
				match(T__2);
				setState(219);
				((TypeContext)_localctx).size = match(CONST_NUM);
				setState(220);
				match(T__5);
				setState(221);
				match(T__12);
				setState(222);
				((TypeContext)_localctx).t = type();

				        if (Integer.parseInt((((TypeContext)_localctx).size!=null?((TypeContext)_localctx).size.getText():null)) == 0) {
				          isCorrect = false;
				          error("list must have at least one element",(((TypeContext)_localctx).size!=null?((TypeContext)_localctx).size.getLine():0));
				        }
				        else {
				          ((TypeContext)_localctx).mems =  new Vector<Type> (Integer.parseInt((((TypeContext)_localctx).size!=null?((TypeContext)_localctx).size.getText():null)));
				          ((TypeContext)_localctx).memids =  new Vector<String> (Integer.parseInt((((TypeContext)_localctx).size!=null?((TypeContext)_localctx).size.getText():null)));
				          for (int i = 0; i < _localctx.mems.size(); i++) {
				            _localctx.mems.set(i, ((TypeContext)_localctx).t.ty);
				            _localctx.memids.set(i, null);
				          }
				          ((TypeContext)_localctx).ty =  new ListType(_localctx.mems, _localctx.memids, "list");
				        }
				      
				}
				break;
			case T__13:
				{
				((TypeContext)_localctx).canAdd =  true; ((TypeContext)_localctx).mems =  new Vector<Type>();
				setState(226);
				match(T__13);
				{
				setState(227);
				((TypeContext)_localctx).t = type();

				        if(!((TypeContext)_localctx).t.ty.isVoid()) {
				          _localctx.mems.add(((TypeContext)_localctx).t.ty);
				          ((TypeContext)_localctx).isVoid =  false;
				        }
				        else
				          ((TypeContext)_localctx).isVoid =  true;
				      
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(229);
					((TypeContext)_localctx).o = match(T__14);
					setState(230);
					((TypeContext)_localctx).t2 = type();

					        if (_localctx.isVoid && _localctx.canAdd || ((TypeContext)_localctx).t2.ty.isVoid()) {
					          ((TypeContext)_localctx).canAdd =  false;
					          isCorrect = false;
					          error("A function cannot have both void and other types as input.", (((TypeContext)_localctx).o!=null?((TypeContext)_localctx).o.getLine():0));
					        }
					        else {
					            _localctx.mems.add(((TypeContext)_localctx).t2.ty);
					        }
					      
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(238);
				match(T__15);
				setState(239);
				((TypeContext)_localctx).t3 = type();
				((TypeContext)_localctx).output =  ((TypeContext)_localctx).t3.ty;
				setState(241);
				match(T__16);

				        if(_localctx.canAdd)
				          ((TypeContext)_localctx).ty =  new Ptf(_localctx.mems, _localctx.output);
				        else
				          ((TypeContext)_localctx).ty =  new InvalidType();
				        
				}
				break;
			case T__17:
				{
				setState(244);
				match(T__17);
				setState(245);
				match(T__2);
				setState(246);
				((TypeContext)_localctx).size = match(CONST_NUM);
				setState(247);
				match(T__5);

				      ((TypeContext)_localctx).mems =  new Vector<Type> (Integer.parseInt((((TypeContext)_localctx).size!=null?((TypeContext)_localctx).size.getText():null)));
				      for (int i = 0; i < _localctx.mems.size(); i++)
				        _localctx.mems.set(i, new Primitive("char"));
				      ((TypeContext)_localctx).ty =  new ListType(_localctx.mems, null, "list");
				    
				}
				break;
			case T__18:
				{
				setState(249);
				match(T__18);
				((TypeContext)_localctx).ty =  new Primitive("char");
				}
				break;
			case T__19:
				{
				setState(251);
				match(T__19);
				((TypeContext)_localctx).ty =  new Primitive("int"); 
				}
				break;
			case T__20:
				{
				setState(253);
				match(T__20);
				((TypeContext)_localctx).ty =  new Primitive("void");
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockContext extends ParserRuleContext {
		public Type ReturnTy;
		public int reLine;
		public StatementContext s;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__21);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__30) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__40) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << CONST_FUNC) | (1L << ID))) != 0)) {
				{
				{
				setState(258);
				((BlockContext)_localctx).s = statement();
				 ((BlockContext)_localctx).ReturnTy =  ((BlockContext)_localctx).s.ReturnTy; ;((BlockContext)_localctx).reLine =  ((BlockContext)_localctx).s.reLine;
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(T__22);
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
		public Type ReturnTy;
		public int reLine;
		public Other_stmContext o;
		public If_stmContext if_stm() {
			return getRuleContext(If_stmContext.class,0);
		}
		public Other_stmContext other_stm() {
			return getRuleContext(Other_stmContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(268);
				if_stm();
				}
				break;
			case T__2:
			case T__9:
			case T__11:
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__30:
			case T__32:
			case T__35:
			case T__36:
			case T__37:
			case T__39:
			case T__40:
			case CONST_NUM:
			case CONST_CHAR:
			case CONST_STR:
			case CONST_FUNC:
			case ID:
				{
				setState(269);
				((StatementContext)_localctx).o = other_stm();
				((StatementContext)_localctx).ReturnTy =  ((StatementContext)_localctx).o.ReturnTy; ((StatementContext)_localctx).reLine =  ((StatementContext)_localctx).o.reLine; 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Other_stmContext extends ParserRuleContext {
		public Type ReturnTy;
		public int reLine;
		public Return_stmContext r;
		public Token s;
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public While_stmContext while_stm() {
			return getRuleContext(While_stmContext.class,0);
		}
		public Foreach_stmContext foreach_stm() {
			return getRuleContext(Foreach_stmContext.class,0);
		}
		public Break_stmContext break_stm() {
			return getRuleContext(Break_stmContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Return_stmContext return_stm() {
			return getRuleContext(Return_stmContext.class,0);
		}
		public Other_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterOther_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitOther_stm(this);
		}
	}

	public final Other_stmContext other_stm() throws RecognitionException {
		Other_stmContext _localctx = new Other_stmContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_other_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(274);
				vardef();
				setState(275);
				match(T__0);
				}
				break;
			case 2:
				{
				setState(277);
				expr();
				setState(278);
				match(T__0);
				}
				break;
			case 3:
				{
				setState(280);
				while_stm();
				}
				break;
			case 4:
				{
				setState(281);
				foreach_stm();
				}
				break;
			case 5:
				{
				setState(282);
				((Other_stmContext)_localctx).r = return_stm();
				setState(283);
				((Other_stmContext)_localctx).s = match(T__0);
				((Other_stmContext)_localctx).ReturnTy =  ((Other_stmContext)_localctx).r.tyReturn; ((Other_stmContext)_localctx).reLine =  (((Other_stmContext)_localctx).s!=null?((Other_stmContext)_localctx).s.getLine():0); 
				}
				break;
			case 6:
				{
				setState(286);
				break_stm();
				setState(287);
				match(T__0);
				}
				break;
			case 7:
				{
				setState(289);
				block();
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

	public static class If_stmContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_stm_elseContext if_stm_else() {
			return getRuleContext(If_stm_elseContext.class,0);
		}
		public If_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterIf_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitIf_stm(this);
		}
	}

	public final If_stmContext if_stm() throws RecognitionException {
		If_stmContext _localctx = new If_stmContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(292);
				match(T__23);
				setState(293);
				match(T__2);
				setState(294);
				expr();
				setState(295);
				match(T__5);

				      handler.push(currEnv);
				      num++;
				      currEnv = new Env(handler.top(),num);
				    
				setState(297);
				statement();
				 currEnv = handler.pop(); 
				}
				break;
			case 2:
				{
				setState(300);
				match(T__23);
				setState(301);
				match(T__2);
				setState(302);
				expr();
				setState(303);
				match(T__5);

				      handler.push(currEnv);
				      num++;
				      currEnv = new Env(handler.top(),num);
				    
				setState(305);
				if_stm_else();
				 currEnv = handler.pop(); 
				setState(307);
				match(T__24);

				      handler.push(currEnv);
				      num++;
				      currEnv = new Env(handler.top(),num);
				    
				setState(309);
				statement();
				 currEnv = handler.pop(); 
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

	public static class If_stm_elseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<If_stm_elseContext> if_stm_else() {
			return getRuleContexts(If_stm_elseContext.class);
		}
		public If_stm_elseContext if_stm_else(int i) {
			return getRuleContext(If_stm_elseContext.class,i);
		}
		public Other_stmContext other_stm() {
			return getRuleContext(Other_stmContext.class,0);
		}
		public If_stm_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stm_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterIf_stm_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitIf_stm_else(this);
		}
	}

	public final If_stm_elseContext if_stm_else() throws RecognitionException {
		If_stm_elseContext _localctx = new If_stm_elseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stm_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(314);
				match(T__23);
				setState(315);
				match(T__2);
				setState(316);
				expr();
				setState(317);
				match(T__5);

				      handler.push(currEnv);
				      num++;
				      currEnv = new Env(handler.top(),num);
				    
				setState(319);
				if_stm_else();
				 currEnv = handler.pop(); 
				setState(321);
				match(T__24);

				      handler.push(currEnv);
				      num++;
				      currEnv = new Env(handler.top(),num);
				    
				setState(323);
				if_stm_else();
				 currEnv = handler.pop(); 
				}
				break;
			case T__2:
			case T__9:
			case T__11:
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__30:
			case T__32:
			case T__35:
			case T__36:
			case T__37:
			case T__39:
			case T__40:
			case CONST_NUM:
			case CONST_CHAR:
			case CONST_STR:
			case CONST_FUNC:
			case ID:
				{
				setState(326);
				other_stm();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public Type ty;
		public Expr_assignContext e1;
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			((ExprContext)_localctx).e1 = expr_assign();
			 ((ExprContext)_localctx).ty =  ((ExprContext)_localctx).e1.ty;
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

	public static class Expr_assignContext extends ParserRuleContext {
		public Type ty;
		public Expr_orContext e1;
		public Token op;
		public Expr_assignContext e2;
		public Expr_orContext e3;
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public Expr_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_assign(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_assign);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				((Expr_assignContext)_localctx).e1 = expr_or();
				setState(333);
				((Expr_assignContext)_localctx).op = match(T__8);
				setState(334);
				((Expr_assignContext)_localctx).e2 = expr_assign();
				 if (((Expr_assignContext)_localctx).e2.ty instanceof InvalidType || ((Expr_assignContext)_localctx).e1.ty instanceof InvalidType) {
				        ((Expr_assignContext)_localctx).ty =  new InvalidType();
				        isCorrect = false;
				        error("Assignment can not be done, types are invalid",0);
				     }
				     else if (!((Expr_assignContext)_localctx).e2.ty.equals(((Expr_assignContext)_localctx).e1.ty)) {
				       isCorrect = false;
				       error(" No viable conversion from " + ((Expr_assignContext)_localctx).e2.ty.getType() + " to " + ((Expr_assignContext)_localctx).e1.ty.getType(),(((Expr_assignContext)_localctx).op!=null?((Expr_assignContext)_localctx).op.getLine():0));
				       ((Expr_assignContext)_localctx).ty =  new InvalidType(); //just for now
				    }
				    else
				      ((Expr_assignContext)_localctx).ty =  ((Expr_assignContext)_localctx).e1.ty;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				((Expr_assignContext)_localctx).e3 = expr_or();
				 ((Expr_assignContext)_localctx).ty =  ((Expr_assignContext)_localctx).e3.ty; 
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

	public static class Expr_orContext extends ParserRuleContext {
		public Type ty;
		public Expr_andContext e1;
		public Expr_or_tmpContext e2;
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_or(this);
		}
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			((Expr_orContext)_localctx).e1 = expr_and();
			setState(343);
			((Expr_orContext)_localctx).e2 = expr_or_tmp();

			      if (((Expr_orContext)_localctx).e2.ty == null ) {
			        ((Expr_orContext)_localctx).ty =  ((Expr_orContext)_localctx).e1.ty;
			      }
			      else {
			        if (((Expr_orContext)_localctx).e2.ty instanceof InvalidType || ((Expr_orContext)_localctx).e1.ty instanceof InvalidType)
			          ((Expr_orContext)_localctx).ty =  new InvalidType();
			        else {
			          if (((Expr_orContext)_localctx).e1.ty.getType().equals("int") && ((Expr_orContext)_localctx).e2.ty.getType().equals("int"))
			            ((Expr_orContext)_localctx).ty =  ((Expr_orContext)_localctx).e1.ty;
			          else {
			              ((Expr_orContext)_localctx).ty =  new InvalidType();
			              isCorrect = false;
			              error("Logical Or can only be applied on Integer types",0);
			          }
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

	public static class Expr_or_tmpContext extends ParserRuleContext {
		public Type ty;
		public Expr_andContext e1;
		public Expr_or_tmpContext e2;
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_or_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_or_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_or_tmp(this);
		}
	}

	public final Expr_or_tmpContext expr_or_tmp() throws RecognitionException {
		Expr_or_tmpContext _localctx = new Expr_or_tmpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_or_tmp);
		try {
			setState(352);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(T__25);
				setState(347);
				((Expr_or_tmpContext)_localctx).e1 = expr_and();
				setState(348);
				((Expr_or_tmpContext)_localctx).e2 = expr_or_tmp();
				 if (((Expr_or_tmpContext)_localctx).e1.ty.getType().equals("int")) {
				        ((Expr_or_tmpContext)_localctx).ty =  (((Expr_or_tmpContext)_localctx).e2.ty == null)? ((Expr_or_tmpContext)_localctx).e1.ty : (((Expr_or_tmpContext)_localctx).e2.ty.getType().equals("int")) ? ((Expr_or_tmpContext)_localctx).e2.ty : new InvalidType();
				      }
				      else
				        ((Expr_or_tmpContext)_localctx).ty =  new InvalidType();
				    
				}
				break;
			case T__0:
			case T__4:
			case T__5:
			case T__8:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_andContext extends ParserRuleContext {
		public Type ty;
		public Expr_eqContext e1;
		public Expr_and_tmpContext e2;
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_and(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			((Expr_andContext)_localctx).e1 = expr_eq();
			setState(355);
			((Expr_andContext)_localctx).e2 = expr_and_tmp();

			      if (((Expr_andContext)_localctx).e2.ty == null )
			        ((Expr_andContext)_localctx).ty =  ((Expr_andContext)_localctx).e1.ty;
			      else {
			        if (((Expr_andContext)_localctx).e2.ty instanceof InvalidType || ((Expr_andContext)_localctx).e1.ty instanceof InvalidType)
			          ((Expr_andContext)_localctx).ty =  new InvalidType();
			        else {
			          if (((Expr_andContext)_localctx).e1.ty.getType().equals("int") && ((Expr_andContext)_localctx).e2.ty.getType().equals("int"))
			            ((Expr_andContext)_localctx).ty =  ((Expr_andContext)_localctx).e1.ty;
			          else {
			              ((Expr_andContext)_localctx).ty =  new InvalidType();
			              isCorrect = false;
			              error("Logical And can only be applied on Integer types",0);
			          }
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

	public static class Expr_and_tmpContext extends ParserRuleContext {
		public Type ty;
		public Expr_eqContext e1;
		public Expr_and_tmpContext e2;
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_and_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_and_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_and_tmp(this);
		}
	}

	public final Expr_and_tmpContext expr_and_tmp() throws RecognitionException {
		Expr_and_tmpContext _localctx = new Expr_and_tmpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_and_tmp);
		try {
			setState(364);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(T__26);
				setState(359);
				((Expr_and_tmpContext)_localctx).e1 = expr_eq();
				setState(360);
				((Expr_and_tmpContext)_localctx).e2 = expr_and_tmp();
				 if (((Expr_and_tmpContext)_localctx).e1.ty.getType().equals("int")) {
				        ((Expr_and_tmpContext)_localctx).ty =  (((Expr_and_tmpContext)_localctx).e2.ty == null)? ((Expr_and_tmpContext)_localctx).e1.ty : (((Expr_and_tmpContext)_localctx).e2.ty.getType().equals("int")) ? ((Expr_and_tmpContext)_localctx).e2.ty : new InvalidType();
				      }
				      else
				        ((Expr_and_tmpContext)_localctx).ty =  new InvalidType();
				    
				}
				break;
			case T__0:
			case T__4:
			case T__5:
			case T__8:
			case T__10:
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_eqContext extends ParserRuleContext {
		public Type ty;
		public Expr_cmpContext e1;
		public Expr_eq_tmpContext e2;
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_eq(this);
		}
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((Expr_eqContext)_localctx).e1 = expr_cmp();
			setState(367);
			((Expr_eqContext)_localctx).e2 = expr_eq_tmp();

			      if (((Expr_eqContext)_localctx).e2.ty == null )
			        ((Expr_eqContext)_localctx).ty =  ((Expr_eqContext)_localctx).e1.ty;
			      else {
			        if (((Expr_eqContext)_localctx).e2.ty instanceof InvalidType || ((Expr_eqContext)_localctx).e1.ty instanceof InvalidType)
			          ((Expr_eqContext)_localctx).ty =  new InvalidType();
			        else {
			          if (((Expr_eqContext)_localctx).e1.ty.getType().equals("int") && ((Expr_eqContext)_localctx).e2.ty.getType().equals("int"))
			            ((Expr_eqContext)_localctx).ty =  ((Expr_eqContext)_localctx).e1.ty;
			          else {
			              ((Expr_eqContext)_localctx).ty =  new InvalidType();
			              isCorrect = false;
			              error("Only Integer types can be compared",0);
			          }
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

	public static class Expr_eq_tmpContext extends ParserRuleContext {
		public Type ty;
		public Token op;
		public Expr_cmpContext e1;
		public Expr_eq_tmpContext e2;
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eq_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_eq_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_eq_tmp(this);
		}
	}

	public final Expr_eq_tmpContext expr_eq_tmp() throws RecognitionException {
		Expr_eq_tmpContext _localctx = new Expr_eq_tmpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_eq_tmp);
		int _la;
		try {
			setState(376);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				((Expr_eq_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
					((Expr_eq_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(371);
				((Expr_eq_tmpContext)_localctx).e1 = expr_cmp();
				setState(372);
				((Expr_eq_tmpContext)_localctx).e2 = expr_eq_tmp();
				 if (((Expr_eq_tmpContext)_localctx).e1.ty.getType().equals("int")) {
				        ((Expr_eq_tmpContext)_localctx).ty =  (((Expr_eq_tmpContext)_localctx).e2.ty == null)? ((Expr_eq_tmpContext)_localctx).e1.ty : (((Expr_eq_tmpContext)_localctx).e2.ty.getType().equals("int")) ? ((Expr_eq_tmpContext)_localctx).e2.ty : new InvalidType();
				      }
				      else
				        ((Expr_eq_tmpContext)_localctx).ty =  new InvalidType();
				    
				}
				break;
			case T__0:
			case T__4:
			case T__5:
			case T__8:
			case T__10:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_cmpContext extends ParserRuleContext {
		public Type ty;
		public Expr_addContext e1;
		public Expr_cmp_tmpContext e2;
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_cmp(this);
		}
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			((Expr_cmpContext)_localctx).e1 = expr_add();
			setState(379);
			((Expr_cmpContext)_localctx).e2 = expr_cmp_tmp();

			      if (((Expr_cmpContext)_localctx).e2.ty == null )
			        ((Expr_cmpContext)_localctx).ty =  ((Expr_cmpContext)_localctx).e1.ty;
			      else {
			        if (((Expr_cmpContext)_localctx).e2.ty instanceof InvalidType || ((Expr_cmpContext)_localctx).e1.ty instanceof InvalidType)
			          ((Expr_cmpContext)_localctx).ty =  new InvalidType();
			        else {
			          if (((Expr_cmpContext)_localctx).e1.ty.getType().equals("int") && ((Expr_cmpContext)_localctx).e2.ty.getType().equals("int"))
			            ((Expr_cmpContext)_localctx).ty =  ((Expr_cmpContext)_localctx).e1.ty;
			          else {
			              ((Expr_cmpContext)_localctx).ty =  new InvalidType();
			              isCorrect = false;
			              error("Only Integer types can be compared",0);
			          }
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

	public static class Expr_cmp_tmpContext extends ParserRuleContext {
		public Type ty;
		public Token op;
		public Expr_addContext e1;
		public Expr_cmp_tmpContext e2;
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmp_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_cmp_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_cmp_tmp(this);
		}
	}

	public final Expr_cmp_tmpContext expr_cmp_tmp() throws RecognitionException {
		Expr_cmp_tmpContext _localctx = new Expr_cmp_tmpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_cmp_tmp);
		int _la;
		try {
			setState(388);
			switch (_input.LA(1)) {
			case T__13:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				((Expr_cmp_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__16) ) {
					((Expr_cmp_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(383);
				((Expr_cmp_tmpContext)_localctx).e1 = expr_add();
				setState(384);
				((Expr_cmp_tmpContext)_localctx).e2 = expr_cmp_tmp();
				 if (((Expr_cmp_tmpContext)_localctx).e1.ty.getType().equals("int")) {
				        ((Expr_cmp_tmpContext)_localctx).ty =  (((Expr_cmp_tmpContext)_localctx).e2.ty == null)? ((Expr_cmp_tmpContext)_localctx).e1.ty : (((Expr_cmp_tmpContext)_localctx).e2.ty.getType().equals("int")) ? ((Expr_cmp_tmpContext)_localctx).e2.ty : new InvalidType();
				      }
				      else
				        ((Expr_cmp_tmpContext)_localctx).ty =  new InvalidType();
				    
				}
				break;
			case T__0:
			case T__4:
			case T__5:
			case T__8:
			case T__10:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_addContext extends ParserRuleContext {
		public Type ty;
		public Expr_multContext e1;
		public Expr_add_tmpContext e2;
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_add(this);
		}
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			((Expr_addContext)_localctx).e1 = expr_mult();
			setState(391);
			((Expr_addContext)_localctx).e2 = expr_add_tmp();

			      if (((Expr_addContext)_localctx).e2.ty == null )
			        ((Expr_addContext)_localctx).ty =  ((Expr_addContext)_localctx).e1.ty;
			      else {
			        if (((Expr_addContext)_localctx).e2.ty instanceof InvalidType || ((Expr_addContext)_localctx).e1.ty instanceof InvalidType)
			          ((Expr_addContext)_localctx).ty =  new InvalidType();
			        else {
			          if (((Expr_addContext)_localctx).e1.ty.getType().equals("int") && ((Expr_addContext)_localctx).e2.ty.getType().equals("int"))
			            ((Expr_addContext)_localctx).ty =  ((Expr_addContext)_localctx).e1.ty;
			          else {
			              ((Expr_addContext)_localctx).ty =  new InvalidType();
			              isCorrect = false;
			              error("Only Integer types can be added or subtracted", 0);
			          }
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

	public static class Expr_add_tmpContext extends ParserRuleContext {
		public Type ty;
		public Token op;
		public Expr_multContext e1;
		public Expr_add_tmpContext e2;
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_add_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_add_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_add_tmp(this);
		}
	}

	public final Expr_add_tmpContext expr_add_tmp() throws RecognitionException {
		Expr_add_tmpContext _localctx = new Expr_add_tmpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_add_tmp);
		int _la;
		try {
			setState(400);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				((Expr_add_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((Expr_add_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(395);
				((Expr_add_tmpContext)_localctx).e1 = expr_mult();
				setState(396);
				((Expr_add_tmpContext)_localctx).e2 = expr_add_tmp();
				 if (((Expr_add_tmpContext)_localctx).e1.ty.getType().equals("int"))
				      { ((Expr_add_tmpContext)_localctx).ty =  (((Expr_add_tmpContext)_localctx).e2.ty == null) ? ((Expr_add_tmpContext)_localctx).e1.ty : (((Expr_add_tmpContext)_localctx).e2.ty.getType().equals("int"))? ((Expr_add_tmpContext)_localctx).e2.ty : new InvalidType(); }
				      else
				        ((Expr_add_tmpContext)_localctx).ty =  new InvalidType();
				    
				}
				break;
			case T__0:
			case T__4:
			case T__5:
			case T__8:
			case T__10:
			case T__13:
			case T__16:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_multContext extends ParserRuleContext {
		public Type ty;
		public Expr_unContext e1;
		public Expr_mult_tmpContext e2;
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_mult(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			((Expr_multContext)_localctx).e1 = expr_un();
			setState(403);
			((Expr_multContext)_localctx).e2 = expr_mult_tmp();

			      if (((Expr_multContext)_localctx).e2.ty == null ) {
			        ((Expr_multContext)_localctx).ty =  ((Expr_multContext)_localctx).e1.ty;
			      }
			      else {
			        if (((Expr_multContext)_localctx).e2.ty instanceof InvalidType || ((Expr_multContext)_localctx).e1.ty instanceof InvalidType)
			          ((Expr_multContext)_localctx).ty =  new InvalidType();
			        else {
			          if (((Expr_multContext)_localctx).e1.ty.getType().equals("int") && ((Expr_multContext)_localctx).e2.ty.getType().equals("int"))
			            ((Expr_multContext)_localctx).ty =  ((Expr_multContext)_localctx).e1.ty;
			          else {
			              ((Expr_multContext)_localctx).ty =  new InvalidType();
			              isCorrect = false;
			              error("Only Integer types can be multiplied or divided", 0);
			          }
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

	public static class Expr_mult_tmpContext extends ParserRuleContext {
		public Type ty;
		public Token op;
		public Expr_unContext e1;
		public Expr_mult_tmpContext e2;
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_mult_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_mult_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_mult_tmp(this);
		}
	}

	public final Expr_mult_tmpContext expr_mult_tmp() throws RecognitionException {
		Expr_mult_tmpContext _localctx = new Expr_mult_tmpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_mult_tmp);
		int _la;
		try {
			setState(412);
			switch (_input.LA(1)) {
			case T__14:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				((Expr_mult_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__31) ) {
					((Expr_mult_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(407);
				((Expr_mult_tmpContext)_localctx).e1 = expr_un();
				setState(408);
				((Expr_mult_tmpContext)_localctx).e2 = expr_mult_tmp();
				 if (((Expr_mult_tmpContext)_localctx).e1.ty.getType().equals("int"))
				      { ((Expr_mult_tmpContext)_localctx).ty =  (((Expr_mult_tmpContext)_localctx).e2.ty == null) ? ((Expr_mult_tmpContext)_localctx).e1.ty : (((Expr_mult_tmpContext)_localctx).e2.ty.getType().equals("int"))? ((Expr_mult_tmpContext)_localctx).e2.ty : new InvalidType(); }
				    
				}
				break;
			case T__0:
			case T__4:
			case T__5:
			case T__8:
			case T__10:
			case T__13:
			case T__16:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_unContext extends ParserRuleContext {
		public Type ty;
		public Token op;
		public Expr_unContext e1;
		public Expr_memContext e2;
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_memContext expr_mem() {
			return getRuleContext(Expr_memContext.class,0);
		}
		public Expr_unContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_un; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_un(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_un(this);
		}
	}

	public final Expr_unContext expr_un() throws RecognitionException {
		Expr_unContext _localctx = new Expr_unContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_un);
		int _la;
		try {
			setState(421);
			switch (_input.LA(1)) {
			case T__30:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				((Expr_unContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__32) ) {
					((Expr_unContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(415);
				((Expr_unContext)_localctx).e1 = expr_un();

				      if (!((Expr_unContext)_localctx).e1.ty.getType().equals("int"))
				      { ((Expr_unContext)_localctx).ty =  new InvalidType(); isCorrect = false; error("Unary operations can only be applied to integers.", (((Expr_unContext)_localctx).op!=null?((Expr_unContext)_localctx).op.getLine():0));}
				      else ((Expr_unContext)_localctx).ty =  ((Expr_unContext)_localctx).e1.ty;
				    
				}
				break;
			case T__2:
			case T__9:
			case T__35:
			case CONST_NUM:
			case CONST_CHAR:
			case CONST_STR:
			case CONST_FUNC:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				((Expr_unContext)_localctx).e2 = expr_mem();
				 ((Expr_unContext)_localctx).ty =  (((Expr_unContext)_localctx).e2.ty ==  null) ? new InvalidType(): ((Expr_unContext)_localctx).e2.ty;
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

	public static class Expr_memContext extends ParserRuleContext {
		public Type ty;
		public Expr_otherContext e1;
		public Expr_mem_tmpContext e2;
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_memContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_mem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_mem(this);
		}
	}

	public final Expr_memContext expr_mem() throws RecognitionException {
		Expr_memContext _localctx = new Expr_memContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_mem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			((Expr_memContext)_localctx).e1 = expr_other();
			setState(424);
			((Expr_memContext)_localctx).e2 = expr_mem_tmp(((Expr_memContext)_localctx).e1.name, null);
			((Expr_memContext)_localctx).ty =  (((Expr_memContext)_localctx).e2.ty == null)? ((Expr_memContext)_localctx).e1.retType: ((Expr_memContext)_localctx).e2.ty;
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

	public static class Expr_mem_tmpContext extends ParserRuleContext {
		public String name;
		public Type inputType;
		public Type ty;
		public Vector<Type> types;
		public Token num;
		public Token var;
		public Token s;
		public ExprContext e;
		public ExprContext e2;
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public TerminalNode CONST_NUM() { return getToken(xParser.CONST_NUM, 0); }
		public TerminalNode ID() { return getToken(xParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_mem_tmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_mem_tmpContext(ParserRuleContext parent, int invokingState, String name, Type inputType) {
			super(parent, invokingState);
			this.name = name;
			this.inputType = inputType;
		}
		@Override public int getRuleIndex() { return RULE_expr_mem_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_mem_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_mem_tmp(this);
		}
	}

	public final Expr_mem_tmpContext expr_mem_tmp(String name,Type inputType) throws RecognitionException {
		Expr_mem_tmpContext _localctx = new Expr_mem_tmpContext(_ctx, getState(), name, inputType);
		enterRule(_localctx, 58, RULE_expr_mem_tmp);
		int _la;
		try {
			setState(454);
			switch (_input.LA(1)) {
			case T__2:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				((Expr_mem_tmpContext)_localctx).types =  new Vector<Type>();
				setState(450);
				switch (_input.LA(1)) {
				case T__33:
					{
					setState(428);
					match(T__33);
					setState(429);
					((Expr_mem_tmpContext)_localctx).num = match(CONST_NUM);

					      if (_localctx.name != null)
					      {
					        int n = Integer.parseInt((((Expr_mem_tmpContext)_localctx).num!=null?((Expr_mem_tmpContext)_localctx).num.getText():null));
					        Type listVarType = currEnv.listHasIndex(_localctx.name, n);
					        if (listVarType == null) {
					          isCorrect = false;
					          error("The index " + n + " is not valid.", (((Expr_mem_tmpContext)_localctx).num!=null?((Expr_mem_tmpContext)_localctx).num.getLine():0));
					          ((Expr_mem_tmpContext)_localctx).ty =  new InvalidType();
					        }
					        else {
					          ((Expr_mem_tmpContext)_localctx).ty =  listVarType;
					        }
					      }
					      else {
					        if (_localctx.inputType instanceof ListType) {
					          int n = Integer.parseInt((((Expr_mem_tmpContext)_localctx).num!=null?((Expr_mem_tmpContext)_localctx).num.getText():null));
					          Type listVarType = ((ListType)_localctx.inputType).getIndexType(n);
					          if (listVarType == null) {
					            isCorrect = false;
					            error("The index " + (((Expr_mem_tmpContext)_localctx).var!=null?((Expr_mem_tmpContext)_localctx).var.getText():null) + " is not valid.", (((Expr_mem_tmpContext)_localctx).num!=null?((Expr_mem_tmpContext)_localctx).num.getLine():0));
					            ((Expr_mem_tmpContext)_localctx).ty =  new InvalidType();
					          }
					          else
					            ((Expr_mem_tmpContext)_localctx).ty =  listVarType;
					        }
					        else
					          ((Expr_mem_tmpContext)_localctx).ty =  new InvalidType();
					      }
					    
					}
					break;
				case T__34:
					{
					setState(431);
					match(T__34);
					setState(432);
					((Expr_mem_tmpContext)_localctx).var = match(ID);

					      if (_localctx.name != null)
					      {
					        Type listVarType = currEnv.listHasLabel(_localctx.name, (((Expr_mem_tmpContext)_localctx).var!=null?((Expr_mem_tmpContext)_localctx).var.getText():null));
					        if (listVarType == null) {
					          isCorrect = false;
					          error("The label " + (((Expr_mem_tmpContext)_localctx).var!=null?((Expr_mem_tmpContext)_localctx).var.getText():null) + " is not valid.", (((Expr_mem_tmpContext)_localctx).var!=null?((Expr_mem_tmpContext)_localctx).var.getLine():0));
					          ((Expr_mem_tmpContext)_localctx).ty =  new InvalidType();
					        }
					        else {
					          ((Expr_mem_tmpContext)_localctx).ty =  listVarType;
					        }
					      }
					      else {
					        if (_localctx.inputType.getType().equals("list")) {
					          Type listVarType = ((ListType)_localctx.inputType).getLabelType((((Expr_mem_tmpContext)_localctx).var!=null?((Expr_mem_tmpContext)_localctx).var.getText():null));
					          if (listVarType == null) {
					            isCorrect = false;
					            error("The label " + (((Expr_mem_tmpContext)_localctx).var!=null?((Expr_mem_tmpContext)_localctx).var.getText():null) + " is not valid.", (((Expr_mem_tmpContext)_localctx).num!=null?((Expr_mem_tmpContext)_localctx).num.getLine():0));
					            ((Expr_mem_tmpContext)_localctx).ty =  new InvalidType();
					          }
					          else
					            ((Expr_mem_tmpContext)_localctx).ty =  listVarType;
					        }
					        else
					          ((Expr_mem_tmpContext)_localctx).ty =  new InvalidType();
					          error("You can only call labels on a list.", (((Expr_mem_tmpContext)_localctx).num!=null?((Expr_mem_tmpContext)_localctx).num.getLine():0));
					      }
					    
					}
					break;
				case T__2:
					{
					setState(434);
					((Expr_mem_tmpContext)_localctx).s = match(T__2);
					setState(446);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__30) | (1L << T__32) | (1L << T__35) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << CONST_FUNC) | (1L << ID))) != 0)) {
						{
						setState(435);
						((Expr_mem_tmpContext)_localctx).e = expr();
						 _localctx.types.add(((Expr_mem_tmpContext)_localctx).e.ty); 
						setState(443);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(437);
							match(T__4);
							setState(438);
							((Expr_mem_tmpContext)_localctx).e2 = expr();
							 _localctx.types.add(((Expr_mem_tmpContext)_localctx).e2.ty); 
							}
							}
							setState(445);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(448);
					match(T__5);

					        if (_localctx.name != null) //call from expr_mem
					          ((Expr_mem_tmpContext)_localctx).ty =  root.findFunction(new Pair<String, Vector<Type> >(_localctx.name, _localctx.types), (((Expr_mem_tmpContext)_localctx).s!=null?((Expr_mem_tmpContext)_localctx).s.getLine():0));
					        else { //call from expr_mem_tmp
					          if (_localctx.inputType instanceof Ptf) {
					            if (((Ptf)_localctx.inputType).matchesInputType(_localctx.types))
					              ((Expr_mem_tmpContext)_localctx).ty =  ((Ptf)_localctx.inputType).getOutputType();
					            else
					              ((Expr_mem_tmpContext)_localctx).ty =  new InvalidType();
					          }
					        }
					        if (_localctx.ty instanceof InvalidType) {
					          isCorrect = false;
					        //  error("Function call is not valid.", (((Expr_mem_tmpContext)_localctx).num!=null?((Expr_mem_tmpContext)_localctx).num.getLine():0)); //TODO: better error message
					        }
					         print("operator: funcall");
					      
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(452);
				expr_mem_tmp(null, _localctx.ty);
				}
				break;
			case T__0:
			case T__4:
			case T__5:
			case T__8:
			case T__10:
			case T__13:
			case T__14:
			case T__16:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_otherContext extends ParserRuleContext {
		public Type retType;
		public String name;
		public Vector<Type> types;
		public Variable returnVar;
		public String string;
		public Vector<Variable> hey;
		public Token CONST_STR;
		public Token n;
		public ExprContext ex1;
		public ExprContext ex2;
		public ExprContext ex3;
		public TerminalNode CONST_NUM() { return getToken(xParser.CONST_NUM, 0); }
		public TerminalNode CONST_CHAR() { return getToken(xParser.CONST_CHAR, 0); }
		public TerminalNode CONST_STR() { return getToken(xParser.CONST_STR, 0); }
		public TerminalNode CONST_FUNC() { return getToken(xParser.CONST_FUNC, 0); }
		public TerminalNode ID() { return getToken(xParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterExpr_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitExpr_other(this);
		}
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_other);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			switch (_input.LA(1)) {
			case CONST_NUM:
				{
				setState(456);
				match(CONST_NUM);
				((Expr_otherContext)_localctx).retType =  new Primitive("int");
				}
				break;
			case CONST_CHAR:
				{
				setState(458);
				match(CONST_CHAR);
				((Expr_otherContext)_localctx).retType =  new Primitive("char");
				}
				break;
			case CONST_STR:
				{
				setState(460);
				((Expr_otherContext)_localctx).CONST_STR = match(CONST_STR);
				 ((Expr_otherContext)_localctx).string =  (((Expr_otherContext)_localctx).CONST_STR!=null?((Expr_otherContext)_localctx).CONST_STR.getText():null); ((Expr_otherContext)_localctx).types =  new Vector<Type>();
				        for (int i = 0; i < _localctx.string.length(); i++)
				          _localctx.types.add(new Primitive("char"));
				        ((Expr_otherContext)_localctx).retType =  new ListType(_localctx.types, null, "list");
				}
				break;
			case CONST_FUNC:
				{
				setState(462);
				match(CONST_FUNC);
				((Expr_otherContext)_localctx).retType =  null;
				}
				break;
			case ID:
				{
				setState(464);
				((Expr_otherContext)_localctx).n = match(ID);
				 ((Expr_otherContext)_localctx).name = (((Expr_otherContext)_localctx).n!=null?((Expr_otherContext)_localctx).n.getText():null);
				 if (currEnv.varExists(_localctx.name) == false) { //yani variable nist vali momkene function bashe
				        Function func = root.findByName(_localctx.name);  //agar functionesh bud bayad baresh gardunim ye ptf besazim baresh bardunim bala bad inaro check kone
				        ((Expr_otherContext)_localctx).retType =  new Ptf(func.getTypes(), func.getRetType());
				        ((Expr_otherContext)_localctx).hey =   new Vector<Variable> ();
				        _localctx.hey.add(new Variable(_localctx.name,new Ptf(func.getTypes(), func.getRetType()),0));
				        currEnv.addIfNotExistVar(_localctx.hey);
				        }
				        else { //the id exists
				          ((Expr_otherContext)_localctx).returnVar =  currEnv.getVar(_localctx.name);
				          ((Expr_otherContext)_localctx).retType =  _localctx.returnVar.getTypeObj();
				        }
				      
				}
				break;
			case T__9:
				{
				setState(467);
				match(T__9);
				setState(479);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__30) | (1L << T__32) | (1L << T__35) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << CONST_FUNC) | (1L << ID))) != 0)) {
					{
					setState(468);
					((Expr_otherContext)_localctx).ex1 = expr();
					((Expr_otherContext)_localctx).types =  new Vector<Type>(); _localctx.types.add(((Expr_otherContext)_localctx).ex1.ty);
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(470);
						match(T__4);
						setState(471);
						((Expr_otherContext)_localctx).ex2 = expr();
						_localctx.types.add(((Expr_otherContext)_localctx).ex2.ty);
						}
						}
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(481);
				match(T__10);

				      ListType lst;
				      lst = new ListType(_localctx.types.size(), _localctx.types, "list");
				      ((Expr_otherContext)_localctx).retType =  lst;
				    
				}
				break;
			case T__35:
				{
				setState(483);
				match(T__35);
				}
				break;
			case T__2:
				{
				setState(484);
				match(T__2);
				setState(485);
				((Expr_otherContext)_localctx).ex3 = expr();
				((Expr_otherContext)_localctx).retType =  ((Expr_otherContext)_localctx).ex3.ty;
				setState(487);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			print("other expressions");
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

	public static class While_stmContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterWhile_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitWhile_stm(this);
		}
	}

	public final While_stmContext while_stm() throws RecognitionException {
		While_stmContext _localctx = new While_stmContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_while_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__36);
			setState(494);
			match(T__2);
			setState(495);
			expr();
			setState(496);
			match(T__5);

			      handler.push(currEnv);
			      num++;
			      currEnv = new Env(handler.top(),num);
			    
			setState(498);
			statement();

			      print("while");
			      currEnv = handler.pop();
			    
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

	public static class Foreach_stmContext extends ParserRuleContext {
		public Vector<Variable> vars;
		public TypeContext t;
		public Token var;
		public ExprContext e;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(xParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Foreach_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterForeach_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitForeach_stm(this);
		}
	}

	public final Foreach_stmContext foreach_stm() throws RecognitionException {
		Foreach_stmContext _localctx = new Foreach_stmContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_foreach_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__37);
			setState(502);
			match(T__2);
			setState(503);
			((Foreach_stmContext)_localctx).t = type();
			setState(504);
			((Foreach_stmContext)_localctx).var = match(ID);
			setState(505);
			match(T__38);
			setState(506);
			((Foreach_stmContext)_localctx).e = expr();
			setState(507);
			match(T__5);

			      if (((Foreach_stmContext)_localctx).e.ty.getType().equals("list")) {
			        Type elementType = ((ListType)((Foreach_stmContext)_localctx).e.ty).oneType();
			        if (elementType != null && elementType.equals(((Foreach_stmContext)_localctx).t.ty)) {
			          ((Foreach_stmContext)_localctx).vars =  new Vector<Variable>();
			          _localctx.vars.add(new Variable((((Foreach_stmContext)_localctx).var!=null?((Foreach_stmContext)_localctx).var.getText():null), ((Foreach_stmContext)_localctx).t.ty, 0));
			          currEnv.addIfNotExistVar(_localctx.vars);
			        }
			        else {
			          isCorrect = false;
			          error("type of " + " ' "  + (((Foreach_stmContext)_localctx).var!=null?((Foreach_stmContext)_localctx).var.getText():null) +  " ' " + " does not match type of elements of this list " , (((Foreach_stmContext)_localctx).var!=null?((Foreach_stmContext)_localctx).var.getLine():0));
			        }
			      }
			      else {
			        isCorrect = false;
			        error("this type is not iteratable",(((Foreach_stmContext)_localctx).var!=null?((Foreach_stmContext)_localctx).var.getLine():0));
			      }
			      handler.push(currEnv);
			      num++;
			      currEnv = new Env(handler.top(),num);
			    
			setState(509);
			statement();

			       currEnv = handler.pop();
			       print("foreach");
			     
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

	public static class Return_stmContext extends ParserRuleContext {
		public Type tyReturn;
		public ExprContext e1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterReturn_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitReturn_stm(this);
		}
	}

	public final Return_stmContext return_stm() throws RecognitionException {
		Return_stmContext _localctx = new Return_stmContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_return_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(T__39);
			setState(516);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__30) | (1L << T__32) | (1L << T__35) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << CONST_FUNC) | (1L << ID))) != 0)) {
				{
				setState(513);
				((Return_stmContext)_localctx).e1 = expr();
				 ((Return_stmContext)_localctx).tyReturn =  ((Return_stmContext)_localctx).e1.ty; print("return");
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

	public static class Break_stmContext extends ParserRuleContext {
		public Break_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).enterBreak_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xListener ) ((xListener)listener).exitBreak_stm(this);
		}
	}

	public final Break_stmContext break_stm() throws RecognitionException {
		Break_stmContext _localctx = new Break_stmContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_break_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T__40);
			print("break");
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u020c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2S\n"+
		"\2\r\2\16\2T\3\2\3\2\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5g\n\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\7\5s\n\5\f"+
		"\5\16\5v\13\5\5\5x\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0083\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008b\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u0092"+
		"\n\6\f\6\16\6\u0095\13\6\5\6\u0097\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ab\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00b4\n\b\3\b\7\b\u00b7\n\b\f\b\16\b\u00ba\13\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c4\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00ce\n\t\3\t\3\t\3\t\3\t\7\t\u00d4\n\t\f\t\16\t\u00d7\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00ec\n\t\f\t\16\t\u00ef\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0102\n\t\3\n\3\n\3\n\3\n\7\n\u0108"+
		"\n\n\f\n\16\n\u010b\13\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0113\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0125"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u013b\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u014a\n\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0157\n\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0163\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u016f\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u017b\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u0187\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0193\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u019f\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01a8\n\35\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\7\37\u01bc\n\37\f\37\16\37\u01bf\13\37\5\37\u01c1\n\37\3"+
		"\37\3\37\5\37\u01c5\n\37\3\37\3\37\5\37\u01c9\n\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u01dd\n \f \16 \u01e0\13 \5 \u01e2"+
		"\n \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01ec\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0207\n#\3"+
		"$\3$\3$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDF\2\7\3\2\36\37\4\2\20\20\23\23\3\2 !\4\2\21\21\"\"\4\2!"+
		"!##\u0224\2R\3\2\2\2\4Z\3\2\2\2\6\\\3\2\2\2\b`\3\2\2\2\n|\3\2\2\2\f\u009f"+
		"\3\2\2\2\16\u00a3\3\2\2\2\20\u0101\3\2\2\2\22\u0103\3\2\2\2\24\u0112\3"+
		"\2\2\2\26\u0124\3\2\2\2\30\u013a\3\2\2\2\32\u0149\3\2\2\2\34\u014b\3\2"+
		"\2\2\36\u0156\3\2\2\2 \u0158\3\2\2\2\"\u0162\3\2\2\2$\u0164\3\2\2\2&\u016e"+
		"\3\2\2\2(\u0170\3\2\2\2*\u017a\3\2\2\2,\u017c\3\2\2\2.\u0186\3\2\2\2\60"+
		"\u0188\3\2\2\2\62\u0192\3\2\2\2\64\u0194\3\2\2\2\66\u019e\3\2\2\28\u01a7"+
		"\3\2\2\2:\u01a9\3\2\2\2<\u01c8\3\2\2\2>\u01eb\3\2\2\2@\u01ef\3\2\2\2B"+
		"\u01f7\3\2\2\2D\u0202\3\2\2\2F\u0208\3\2\2\2HI\5\4\3\2IJ\7\3\2\2JS\3\2"+
		"\2\2KL\5\16\b\2LM\7\3\2\2MS\3\2\2\2NS\5\n\6\2OP\5\f\7\2PQ\7\3\2\2QS\3"+
		"\2\2\2RH\3\2\2\2RK\3\2\2\2RN\3\2\2\2RO\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2UV\3\2\2\2VW\b\2\1\2W\3\3\2\2\2X[\5\b\5\2Y[\5\6\4\2ZX\3\2\2\2ZY"+
		"\3\2\2\2[\5\3\2\2\2\\]\7\4\2\2]^\7\60\2\2^_\b\4\1\2_\7\3\2\2\2`a\b\5\1"+
		"\2ab\5\20\t\2bc\7\60\2\2cw\7\5\2\2de\7\60\2\2eg\7\6\2\2fd\3\2\2\2fg\3"+
		"\2\2\2gh\3\2\2\2hi\5\20\t\2it\b\5\1\2jm\7\7\2\2kl\7\60\2\2ln\7\6\2\2m"+
		"k\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5\20\t\2pq\b\5\1\2qs\3\2\2\2rj\3\2\2\2"+
		"sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wf\3\2\2\2wx\3\2\2\2"+
		"xy\3\2\2\2yz\7\b\2\2z{\b\5\1\2{\t\3\2\2\2|}\b\6\1\2}~\5\20\t\2~\177\7"+
		"\60\2\2\177\u0096\7\5\2\2\u0080\u0082\b\6\1\2\u0081\u0083\7\t\2\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\60"+
		"\2\2\u0085\u0086\7\6\2\2\u0086\u0087\5\20\t\2\u0087\u0093\b\6\1\2\u0088"+
		"\u008a\7\7\2\2\u0089\u008b\7\t\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\60\2\2\u008d\u008e\7\6\2\2\u008e"+
		"\u008f\5\20\t\2\u008f\u0090\b\6\1\2\u0090\u0092\3\2\2\2\u0091\u0088\3"+
		"\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0080\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\b\2\2\u0099\u009a\b\6\1\2\u009a"+
		"\u009b\b\6\1\2\u009b\u009c\b\6\1\2\u009c\u009d\5\22\n\2\u009d\u009e\b"+
		"\6\1\2\u009e\13\3\2\2\2\u009f\u00a0\5\6\4\2\u00a0\u00a1\7\n\2\2\u00a1"+
		"\u00a2\5\20\t\2\u00a2\r\3\2\2\2\u00a3\u00a4\b\b\1\2\u00a4\u00a5\5\20\t"+
		"\2\u00a5\u00aa\7\60\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00a8\5\34\17\2\u00a8"+
		"\u00a9\b\b\1\2\u00a9\u00ab\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b8\b\b\1\2\u00ad\u00ae\7\7\2\2\u00ae"+
		"\u00b3\7\60\2\2\u00af\u00b0\7\13\2\2\u00b0\u00b1\5\34\17\2\u00b1\u00b2"+
		"\b\b\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\b\b\1\2\u00b6\u00ad\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\b\b\1\2\u00bc\17\3\2\2\2\u00bd\u0102\7\60\2"+
		"\2\u00be\u00bf\b\t\1\2\u00bf\u00c3\7\f\2\2\u00c0\u00c1\7\60\2\2\u00c1"+
		"\u00c2\7\6\2\2\u00c2\u00c4\b\t\1\2\u00c3\u00c0\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\t\1\2\u00c6\u00c7\5\20\t\2\u00c7"+
		"\u00d5\b\t\1\2\u00c8\u00c9\b\t\1\2\u00c9\u00cd\7\7\2\2\u00ca\u00cb\7\60"+
		"\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00ce\b\t\1\2\u00cd\u00ca\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\t\1\2\u00d0\u00d1\5\20"+
		"\t\2\u00d1\u00d2\b\t\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00c8\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00da\b\t\1\2\u00da"+
		"\u0102\3\2\2\2\u00db\u00dc\7\16\2\2\u00dc\u00dd\7\5\2\2\u00dd\u00de\7"+
		",\2\2\u00de\u00df\7\b\2\2\u00df\u00e0\7\17\2\2\u00e0\u00e1\5\20\t\2\u00e1"+
		"\u00e2\b\t\1\2\u00e2\u0102\3\2\2\2\u00e3\u00e4\b\t\1\2\u00e4\u00e5\7\20"+
		"\2\2\u00e5\u00e6\5\20\t\2\u00e6\u00ed\b\t\1\2\u00e7\u00e8\7\21\2\2\u00e8"+
		"\u00e9\5\20\t\2\u00e9\u00ea\b\t\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00e7\3"+
		"\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\22\2\2\u00f1\u00f2\5"+
		"\20\t\2\u00f2\u00f3\b\t\1\2\u00f3\u00f4\7\23\2\2\u00f4\u00f5\b\t\1\2\u00f5"+
		"\u0102\3\2\2\2\u00f6\u00f7\7\24\2\2\u00f7\u00f8\7\5\2\2\u00f8\u00f9\7"+
		",\2\2\u00f9\u00fa\7\b\2\2\u00fa\u0102\b\t\1\2\u00fb\u00fc\7\25\2\2\u00fc"+
		"\u0102\b\t\1\2\u00fd\u00fe\7\26\2\2\u00fe\u0102\b\t\1\2\u00ff\u0100\7"+
		"\27\2\2\u0100\u0102\b\t\1\2\u0101\u00bd\3\2\2\2\u0101\u00be\3\2\2\2\u0101"+
		"\u00db\3\2\2\2\u0101\u00e3\3\2\2\2\u0101\u00f6\3\2\2\2\u0101\u00fb\3\2"+
		"\2\2\u0101\u00fd\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\21\3\2\2\2\u0103\u0109"+
		"\7\30\2\2\u0104\u0105\5\24\13\2\u0105\u0106\b\n\1\2\u0106\u0108\3\2\2"+
		"\2\u0107\u0104\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\31\2\2"+
		"\u010d\23\3\2\2\2\u010e\u0113\5\30\r\2\u010f\u0110\5\26\f\2\u0110\u0111"+
		"\b\13\1\2\u0111\u0113\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2"+
		"\u0113\25\3\2\2\2\u0114\u0115\5\16\b\2\u0115\u0116\7\3\2\2\u0116\u0125"+
		"\3\2\2\2\u0117\u0118\5\34\17\2\u0118\u0119\7\3\2\2\u0119\u0125\3\2\2\2"+
		"\u011a\u0125\5@!\2\u011b\u0125\5B\"\2\u011c\u011d\5D#\2\u011d\u011e\7"+
		"\3\2\2\u011e\u011f\b\f\1\2\u011f\u0125\3\2\2\2\u0120\u0121\5F$\2\u0121"+
		"\u0122\7\3\2\2\u0122\u0125\3\2\2\2\u0123\u0125\5\22\n\2\u0124\u0114\3"+
		"\2\2\2\u0124\u0117\3\2\2\2\u0124\u011a\3\2\2\2\u0124\u011b\3\2\2\2\u0124"+
		"\u011c\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0123\3\2\2\2\u0125\27\3\2\2"+
		"\2\u0126\u0127\7\32\2\2\u0127\u0128\7\5\2\2\u0128\u0129\5\34\17\2\u0129"+
		"\u012a\7\b\2\2\u012a\u012b\b\r\1\2\u012b\u012c\5\24\13\2\u012c\u012d\b"+
		"\r\1\2\u012d\u013b\3\2\2\2\u012e\u012f\7\32\2\2\u012f\u0130\7\5\2\2\u0130"+
		"\u0131\5\34\17\2\u0131\u0132\7\b\2\2\u0132\u0133\b\r\1\2\u0133\u0134\5"+
		"\32\16\2\u0134\u0135\b\r\1\2\u0135\u0136\7\33\2\2\u0136\u0137\b\r\1\2"+
		"\u0137\u0138\5\24\13\2\u0138\u0139\b\r\1\2\u0139\u013b\3\2\2\2\u013a\u0126"+
		"\3\2\2\2\u013a\u012e\3\2\2\2\u013b\31\3\2\2\2\u013c\u013d\7\32\2\2\u013d"+
		"\u013e\7\5\2\2\u013e\u013f\5\34\17\2\u013f\u0140\7\b\2\2\u0140\u0141\b"+
		"\16\1\2\u0141\u0142\5\32\16\2\u0142\u0143\b\16\1\2\u0143\u0144\7\33\2"+
		"\2\u0144\u0145\b\16\1\2\u0145\u0146\5\32\16\2\u0146\u0147\b\16\1\2\u0147"+
		"\u014a\3\2\2\2\u0148\u014a\5\26\f\2\u0149\u013c\3\2\2\2\u0149\u0148\3"+
		"\2\2\2\u014a\33\3\2\2\2\u014b\u014c\5\36\20\2\u014c\u014d\b\17\1\2\u014d"+
		"\35\3\2\2\2\u014e\u014f\5 \21\2\u014f\u0150\7\13\2\2\u0150\u0151\5\36"+
		"\20\2\u0151\u0152\b\20\1\2\u0152\u0157\3\2\2\2\u0153\u0154\5 \21\2\u0154"+
		"\u0155\b\20\1\2\u0155\u0157\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u0153\3"+
		"\2\2\2\u0157\37\3\2\2\2\u0158\u0159\5$\23\2\u0159\u015a\5\"\22\2\u015a"+
		"\u015b\b\21\1\2\u015b!\3\2\2\2\u015c\u015d\7\34\2\2\u015d\u015e\5$\23"+
		"\2\u015e\u015f\5\"\22\2\u015f\u0160\b\22\1\2\u0160\u0163\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u0161\3\2\2\2\u0163#\3\2\2\2"+
		"\u0164\u0165\5(\25\2\u0165\u0166\5&\24\2\u0166\u0167\b\23\1\2\u0167%\3"+
		"\2\2\2\u0168\u0169\7\35\2\2\u0169\u016a\5(\25\2\u016a\u016b\5&\24\2\u016b"+
		"\u016c\b\24\1\2\u016c\u016f\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0168\3"+
		"\2\2\2\u016e\u016d\3\2\2\2\u016f\'\3\2\2\2\u0170\u0171\5,\27\2\u0171\u0172"+
		"\5*\26\2\u0172\u0173\b\25\1\2\u0173)\3\2\2\2\u0174\u0175\t\2\2\2\u0175"+
		"\u0176\5,\27\2\u0176\u0177\5*\26\2\u0177\u0178\b\26\1\2\u0178\u017b\3"+
		"\2\2\2\u0179\u017b\3\2\2\2\u017a\u0174\3\2\2\2\u017a\u0179\3\2\2\2\u017b"+
		"+\3\2\2\2\u017c\u017d\5\60\31\2\u017d\u017e\5.\30\2\u017e\u017f\b\27\1"+
		"\2\u017f-\3\2\2\2\u0180\u0181\t\3\2\2\u0181\u0182\5\60\31\2\u0182\u0183"+
		"\5.\30\2\u0183\u0184\b\30\1\2\u0184\u0187\3\2\2\2\u0185\u0187\3\2\2\2"+
		"\u0186\u0180\3\2\2\2\u0186\u0185\3\2\2\2\u0187/\3\2\2\2\u0188\u0189\5"+
		"\64\33\2\u0189\u018a\5\62\32\2\u018a\u018b\b\31\1\2\u018b\61\3\2\2\2\u018c"+
		"\u018d\t\4\2\2\u018d\u018e\5\64\33\2\u018e\u018f\5\62\32\2\u018f\u0190"+
		"\b\32\1\2\u0190\u0193\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u018c\3\2\2\2"+
		"\u0192\u0191\3\2\2\2\u0193\63\3\2\2\2\u0194\u0195\58\35\2\u0195\u0196"+
		"\5\66\34\2\u0196\u0197\b\33\1\2\u0197\65\3\2\2\2\u0198\u0199\t\5\2\2\u0199"+
		"\u019a\58\35\2\u019a\u019b\5\66\34\2\u019b\u019c\b\34\1\2\u019c\u019f"+
		"\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u0198\3\2\2\2\u019e\u019d\3\2\2\2\u019f"+
		"\67\3\2\2\2\u01a0\u01a1\t\6\2\2\u01a1\u01a2\58\35\2\u01a2\u01a3\b\35\1"+
		"\2\u01a3\u01a8\3\2\2\2\u01a4\u01a5\5:\36\2\u01a5\u01a6\b\35\1\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a0\3\2\2\2\u01a7\u01a4\3\2\2\2\u01a89\3\2\2\2"+
		"\u01a9\u01aa\5> \2\u01aa\u01ab\5<\37\2\u01ab\u01ac\b\36\1\2\u01ac;\3\2"+
		"\2\2\u01ad\u01c4\b\37\1\2\u01ae\u01af\7$\2\2\u01af\u01b0\7,\2\2\u01b0"+
		"\u01c5\b\37\1\2\u01b1\u01b2\7%\2\2\u01b2\u01b3\7\60\2\2\u01b3\u01c5\b"+
		"\37\1\2\u01b4\u01c0\7\5\2\2\u01b5\u01b6\5\34\17\2\u01b6\u01bd\b\37\1\2"+
		"\u01b7\u01b8\7\7\2\2\u01b8\u01b9\5\34\17\2\u01b9\u01ba\b\37\1\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0"+
		"\u01b5\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7\b"+
		"\2\2\u01c3\u01c5\b\37\1\2\u01c4\u01ae\3\2\2\2\u01c4\u01b1\3\2\2\2\u01c4"+
		"\u01b4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c9\5<\37\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01ad\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9=\3\2\2\2\u01ca\u01cb"+
		"\7,\2\2\u01cb\u01ec\b \1\2\u01cc\u01cd\7-\2\2\u01cd\u01ec\b \1\2\u01ce"+
		"\u01cf\7.\2\2\u01cf\u01ec\b \1\2\u01d0\u01d1\7/\2\2\u01d1\u01ec\b \1\2"+
		"\u01d2\u01d3\7\60\2\2\u01d3\u01d4\b \1\2\u01d4\u01ec\b \1\2\u01d5\u01e1"+
		"\7\f\2\2\u01d6\u01d7\5\34\17\2\u01d7\u01de\b \1\2\u01d8\u01d9\7\7\2\2"+
		"\u01d9\u01da\5\34\17\2\u01da\u01db\b \1\2\u01db\u01dd\3\2\2\2\u01dc\u01d8"+
		"\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01d6\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7\r\2\2\u01e4\u01ec\b \1\2\u01e5"+
		"\u01ec\7&\2\2\u01e6\u01e7\7\5\2\2\u01e7\u01e8\5\34\17\2\u01e8\u01e9\b"+
		" \1\2\u01e9\u01ea\7\b\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01ca\3\2\2\2\u01eb"+
		"\u01cc\3\2\2\2\u01eb\u01ce\3\2\2\2\u01eb\u01d0\3\2\2\2\u01eb\u01d2\3\2"+
		"\2\2\u01eb\u01d5\3\2\2\2\u01eb\u01e5\3\2\2\2\u01eb\u01e6\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ee\b \1\2\u01ee?\3\2\2\2\u01ef\u01f0\7\'\2\2\u01f0"+
		"\u01f1\7\5\2\2\u01f1\u01f2\5\34\17\2\u01f2\u01f3\7\b\2\2\u01f3\u01f4\b"+
		"!\1\2\u01f4\u01f5\5\24\13\2\u01f5\u01f6\b!\1\2\u01f6A\3\2\2\2\u01f7\u01f8"+
		"\7(\2\2\u01f8\u01f9\7\5\2\2\u01f9\u01fa\5\20\t\2\u01fa\u01fb\7\60\2\2"+
		"\u01fb\u01fc\7)\2\2\u01fc\u01fd\5\34\17\2\u01fd\u01fe\7\b\2\2\u01fe\u01ff"+
		"\b\"\1\2\u01ff\u0200\5\24\13\2\u0200\u0201\b\"\1\2\u0201C\3\2\2\2\u0202"+
		"\u0206\7*\2\2\u0203\u0204\5\34\17\2\u0204\u0205\b#\1\2\u0205\u0207\3\2"+
		"\2\2\u0206\u0203\3\2\2\2\u0206\u0207\3\2\2\2\u0207E\3\2\2\2\u0208\u0209"+
		"\7+\2\2\u0209\u020a\b$\1\2\u020aG\3\2\2\2*RTZfmtw\u0082\u008a\u0093\u0096"+
		"\u00aa\u00b3\u00b8\u00c3\u00cd\u00d5\u00ed\u0101\u0109\u0112\u0124\u013a"+
		"\u0149\u0156\u0162\u016e\u017a\u0186\u0192\u019e\u01a7\u01bd\u01c0\u01c4"+
		"\u01c8\u01de\u01e1\u01eb\u0206";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}