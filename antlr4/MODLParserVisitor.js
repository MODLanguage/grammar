// Generated from /Users/tonywalmsley/work/num/grammar/antlr4/MODLParser.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by MODLParser.

function MODLParserVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

MODLParserVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
MODLParserVisitor.prototype.constructor = MODLParserVisitor;

// Visit a parse tree produced by MODLParser#modl.
MODLParserVisitor.prototype.visitModl = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MODLParser#modl_structure.
MODLParserVisitor.prototype.visitModl_structure = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MODLParser#modl_map.
MODLParserVisitor.prototype.visitModl_map = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MODLParser#modl_array.
MODLParserVisitor.prototype.visitModl_array = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MODLParser#modl_pair.
MODLParserVisitor.prototype.visitModl_pair = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MODLParser#modl_value.
MODLParserVisitor.prototype.visitModl_value = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MODLParser#modl_primitive.
MODLParserVisitor.prototype.visitModl_primitive = function(ctx) {
  return this.visitChildren(ctx);
};



exports.MODLParserVisitor = MODLParserVisitor;