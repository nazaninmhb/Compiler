grammar x;

@header {
  import java.util.*;
  import java.lang.Object;
}

@members{
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
}

program
    :
        (fordecl ';'
        | vardef ';'
        | funcdef
        | typedef ';'
        )+
        { if (!root.getMain()) {
            isCorrect = false;
            print("Main function must be defined");
          }
          root.functionisdefined();
        }
    ;
fordecl
    : (func_fordecl
    | type_fordecl)
    ;
type_fordecl //kar dare
    : 'typedef' type_name=ID {print("type forward decleration: "+$type_name.text);}
    ;
func_fordecl
    locals [Vector<Type> types]
    : {$types = new Vector<Type>();}
      output=type func_name=ID '(' ((ID ':')? t=type {$types.add($t.ty);} (',' (ID ':')? t2=type {$types.add($t2.ty); })*)? ')'
       {
         if (!root.addIfNotExistForward(new Pair<String, Vector<Type> > ($func_name.text, $types), $output.ty)) {
           isCorrect = false;
           error("The " + $func_name + " function is already declared",0);
         }
       }
    ;
funcdef
    locals [ boolean argExists, Vector<Type> types, Vector<String> inputs, Vector<Variable> vars ]
    : {$types = new Vector<Type>(); $inputs = new Vector<String>();  $vars = new Vector<Variable>(); $argExists = false;}
      output=type func_name=ID '(' ( {$argExists = true;} (ref='$')? inName=ID ':' var=type
      {$types.add($var.ty); $inputs.add($inName.text); $vars.add(new Variable($inName.text, $var.ty,0)); } (',' (ref='$')? inName2=ID ':' var2=type
      {$types.add($var2.ty); $inputs.add($inName2.text); $vars.add(new Variable($inName2.text, $var.ty,0)); }
    )*)? ')'
    {
      if ($func_name.text.equals("main")) {
        if (!$output.text.equals("void")) {
          isCorrect = false;
          error("Output of main function must be void.", $func_name.line);
        }
        if($argExists) {
          isCorrect = false;
          error("Main function must not have arguments.", $func_name.line);
        }
      }

      if (!root.addIfNotExistFunc(new Pair<String, Vector<Type> > ($func_name.text, $types), $inputs, $output.ty)) {
        isCorrect = false;
        error("Function " + $func_name.text + " is already defined.", $func_name.line);
      }
    }
    { num++; handler.push(currEnv); currEnv = new Env(handler.top(),num); currEnv.addIfNotExistVar($vars); }
    {print("funcdef");}  b=block { if($output.text.equals("void")) { //return type can be void, or null or it can have no type;
                  if ($b.ReturnTy != null ) //can be void?
                    error("void function should not return type",$b.reLine);
                }
                else if(!$b.ReturnTy.equals($output.ty))
                { error("mismatched return type expected " + $output.ty.getType() + " encountered " + $b.ReturnTy.getType() + ".",$b.reLine );}
      currEnv = handler.pop(); }
    ;
typedef //kar dare
    : type_fordecl 'as' type
    ;
vardef
    locals [Vector<Variable> variables,boolean hasType]
    : {$variables =  new Vector<Variable>(); $hasType =false; print("vardef");}
      t=type var=ID ('=' e=expr {$hasType = true;})?
      { //print($e.ty.getType());
        if ($t.text.equals("void"))
          error("Void can not be a variable type.", $var.line);
        else {
          if ($hasType) {
            if ($t.ty.equals($e.ty))
              $variables.add(new Variable($var.text, $t.ty,0));
            else {
              isCorrect = false;
              error(" No viable conversion from " + $e.ty.getType() + " to " + $t.ty.getType(),$var.line); //Not SURE
            }
          }
          else {
            $variables.add(new Variable($var.text, $t.ty,0));
          }
        }
        $hasType = false;
      }
      (',' var=ID ('=' e=expr { $hasType = true;})?  //this type can be output of a ptf or type of a variable,
      {
        if ($t.text.equals("void"))
          error("Void can not be a variable type.", $var.line);
        else {
          if ($hasType) {
            if ($t.ty.equals($e.ty))
              $variables.add(new Variable($var.text, $t.ty,0));
            else {
              isCorrect = false;
              error(" No viable conversion from " + $e.ty.getType() + " to " + $t.ty.getType(),$var.line); //Not SURE
            }
          }
          else
            $variables.add(new Variable($var.text, $t.ty,0));
        }
        $hasType = false;
      })*
      { currEnv.addIfNotExistVar($variables); }
    ;
