// Generated from C:/Users/Danny/IdeaProjects/CMPE152_Parser/src/com/company\MyGrammar.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MyGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(MyGrammarParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MyGrammarParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MyGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(MyGrammarParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MyGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#allexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllexpr(MyGrammarParser.AllexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#andexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpr(MyGrammarParser.AndexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(MyGrammarParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(MyGrammarParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MyGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#incdecexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncdecexpr(MyGrammarParser.IncdecexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MyGrammarParser.FactorContext ctx);
}