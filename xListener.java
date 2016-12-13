// Generated from x.g4 by ANTLR 4.5.3

  import java.util.*;
  import java.lang.Object;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xParser}.
 */
public interface xListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(xParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(xParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#fordecl}.
	 * @param ctx the parse tree
	 */
	void enterFordecl(xParser.FordeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#fordecl}.
	 * @param ctx the parse tree
	 */
	void exitFordecl(xParser.FordeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#type_fordecl}.
	 * @param ctx the parse tree
	 */
	void enterType_fordecl(xParser.Type_fordeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#type_fordecl}.
	 * @param ctx the parse tree
	 */
	void exitType_fordecl(xParser.Type_fordeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#func_fordecl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_fordecl(xParser.Func_fordeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#func_fordecl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_fordecl(xParser.Func_fordeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(xParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(xParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(xParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(xParser.TypedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(xParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(xParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(xParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(xParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(xParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(xParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(xParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(xParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#other_stm}.
	 * @param ctx the parse tree
	 */
	void enterOther_stm(xParser.Other_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#other_stm}.
	 * @param ctx the parse tree
	 */
	void exitOther_stm(xParser.Other_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#if_stm}.
	 * @param ctx the parse tree
	 */
	void enterIf_stm(xParser.If_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#if_stm}.
	 * @param ctx the parse tree
	 */
	void exitIf_stm(xParser.If_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#if_stm_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_stm_else(xParser.If_stm_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#if_stm_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_stm_else(xParser.If_stm_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(xParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(xParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_assign(xParser.Expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_assign(xParser.Expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or(xParser.Expr_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or(xParser.Expr_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_or_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_tmp(xParser.Expr_or_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_or_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_tmp(xParser.Expr_or_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and(xParser.Expr_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and(xParser.Expr_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_and_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and_tmp(xParser.Expr_and_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_and_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and_tmp(xParser.Expr_and_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(xParser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(xParser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_eq_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq_tmp(xParser.Expr_eq_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_eq_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq_tmp(xParser.Expr_eq_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp(xParser.Expr_cmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp(xParser.Expr_cmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_cmp_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp_tmp(xParser.Expr_cmp_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_cmp_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp_tmp(xParser.Expr_cmp_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(xParser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(xParser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_tmp(xParser.Expr_add_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_tmp(xParser.Expr_add_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(xParser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(xParser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult_tmp(xParser.Expr_mult_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult_tmp(xParser.Expr_mult_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_un}.
	 * @param ctx the parse tree
	 */
	void enterExpr_un(xParser.Expr_unContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_un}.
	 * @param ctx the parse tree
	 */
	void exitExpr_un(xParser.Expr_unContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_mem}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mem(xParser.Expr_memContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_mem}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mem(xParser.Expr_memContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_mem_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mem_tmp(xParser.Expr_mem_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_mem_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mem_tmp(xParser.Expr_mem_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void enterExpr_other(xParser.Expr_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void exitExpr_other(xParser.Expr_otherContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#while_stm}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stm(xParser.While_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#while_stm}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stm(xParser.While_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#foreach_stm}.
	 * @param ctx the parse tree
	 */
	void enterForeach_stm(xParser.Foreach_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#foreach_stm}.
	 * @param ctx the parse tree
	 */
	void exitForeach_stm(xParser.Foreach_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#return_stm}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stm(xParser.Return_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#return_stm}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stm(xParser.Return_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link xParser#break_stm}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stm(xParser.Break_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link xParser#break_stm}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stm(xParser.Break_stmContext ctx);
}