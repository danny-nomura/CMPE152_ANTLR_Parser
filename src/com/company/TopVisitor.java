package com.company;

import org.antlr.v4.runtime.tree.*;

public class TopVisitor<T> extends MyGrammarBaseVisitor<T> {

    public T visitProgram(MyGrammarParser.ProgramContext ctx) {
        System.out.println("Visited PROGRAM --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitBlock(MyGrammarParser.BlockContext ctx) {
        System.out.println("Visited BLOCK --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitDecls(MyGrammarParser.DeclsContext ctx) {
        System.out.println("Visited DECLS --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitDecl(MyGrammarParser.DeclContext ctx) {
        System.out.println("Visited DECL --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitType(MyGrammarParser.TypeContext ctx) {
        System.out.println("Visited TYPE --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitStmts(MyGrammarParser.StmtsContext ctx) {
        System.out.println("Visited STMTS --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitAssign(MyGrammarParser.AssignContext ctx) {
        System.out.println("Visited ASSIGN --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitStmt(MyGrammarParser.StmtContext ctx) {
        System.out.println("Visited STMT --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitAllexpr(MyGrammarParser.AllexprContext ctx) {
        System.out.println("Visited ALLEXPR --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitAndexpr(MyGrammarParser.AndexprContext ctx) {
        System.out.println("Visited ANDEXPR --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitEqual(MyGrammarParser.EqualContext ctx) {
        System.out.println("Visited EQUAL --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitRel(MyGrammarParser.RelContext ctx) {
        System.out.println("Visited REL --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitExpr(MyGrammarParser.ExprContext ctx) {
        System.out.println("Visited EXPR --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitTerm(MyGrammarParser.TermContext ctx) {
        System.out.println("Visited TERM --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitIncdecexpr(MyGrammarParser.IncdecexprContext ctx) {
        System.out.println("Visited INCDECEXPR --- " + ctx.getText());
        return visitChildren(ctx);
    }

    public T visitFactor(MyGrammarParser.FactorContext ctx) {
        System.out.println("Visited FACTOR --- " + ctx.getText());
        return visitChildren(ctx);
    }
}
