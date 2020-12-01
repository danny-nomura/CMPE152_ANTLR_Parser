package com.company;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        MyGrammarLexer lex = new MyGrammarLexer(CharStreams.fromString(
                // PLACE TEST INPUT HERE
            "{\n" +
                    "\tint r; int dd; int a; int d;\n" +
                    "\tr = a; dd = d;\n" +
                    "\twhile( dd <= r ){\n" +
                    "\t   dd = 2*dd;\n" +
                    "\t}\n" +
                    "}"
        ));
        MyGrammarParser parse = new MyGrammarParser(new CommonTokenStream(lex));
        MyGrammarParser.ProgramContext myTree = parse.program();

        // Walking the tree with listener
        ParseTreeWalker myWalker = new ParseTreeWalker();
        TopListener listener = new TopListener();
        myWalker.walk(listener, myTree);
        System.out.println("Tree has been walked by walker");
        System.out.println("Listening has concluded ############################################################");

        // Uncomment below to include visitor runthrough with listener
        /*
        // Visiting tree with visitor
        TopVisitor visitor = new TopVisitor();
        visitor.visit(myTree);
        System.out.println("Tree has been visited by visitor");
        System.out.println("Visiting has concluded ############################################################");
        */
    }
}