type returns [Type ty]
  locals [Vector<String> memids, Vector<Type> mems, String name, String name2, Type output, boolean isVoid, boolean canAdd, Vector<Variable> input]
    : (ID
    | {$memids = new Vector<String>(); $mems = new Vector<Type>(); $name = null;}
     '[' (nam=ID ':' {$name=$nam.text;})? {$memids.add($name);} t=type {$mems.add($t.ty);}
        ({$name2 = null;} ',' (nam2=ID ':'{$name2=$nam2.text;})? {$memids.add($name2);} t2=type {$mems.add($t2.ty);})* ']'
        { $ty = new ListType($mems, $memids, "list");}
    | 'list' '(' size=CONST_NUM ')' 'of' t=type
      {
        if (Integer.parseInt($size.text) == 0) {
          isCorrect = false;
          error("list must have at least one element",$size.line);
        }
        else {
          $mems = new Vector<Type> (Integer.parseInt($size.text));
          $memids = new Vector<String> (Integer.parseInt($size.text));
          for (int i = 0; i < $mems.size(); i++) {
            $mems.set(i, $t.ty);
            $memids.set(i, null);
          }
          $ty = new ListType($mems, $memids, "list");
        }
      }
    | {$canAdd = true; $mems = new Vector<Type>();}'<'(t=type
      {
        if(!$t.ty.isVoid()) {
          $mems.add($t.ty);
          $isVoid = false;
        }
        else
          $isVoid = true;
      }
      (o='*' t2=type {
        if ($isVoid && $canAdd || $t2.ty.isVoid()) {
          $canAdd = false;
          isCorrect = false;
          error("A function cannot have both void and other types as input.", $o.line);
        }
        else {
            $mems.add($t2.ty);
        }
      })*) '->' t3=type {$output = $t3.ty;} '>' {
        if($canAdd)
          $ty = new Ptf($mems, $output);
        else
          $ty = new InvalidType();
        }
    | 'string' '(' size=CONST_NUM ')'
    {
      $mems = new Vector<Type> (Integer.parseInt($size.text));
      for (int i = 0; i < $mems.size(); i++)
        $mems.set(i, new Primitive("char"));
      $ty = new ListType($mems, null, "list");
    }
    | 'char' {$ty = new Primitive("char");}
    | 'int'  {$ty = new Primitive("int"); }
    | 'void' {$ty = new Primitive("void");})
    ;
block returns [Type ReturnTy, int reLine]
    : '{' (s=statement { $ReturnTy = $s.ReturnTy; ;$reLine = $s.reLine;})* '}'
    ;
statement returns [Type ReturnTy, int reLine]
    : (if_stm
    | o=other_stm {$ReturnTy = $o.ReturnTy; $reLine = $o.reLine; } )
    ;
other_stm returns [Type ReturnTy, int reLine]//[boolean cinLoop] returns [boolean inLoop]
    : //{$cinLoop = $inLoop;}
    (vardef ';' //done taghriban
    | expr ';' //dare tamum mishe
    | while_stm //{$inLoop = true;} //munde erroresh
    | foreach_stm //{$inLoop = true;} //munde erroresh
    | r=return_stm s=';' {$ReturnTy = $r.tyReturn; $reLine = $s.line; } //munde
    | break_stm ';' //munde
    | block )
    ;
if_stm
    : ('if' '(' expr ')'
    {
      handler.push(currEnv);
      num++;
      currEnv = new Env(handler.top(),num);
    }
    statement { currEnv = handler.pop(); }
    | 'if' '(' expr ')'
    {
      handler.push(currEnv);
      num++;
      currEnv = new Env(handler.top(),num);
    }
    if_stm_else { currEnv = handler.pop(); }
    'else'
    {
      handler.push(currEnv);
      num++;
      currEnv = new Env(handler.top(),num);
    }
    statement { currEnv = handler.pop(); })
    ;
if_stm_else
    : ('if' '(' expr ')'
    {
      handler.push(currEnv);
      num++;
      currEnv = new Env(handler.top(),num);
    }
    if_stm_else { currEnv = handler.pop(); }
    'else'
    {
      handler.push(currEnv);
      num++;
      currEnv = new Env(handler.top(),num);
    }
    if_stm_else { currEnv = handler.pop(); }
    | other_stm)
    ;
expr returns [Type ty]
    : e1=expr_assign
      { $ty = $e1.ty;}
    ;
