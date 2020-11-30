package com.company;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TopListener extends MyGrammarBaseListener{
    @Override
    public void enterProgram(MyGrammarParser.ProgramContext ctx) {
        System.out.println("Entered PROGRAM --- " + ctx.getText());
    }

    @Override
    public void exitProgram(MyGrammarParser.ProgramContext ctx) {

    }

    @Override
    public void enterBlock(MyGrammarParser.BlockContext ctx) {
        System.out.println("Entered BLOCK --- " + ctx.getText());
    }

    @Override
    public void exitBlock(MyGrammarParser.BlockContext ctx) { }

    @Override
    public void enterDecls(MyGrammarParser.DeclsContext ctx) {
        System.out.println("Entered DECLS --- " + ctx.getText());
    }

    @Override
    public void exitDecls(MyGrammarParser.DeclsContext ctx) { }

    @Override
    public void enterDecl(MyGrammarParser.DeclContext ctx) {
        System.out.println("Entered DECL --- " + ctx.getText());
    }

    @Override
    public void exitDecl(MyGrammarParser.DeclContext ctx) { }

    @Override
    public void enterType(MyGrammarParser.TypeContext ctx) {
        System.out.println("Entered TYPE --- " + ctx.getText());
    }

    @Override
    public void exitType(MyGrammarParser.TypeContext ctx) { }

    @Override
    public void enterStmts(MyGrammarParser.StmtsContext ctx) {
        System.out.println("Entered STMTS --- " + ctx.getText());
    }

    @Override
    public void exitStmts(MyGrammarParser.StmtsContext ctx) { }

    @Override
    public void enterAssign(MyGrammarParser.AssignContext ctx) {
        System.out.println("Entered ASSIGN --- " + ctx.getText());
    }

    @Override
    public void exitAssign(MyGrammarParser.AssignContext ctx) { }

    @Override
    public void enterStmt(MyGrammarParser.StmtContext ctx) {
        System.out.println("Entered STMT --- " + ctx.getText());
    }

    @Override
    public void exitStmt(MyGrammarParser.StmtContext ctx) { }

    @Override
    public void enterAllexpr(MyGrammarParser.AllexprContext ctx) {
        System.out.println("Entered ALLEXPR --- " + ctx.getText());
    }

    @Override
    public void exitAllexpr(MyGrammarParser.AllexprContext ctx) { }

    @Override
    public void enterAndexpr(MyGrammarParser.AndexprContext ctx) {
        System.out.println("Entered ANDEXPR --- " + ctx.getText());
    }

    @Override
    public void exitAndexpr(MyGrammarParser.AndexprContext ctx) { }

    @Override
    public void enterEqual(MyGrammarParser.EqualContext ctx) {
        System.out.println("Entered EQUAL --- " + ctx.getText());
    }

    @Override
    public void exitEqual(MyGrammarParser.EqualContext ctx) { }

    @Override
    public void enterRel(MyGrammarParser.RelContext ctx) {
        System.out.println("Entered REL --- " + ctx.getText());
    }

    @Override
    public void exitRel(MyGrammarParser.RelContext ctx) { }

    @Override
    public void enterExpr(MyGrammarParser.ExprContext ctx) {
        System.out.println("Entered EXPR --- " + ctx.getText());
    }

    @Override
    public void exitExpr(MyGrammarParser.ExprContext ctx) { }

    @Override
    public void enterTerm(MyGrammarParser.TermContext ctx) {
        System.out.println("Entered TERM --- " + ctx.getText());
    }

    @Override
    public void exitTerm(MyGrammarParser.TermContext ctx) { }

    @Override
    public void enterIncdecexpr(MyGrammarParser.IncdecexprContext ctx) {
        System.out.println("Entered INCDECEXPR --- " + ctx.getText());
    }

    @Override
    public void exitIncdecexpr(MyGrammarParser.IncdecexprContext ctx) { }

    @Override
    public void enterFactor(MyGrammarParser.FactorContext ctx) {
        System.out.println("Entered FACTOR --- " + ctx.getText());
    }

    @Override
    public void exitFactor(MyGrammarParser.FactorContext ctx) { }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("Entered EVERY RULE --- " + ctx.getText());
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) { }

    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println("Visited TERMINAL --- " + node.getText());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println("Visited ERROR NODE --- " + node.getText());
    }

}