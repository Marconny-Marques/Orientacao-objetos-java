import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do { 
            System.out.println("\n--- Menu ---");
            System.out.println("Deseja cadastrar novos itens? 1-");
            System.out.println("Deseja listar todos os itens cadastrados? 2-");
            System.out.println("Deseja buscar um item pelo nome? 3-");
            System.out.println("Deseja atualizar a quantidade em estoque? 4-");
            System.out.println("Deseja calcular o valor total armazenado em estoque? 5-");
            System.out.println("Deseja exibir os itens com estoque zerado? 6-");
            System.out.println("Deseja exibir os itens ordenados por preço? 7-"); 

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: 

                break;

                case 2: 

                break;

                default:
            }
        } while (opcao == 0);

        scanner.close();
    }
}
