/*
 MIT License Copyright (c) 2018 NUM Technology Ltd Permission is hereby granted, free of charge, to
 any person obtaining a copy of this software and associated documentation files (the "Software"),
 to deal in the Software without restriction, including without limitation the rights to use, copy,
 modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 persons to whom the Software is furnished to do so, subject to the following conditions: The above
 copyright notice and this permission notice shall be included in all copies or substantial portions
 of the Software.
 
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT
 OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

lexer grammar MODLLexer;
WS: [ \t\r\n]+ -> skip;
NULL: 'null' | '000';
TRUE: 'true' | '01';
FALSE: 'false' | '00';
EQUALS: '=';
STRUCT_SEP: ';';
ARR_SEP: ',';
LBRAC: '(';
RBRAC: ')';
LSBRAC: '[';
RSBRAC: ']';
NUMBER: '-'? INT ('.' [0-9]+)? EXP?;
fragment INT: '0' | [1-9] [0-9]*;
fragment EXP: [Ee] [+\-]? INT;

// String inside double quotes – any character is allowed inside quotes except for the double quote
// itself OR String inside graves – any character is allowed inside graves except for the grave
QUOTED:
	(
		( '"' ( INSIDE_QUOTES | '~"' | '\\"')* '"')
		| ('`' ( INSIDE_GRAVES) '`')
	);
fragment INSIDE_QUOTES: ~["];
fragment INSIDE_GRAVES: ~[`]*;

STRING:
	'# '? (ESCAPED | UNRESERVED)+ (
		(' '+) ( ESCAPED | UNRESERVED)+
	)*;
// These two should be identical except for regex inversion on first:
fragment UNRESERVED:
	~ (
		'\\'
		| '~'
		| '('
		| ')'
		| '['
		| ']'
		| ' '
		| ';'
		| '='
		| '"'
		| '\b'
		| '\f'
		| '\n'
		| '\r'
		| '\t'
	);
fragment RESERVED_CHARS: (
		'\\'
		| '~'
		| '('
		| ')'
		| '['
		| ']'
		| ' '
		| ';'
		| '='
		| '"'
		| '\b'
		| '\f'
		| '\n'
		| '\r'
		| '\t'
	);
fragment ESCAPED: // Standard JSON escaping, e.g. \t for tab
	'\\' ([\\/bfnrt] | 'u')
	// Standard back slash can be used to escape reserved characters
	| '\\' RESERVED_CHARS
	// Additionally, MODL allows tilde ( ~ ) escapes because backslash is problematic in DNS
	| '~' ( RESERVED_CHARS | 'u');
