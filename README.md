# JLox

Implementação de um interpretador para a linguagem Lox feita em Java seguindo o livro [Crafting Intepreters do Robert Nystrom](https://craftinginterpreters.com/).

## Aprendizado

A partir do conteúdo do livro e desta implementação é possível aprender diversos conceitos de como é implementado uma linguagem de programação, como tokenização, análise estática, análise semântica, etc.

## Funcionalidades extras

Além das funcionalidades implementadas no livro, também são desenvolvidas algumas funcionalidades sugeridas e outras que considerei interessante implementar:

- Comando `break` para a interrupção de loops;
- O comando `print` foi removido em decorrência da criação de uma função `print()`;
- Criada função `exit()` para encerrar o script;
- Criada função `input()` para receber entradas do usuário;