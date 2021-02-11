// Generated from /Users/tonywalmsley/work/num/grammar/antlr4/MODLParser.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var MODLParserListener = require('./MODLParserListener').MODLParserListener;
var MODLParserVisitor = require('./MODLParserVisitor').MODLParserVisitor;

var grammarFileName = "MODLParser.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\u0011\\\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0003\u0002\u0005\u0002\u0012\n\u0002\u0003\u0002\u0003\u0002",
    "\u0003\u0002\u0007\u0002\u0017\n\u0002\f\u0002\u000e\u0002\u001a\u000b",
    "\u0002\u0003\u0002\u0005\u0002\u001d\n\u0002\u0005\u0002\u001f\n\u0002",
    "\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0005\u0003\'\n\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004",
    "\u0007\u0004-\n\u0004\f\u0004\u000e\u00040\u000b\u0004\u0005\u00042",
    "\n\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005",
    "\u0006\u00059\n\u0005\r\u0005\u000e\u0005:\u0003\u0005\u0003\u0005\u0007",
    "\u0005?\n\u0005\f\u0005\u000e\u0005B\u000b\u0005\u0007\u0005D\n\u0005",
    "\f\u0005\u000e\u0005G\u000b\u0005\u0005\u0005I\n\u0005\u0003\u0005\u0003",
    "\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005",
    "\u0006R\n\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005",
    "\u0007X\n\u0007\u0003\b\u0003\b\u0003\b\u0002\u0002\t\u0002\u0004\u0006",
    "\b\n\f\u000e\u0002\u0004\u0003\u0002\u000f\u0010\u0004\u0002\u0004\u0006",
    "\u000e\u0010\u0002f\u0002\u001e\u0003\u0002\u0002\u0002\u0004&\u0003",
    "\u0002\u0002\u0002\u0006(\u0003\u0002\u0002\u0002\b5\u0003\u0002\u0002",
    "\u0002\nL\u0003\u0002\u0002\u0002\fW\u0003\u0002\u0002\u0002\u000eY",
    "\u0003\u0002\u0002\u0002\u0010\u0012\u0005\u0004\u0003\u0002\u0011\u0010",
    "\u0003\u0002\u0002\u0002\u0011\u0012\u0003\u0002\u0002\u0002\u0012\u001f",
    "\u0003\u0002\u0002\u0002\u0013\u0018\u0005\u0004\u0003\u0002\u0014\u0015",
    "\u0007\b\u0002\u0002\u0015\u0017\u0005\u0004\u0003\u0002\u0016\u0014",
    "\u0003\u0002\u0002\u0002\u0017\u001a\u0003\u0002\u0002\u0002\u0018\u0016",
    "\u0003\u0002\u0002\u0002\u0018\u0019\u0003\u0002\u0002\u0002\u0019\u001c",
    "\u0003\u0002\u0002\u0002\u001a\u0018\u0003\u0002\u0002\u0002\u001b\u001d",
    "\u0007\b\u0002\u0002\u001c\u001b\u0003\u0002\u0002\u0002\u001c\u001d",
    "\u0003\u0002\u0002\u0002\u001d\u001f\u0003\u0002\u0002\u0002\u001e\u0011",
    "\u0003\u0002\u0002\u0002\u001e\u0013\u0003\u0002\u0002\u0002\u001f ",
    "\u0003\u0002\u0002\u0002 !\u0007\u0002\u0002\u0003!\u0003\u0003\u0002",
    "\u0002\u0002\"\'\u0005\u0006\u0004\u0002#\'\u0005\b\u0005\u0002$\'\u0005",
    "\n\u0006\u0002%\'\u0005\u000e\b\u0002&\"\u0003\u0002\u0002\u0002&#\u0003",
    "\u0002\u0002\u0002&$\u0003\u0002\u0002\u0002&%\u0003\u0002\u0002\u0002",
    "\'\u0005\u0003\u0002\u0002\u0002(1\u0007\n\u0002\u0002).\u0005\n\u0006",
    "\u0002*+\u0007\b\u0002\u0002+-\u0005\n\u0006\u0002,*\u0003\u0002\u0002",
    "\u0002-0\u0003\u0002\u0002\u0002.,\u0003\u0002\u0002\u0002./\u0003\u0002",
    "\u0002\u0002/2\u0003\u0002\u0002\u00020.\u0003\u0002\u0002\u00021)\u0003",
    "\u0002\u0002\u000212\u0003\u0002\u0002\u000223\u0003\u0002\u0002\u0002",
    "34\u0007\u000b\u0002\u00024\u0007\u0003\u0002\u0002\u00025H\u0007\f",
    "\u0002\u00026E\u0005\f\u0007\u000279\u0007\b\u0002\u000287\u0003\u0002",
    "\u0002\u00029:\u0003\u0002\u0002\u0002:8\u0003\u0002\u0002\u0002:;\u0003",
    "\u0002\u0002\u0002;<\u0003\u0002\u0002\u0002<@\u0005\f\u0007\u0002=",
    "?\u0007\b\u0002\u0002>=\u0003\u0002\u0002\u0002?B\u0003\u0002\u0002",
    "\u0002@>\u0003\u0002\u0002\u0002@A\u0003\u0002\u0002\u0002AD\u0003\u0002",
    "\u0002\u0002B@\u0003\u0002\u0002\u0002C8\u0003\u0002\u0002\u0002DG\u0003",
    "\u0002\u0002\u0002EC\u0003\u0002\u0002\u0002EF\u0003\u0002\u0002\u0002",
    "FI\u0003\u0002\u0002\u0002GE\u0003\u0002\u0002\u0002H6\u0003\u0002\u0002",
    "\u0002HI\u0003\u0002\u0002\u0002IJ\u0003\u0002\u0002\u0002JK\u0007\r",
    "\u0002\u0002K\t\u0003\u0002\u0002\u0002LM\t\u0002\u0002\u0002MQ\u0007",
    "\u0007\u0002\u0002NR\u0005\f\u0007\u0002OR\u0005\u0006\u0004\u0002P",
    "R\u0005\b\u0005\u0002QN\u0003\u0002\u0002\u0002QO\u0003\u0002\u0002",
    "\u0002QP\u0003\u0002\u0002\u0002R\u000b\u0003\u0002\u0002\u0002SX\u0005",
    "\u0006\u0004\u0002TX\u0005\b\u0005\u0002UX\u0005\n\u0006\u0002VX\u0005",
    "\u000e\b\u0002WS\u0003\u0002\u0002\u0002WT\u0003\u0002\u0002\u0002W",
    "U\u0003\u0002\u0002\u0002WV\u0003\u0002\u0002\u0002X\r\u0003\u0002\u0002",
    "\u0002YZ\t\u0003\u0002\u0002Z\u000f\u0003\u0002\u0002\u0002\u000f\u0011",
    "\u0018\u001c\u001e&.1:@EHQW"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, null, "'null'", "'true'", "'false'", "'='", "';'", 
                     "','", "'{'", "'}'", "'['", "']'" ];