expr_assign returns [Type ty]
    : e1=expr_or op='=' e2=expr_assign
    { if ($e2.ty instanceof InvalidType || $e1.ty instanceof InvalidType) {
        $ty = new InvalidType();
        isCorrect = false;
        error("Assignment can not be done, types are invalid",0);
     }
     else if (!$e2.ty.equals($e1.ty)) {
       isCorrect = false;
       error(" No viable conversion from " + $e2.ty.getType() + " to " + $e1.ty.getType(),$op.line);
       $ty = new InvalidType(); //just for now
    }
    else
      $ty = $e1.ty;
    }
    | e3=expr_or { $ty = $e3.ty; }
    ;
expr_or returns [Type ty]
    : e1=expr_and e2=expr_or_tmp
    {
      if ($e2.ty == null ) {
        $ty = $e1.ty;
      }
      else {
        if ($e2.ty instanceof InvalidType || $e1.ty instanceof InvalidType)
          $ty = new InvalidType();
        else {
          if ($e1.ty.getType().equals("int") && $e2.ty.getType().equals("int"))
            $ty = $e1.ty;
          else {
              $ty = new InvalidType();
              isCorrect = false;
              error("Logical Or can only be applied on Integer types",0);
          }
        }
      }
    }
    ;
expr_or_tmp returns [Type ty]
    : '||' e1=expr_and e2=expr_or_tmp
    { if ($e1.ty.getType().equals("int")) {
        $ty = ($e2.ty == null)? $e1.ty : ($e2.ty.getType().equals("int")) ? $e2.ty : new InvalidType();
      }
      else
        $ty = new InvalidType();
    }
    |
    ;
expr_and returns [Type ty]
    : e1=expr_eq e2=expr_and_tmp
    {
      if ($e2.ty == null )
        $ty = $e1.ty;
      else {
        if ($e2.ty instanceof InvalidType || $e1.ty instanceof InvalidType)
          $ty = new InvalidType();
        else {
          if ($e1.ty.getType().equals("int") && $e2.ty.getType().equals("int"))
            $ty = $e1.ty;
          else {
              $ty = new InvalidType();
              isCorrect = false;
              error("Logical And can only be applied on Integer types",0);
          }
        }
      }
    }
    ;
expr_and_tmp returns [Type ty]
    : '&&' e1=expr_eq e2=expr_and_tmp
    { if ($e1.ty.getType().equals("int")) {
        $ty = ($e2.ty == null)? $e1.ty : ($e2.ty.getType().equals("int")) ? $e2.ty : new InvalidType();
      }
      else
        $ty = new InvalidType();
    }
    |
    ;
expr_eq returns [Type ty]
    : e1=expr_cmp e2=expr_eq_tmp
    {
      if ($e2.ty == null )
        $ty = $e1.ty;
      else {
        if ($e2.ty instanceof InvalidType || $e1.ty instanceof InvalidType)
          $ty = new InvalidType();
        else {
          if ($e1.ty.getType().equals("int") && $e2.ty.getType().equals("int"))
            $ty = $e1.ty;
          else {
              $ty = new InvalidType();
              isCorrect = false;
              error("Only Integer types can be compared",0);
          }
        }
      }
    }
    ;
expr_eq_tmp returns [Type ty]
    : op=('=='|'!=') e1=expr_cmp e2=expr_eq_tmp
    { if ($e1.ty.getType().equals("int")) {
        $ty = ($e2.ty == null)? $e1.ty : ($e2.ty.getType().equals("int")) ? $e2.ty : new InvalidType();
      }
      else
        $ty = new InvalidType();
    }
    |
    ;
expr_cmp returns [Type ty]
    : e1=expr_add e2=expr_cmp_tmp
    {
      if ($e2.ty == null )
        $ty = $e1.ty;
      else {
        if ($e2.ty instanceof InvalidType || $e1.ty instanceof InvalidType)
          $ty = new InvalidType();
        else {
          if ($e1.ty.getType().equals("int") && $e2.ty.getType().equals("int"))
            $ty = $e1.ty;
          else {
              $ty = new InvalidType();
              isCorrect = false;
              error("Only Integer types can be compared",0);
          }
        }
      }
    }
    ;
expr_cmp_tmp returns [Type ty]
    : op=('<'|'>') e1=expr_add e2=expr_cmp_tmp
    { if ($e1.ty.getType().equals("int")) {
        $ty = ($e2.ty == null)? $e1.ty : ($e2.ty.getType().equals("int")) ? $e2.ty : new InvalidType();
      }
      else
        $ty = new InvalidType();
    }
    |
    ;
