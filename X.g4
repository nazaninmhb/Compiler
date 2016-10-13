

  grammar X;

  compilationUnit : functionDefinition ;

  declarationseq
            : declarationseq declaration
            | declaration
            ;
  declaration
            : functionDefinition
            ;

  /* Statements */

  statement
          : expressionStatement
          | conditionalStatement
          | jumpStatement
          | scopeStatement
          | variableDeclaration
          | listDeclaration
        //  | iterativeStatement
        //  | ptfStatement
          ;
  variableDeclaration
          : type variable '=' typeIdentifier ';'
          | type variable ';'
          ;
  listDeclaration
          : listIdentifier
          ;
  typeIdentifier
          : INT
          | charIdentifier
          | stringIdentifier
          | listIdentifier // nemidunam vaghean koja bezaramaesh
          ;

  charIdentifier
          : '\'' CHAR '\''
          ;
  stringIdentifier
          : '"' CHAR* '"'
          ;

  listIdentifier
          : 'list' '(' INT ')' Of typeIdentifier VARNAME?
          | '[' label? typeIdentifier (',' label? typeIdentifier ) ']' VARNAME?
          ;
  expressionStatement
          : expression
          ;
  expression
          : '(' expression ')'
          | expression ('*'|'/') expression
          | expression ('+'|'-') expression
          | expression ('&&'|'||') expression
          ;
  conditionalStatement
          : If '(' condition ')' statement
          | If LeftParen condition RightParen statement Else statement
          ;
  jumpStatement
          : Return expression? SemiColon
          | Break SemiColon
          ;
  scopeStatement
          : '{' statementSeq '}'
          | '{' '}'
          ;
  statementSeq
          : statement
          | statementSeq statement
          ;
  condition
          : relationalOperators  //folani relationalOperators folan
          ;


  /*Functions*/

  functionDefinition
          : declaratorType declarator functionbody
          ;
  typedefDefenition
          : declaratorType declarationVar As  //statement? | expression?
          ;
//  forwardDeclaration
  //        :
    //      ;
  declaratorType
          : type
          | 'void'
        //  | TypeDef
          ;

  declarator
          : declarationVar parameterPassing
          ;
  parameterPassing
          : '(' argumentSeq? ')' //zero for main
          ;
  argumentSeq
          : argument (',' argument)*
          ;
  argument
          : type variable
          ;

  primitiveType
          : 'int'
          | 'char'
          | 'string' '(' INT ')'
          ;
  variable
          : id=VARNAME
          ;
  label
          : VARNAME ':'
          ;
  declarationVar
          : variable  //motmaen nistam
          ;
  functionbody
          : scopeStatement
          ;

  type
          : primitiveType
          //| 'void'
          | variable
          //| list
          //| ptf
          ;

  /*
  listDefenition

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
  As       : 'as'      ;
  Else     : 'else'    ;
  In       : 'in'      ;
  Tail     : 'tail'    ;
  SIZE     : 'Size'    ;
//  String   : (CHAR)*   ;
  INT      : Digit+    ;
  CHAR     : Letter   ;
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

  /*Relational Operators*/
  relationalOperators
            : Equal
            | NotEqual
            | Less
            | Greater
            ;

  Equal    : '==' ;
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
  Letters
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
  WS
      : [ \t]+  -> skip
      ;

  Newline
      :  ( '\r' '\n'?
      |    '\n' ) -> skip
      ;
