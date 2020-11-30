// Generated from C:/Users/Danny/IdeaProjects/CMPE152_Parser/src/com/company\MyGrammar.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MyGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MyGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(MyGrammarParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(MyGrammarParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MyGrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MyGrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MyGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MyGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(MyGrammarParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(MyGrammarParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MyGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MyGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#allexpr}.
	 * @param ctx the parse tree
	 */
	void enterAllexpr(MyGrammarParser.AllexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#allexpr}.
	 * @param ctx the parse tree
	 */
	void exitAllexpr(MyGrammarParser.AllexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr(MyGrammarParser.AndexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr(MyGrammarParser.AndexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(MyGrammarParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(MyGrammarParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(MyGrammarParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(MyGrammarParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MyGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MyGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#incdecexpr}.
	 * @param ctx the parse tree
	 */
	void enterIncdecexpr(MyGrammarParser.IncdecexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#incdecexpr}.
	 * @param ctx the parse tree
	 */
	void exitIncdecexpr(MyGrammarParser.IncdecexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MyGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MyGrammarParser.FactorContext ctx);
}