expr_add returns [Type ty]
    : e1=expr_mult e2=expr_add_tmp
    {
      if ($e2.ty == null )
        $ty = $e1.ty;
      else {
        if ($e2.ty instanceof InvalidType || $e1.ty instanceof InvalidType)
          $ty = new InvalidType();
        else {
          if ($e1.ty.getType().equals("int") && $e2.ty.getType().equals("int"))
            $ty = $e1.ty;
          else {
              $ty = new InvalidType();
              isCorrect = false;
              error("Only Integer types can be added or subtracted", 0);
          }
        }
      }
    }
    ;
expr_add_tmp returns [Type ty]
    : op=('+'|'-') e1=expr_mult e2=expr_add_tmp
    { if ($e1.ty.getType().equals("int"))
      { $ty = ($e2.ty == null) ? $e1.ty : ($e2.ty.getType().equals("int"))? $e2.ty : new InvalidType(); }
      else
        $ty = new InvalidType();
    }
    |
    ;
expr_mult returns [Type ty]
    : e1=expr_un e2=expr_mult_tmp
    {
      if ($e2.ty == null ) {
        $ty = $e1.ty;
      }
      else {
        if ($e2.ty instanceof InvalidType || $e1.ty instanceof InvalidType)
          $ty = new InvalidType();
        else {
          if ($e1.ty.getType().equals("int") && $e2.ty.getType().equals("int"))
            $ty = $e1.ty;
          else {
              $ty = new InvalidType();
              isCorrect = false;
              error("Only Integer types can be multiplied or divided", 0);
          }
        }
      }
    }
    ;
expr_mult_tmp returns [Type ty]
    : op=('*'|'/') e1=expr_un e2=expr_mult_tmp
    { if ($e1.ty.getType().equals("int"))
      { $ty = ($e2.ty == null) ? $e1.ty : ($e2.ty.getType().equals("int"))? $e2.ty : new InvalidType(); }
    }
    |
    ;
expr_un returns [Type ty]
    : op=('!'|'-') e1=expr_un {
      if (!$e1.ty.getType().equals("int"))
      { $ty = new InvalidType(); isCorrect = false; error("Unary operations can only be applied to integers.", $op.line);}
      else $ty = $e1.ty;
    }
    | e2=expr_mem { $ty = ($e2.ty ==  null) ? new InvalidType(): $e2.ty;}
    ;
expr_mem returns [Type ty]
    : e1=expr_other e2=expr_mem_tmp[$e1.name, null] {$ty = ($e2.ty == null)? $e1.retType: $e2.ty;} //WRONG?
    ;
expr_mem_tmp [String name, Type inputType] returns [Type ty]
  locals [Vector<Type> types]
    : {$types = new Vector<Type>();}
    (
    '#' num=CONST_NUM
    {
      if ($name != null)
      {
        int n = Integer.parseInt($num.text);
        Type listVarType = currEnv.listHasIndex($name, n);
        if (listVarType == null) {
          isCorrect = false;
          error("The index " + n + " is not valid.", $num.line);
          $ty = new InvalidType();
        }
        else {
          $ty = listVarType;
        }
      }
      else {
        if ($inputType instanceof ListType) {
          int n = Integer.parseInt($num.text);
          Type listVarType = ((ListType)$inputType).getIndexType(n);
          if (listVarType == null) {
            isCorrect = false;
            error("The index " + $var.text + " is not valid.", $num.line);
            $ty = new InvalidType();
          }
          else
            $ty = listVarType;
        }
        else
          $ty = new InvalidType();
      }
    }

    | '.' var=ID
    {
      if ($name != null)
      {
        Type listVarType = currEnv.listHasLabel($name, $var.text);
        if (listVarType == null) {
          isCorrect = false;
          error("The label " + $var.text + " is not valid.", $var.line);
          $ty = new InvalidType();
        }
        else {
          $ty = listVarType;
        }
      }
      else {
        if ($inputType.getType().equals("list")) {
          Type listVarType = ((ListType)$inputType).getLabelType($var.text);
          if (listVarType == null) {
            isCorrect = false;
            error("The label " + $var.text + " is not valid.", $num.line);
            $ty = new InvalidType();
          }
          else
            $ty = listVarType;
        }
        else
          $ty = new InvalidType();
          error("You can only call labels on a list.", $num.line);
      }
    }

    |  s='(' (e=expr { $types.add($e.ty); } (',' e2=expr { $types.add($e2.ty); })*)? ')'
      {
        if ($name != null) //call from expr_mem
          $ty = root.findFunction(new Pair<String, Vector<Type> >($name, $types), $s.line);
        else { //call from expr_mem_tmp
          if ($inputType instanceof Ptf) {
            if (((Ptf)$inputType).matchesInputType($types))
              $ty = ((Ptf)$inputType).getOutputType();
            else
              $ty = new InvalidType();
          }
        }
        if ($ty instanceof InvalidType) {
          isCorrect = false;
        //  error("Function call is not valid.", $num.line); //TODO: better error message
        }
         print("operator: funcall");
      }
      )
      expr_mem_tmp[null, $ty]
    |
    ;

