package Ex_08;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Pedido> Pedidos = new ArrayList<>();

        List<Pizza> Pizzas = new ArrayList<>();

        Pizzas.add(new Pizza("Calabresa", 25.90, "Molho de tomate, Queijo Mussarela, Calabresa e Orégano"));
        Pizzas.add(new Pizza("Margherita", 24.90, "Molho de tomate, Queijo Mussarela, Tomate e Manjericão"));
        Pizzas.add(new Pizza("Quatro Queijos", 27.50, "Molho de tomate, Queijo Mussarela, Queijo Gorgonzola, Queijo Provolone e Queijo Parmesão"));
        Pizzas.add(new Pizza("Frango com Catupiry", 28.90, "Molho de tomate, Queijo Mussarela, Frango desfiado e Catupiry"));
        Pizzas.add(new Pizza("Portuguesa", 26.50, "Molho de tomate, Queijo Mussarela, Presunto, Ovo, Cebola, Pimentão e Azeitonas"));
        Pizzas.add(new Pizza("Pepperoni", 29.90, "Molho de tomate, Queijo Mussarela e Pepperoni"));
        Pizzas.add(new Pizza("Napolitana", 27.90, "Molho de tomate, Queijo Mussarela, Anchovas, Azeitonas e Orégano"));
        Pizzas.add(new Pizza("Vegetariana", 28.50, "Molho de tomate, Queijo Mussarela, Tomate, Pimentão, Cebola, Champignon, Milho e Ervilha"));
        Pizzas.add(new Pizza("Baiana", 26.90, "Molho de tomate, Queijo Mussarela, Calabresa, Pimenta, Cebola e Orégano"));
        Pizzas.add(new Pizza("Mussarela", 23.90, "Molho de tomate e Queijo Mussarela"));
        Pizzas.add(new Pizza("Brigadeiro", 30.50, "Brigadeiro e Granulado de Chocolate"));
        Pizzas.add(new Pizza("Banana com Canela", 27.90, "Banana, Leite condensado e Canela"));
        Pizzas.add(new Pizza("Romeu e Julieta", 29.90, "Molho de tomate, Queijo Mussarela, Goiabada e Queijo Minas"));
        Pizzas.add(new Pizza("Alho e Óleo", 25.90, "Molho de tomate, Queijo Mussarela, Alho e Óleo"));
        Pizzas.add(new Pizza("Camarão", 32.90, "Molho de tomate, Queijo Mussarela, Camarão e Catupiry"));
        Pizzas.add(new Pizza("Aliche", 28.90, "Molho de tomate, Queijo Mussarela, Aliche e Orégano"));
        Pizzas.add(new Pizza("Carbonara", 31.50, "Molho de tomate, Queijo Mussarela, Bacon, Ovo e Parmesão"));
        Pizzas.add(new Pizza("Califórnia", 29.90, "Molho de tomate, Queijo Mussarela, Presunto, Abacaxi e Cereja"));
        Pizzas.add(new Pizza("Toscana", 27.50, "Molho de tomate, Queijo Mussarela, Linguiça Toscana, Cebola e Orégano"));
        Pizzas.add(new Pizza("Parmegiana", 30.90, "Molho de tomate, Queijo Mussarela, Filé de frango ou Filé Mignon, Molho de tomate e Parmesão"));
        Pizzas.add(new Pizza("Atum", 28.90, "Molho de tomate, Queijo Mussarela, Atum, Cebola, Azeitona e Orégano"));
        Pizzas.add(new Pizza("Chocolate com Morango", 32.90, "Chocolate, Morango e Leite condensado"));
        Pizzas.add(new Pizza("Bacon", 27.90, "Molho de tomate, Queijo Mussarela e Bacon"));
        Pizzas.add(new Pizza("Mexicana", 29.90, "Molho de tomate, Queijo Mussarela, Carne moída, Pimenta, Cebola e Pimentão"));
        Pizzas.add(new Pizza("Palmito", 26.90, "Molho de tomate, Queijo Mussarela e Palmito"));
        Pizzas.add(new Pizza("Escarola com Bacon", 28.90, "Molho de tomate, Queijo Mussarela, Escarola e Bacon"));
        Pizzas.add(new Pizza("Cheddar com Bacon", 30.50, "Molho de tomate, Queijo Cheddar, Queijo Mussarela e Bacon"));
        Pizzas.add(new Pizza("Brócolis com Bacon", 29.90, "Molho de tomate, Queijo Mussarela, Brócolis e Bacon"));
        Pizzas.add(new Pizza("Chocolate com M&M's", 31.90, "Chocolate e M&M's"));
        Pizzas.add(new Pizza("Morango com Leite Condensado", 30.90, "Molho de tomate, Queijo Mussarela, Morango e Leite condensado"));
        Pizzas.add(new Pizza("Salame", 28.50, "Molho de tomate, Queijo Mussarela e Salame"));
        Pizzas.add(new Pizza("Rúcula com Tomate Seco", 30.90, "Molho de tomate, Queijo Mussarela, Rúcula e Tomate seco"));
        Pizzas.add(new Pizza("Siciliana", 31.50, "Molho de tomate, Queijo Mussarela, Tomate seco, Rúcula, Parmesão e Manjericão"));
        Pizzas.add(new Pizza("Palmito com Champignon", 29.90, "Molho de tomate, Queijo Mussarela, Palmito e Champignon"));
        Pizzas.add(new Pizza("Aliche com Rúcula", 30.50, "Molho de tomate, Queijo Mussarela, Aliche e Rúcula"));
        Pizzas.add(new Pizza("Beringela com Tomate Seco", 30.90, "Molho de tomate, Queijo Mussarela, Berinjela e Tomate seco"));
        Pizzas.add(new Pizza("Brie com Damasco", 31.90, "Molho de tomate, Queijo Brie, Damasco e Rúcula"));
        Pizzas.add(new Pizza("Brócolis com Gorgonzola", 31.50, "Molho de tomate, Queijo Mussarela, Brócolis e Queijo Gorgonzola"));
        Pizzas.add(new Pizza("Camarão com Catupiry", 32.90, "Molho de tomate, Queijo Mussarela, Camarão e Catupiry"));
        Pizzas.add(new Pizza("Carne de Sol", 29.90, "Molho de tomate, Queijo Mussarela, Carne de Sol e Cebola"));
        Pizzas.add(new Pizza("Cheddar com Batata Palha", 30.50, "Molho de tomate, Queijo Cheddar, Batata palha e Bacon"));
        Pizzas.add(new Pizza("Chocolate com Banana", 31.90, "Chocolate e Banana"));
        Pizzas.add(new Pizza("Chocolate com Morango", 32.90, "Chocolate e Morango"));
        Pizzas.add(new Pizza("Escarola com Catupiry", 30.90, "Molho de tomate, Queijo Mussarela, Escarola e Catupiry"));
        Pizzas.add(new Pizza("Figo com Presunto Parma", 31.90, "Molho de tomate, Queijo Mussarela, Figo e Presunto Parma"));
        Pizzas.add(new Pizza("Gorgonzola com Nozes", 31.50, "Molho de tomate, Queijo Gorgonzola e Nozes"));
        Pizzas.add(new Pizza("Lombo com Catupiry", 30.90, "Molho de tomate, Queijo Mussarela, Lombo e Catupiry"));
        Pizzas.add(new Pizza("Pera com Gorgonzola", 31.90, "Molho de tomate, Queijo Mussarela, Pera e Gorgonzola"));

        int opcao1;

        do {
            
            System.out.println("\n--- Pizzaria ---\n");
            System.out.println("\n[1] Cardapio");
            System.out.println("[2] Fazer Pedido");
            System.out.println("[3] Informações Pedido");
            System.out.println("[4] Cancelar Pedido");
            System.out.println("[5] Relatório dos Pedidos");
            System.out.println("[0] Sair");
            System.out.print("Informe a opção desejada: ");
            opcao1 = Integer.parseInt(leitor.nextLine());

            switch (opcao1) {
                case 1:
                    Pizza.menuPizzas(Pizzas);    
                break;

                case 2:
                    Pedido.adicionarPedido(Pedidos, Pizzas);
                break;

                case 3:
                    Pedido.informacaoPedido(Pedidos);
                break;

                case 4:
                    Pedido.cancelarPedido(Pedidos);
                break;

                case 5:
                    Pedido.relatorioPedidos(Pedidos); 
                break;

                case 0:
                break;
            
                default:
                    System.out.println("> Opção inválida!");
                break;
            }

        } while (opcao1 != 0);

        leitor.close();
    }
}