var symbolicNames = [ null, "WS", "NULL", "TRUE", "FALSE", "EQUALS", "STRUCT_SEP", 
                      "ARR_SEP", "LBRAC", "RBRAC", "LSBRAC", "RSBRAC", "NUMBER", 
                      "QUOTED", "STRING", "HASH_PREFIX" ];

var ruleNames =  [ "modl", "modl_structure", "modl_map", "modl_array", "modl_pair", 
                   "modl_value", "modl_primitive" ];

function MODLParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

MODLParser.prototype = Object.create(antlr4.Parser.prototype);
MODLParser.prototype.constructor = MODLParser;

Object.defineProperty(MODLParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

MODLParser.EOF = antlr4.Token.EOF;
MODLParser.WS = 1;
MODLParser.NULL = 2;
MODLParser.TRUE = 3;
MODLParser.FALSE = 4;
MODLParser.EQUALS = 5;
MODLParser.STRUCT_SEP = 6;
MODLParser.ARR_SEP = 7;
MODLParser.LBRAC = 8;
MODLParser.RBRAC = 9;
MODLParser.LSBRAC = 10;
MODLParser.RSBRAC = 11;
MODLParser.NUMBER = 12;
MODLParser.QUOTED = 13;
MODLParser.STRING = 14;
MODLParser.HASH_PREFIX = 15;

MODLParser.RULE_modl = 0;
MODLParser.RULE_modl_structure = 1;
MODLParser.RULE_modl_map = 2;
MODLParser.RULE_modl_array = 3;
MODLParser.RULE_modl_pair = 4;
MODLParser.RULE_modl_value = 5;
MODLParser.RULE_modl_primitive = 6;


function ModlContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MODLParser.RULE_modl;
    return this;
}

ModlContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ModlContext.prototype.constructor = ModlContext;

ModlContext.prototype.EOF = function() {
    return this.getToken(MODLParser.EOF, 0);
};

ModlContext.prototype.modl_structure = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(Modl_structureContext);
    } else {
        return this.getTypedRuleContext(Modl_structureContext,i);
    }
};

ModlContext.prototype.STRUCT_SEP = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(MODLParser.STRUCT_SEP);
    } else {
        return this.getToken(MODLParser.STRUCT_SEP, i);
    }
};


ModlContext.prototype.enterRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.enterModl(this);
	}
};

ModlContext.prototype.exitRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.exitModl(this);
	}
};

ModlContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MODLParserVisitor ) {
        return visitor.visitModl(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MODLParser.ModlContext = ModlContext;

MODLParser.prototype.modl = function() {

    var localctx = new ModlContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, MODLParser.RULE_modl);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 28;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,3,this._ctx);
        switch(la_) {
        case 1:
            this.state = 15;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << MODLParser.NULL) | (1 << MODLParser.TRUE) | (1 << MODLParser.FALSE) | (1 << MODLParser.LBRAC) | (1 << MODLParser.LSBRAC) | (1 << MODLParser.NUMBER) | (1 << MODLParser.QUOTED) | (1 << MODLParser.STRING))) !== 0)) {
                this.state = 14;
                this.modl_structure();
            }

            break;

        case 2:
            this.state = 17;
            this.modl_structure();
            this.state = 22;
            this._errHandler.sync(this);
            var _alt = this._interp.adaptivePredict(this._input,1,this._ctx)
            while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
                if(_alt===1) {
                    this.state = 18;
                    this.match(MODLParser.STRUCT_SEP);
                    this.state = 19;
                    this.modl_structure(); 
                }
                this.state = 24;
                this._errHandler.sync(this);
                _alt = this._interp.adaptivePredict(this._input,1,this._ctx);
            }

            this.state = 26;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if(_la===MODLParser.STRUCT_SEP) {
                this.state = 25;
                this.match(MODLParser.STRUCT_SEP);
            }

            break;

        }
        this.state = 30;
        this.match(MODLParser.EOF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Modl_structureContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MODLParser.RULE_modl_structure;
    return this;
}

Modl_structureContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Modl_structureContext.prototype.constructor = Modl_structureContext;

Modl_structureContext.prototype.modl_map = function() {
    return this.getTypedRuleContext(Modl_mapContext,0);
};

Modl_structureContext.prototype.modl_array = function() {
    return this.getTypedRuleContext(Modl_arrayContext,0);
};

Modl_structureContext.prototype.modl_pair = function() {
    return this.getTypedRuleContext(Modl_pairContext,0);
};

Modl_structureContext.prototype.modl_primitive = function() {
    return this.getTypedRuleContext(Modl_primitiveContext,0);
};

Modl_structureContext.prototype.enterRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.enterModl_structure(this);
	}
};

Modl_structureContext.prototype.exitRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.exitModl_structure(this);
	}
};

Modl_structureContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MODLParserVisitor ) {
        return visitor.visitModl_structure(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MODLParser.Modl_structureContext = Modl_structureContext;

MODLParser.prototype.modl_structure = function() {

    var localctx = new Modl_structureContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, MODLParser.RULE_modl_structure);
    try {
        this.state = 36;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,4,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 32;
            this.modl_map();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 33;
            this.modl_array();
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 34;
            this.modl_pair();
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 35;
            this.modl_primitive();
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Modl_mapContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MODLParser.RULE_modl_map;
    return this;
}

Modl_mapContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Modl_mapContext.prototype.constructor = Modl_mapContext;

Modl_mapContext.prototype.LBRAC = function() {
    return this.getToken(MODLParser.LBRAC, 0);
};

Modl_mapContext.prototype.RBRAC = function() {
    return this.getToken(MODLParser.RBRAC, 0);
};

Modl_mapContext.prototype.modl_pair = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(Modl_pairContext);
    } else {
        return this.getTypedRuleContext(Modl_pairContext,i);
    }
};

Modl_mapContext.prototype.STRUCT_SEP = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(MODLParser.STRUCT_SEP);
    } else {
        return this.getToken(MODLParser.STRUCT_SEP, i);
    }
};


