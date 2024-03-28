package Ex_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    String titulo;
    String autor;
    String ano;

    Biblioteca (String titulo, String autor, String ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    static List<Biblioteca> biblioteca = new ArrayList<>();

    static void registrarLivros(){

        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de livros a ser inserida: ");
        int quantInsert = Integer.parseInt(leitor.nextLine());

        for(int i = 0; i < quantInsert; i++){
            System.out.println("Informe o nome do Livro: ");
            String titulo = leitor.nextLine();

            System.out.println("Informe o autor do Livro: ");
            String autor = leitor.nextLine();

            System.out.println("Informe o ano de publicação do Livro (DD/MM/AAAA): ");
            String ano = leitor.nextLine();
            System.out.println();

            biblioteca.add(new Biblioteca(titulo, autor, ano));
        }

        
    }

    static void exibirLivros(){

        System.out.println("\n---Informações da Biblioteca---");

        if(biblioteca.isEmpty()){
            System.out.println("- A bibliotecca está vazia!\n");
        }else{
            for(Biblioteca livro : biblioteca){
                System.out.println("- Nome da obra: " + livro.titulo);
                System.out.println("- Autor: " + livro.autor);
                System.out.println("- Ano de publicação: "+ livro.ano);
                System.out.println();
            }
        }
              
    }
}
