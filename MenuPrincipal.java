import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu Principal:");
            System.out.println("1. Entrar Despesa");
            System.out.println("2. Anotar Pagamento");
            System.out.println("3. Listar Despesas em Aberto no período");
            System.out.println("4. Listar Despesas Pagas no período");
            System.out.println("5. Gerenciar Tipos de Despesa");
            System.out.println("6. Gerenciar Usuários");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Chamar método para entrar despesa
                    break;
                case 2:
                    // Chamar método para anotar pagamento
                    break;
                case 3:
                    // Chamar método para listar despesas em aberto
                    break;
                case 4:
                    // Chamar método para listar despesas pagas
                    break;
                case 5:
                    // Chamar método para gerenciar tipos de despesa
                    break;
                case 6:
                    // Chamar método para gerenciar usuários
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }
}
