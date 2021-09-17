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

## Exemplo de programa em Lox

```
class ListaLigada {
	init() {
		this.proximo = nil;
		this.valor = nil;
	}

	adiciona(item) {
		var corrente = this;
		while(corrente.valor != nil) {
			corrente = this.proximo;
		}

		corrente.valor = item;
		corrente.proximo = ListaLigada();
	}

	iterar(funcao) {
		var corrente = this;
		while (corrente.proximo != nil) {
			funcao(corrente.valor);
			corrente = corrente.proximo;
		}
	}
}

class Veiculo {
    init(nome) {
        this.nome = nome;
    }
} 

class Carro < Veiculo {
    init(nome, quantidadeDeRodas) {
        super.init(nome);
        this.quantidadeDeRodas = quantidadeDeRodas;
    }
}

fun imprimir(carro) {
	print("Você cadastrou o carro " + carro.nome + " com " + carro.quantidadeDeRodas + " rodas.");
}

fun main() {
	var lista = ListaLigada();
	var sair;

    while (true) {
        var nome = input("Digite o nome do carro: ");
        var quantidadeDeRodas = input("Digite a quantidade de rodas: ");
        
        var carro = Carro(nome, quantidadeDeRodas);
        lista.adiciona(carro);

        print(carro.nome);
        sair = input("Digite 'sim' se deseja sair: ");
        
        if (sair == "sim") {
            break;
        }
    }

    lista.iterar(imprimir);
}

main();
```