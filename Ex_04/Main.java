package Ex_04;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();

        jogadores.add(new Jogador("Akeno", 2900, 32));
        jogadores.add(new Jogador("Davi", 10088, 99));
        jogadores.add(new Jogador("Abner", 7944, 81));
        jogadores.add(new Jogador("Lilian", 1211, 26));
        jogadores.add(new Jogador("Ana", 1098, 26));
        jogadores.add(new Jogador("Claudiano", 2855, 30));

        int opcaoPrimaria;

        do {
            
            System.out.println("\n--- Jogadores ---\n");

            System.out.println("[1] Acessar Jogadores");
            System.out.println("[2] Sair");
            System.out.print("\nInforme a opção desejada: ");
            opcaoPrimaria = Integer.parseInt(leitor.nextLine());

            switch (opcaoPrimaria) {
                case 1:
                    System.out.print("\nInforme o número do jogador: ");
                    int contaSelecionada = Integer.parseInt(leitor.nextLine());
            
                    Jogador jogador = jogadores.get(0);
            
                    if(contaSelecionada >= 1 && contaSelecionada <= 6){
                        jogador = jogadores.get((contaSelecionada - 1));
                    }
            
                    System.out.println("> A conta de " + jogador.getNome() + " foi selecionada\n");

                    
                    int opcao;

                    do {
                        
                        System.out.println("--- Opções Avançadas ---");

                        System.out.println("\n[1] Pontuação");
                        System.out.println("[2] Nível");
                        System.out.println("[3] Informações do jogador " + jogador.getNome());
                        System.out.println("[4] Sair");
                        System.out.print("\nInforme a opção desejada: ");
                        opcao = Integer.parseInt(leitor.nextLine());

                        switch (opcao) {
                            case 1:
                                System.out.print("Informe a nova pontuação: ");
                                int pt = Integer.parseInt(leitor.nextLine());
                                jogador.setPontuacao(pt);
                            break;

                            case 2:
                                System.out.print("Informe o novo nível: ");
                                int nv = Integer.parseInt(leitor.nextLine());
                                jogador.setNivel(nv);
                            break;

                            case 3:
                                jogador.getInfoJogador();
                            break;

                            case 4:
                            break;
                        
                            default:
                            break;
                        }

                    } while (opcao != 4);

                break;

                case 2:
                break;
            
                default:
                break;
            }
        } while (opcaoPrimaria != 2);

        leitor.close();
    }
}
