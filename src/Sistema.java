import java.util.ArrayList;

public class Sistema{

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarNovoItem(Produto nome, double preco) {
        if (!this.produtos.contains(nome)) {
            this.produtos.add(nome);
        } else {
            System.out.println("Produto já cadastrado!");
        }
    }

    public void buscarItem(String nome) {
        for(Produto item: produtos) {
            System.out.println(item);
        }
    }
    public void listarItem(Produto produtos){
        for (Produto produto : this.produtos) {
            System.out.println("Produtos:\n" + produto);
            
        }
    }

    public void atualizarPreco(String nome, double preco) {
        for (Produto p: this.produtos) {
            if(p.getNome().equalsIgnoreCase(nome)) {
                p.setPreco(preco);
                System.out.println("Preço atualizado!!");
                return;
            }
        }

        System.out.println("Produto não encontrado!");
    }


}