Modl_mapContext.prototype.enterRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.enterModl_map(this);
	}
};

Modl_mapContext.prototype.exitRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.exitModl_map(this);
	}
};

Modl_mapContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MODLParserVisitor ) {
        return visitor.visitModl_map(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MODLParser.Modl_mapContext = Modl_mapContext;

MODLParser.prototype.modl_map = function() {

    var localctx = new Modl_mapContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, MODLParser.RULE_modl_map);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 38;
        this.match(MODLParser.LBRAC);
        this.state = 47;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===MODLParser.QUOTED || _la===MODLParser.STRING) {
            this.state = 39;
            this.modl_pair();
            this.state = 44;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===MODLParser.STRUCT_SEP) {
                this.state = 40;
                this.match(MODLParser.STRUCT_SEP);
                this.state = 41;
                this.modl_pair();
                this.state = 46;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
        }

        this.state = 49;
        this.match(MODLParser.RBRAC);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Modl_arrayContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MODLParser.RULE_modl_array;
    return this;
}

Modl_arrayContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Modl_arrayContext.prototype.constructor = Modl_arrayContext;

Modl_arrayContext.prototype.LSBRAC = function() {
    return this.getToken(MODLParser.LSBRAC, 0);
};

Modl_arrayContext.prototype.RSBRAC = function() {
    return this.getToken(MODLParser.RSBRAC, 0);
};

Modl_arrayContext.prototype.modl_value = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(Modl_valueContext);
    } else {
        return this.getTypedRuleContext(Modl_valueContext,i);
    }
};

Modl_arrayContext.prototype.STRUCT_SEP = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(MODLParser.STRUCT_SEP);
    } else {
        return this.getToken(MODLParser.STRUCT_SEP, i);
    }
};


Modl_arrayContext.prototype.enterRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.enterModl_array(this);
	}
};

Modl_arrayContext.prototype.exitRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.exitModl_array(this);
	}
};

Modl_arrayContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MODLParserVisitor ) {
        return visitor.visitModl_array(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MODLParser.Modl_arrayContext = Modl_arrayContext;

MODLParser.prototype.modl_array = function() {

    var localctx = new Modl_arrayContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, MODLParser.RULE_modl_array);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 51;
        this.match(MODLParser.LSBRAC);
        this.state = 70;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << MODLParser.NULL) | (1 << MODLParser.TRUE) | (1 << MODLParser.FALSE) | (1 << MODLParser.LBRAC) | (1 << MODLParser.LSBRAC) | (1 << MODLParser.NUMBER) | (1 << MODLParser.QUOTED) | (1 << MODLParser.STRING))) !== 0)) {
            this.state = 52;
            this.modl_value();
            this.state = 67;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===MODLParser.STRUCT_SEP) {
                this.state = 54; 
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                do {
                    this.state = 53;
                    this.match(MODLParser.STRUCT_SEP);
                    this.state = 56; 
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                } while(_la===MODLParser.STRUCT_SEP);

                this.state = 58;
                this.modl_value();
                this.state = 62;
                this._errHandler.sync(this);
                var _alt = this._interp.adaptivePredict(this._input,8,this._ctx)
                while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
                    if(_alt===1) {
                        this.state = 59;
                        this.match(MODLParser.STRUCT_SEP); 
                    }
                    this.state = 64;
                    this._errHandler.sync(this);
                    _alt = this._interp.adaptivePredict(this._input,8,this._ctx);
                }

                this.state = 69;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
        }

        this.state = 72;
        this.match(MODLParser.RSBRAC);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Modl_pairContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MODLParser.RULE_modl_pair;
    return this;
}

Modl_pairContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Modl_pairContext.prototype.constructor = Modl_pairContext;

Modl_pairContext.prototype.EQUALS = function() {
    return this.getToken(MODLParser.EQUALS, 0);
};

Modl_pairContext.prototype.STRING = function() {
    return this.getToken(MODLParser.STRING, 0);
};

Modl_pairContext.prototype.QUOTED = function() {
    return this.getToken(MODLParser.QUOTED, 0);
};

Modl_pairContext.prototype.modl_value = function() {
    return this.getTypedRuleContext(Modl_valueContext,0);
};

