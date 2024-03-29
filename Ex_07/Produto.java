package Ex_07;
import java.util.Scanner;
import java.util.List;

public class Produto {

    static Scanner leitor = new Scanner(System.in);

    private String nome;
    private int idProduto;
    private double preco;
    private int quantEmEstoque;

    Produto(String nome, int idProduto, double preco, int quantEmEstoque){
        this.nome = nome;
        this.idProduto = idProduto;
        this.preco = preco;
        this.quantEmEstoque = quantEmEstoque;
    }

    static void adicionarProduto(List<Produto> Estoque){

        System.out.println("\n--- Adicionar Produto ---\n");

        System.out.print("Informe a quantidade de protudos que será inserida: ");
        int quantProdutos = Integer.parseInt(leitor.nextLine());

        for(int i = 0; i < quantProdutos; i++){
            System.out.print("Informe o nome do produto: ");
            String nome = leitor.nextLine();

            System.out.print("Informe o preço do produto: R$");
            double preco = Double.parseDouble(leitor.nextLine());

            System.out.print("Informe a quantidade de " + nome + " a ser inserido(a) no estoque: ");
            int quantEmEstoque = Integer.parseInt(leitor.nextLine());

            Estoque.add(new Produto(nome, Estoque.size() + 1, preco, quantEmEstoque));
        }
    }

    int getIdProduto(){
        return this.idProduto;
    }

    void setNome(String nome){
        this.nome = nome;
        System.out.println("> Nome alterado para " + nome);
    }

    String getNome(){
        return this.nome;
    }

    void setPreco(double preco){
        this.preco = preco;
        System.out.println("> Preço alterado para " + preco);
    }

    double getPreco(){
        return this.preco;
    }

    void setQuantEmEstoque(int quantEmEstoque){
        this.quantEmEstoque = quantEmEstoque;
        System.out.println("> Quantidade em estoque alterado para " + quantEmEstoque);
    }

    int getQuantEmEstoque(){
        return this.quantEmEstoque;
    }

    static void alterarProduto(List<Produto> Estoque){

        System.out.println("\n--- Alterar Produtos ---\n");

        System.out.print("Informe o código do produto que deseja alterar: ");
        int idProduto = Integer.parseInt(leitor.nextLine());

        for (Produto produtos : Estoque) {
            if (produtos.getIdProduto() == idProduto) {

                System.out.println("> Produto " + produtos.getNome() + " selecionado");

                int opcao;
                do {
                    
                    System.out.println("\n[1] Alterar nome");
                    System.out.println("[2] Alterar preço");
                    System.out.println("[3] Alterar quantidade do estoque");
                    System.out.println("[4] Informações do produto");
                    System.out.println("[5] Sair");
                    System.out.print("Informe a opção desejada: ");
                    opcao = Integer.parseInt(leitor.nextLine());

                    switch (opcao) {
                        case 1:
                            System.out.print("Informe o novo nome: ");
                            String setarNome = leitor.nextLine(); 
                            produtos.setNome(setarNome);
                        break;

                        case 2:
                            System.out.print("Informe o novo preço: R$");
                            double setarPreco = Double.parseDouble(leitor.nextLine());
                            produtos.setPreco(setarPreco);
                        break;

                        case 3:
                            System.out.print("Informe a nova quantidade de produtos em estoque: ");
                            int setarQuantEstoque = Integer.parseInt(leitor.nextLine());
                            produtos.setQuantEmEstoque(setarQuantEstoque);
                        break;

                        case 4:
                            System.out.println("\n--- Informações do produto " + produtos.getNome() + " ---\n");
                            System.out.println("Identificador: " + produtos.getIdProduto());
                            System.out.println("Preço: " + produtos.getPreco());
                            System.out.println("Quantidade em estoque: " + produtos.getQuantEmEstoque());
                        break;

                        case 5:
                        break;
                    
                        default:
                            System.out.println("> Opção inválida!");
                        break;
                    }

                } while (opcao != 5);
            }
        }

    }

