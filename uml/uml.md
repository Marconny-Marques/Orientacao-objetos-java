    classDiagram
    class Produto {
        +String nome
        +double preco
        +int quantidadeEstoque
        +atualizarEstoque(int novaQtd)
        +exibirDetalhes()
    }

    class Jogo {
        +String genero
        +String plataforma
    }

    class Console {
        +String marca
        +String modelo
    }

    class Acessorio {
        +String tipo
    }

    class SistemaLoja {
        -List~Produto~ inventario
        +cadastrarItem(Produto p)
        +listarTodos()
        +buscarPorNome(String nome) Produto
        +atualizarQuantidade(String nome, int qtd)
        +calcularValorTotalEstoque() double
        +exibirItensEstoqueZerado()
        +exibirOrdenadosPorPreco()
    }

    %% Herança
    Produto <|-- Jogo
    Produto <|-- Console
    Produto <|-- Acessorio

    %% Associação
    SistemaLoja "1" o-- "*" Produto : gerencia