expr_other returns [Type retType, String name]
    locals [Vector<Type> types,Variable returnVar,Vector<Type> types, String string,Vector<Variable> hey]
    : (CONST_NUM {$retType = new Primitive("int");}
    | CONST_CHAR {$retType = new Primitive("char");}
    | CONST_STR { $string = $CONST_STR.text; $types = new Vector<Type>();
        for (int i = 0; i < $string.length(); i++)
          $types.add(new Primitive("char"));
        $retType = new ListType($types, null, "list");}
    | CONST_FUNC {$retType = null;}
    | n=ID { $name=$n.text;}  // assume its an variable, return its type
      { if (currEnv.varExists($name) == false) { //yani variable nist vali momkene function bashe
        // Function func = root.findByName($name);  //agar functionesh bud bayad baresh gardunim ye ptf besazim baresh bardunim bala bad inaro check kone
        // $retType = new Ptf(func.getTypes(), func.getRetType());
        // $hey =  new Vector<Variable> ();
        // $hey.add(new Variable($name,new Ptf(func.getTypes(), func.getRetType()),0));
        // currEnv.addIfNotExistVar($hey);
        }
        else { //the id exists
          $returnVar = currEnv.getVar($name);
          $retType = $returnVar.getTypeObj();
        }
      }
    | '[' (ex1=expr {$types = new Vector<Type>(); $types.add($ex1.ty);}
      (',' ex2=expr {$types.add($ex2.ty);})*)?']'
    {
      ListType lst;
      lst = new ListType($types.size(), $types, "list");
      $retType = lst;
    }
    | 'nil' //TODO
    | '(' ex3=expr {$retType = $ex3.ty;} ')') {print("other expressions");}
    ;

while_stm //[boolean inWhile]
    : 'while' '(' expr ')'
    {
      handler.push(currEnv);
      num++;
      currEnv = new Env(handler.top(),num);
    }
    statement
    {
      print("while");
      currEnv = handler.pop();
    }
    ;
foreach_stm
    locals [Vector<Variable> vars]
    : 'foreach' '(' t=type var=ID 'in' e=expr ')'
    {
      if ($e.ty.getType().equals("list")) {
        Type elementType = ((ListType)$e.ty).oneType();
        if (elementType != null && elementType.equals($t.ty)) {
          $vars = new Vector<Variable>();
          $vars.add(new Variable($var.text, $t.ty, 0));
          currEnv.addIfNotExistVar($vars);
        }
        else {
          isCorrect = false;
          error("type of " + " ' "  + $var.text +  " ' " + " does not match type of elements of this list " , $var.line);
        }
      }
      else {
        isCorrect = false;
        error("this type is not iteratable",$var.line);
      }
      handler.push(currEnv);
      num++;
      currEnv = new Env(handler.top(),num);
    }
     statement
     {
       currEnv = handler.pop();
       print("foreach");
     }
    ;
return_stm returns [Type tyReturn]//[boolean inLoop]
    : 'return'
      //{ if (!$inLoop){
      //  error("return statement not in loop or function statement", $return.line);
      //  }
      //}
      (e1=expr { $tyReturn = $e1.ty; print("return");})?
    ;
break_stm
    : 'break' {print("break");}
    ;

CONST_NUM:
    [0-9]+ ('.' [0-9]+)?
    ;
CONST_CHAR:
    '\'' . '\''
    ;
CONST_STR:
    '"' ~('\r' | '\n' | '"')* '"'
    ;
CONST_FUNC:
    'tail' | 'head' | 'size' | 'read' | 'write'
    ;
ID:
    [a-zA-Z_][a-zA-Z0-9_]*
    ;
SLC:
    '//'(~[\r\n])* -> skip
    ;
MLC:
    '/*'((~[*])|'*'(~[/])+)*('*')* '*/' -> skip
    ;
WS:
    [ \r\t\n]+ -> skip
    ;
