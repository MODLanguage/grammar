// Generated from /Users/tonywalmsley/work/num/grammar/antlr4/MODLParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MODLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NULL=2, TRUE=3, FALSE=4, COLON=5, EQUALS=6, STRUCT_SEP=7, ARR_SEP=8, 
		LBRAC=9, RBRAC=10, LSBRAC=11, RSBRAC=12, NUMBER=13, COMMENT=14, QUOTED=15, 
		STRING=16, HASH_PREFIX=17;
	public static final int
		RULE_modl = 0, RULE_modl_structure = 1, RULE_modl_map = 2, RULE_modl_array = 3, 
		RULE_modl_nb_array = 4, RULE_modl_pair = 5, RULE_modl_value_item = 6, 
		RULE_modl_value = 7, RULE_modl_array_value_item = 8, RULE_modl_primitive = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"modl", "modl_structure", "modl_map", "modl_array", "modl_nb_array", 
			"modl_pair", "modl_value_item", "modl_value", "modl_array_value_item", 
			"modl_primitive"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "':'", "'='", "';'", "','", "'('", "')'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NULL", "TRUE", "FALSE", "COLON", "EQUALS", "STRUCT_SEP", 
			"ARR_SEP", "LBRAC", "RBRAC", "LSBRAC", "RSBRAC", "NUMBER", "COMMENT", 
			"QUOTED", "STRING", "HASH_PREFIX"
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
	public String getGrammarFileName() { return "MODLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MODLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MODLParser.EOF, 0); }
		public List<Modl_structureContext> modl_structure() {
			return getRuleContexts(Modl_structureContext.class);
		}
		public Modl_structureContext modl_structure(int i) {
			return getRuleContext(Modl_structureContext.class,i);
		}
		public List<TerminalNode> STRUCT_SEP() { return getTokens(MODLParser.STRUCT_SEP); }
		public TerminalNode STRUCT_SEP(int i) {
			return getToken(MODLParser.STRUCT_SEP, i);
		}
		public ModlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modl; }
	}

	public final ModlContext modl() throws RecognitionException {
		ModlContext _localctx = new ModlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_modl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRAC) | (1L << LSBRAC) | (1L << QUOTED) | (1L << STRING))) != 0)) {
					{
					setState(20);
					modl_structure();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(23);
				modl_structure();
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(24);
						match(STRUCT_SEP);
						setState(25);
						modl_structure();
						}
						} 
					}
					setState(30);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRUCT_SEP) {
					{
					setState(31);
					match(STRUCT_SEP);
					}
				}

				}
				break;
			}
			setState(36);
			match(EOF);
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

	public static class Modl_structureContext extends ParserRuleContext {
		public Modl_mapContext modl_map() {
			return getRuleContext(Modl_mapContext.class,0);
		}
		public Modl_arrayContext modl_array() {
			return getRuleContext(Modl_arrayContext.class,0);
		}
		public Modl_pairContext modl_pair() {
			return getRuleContext(Modl_pairContext.class,0);
		}
		public Modl_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modl_structure; }
	}

	public final Modl_structureContext modl_structure() throws RecognitionException {
		Modl_structureContext _localctx = new Modl_structureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modl_structure);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRAC:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				modl_map();
				}
				break;
			case LSBRAC:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				modl_array();
				}
				break;
			case QUOTED:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				modl_pair();
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

	public static class Modl_mapContext extends ParserRuleContext {
		public TerminalNode LBRAC() { return getToken(MODLParser.LBRAC, 0); }
		public TerminalNode RBRAC() { return getToken(MODLParser.RBRAC, 0); }
		public List<Modl_pairContext> modl_pair() {
			return getRuleContexts(Modl_pairContext.class);
		}
		public Modl_pairContext modl_pair(int i) {
			return getRuleContext(Modl_pairContext.class,i);
		}
		public List<TerminalNode> STRUCT_SEP() { return getTokens(MODLParser.STRUCT_SEP); }
		public TerminalNode STRUCT_SEP(int i) {
			return getToken(MODLParser.STRUCT_SEP, i);
		}
		public Modl_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modl_map; }
	}

	public final Modl_mapContext modl_map() throws RecognitionException {
		Modl_mapContext _localctx = new Modl_mapContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modl_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(LBRAC);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUOTED || _la==STRING) {
				{
				setState(44);
				modl_pair();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRUCT_SEP) {
					{
					{
					setState(45);
					match(STRUCT_SEP);
					setState(46);
					modl_pair();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(54);
			match(RBRAC);
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

	public static class Modl_arrayContext extends ParserRuleContext {
		public TerminalNode LSBRAC() { return getToken(MODLParser.LSBRAC, 0); }
		public TerminalNode RSBRAC() { return getToken(MODLParser.RSBRAC, 0); }
		public List<Modl_array_value_itemContext> modl_array_value_item() {
			return getRuleContexts(Modl_array_value_itemContext.class);
		}
		public Modl_array_value_itemContext modl_array_value_item(int i) {
			return getRuleContext(Modl_array_value_itemContext.class,i);
		}
		public List<Modl_nb_arrayContext> modl_nb_array() {
			return getRuleContexts(Modl_nb_arrayContext.class);
		}
		public Modl_nb_arrayContext modl_nb_array(int i) {
			return getRuleContext(Modl_nb_arrayContext.class,i);
		}
		public List<TerminalNode> STRUCT_SEP() { return getTokens(MODLParser.STRUCT_SEP); }
		public TerminalNode STRUCT_SEP(int i) {
			return getToken(MODLParser.STRUCT_SEP, i);
		}
		public Modl_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modl_array; }
	}

	public final Modl_arrayContext modl_array() throws RecognitionException {
		Modl_arrayContext _localctx = new Modl_arrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modl_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(LSBRAC);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << LBRAC) | (1L << LSBRAC) | (1L << NUMBER) | (1L << QUOTED) | (1L << STRING))) != 0)) {
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(57);
					modl_array_value_item();
					}
					break;
				case 2:
					{
					setState(58);
					modl_nb_array();
					}
					break;
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRUCT_SEP) {
					{
					{
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(61);
						match(STRUCT_SEP);
						}
						}
						setState(64); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==STRUCT_SEP );
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(66);
						modl_array_value_item();
						}
						break;
					case 2:
						{
						setState(67);
						modl_nb_array();
						}
						break;
					}
					setState(73);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(70);
							match(STRUCT_SEP);
							}
							} 
						}
						setState(75);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(83);
			match(RSBRAC);
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

	public static class Modl_nb_arrayContext extends ParserRuleContext {
		public List<Modl_array_value_itemContext> modl_array_value_item() {
			return getRuleContexts(Modl_array_value_itemContext.class);
		}
		public Modl_array_value_itemContext modl_array_value_item(int i) {
			return getRuleContext(Modl_array_value_itemContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(MODLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MODLParser.COLON, i);
		}
		public Modl_nb_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modl_nb_array; }
	}

	public final Modl_nb_arrayContext modl_nb_array() throws RecognitionException {
		Modl_nb_arrayContext _localctx = new Modl_nb_arrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modl_nb_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(85);
					modl_array_value_item();
					setState(87); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(86);
							match(COLON);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(89); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					modl_array_value_item();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(101);
				match(COLON);
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

	public static class Modl_pairContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(MODLParser.EQUALS, 0); }
		public Modl_value_itemContext modl_value_item() {
			return getRuleContext(Modl_value_itemContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MODLParser.STRING, 0); }
		public TerminalNode QUOTED() { return getToken(MODLParser.QUOTED, 0); }
		public Modl_mapContext modl_map() {
			return getRuleContext(Modl_mapContext.class,0);
		}
		public Modl_arrayContext modl_array() {
			return getRuleContext(Modl_arrayContext.class,0);
		}
		public Modl_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modl_pair; }
	}

	public final Modl_pairContext modl_pair() throws RecognitionException {
		Modl_pairContext _localctx = new Modl_pairContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modl_pair);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				_la = _input.LA(1);
				if ( !(_la==QUOTED || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(105);
				match(EQUALS);
				setState(106);
				modl_value_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(STRING);
				setState(108);
				modl_map();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(STRING);
				setState(110);
				modl_array();
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

	public static class Modl_value_itemContext extends ParserRuleContext {
		public Modl_valueContext modl_value() {
			return getRuleContext(Modl_valueContext.class,0);
		}
		public Modl_value_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modl_value_item; }
	}

	public final Modl_value_itemContext modl_value_item() throws RecognitionException {
		Modl_value_itemContext _localctx = new Modl_value_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_modl_value_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			modl_value();
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

	public static class Modl_valueContext extends ParserRuleContext {
		public Modl_mapContext modl_map() {
			return getRuleContext(Modl_mapContext.class,0);
		}
		public Modl_arrayContext modl_array() {
			return getRuleContext(Modl_arrayContext.class,0);
		}
		public Modl_nb_arrayContext modl_nb_array() {
			return getRuleContext(Modl_nb_arrayContext.class,0);
		}
		public Modl_pairContext modl_pair() {
			return getRuleContext(Modl_pairContext.class,0);
		}
		public Modl_primitiveContext modl_primitive() {
			return getRuleContext(Modl_primitiveContext.class,0);
		}
		public Modl_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modl_value; }
	}

	public final Modl_valueContext modl_value() throws RecognitionException {
		Modl_valueContext _localctx = new Modl_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modl_value);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				modl_map();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				modl_array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				modl_nb_array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				modl_pair();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				modl_primitive();
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

	public static class Modl_array_value_itemContext extends ParserRuleContext {
		public Modl_mapContext modl_map() {
			return getRuleContext(Modl_mapContext.class,0);
		}
		public Modl_pairContext modl_pair() {
			return getRuleContext(Modl_pairContext.class,0);
		}
		public Modl_arrayContext modl_array() {
			return getRuleContext(Modl_arrayContext.class,0);
		}
		public Modl_primitiveContext modl_primitive() {
			return getRuleContext(Modl_primitiveContext.class,0);
		}
		public Modl_array_value_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modl_array_value_item; }
	}

	public final Modl_array_value_itemContext modl_array_value_item() throws RecognitionException {
		Modl_array_value_itemContext _localctx = new Modl_array_value_itemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_modl_array_value_item);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				modl_map();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				modl_pair();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				modl_array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				modl_primitive();
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

	public static class Modl_primitiveContext extends ParserRuleContext {
		public TerminalNode QUOTED() { return getToken(MODLParser.QUOTED, 0); }
		public TerminalNode NUMBER() { return getToken(MODLParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(MODLParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(MODLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MODLParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(MODLParser.NULL, 0); }
		public Modl_primitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modl_primitive; }
	}

	public final Modl_primitiveContext modl_primitive() throws RecognitionException {
		Modl_primitiveContext _localctx = new Modl_primitiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modl_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << QUOTED) | (1L << STRING))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\5\2\30\n\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\5\2#\n"+
		"\2\5\2%\n\2\3\2\3\2\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\7\4\62\n\4\f"+
		"\4\16\4\65\13\4\5\4\67\n\4\3\4\3\4\3\5\3\5\3\5\5\5>\n\5\3\5\6\5A\n\5\r"+
		"\5\16\5B\3\5\3\5\5\5G\n\5\3\5\7\5J\n\5\f\5\16\5M\13\5\7\5O\n\5\f\5\16"+
		"\5R\13\5\5\5T\n\5\3\5\3\5\3\6\3\6\6\6Z\n\6\r\6\16\6[\6\6^\n\6\r\6\16\6"+
		"_\3\6\7\6c\n\6\f\6\16\6f\13\6\3\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7r\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\5\n\u0081"+
		"\n\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\21\22\5\2\4"+
		"\6\17\17\21\22\2\u0095\2$\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\b:\3\2\2\2\n]"+
		"\3\2\2\2\fq\3\2\2\2\16s\3\2\2\2\20z\3\2\2\2\22\u0080\3\2\2\2\24\u0082"+
		"\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\27\30\3\2\2\2\30%\3\2\2\2\31\36\5"+
		"\4\3\2\32\33\7\t\2\2\33\35\5\4\3\2\34\32\3\2\2\2\35 \3\2\2\2\36\34\3\2"+
		"\2\2\36\37\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2!#\7\t\2\2\"!\3\2\2\2\"#\3"+
		"\2\2\2#%\3\2\2\2$\27\3\2\2\2$\31\3\2\2\2%&\3\2\2\2&\'\7\2\2\3\'\3\3\2"+
		"\2\2(,\5\6\4\2),\5\b\5\2*,\5\f\7\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3"+
		"\2\2\2-\66\7\13\2\2.\63\5\f\7\2/\60\7\t\2\2\60\62\5\f\7\2\61/\3\2\2\2"+
		"\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2"+
		"\66.\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\f\2\29\7\3\2\2\2:S\7\r\2\2"+
		";>\5\22\n\2<>\5\n\6\2=;\3\2\2\2=<\3\2\2\2>P\3\2\2\2?A\7\t\2\2@?\3\2\2"+
		"\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DG\5\22\n\2EG\5\n\6\2FD\3\2"+
		"\2\2FE\3\2\2\2GK\3\2\2\2HJ\7\t\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2LO\3\2\2\2MK\3\2\2\2N@\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2S=\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\16\2\2V\t\3\2\2\2WY\5"+
		"\22\n\2XZ\7\7\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2"+
		"]W\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`d\3\2\2\2ac\5\22\n\2ba\3\2\2"+
		"\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eh\3\2\2\2fd\3\2\2\2gi\7\7\2\2hg\3\2\2"+
		"\2hi\3\2\2\2i\13\3\2\2\2jk\t\2\2\2kl\7\b\2\2lr\5\16\b\2mn\7\22\2\2nr\5"+
		"\6\4\2op\7\22\2\2pr\5\b\5\2qj\3\2\2\2qm\3\2\2\2qo\3\2\2\2r\r\3\2\2\2s"+
		"t\5\20\t\2t\17\3\2\2\2u{\5\6\4\2v{\5\b\5\2w{\5\n\6\2x{\5\f\7\2y{\5\24"+
		"\13\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\21\3\2\2\2|\u0081"+
		"\5\6\4\2}\u0081\5\f\7\2~\u0081\5\b\5\2\177\u0081\5\24\13\2\u0080|\3\2"+
		"\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\23\3\2\2\2"+
		"\u0082\u0083\t\3\2\2\u0083\25\3\2\2\2\26\27\36\"$+\63\66=BFKPS[_dhqz\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}