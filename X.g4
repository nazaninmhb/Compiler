
//handle one character variables
  grammar X;

  compilationUnit : variableDeclaration*;

  declarationseq
            : declaration*
            ;
  declaration
            : functionDefinition
            ;
  /* Statements */

  statement
          : scopeStatement
          | jumpStatement
          | variableDeclaration
        //  | listDeclaration
          //| assignStatement
        //  | ptfStatement
        //  | iterativeStatement
          ;
  variableDeclaration
          : type variable '=' variable ';'
          | type variable '=' typeIdentifier ';'
          | type variable ';'
          ;
  /*list*/
  listDeclaration
          : listType variable ';'
          ;
  listType
          : '['label? generalTypes (',' label? generalTypes)* ']' //variable? //chetor begim variable bara akharie? tuye ptf ham hamin mishe
          | 'list' '(' Int ')' 'of' generalTypes //variable?
          ;
  //listIdentifier
    //      :
      //    ;
  /*ptf*/
  ptfDeclaration
          : ptfType ////the last example cant be identified
          ;
  ptfType
          : ptfInput+ ptfOutput //nemidune koja output bashe koja input
          ;
  ptfInput
          : type ('*'type)* '->'
          ;
  ptfOutput
          : type variable ';'
          ;
  /*listDeclaration
          : listIdentifier assignStatement?
          ;
  assignStatement
          : variable '=' variable
          | variable '=' typeIdentifier
          | '=' typeIdentifier
          ;*/
  typeIdentifier
          : Int //ptr ham ye identifiere bayad hesab she.
          | Letter
          | String
          //| listIdentifier // nemidunam vaghean koja bezaramaesh
          //| functionIdentifier
          ;
  /*charIdentifier
          : '\'' myChar '\''
          ;
  stringIdentifier
          : '"' myString '"' //okeye? ya chiz dg bashe?
          ;*/

  /*listIdentifier
          : 'list' '(' myInt ')' Of typeIdentifier variable? //tuye list hatman bayad ptr dhashte bashim be onvane ye type
          | '[' label? typeIdentifier (',' label? typeIdentifier)* ']' variable?
          ;
  functionIdentifier
          : variable '(' typeIdentifier (',' typeIdentifier)* ')'
          ;
  expressionStatement
          : expression
          ;*/
  expression
          : Int
          | variable
          | '(' expression ')'
          | expression ('*'|'/') expression
          | expression ('+'|'-') expression
          | expression ('&&'|'||') expression
          ;
  //conditionalStatement
    //      : If '(' condition ')' statement
      //    | If '(' condition ')' statementSeq 'else' statementSeq
        //  ;
  jumpStatement
          : Return expression? ';'
          | Break ';'
          ;
  scopeStatement
          : '{' statementSeq'}'
          ;

  statementSeq
          : statement
          ;
  condition
          : relationalOperators  //folani relationalOperators folan
          ;


  /*Functions*/

  functionDefinition
          : declaratorType declarator functionbody
          ;
  typedefDefenition
          : declaratorType declarationVar 'as'  //statement? | expression?
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

  label
          : variable ':'
          ;
  declarationVar
          : variable
          | 'main'  //motmaen nistam
          ;
  functionbody
          : scopeStatement
          ;
  generalTypes
          : type
          | ptfType
          | listType //chera? chon nemishe ptfType ro gozasht tuye type
          ;         //left recursion bevujud miad, rahe dgeyi be zehnam naresid
  type
          :  primitiveType
          /*| variable*/
          ;
  primitiveType
          : 'int'
          | 'char'
          | 'string' '(' Int ')'
          ;
 variable
         : Varname
         ;
/*
 myString
         : myChar+
         ;
 myChar
         : Nondigit
         ;*/
  /*
  listDefenition*/
  //accessListMember
          //: variable AccessIndex
          //;
  /*myInt   : Digit
          | Minus Digit
          ;*/

  /*reserved words*/

  Of       : 'of'      ;
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
  SIZE     : 'size'    ;

  /*Operators*/

  LeftBrace    : '{' ;
  RightBrace   : '}' ;
  LeftParen    : '(' ;
  RightParen   : ')' ;
  Comma        : ',' ;
  Colon        : ':' ;
  SemiColon    : ';' ;
  PtrToReturn  : '->';
  RightBracket : '[' ;
  LeftBracket  : ']' ;
  Dot          : '.' ;
  AccessIndex  : '#'|'.' ;
  StringIdentier : ' " ' ;
  Assign         : '='   ;
  PassbyRef      : '$'   ;

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

  Int
      :   Digit+
      ;

  String
      :   '\"' .*? '\"'
      ;

  Letter
      :   '\'' Nondigit '\''
      ;

  Varname
      :   Nondigit
          (   Nondigit
          |   Digit
          )*
      ;
  fragment
  Nondigit
      :   [a-zA-Z_]
      ;

  fragment
  Digit
      :   [0-9]
      ;
  /*LETTER
      : [a-zA-Z]
      ;*/
  BlockComment
      : '/*' .*? '*/' ->skip
      ;

  LineComment
      : '//' ~[\r\n]* ->skip
      ;

  WS:
      [ \r\t\n\f]+ -> skip
      ;
  /*WS
      : [ \t]+  -> skip
      ;

  Newline
      :  ( '\r' '\n'?
      |    '\n' ) -> skip
      ;
*/
