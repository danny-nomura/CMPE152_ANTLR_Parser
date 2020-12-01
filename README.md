# CMPE152_ANTLR_Parser
Parser using the ANTLR compiler generator tool
Designed for SJSU CMPE152 Project #3 by Daniel Nomura

## Setup Instructions
Build this project using the Intellij IDE
Ensure you have enabled ANTLR plug-in for Intellij (4.8 was used for implementation)

1. clone repository to local directory
2. open project `cmpe152_Parser` in Intellij IDE
3. Open `Main.java`
4. Observe `test-file1` input is already placed in lines 11-17
5. Uncomment lines 31-36 to enable visitor running AFTER listener
6. Run `Main.java`
7. Observe output in terminal window labled `4: Run`
8. Compare terminal output with contents of `Visitor_Listener_Outputs` files
9. Replace lines 11-17 with contents of `test-file2`, `test-file3`, or `test-file4`
10. Repeat steps 6 - 9 until confirmed parser works as intended

## Notes
Important files can be found as follows

-ANTLR v4 grammar file         - Listed as MyGrammar.g4 in `CMPE152_Parser/src/com.company`
-Railroad diagrams             - Found as MyGrammar.rrd.html in `CMPE152_Parser`
-generated parser code         - Found as MyGrammarParser.java and MyGrammarLexer.java in `CMPE152_Parser/src/com.company`
-Main driver code              - Found as Main.java in `CMPE152_Parser/src/com.company`
-Listener code                 - Found as TopListener.java in `CMPE152_Parser/src/com.company`
-Visitor code                  - Found as TopVisitor.java in `CMPE152_Parser/src/com.company`
-Example input source programs - Found in CMPE152_Parser/Sample_Inputs
-Source program's parse trees  - Found in CMPE152_Parser/Parse_Trees
-listener and visitor output   - Found in CMPE152_Parser/Visitor_Listener_Outputs
