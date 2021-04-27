# MODL Grammar 

This is the definition for Minimal Object Description Language (MODL).
For more information about MODL take a look at the [MODL Specification](https://www.modl.uk/specification). 

Machine diagrams are shown below:

![MODL Machine Diagrams](https://modl.uk/images/machine-diagrams.png)

## Tests

Tests are provided in the `tests` directory. Implementations of the parsers should use those tests to check if it
behaves as expected.

## ANTLR4 Parser Generation
```
antlr4 MODLLexer.g4 MODLParser.g4 -o ../../typescript-modl-interpreter/lib/gen/MODL -package MODL -Dlanguage=JavaScript
antlr4 MODLLexer.g4 MODLParser.g4 -o ../../java-interpreter/src/main/java/uk/modl/parser/antlr -package uk.modl.parser.antlr -Dlanguage=Java
```