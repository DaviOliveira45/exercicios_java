package Ex_08;
import java.util.Scanner;

import java.util.List;

public class Pedido {
    
    private int numPedido;
    private String sabor;
    private String tamanho;
    private double preco;
    private String endereco;

    Pedido(int numPedido, String sabor, String tamanho, double preco, String endereco){
        this.numPedido = numPedido;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
        this.endereco = endereco;    
    }

    static Scanner leitor = new Scanner(System.in);

    static void adicionarPedido(List<Pedido> Pedidos, List<Pizza> Pizzas){

        double preco = 0;

        System.out.println("\n--- Novo Pedido ---\n");

        System.out.print("Informe o sabor: ");
        String sabor = leitor.nextLine();

        for (Pizza pizza : Pizzas) {
            if (sabor.equalsIgnoreCase(pizza.getNomeSabor())) {
                preco = pizza.getPrecoSabor();
            }
        }
            
        System.out.println("- Tamanhos");
        System.out.println("\n[1] Pequeno");
        System.out.println("[2] Médio");
        System.out.println("[3] Grande");

        String tamanho = "";

        System.out.print("Informe o tamanho da pizza: ");
        int opTamanho = Integer.parseInt(leitor.nextLine());

        if (opTamanho >= 1 && opTamanho <= 3) {
            switch (opTamanho) {
                case 1:
                    tamanho = "Pequeno";
                    preco += 20;
                break;

                case 2:
                    tamanho = "Médio";
                    preco += 45; 
                break;

                case 3:
                    tamanho = "Grande";
                    preco += 60;
                break;
            
                default:
                break;
            }
        }

        System.out.print("Informe o endereço completo: ");
        String endereco = leitor.nextLine();

        Pedidos.add(new Pedido((Pedidos.size() + 1), sabor, tamanho, preco, endereco));
    }

    String getSabor(){
        return this.sabor;
    }

    String getEndereco(){
        return this.endereco;
    }

    String getTamanho(){
        return this.tamanho;
    }

    double getPreco(){
        return this.preco;
    }

    int getNumPedido(){
        return this.numPedido;
    }

     static void informacaoPedido(List<Pedido> Pedidos){

        System.out.println("\n--- Informações do Pedido ---\n");

        System.out.print("Insira o número do pedido: ");
        int idPedido = Integer.parseInt(leitor.nextLine());

        for (Pedido pedido : Pedidos) {
            if (idPedido == pedido.numPedido) {
                System.out.println("Sabor: " + pedido.getSabor());
                System.out.println("Tamanho: " + pedido.getTamanho());
                System.out.println("Preço: " + pedido.getPreco());
                System.out.println("Endereço: " + pedido.getEndereco());
            }
        }
    }

    static void cancelarPedido(List<Pedido> Pedidos){

        System.out.println("\n--- Cancelamento do Pedido ---\n");

        System.out.print("Informe o número do pedido que deseja cancelar: ");
        int idPedido = Integer.parseInt(leitor.nextLine());

        for (Pedido pedido : Pedidos) {
            if (idPedido == pedido.getNumPedido()) {
                Pedidos.remove(pedido);
                System.out.println("> Pedido de número " + pedido.getNumPedido() + " foi CANCELADO!");
                break;
            }
        }
    }

    static double mediaValorPedidos(List<Pedido> Pedidos){

        double mediaPizzas = 0;

        for (Pedido pedido : Pedidos) {
            mediaPizzas += pedido.getPreco();
        }

        return (mediaPizzas / Pedidos.size());
    }

    static void relatorioPedidos(List<Pedido> Pedidos){

        System.out.println("\n--- Relatório dos Pedidos ---\n");

        System.out.println("|---------------------|-----------------|----------------|----------------------------------------------------|-----------------|");
        System.out.println("|      Sabor          |     Tamanho     |     Preço      |                  Endereço                           |   Identificador |");
        System.out.println("|---------------------|-----------------|----------------|----------------------------------------------------|-----------------|");
        for (Pedido pedido : Pedidos) {
            System.out.printf("| %-20s | %-15s | R$ %-10.2f | %-50s | %-15d |\n", pedido.getSabor(), pedido.getTamanho(), pedido.getPreco(), pedido.getEndereco(), pedido.getNumPedido());
        }
        System.out.println("|---------------------|-----------------|----------------|----------------------------------------------------|-----------------|");

        System.out.printf("\n> Total de pedidos: %-5d", Pedidos.size());
        System.out.printf(" | Média do valor dos pedidos: R$ %.2f\n", mediaValorPedidos(Pedidos));
    }
}