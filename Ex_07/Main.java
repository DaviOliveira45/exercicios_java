package Ex_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Produto> Estoque = new ArrayList<Produto>();

        Estoque.add(new Produto("Doritos", 1, 11.99, 90));
        Estoque.add(new Produto("Coca-Cola", 2, 5.99, 100));
        Estoque.add(new Produto("Chocolate", 3, 3.49, 80));
        Estoque.add(new Produto("Batata Chips", 4, 4.99, 70));
        Estoque.add(new Produto("Água Mineral", 5, 1.99, 120));
        Estoque.add(new Produto("Salgadinho", 6, 2.99, 110));
        Estoque.add(new Produto("Refrigerante", 7, 4.49, 95));
        Estoque.add(new Produto("Biscoito", 8, 2.49, 85));
        Estoque.add(new Produto("Suco de Laranja", 9, 6.99, 60));
        Estoque.add(new Produto("Cerveja", 10, 3.99, 75));
        Estoque.add(new Produto("Pipoca", 11, 2.79, 65));
        Estoque.add(new Produto("Barra de Cereal", 12, 1.49, 110));
        Estoque.add(new Produto("Pizza Congelada", 13, 8.99, 45));
        Estoque.add(new Produto("Sorvete", 14, 7.49, 55));
        Estoque.add(new Produto("Leite", 15, 3.29, 70));
        Estoque.add(new Produto("Café", 16, 4.79, 90));
        Estoque.add(new Produto("Manteiga", 17, 2.99, 80));
        Estoque.add(new Produto("Pão", 18, 1.99, 100));
        Estoque.add(new Produto("Iogurte", 19, 3.49, 75));
        Estoque.add(new Produto("Macarrão", 20, 2.29, 85));

        int opcao;

        do {
            
            System.out.println("\n--- Mercado ---\n");
            System.out.println("[1] Adicionar Produto");
            System.out.println("[2] Alterar Produto");
            System.out.println("[3] Gerenciar Estoque");
            System.out.println("[4] Gerar Relatório");
            System.out.println("[5] Sair");
            System.out.print("Informe a opção desejada: ");
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    Produto.adicionarProduto(Estoque);
                break;

                case 2:
                    Produto.alterarProduto(Estoque);
                break;

                case 3:
                    Produto.controleEstoque(Estoque);
                break;

                case 4:
                    Produto.relatorioEstoque(Estoque);
                break;

                case 5:
                break;
            
                default:
                    System.out.println("> Opção inválida!");
                break;
            }

        } while (opcao != 5);

        leitor.close();
    }
}
