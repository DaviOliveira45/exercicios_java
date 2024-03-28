package Ex_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner leitor = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n--- Menu ---\n");
            System.out.println("[1] Adicionar Contato");
            System.out.println("[2] Buscar Contato");
            System.out.println("[3] Sair");
            System.out.print("\nInforme a opção desejada: ");
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    agenda.adicionarContato();
                break;

                case 2:
                    System.out.print("\nInforme o nome do contato desejado: ");
                    String nomeInsert = leitor.nextLine();
                    agenda.buscarContato(nomeInsert);
                    break;
                case 3:
                    System.out.println("> Encerrando o programa...");
                    break;
                default:
                    System.out.println("> Opção inválida!");
            }
        } while (opcao != 3);

        leitor.close();
    }
}
