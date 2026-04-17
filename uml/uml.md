    classDiagram
    class Produto {
        +String nome
        +String descricao
        +double preco
        +int quantidadeEstoque
        +cadastrar()
        +consultar()
        +atualizarPreco(double novoPreco)
    }

    class Jogo {
        +String genero
        +String plataforma
        +String desenvolvedora
    }

    class Console {
        +String marca
        +String modelo
        +int capacidadeArmazenamento
    }

    class Acessorio {
        +String tipo
        +String compatibilidade
    }

    class SistemaLoja {
        -List~Produto~ inventario
        +adicionarItem(Produto p)
        +removerItem(String nome)
        +buscarItem(String nome)
        +listarTudo()
    }

    %% Relacionamentos de Herança
    Produto <|-- Jogo
    Produto <|-- Console
    Produto <|-- Acessorio

    %% Relacionamento de Composição/Gerenciamento
    SistemaLoja "1" *-- "*" Produto : gerencia
