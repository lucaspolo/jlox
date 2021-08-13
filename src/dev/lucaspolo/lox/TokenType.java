package dev.lucaspolo.lox;

public enum TokenType {
    // Token de caractere único
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    // Tokens de um ou dois caracteres
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // Literais
    IDENTIFIER, STRING, NUMBER,

    // Palavras reservadas
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NUL, OR,
    PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,

    EOF
}
