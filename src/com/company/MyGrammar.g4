grammar MyGrammar;

program:
        block
        ;

block:
        '{' decls stmts '}'
        ;

decls:
        | decls decl
        ;

decl:
        type ID ';'
        ;

type:
        INT
        | FLOAT
        | BOOL
        ;

stmts:
        | stmts stmt
        ;

assign: ID allexpr ';'
        | ID '=' allexpr ';'
        ;

stmt:
        assign
        | 'if' '(' allexpr ')' stmt
        | 'if' '(' allexpr ')' stmt 'else' stmt
        | 'while' '(' allexpr ')' stmt
        | 'do' stmt 'while' '(' allexpr ')' ';'
        | 'for' '(' assign allexpr ';' incdecexpr ')' stmt
        | 'break' ';'
        | block
        ;

allexpr:
        allexpr OR andexpr
        | andexpr
        ;

andexpr:
        andexpr '&&' equal
        | equal
        ;

equal:
        equal '==' rel
        | equal '!=' rel
        | rel
        ;

rel:
        expr '<' expr
        | expr '<=' expr
        | expr '>' expr
        | expr '>=' expr
        | expr
        ;

expr:
        expr '+' term
        | expr '-' term
        | term
        ;

term:
        term '*' factor
        | term '/' factor
        | factor
        ;

incdecexpr:
        ID INC
        | ID DEC
        ;

factor:
        '(' allexpr ')'
        | incdecexpr
        | ID
        | NUM
        | REAL
        | TRUE
        | FALSE
        ;

OR: '||';
ID : ([a-zA-Z])+;
NUM: ( '-'?[0] | '-'?[1-9][0-9]*);
REAL: '-'?[0-9]+ . [0-9]*[1-9];
TRUE: 'true' | '1';
FALSE: 'false' | '0';
INT: 'int';
FLOAT: 'float';
BOOL: 'bool';
INC: '++';
DEC: '--';
WS : [ \t\r\n]+ -> skip;