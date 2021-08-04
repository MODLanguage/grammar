/*
 MIT License Copyright (c) 2018 NUM Technology Ltd Permission is hereby granted, free of charge, to
 any person obtaining a copy of this software and associated documentation files (the "Software"),
 to deal in the Software without restriction, including without limitation the rights to use, copy,
 modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 persons to whom the Software is furnished to do so, subject to the following conditions: The above
 copyright notice and this permission notice shall be included in all copies or substantial portions
 of the Software. THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

parser grammar MODLParser;

options {
	tokenVocab = MODLLexer;
}

modl: (
		// Valid MODL is zero or more MODL structures separated by semi-colons, or a single modl_primitive
		(
			(modl_structure ( STRUCT_SEP modl_structure)*) STRUCT_SEP?
		)
		| modl_primitive
	) EOF;

modl_structure: modl_map | modl_array | modl_pair;

modl_map: // ( key = value; key = value )
	LBRAC (modl_pair ( STRUCT_SEP modl_pair)*)? RBRAC;

modl_array: // [ item; item ]
	LSBRAC (modl_value ( STRUCT_SEP modl_value)*)? RSBRAC;

// A pair can be a traditional name-value pair split by an equals sign (standard pair), e.g.
// name=John
// 
// For efficiency, it's also possible to assign a map to a pair without an equals sign, since the
// left bracket separates the key from the value – this is called a map pair. e.g. person(name=John)
// – this is equivalent to person=(name=John)
// 
// It's also possible to do the same with an array pair e.g. numbers[1;2;3] – equivalent to
// numbers=[1;2;3]
modl_pair: (STRING | QUOTED) EQUALS (
		modl_map
		| modl_array
		| modl_primitive
	)
	// key = value (standard pair)
	| STRING modl_map // key( key = value ) (map pair)
	| STRING modl_array; // key[ item; item ] (array pair)

modl_value: modl_map | modl_array | modl_pair | modl_primitive;

modl_primitive: QUOTED | NUMBER | STRING | TRUE | FALSE | NULL;

