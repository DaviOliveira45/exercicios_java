package Ex_05;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("McLaren", "P1", "MCL-916hp", 2022));
        carros.add(new Carro("Lamborghini", "Aventador", "LBG-780hp", 2020));
        carros.add(new Carro("Ferrari", "F8 Spider", "FRR-720hp", 2024));

        int opcao;
        do {
            
            System.out.println("\n--- Garagem ---\n");
            System.out.println("[1] Lista de Carros");
            System.out.println("[2] Sair");
            System.out.print("\nInforme a opção desejada: ");
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    int i = 1;
                    int opcaoCar;
                    System.out.println("\n--- Carros ---\n");
                    for(Carro listCarros : carros){
                        System.out.println("[" + i + "] " + listCarros.getMarca() + " " + listCarros.getModelo());
                        i++;
                    }
                    System.out.print("\nInforme o carro desejado: ");
                    opcaoCar = Integer.parseInt(leitor.nextLine());

                    Carro car = carros.get(opcaoCar - 1);

                    int sair;
                    do {
                        System.out.println("\n--- Status " + car.getMarca() + " " + car.getModelo() + " ---\n");
                        System.out.println("[1] Aumentar velocidade");
                        System.out.println("[2] Diminuir velocidade");
                        System.out.println("[3] Informeções do carro");
                        System.out.println("[4] Sair");
                        System.out.print("\nInforme a opção desejada: ");
                        sair = Integer.parseInt(leitor.nextLine());

                        switch (sair) {
                            case 1:
                                car.acelerar();
                            break;

                            case 2:
                                car.frear();
                            break;

                            case 3:
                                car.infoCarro();
                            break;

                            case 4:
                            break;
                        
                            default:
                                System.out.println("> Opção inválida!");
                            break;
                        }
                    } while (sair != 4);

                break;

                case 2:
                break;
            
                default:
                    System.out.println("> Opção inválida!");
                break;
            }

        } while (opcao != 2);

        leitor.close();
    }
}
