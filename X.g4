

grammar X;

compilationUnit
        : (code)*
        ;
code
    : declarationSeq
    ;



/*Statements*/
//expression Statements
//blockStatements
//conditional Statements
//loop Statements
//compound Statements
//jump Statements
declarationseq
          : declarationseq declaration
          | declaration
          ;
declaration
          : functionDefinition
          ;

statement
        : expressionStatement
        | conditionalStatement
        | jumpStatement
        | scopeStatements
        | ptfStatement ;

expressionStatement
        : expression
        ;
expression
        : '(' expression ')'
        | expression ('*'|'/') expression
        | expression ('+'|'-') expression
        |
        ;
conditionalStatement
        : If '(' condition ')'
        | If LeftParen statementseq RightParen
        ;
jumpStatement
        : Return
        | Break
        ;
scopeStatements
        : '{' statementseq '}'
        ;

expressionSeq
        : expression
        | expressionSeq
        ;

statementSeq
        : statement
        | statementSeq statement
        ;
condition
        :
        ;


/*Functions*/
functionDefinition
        : declaratorType declarator functionbody
        ;

declaratorType
        : functionReturnType // TypeDef

functionReturnType
        : Void
        | primitiveType
        ;
declarator
        : Main parameterPassing
        | declarationVar parameterPassing
        ;
parameterPassing
        : '(' parameterSeq? ')' //zero for main
        ;
parameterSeq
        : parameter (',' parameter)*
        ;
parameter
        : primitiveType VARNAME
        ;
primitiveType
        : 'int'
        | 'char'
        | 'string'
        ;
declarationVar
        : String
        ;
functionbody
        : scopeStatements
        ;
        
/*reserved words*/

Of       : 'of'      ;
Main     : 'main'    ;
While    : 'while'   ;
Break    : 'break'   ;
Read     : 'read'    ;
Null     : 'nil'     ;
Return   : 'return'  ;
TypeDef  : 'typedef' ;
If       : 'if'      ;
ForEach  : 'foreach' ;
Head     : 'head'    ;
Write    : 'write'   ;
List     : 'list'    ;
As       : 'as'      ;
Else     : 'else'    ;
In       : 'in'      ;
Tail     : 'tail'    ;
SIZE     : 'Size'    ;
String   : (CHAR)*   ;
INT      : Digit+    ;
CHAR     : Letters   ;
/*Operators*/

LeftBrace    : '{' ;
RightBrace   : '}' ;
LeftParen    : '(' ;
RightParen   : ')' ;
Comma        : ',' ;
Colon        : ':' ;
SemiColon    : ';' ;
PtrToRetrun  : '->';
RightBracket : '[' ;
LeftBracket  : ']' ;
Dot          : '.' ;
AccessIndex  : '#'|'.' ;
StringIdentier : ' " ' ;
Assign         : '='   ;
PassbyRef      : '$'   ;
//CharIdentifier : ' '' ' ;

/*Arithmetic Operators*/
Star  : '*' ;
Plus  : '+' ;
Minus : '-' ;
Div   : '/' ;

/*Relational Operators*/:
Equal    : '=' ;
NotEqual : '!=' ;
Less     : '<' ;
Greater  : '>' ;

/*Logical Operators*/

AND : '&&' ;
OR  : '||' ;
NOT : '!' ;

fragment Digit
    : [0-9]
    ;
fragment Letters
    : [a-zA-Z]
    ;


BlockComment
    : '/*' .*? '*/' ->skip
    ;

LineComment
    : '//' ~[\r\n]* ->skip
    ;

VARNAME
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;
Whitespace
    : [\n\t\r]+ ->skip
    ;