    void removerDoEstoque(){
        System.out.print("Informe a quantidade que deseja remover: ");
        int quantRemover = Integer.parseInt(leitor.nextLine());

        if (quantRemover > 0 && quantRemover <= this.quantEmEstoque) {
            this.quantEmEstoque -= quantRemover;
            System.out.println("> A quantidade do produto " + this.getNome() + " foi atualizada para " + this.quantEmEstoque);
        } 
    }

    void adicionarAoEstoque(){
        System.out.print("Informe a quantidade que deseja inserir: ");
        int quantAdicionar = Integer.parseInt(leitor.nextLine());

        if (quantAdicionar > 0) {
            this.quantEmEstoque += quantAdicionar;
            System.out.println("> A quantidade do produto " + this.getNome() + " foi atualizada para " + this.quantEmEstoque);
        }
    }

    static void controleEstoque(List<Produto> Estoque){
        System.out.println("\n--- Controle de Estoque ---\n");

        System.out.print("Informe o identificador do produto: ");
        int idProduto = Integer.parseInt(leitor.nextLine());

        if (idProduto >= 0 && idProduto <= (Estoque.size() + 1)) {
            for(Produto produtos : Estoque){
                if (produtos.getIdProduto() == idProduto) {
                    System.out.println("Nome: " + produtos.getNome());
                    System.out.println("Quantidade em estoque: " + produtos.getQuantEmEstoque());

                    int opcao;
                    do {
                        
                        System.out.println("\n[1] Remover quantidade do estoque");
                        System.out.println("[2] Adicionar quantidade ao estoque");
                        System.out.println("[3] Sair");
                        System.out.print("Informe a opção desejada: ");
                        opcao = Integer.parseInt(leitor.nextLine());

                        switch (opcao) {
                            case 1:
                                System.out.println("\n--- Remover ---\n");
                                produtos.removerDoEstoque();
                            break;

                            case 2:
                                System.out.println("\n--- Adicionar ---\n");
                                produtos.adicionarAoEstoque();
                            break;

                            case 3:
                            break;
                        
                            default:
                                System.out.println("> Opção inválida!");
                            break;
                        }

                    } while (opcao != 3);

                }
            }
        }      
    }

    static double montanteEstoque(List<Produto> Estoque){

        double totalEmEstoque = 0;

        for (Produto produtos : Estoque) {
            totalEmEstoque += (produtos.preco * produtos.quantEmEstoque);
        }

        return totalEmEstoque;
    }

    /* 
    List<String> listaDeProdutos(List<Produto> Estoque){

        List<String> listProdutos = new ArrayList<>();

        for (Produto produtosLista : Estoque) {
            String nomeProduto = produtosLista.getNome();
            listProdutos.add(nomeProduto);
        }

        return listProdutos;
    }
    */

    static void relatorioEstoque(List<Produto> Estoque){

        /* 
        List<String> listaDosProdutos = new ArrayList<>();
        listaDosProdutos = listaDeProdutos(Estoque);
        */

        System.out.println("\n--- Relatório do Estoque ---\n");

        /* 
        System.out.println("> Produtos <               > Preços <               > Quantidades <               > Montante <\n");
        for (Produto produtos : Estoque) {
            System.out.println("- " + produtos.getNome() + "               " + "- " + produtos.getPreco() + "               " + "- " + produtos.getQuantEmEstoque() + "               " + "- " + (produtos.getPreco() * produtos.getQuantEmEstoque()));
        }
        */
        System.out.println("> Produtos <           | > Preços <    | > Quantidades < | > Montante < | > Identificador <\n");
        for (Produto produtos : Estoque) {
            System.out.printf("- %-20s | R$ %-10.2f | %-15d | R$ %-10.2f | %-4d\n", produtos.getNome(), produtos.getPreco(), produtos.getQuantEmEstoque(), (produtos.getPreco() * produtos.getQuantEmEstoque()), produtos.idProduto);
        }


        System.out.printf("\n> Montante total em estoque: R$ %-10.2f", montanteEstoque(Estoque));

        /* 
        for (String nomes : listaDosProdutos) {
            System.out.println("- " + nomes);
        }
        */

    }
}