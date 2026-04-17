import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do { 
            System.out.println("\n--- Menu ---");
            System.out.println("1- Deseja cadastrar novos itens?");
            System.out.println("2- Deseja listar todos os itens cadastrados?");
            System.out.println("3- Deseja buscar um item pelo nome?");
            System.out.println("4- Deseja atualizar a quantidade em estoque?");
            System.out.println("5- Deseja calcular o valor total armazenado em estoque?");
            System.out.println("6- Deseja exibir os itens com estoque zerado?");
            System.out.println("7- Deseja exibir os itens ordenados por preço?"); 

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
