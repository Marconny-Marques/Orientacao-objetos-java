import java.util.ArrayList;

public class Item {
    private String nomeProduto;
    private int id;
    private double preco;
    private int quantidadeEmEstoque;
    
    public Item(String nomeProduto, int id) {
        this.nomeProduto = nomeProduto;
        this.id = id;
    }

    private ArrayList<String> nomes = new ArrayList<>();

    public String getNome() {
        return nomeProduto;
    }

    public void setNomes(ArrayList<String> novosNomes) {
        this.nomes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void cadastrarNovoItem(String nomeProduto, int id) {
        if (!this.nomes.contains(nomeProduto)) {
            this.nomes.add(nomeProduto);
        } else {
            System.out.println("Produto já cadastrado!");
        }
    }

    public void buscarItem(String nomeProduto, int id) {
        for(String item: nomes) {
            System.out.println(item);
        }
    }

}