Modl_pairContext.prototype.modl_map = function() {
    return this.getTypedRuleContext(Modl_mapContext,0);
};

Modl_pairContext.prototype.modl_array = function() {
    return this.getTypedRuleContext(Modl_arrayContext,0);
};

Modl_pairContext.prototype.enterRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.enterModl_pair(this);
	}
};

Modl_pairContext.prototype.exitRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.exitModl_pair(this);
	}
};

Modl_pairContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MODLParserVisitor ) {
        return visitor.visitModl_pair(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MODLParser.Modl_pairContext = Modl_pairContext;

MODLParser.prototype.modl_pair = function() {

    var localctx = new Modl_pairContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, MODLParser.RULE_modl_pair);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 74;
        _la = this._input.LA(1);
        if(!(_la===MODLParser.QUOTED || _la===MODLParser.STRING)) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
        this.state = 75;
        this.match(MODLParser.EQUALS);
        this.state = 79;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,11,this._ctx);
        switch(la_) {
        case 1:
            this.state = 76;
            this.modl_value();
            break;

        case 2:
            this.state = 77;
            this.modl_map();
            break;

        case 3:
            this.state = 78;
            this.modl_array();
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Modl_valueContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MODLParser.RULE_modl_value;
    return this;
}

Modl_valueContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Modl_valueContext.prototype.constructor = Modl_valueContext;

Modl_valueContext.prototype.modl_map = function() {
    return this.getTypedRuleContext(Modl_mapContext,0);
};

Modl_valueContext.prototype.modl_array = function() {
    return this.getTypedRuleContext(Modl_arrayContext,0);
};

Modl_valueContext.prototype.modl_pair = function() {
    return this.getTypedRuleContext(Modl_pairContext,0);
};

Modl_valueContext.prototype.modl_primitive = function() {
    return this.getTypedRuleContext(Modl_primitiveContext,0);
};

Modl_valueContext.prototype.enterRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.enterModl_value(this);
	}
};

Modl_valueContext.prototype.exitRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.exitModl_value(this);
	}
};

Modl_valueContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MODLParserVisitor ) {
        return visitor.visitModl_value(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MODLParser.Modl_valueContext = Modl_valueContext;

MODLParser.prototype.modl_value = function() {

    var localctx = new Modl_valueContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, MODLParser.RULE_modl_value);
    try {
        this.state = 85;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,12,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 81;
            this.modl_map();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 82;
            this.modl_array();
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 83;
            this.modl_pair();
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 84;
            this.modl_primitive();
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Modl_primitiveContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MODLParser.RULE_modl_primitive;
    return this;
}

Modl_primitiveContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Modl_primitiveContext.prototype.constructor = Modl_primitiveContext;

Modl_primitiveContext.prototype.QUOTED = function() {
    return this.getToken(MODLParser.QUOTED, 0);
};

Modl_primitiveContext.prototype.NUMBER = function() {
    return this.getToken(MODLParser.NUMBER, 0);
};

Modl_primitiveContext.prototype.STRING = function() {
    return this.getToken(MODLParser.STRING, 0);
};

Modl_primitiveContext.prototype.TRUE = function() {
    return this.getToken(MODLParser.TRUE, 0);
};

Modl_primitiveContext.prototype.FALSE = function() {
    return this.getToken(MODLParser.FALSE, 0);
};

Modl_primitiveContext.prototype.NULL = function() {
    return this.getToken(MODLParser.NULL, 0);
};

Modl_primitiveContext.prototype.enterRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.enterModl_primitive(this);
	}
};

Modl_primitiveContext.prototype.exitRule = function(listener) {
    if(listener instanceof MODLParserListener ) {
        listener.exitModl_primitive(this);
	}
};

Modl_primitiveContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MODLParserVisitor ) {
        return visitor.visitModl_primitive(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MODLParser.Modl_primitiveContext = Modl_primitiveContext;

MODLParser.prototype.modl_primitive = function() {

    var localctx = new Modl_primitiveContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, MODLParser.RULE_modl_primitive);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 87;
        _la = this._input.LA(1);
        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << MODLParser.NULL) | (1 << MODLParser.TRUE) | (1 << MODLParser.FALSE) | (1 << MODLParser.NUMBER) | (1 << MODLParser.QUOTED) | (1 << MODLParser.STRING))) !== 0))) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


exports.MODLParser = MODLParser;
