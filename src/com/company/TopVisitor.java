package com.company;

import org.antlr.v4.runtime.tree.*;

public class TopVisitor<T> implements MyGrammarVisitor<T> {

    @Override
    public T visitProgram(MyGrammarParser.ProgramContext ctx) {
        return null;
    }

    @Override
    public T visitBlock(MyGrammarParser.BlockContext ctx) {
        return null;
    }

    @Override
    public T visitDecls(MyGrammarParser.DeclsContext ctx) {
        return null;
    }

    @Override
    public T visitDecl(MyGrammarParser.DeclContext ctx) {
        return null;
    }

    @Override
    public T visitType(MyGrammarParser.TypeContext ctx) {
        return null;
    }

    @Override
    public T visitStmts(MyGrammarParser.StmtsContext ctx) {
        return null;
    }

    @Override
    public T visitAssign(MyGrammarParser.AssignContext ctx) {
        return null;
    }

    @Override
    public T visitStmt(MyGrammarParser.StmtContext ctx) {
        return null;
    }

    @Override
    public T visitAllexpr(MyGrammarParser.AllexprContext ctx) {
        return null;
    }

    @Override
    public T visitAndexpr(MyGrammarParser.AndexprContext ctx) {
        return null;
    }

    @Override
    public T visitEqual(MyGrammarParser.EqualContext ctx) {
        return null;
    }

    @Override
    public T visitRel(MyGrammarParser.RelContext ctx) {
        return null;
    }

    @Override
    public T visitExpr(MyGrammarParser.ExprContext ctx) {
        return null;
    }

    @Override
    public T visitTerm(MyGrammarParser.TermContext ctx) {
        return null;
    }

    @Override
    public T visitIncdecexpr(MyGrammarParser.IncdecexprContext ctx) {
        return null;
    }

    @Override
    public T visitFactor(MyGrammarParser.FactorContext ctx) {
        return null;
    }

    @Override
    public T visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public T visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public T visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public T visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}