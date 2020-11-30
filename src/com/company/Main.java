package com.company;
/*
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello CMPE 152");
    }
}
*/

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {
    public static void main(String[] args) {
        MyGrammarLexer lex = new MyGrammarLexer(CharStreams.fromString(
            "{ \n" +
                    "    int x; int y; float z;\n" +
                    "    x = 3; y = 70; z = 100;\n" +
                    "    while(y<=z){\n" +
                    "        y = y + x;\n" +
                    "        z = z - x;\n" +
                    "    }\n" +
                    "}"
        ));
        MyGrammarParser parse = new MyGrammarParser(new CommonTokenStream(lex));
        MyGrammarParser.ProgramContext myTree = parse.program();

        // Walking the tree with listener
        ParseTreeWalker myWalker = new ParseTreeWalker();
        TopListener listener = new TopListener();
        myWalker.walk(listener, myTree);
        System.out.println("Tree has been walked by walker");

        // Visiting tree with visitor
        TopVisitor visitor = new TopVisitor();
        visitor.visit(myTree);
        System.out.println("Tree has been visited by visitor");
    }
}
