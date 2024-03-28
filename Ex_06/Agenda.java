package Ex_06;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> listaContatos;

    Agenda(){
        listaContatos = new ArrayList<>();
    }

    void adicionarContato(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Adicionar Contato ---\n");

        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Telefone: ");
        String telefone = leitor.nextLine();

        listaContatos.add(new Contato(nome, telefone));
    }

    void buscarContato(String nomeContato){
        boolean encontrado = false;
        for(Contato contato : listaContatos){
            if (contato.getNome().equalsIgnoreCase(nomeContato)) {
                System.out.println("\n--- Contato ---\n");
                System.out.println("Nome: " + contato.getNome() + "\nTelefone: " + contato.getTelefone());
                encontrado = true;
            }
        }
        if(encontrado == false){
            System.out.println("> Contato não encontrado!");
        }
    }
}
