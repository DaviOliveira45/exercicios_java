package Ex_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<ContaBancaria> Contas = new ArrayList<>();
        
        Contas.add(new ContaBancaria(1, "Davi", 1990789.83));
        Contas.add(new ContaBancaria(2, "Lilian", 12.79));
        Contas.add(new ContaBancaria(3,"Akeno", 20.79));

        int opcaoPrimaria;

        do {
            
            System.out.println("\n--- Banco ---\n");

            System.out.println("[1] Manipular Conta");
            System.out.println("[2] Sair");
            System.out.print("\nInforme a opção desejada: ");
            opcaoPrimaria = Integer.parseInt(leitor.nextLine());

            switch (opcaoPrimaria) {
                case 1:
                    System.out.print("\nInforme o número da conta: ");
                    int contaSelecionada = Integer.parseInt(leitor.nextLine());
            
                    ContaBancaria conta = Contas.get(0);
            
                    if(contaSelecionada >= 1 && contaSelecionada <= 3){
                        conta = Contas.get((contaSelecionada - 1));
                    }
            
                    System.out.println("> A conta de " + conta.nomeTitular + " foi selecionada");

                    
                    int opcao;

                    do {
                        
                        System.out.println("--- Serviços ---");

                        System.out.println("\n[1] Depositar");
                        System.out.println("[2] Sacar");
                        System.out.println("[3] Saldo");
                        System.out.println("[4] Sair");
                        System.out.print("\nInforme a opção desejada: ");
                        opcao = Integer.parseInt(leitor.nextLine());

                        switch (opcao) {
                            case 1:
                                conta.depositar();
                            break;

                            case 2:
                                conta.sacar();
                            break;

                            case 3:
                                conta.getSaldo();
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
