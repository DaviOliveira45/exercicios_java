package Ex_03;

import java.util.Scanner;

public class ContaBancaria {
    int numeroConta;
    String nomeTitular;
    double saldo;

    ContaBancaria(int numeroConta, String nomeTitular, double saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    Scanner leitor = new Scanner(System.in);

    void depositar(){
        System.out.println("\n--- Depositar ---\n");

        System.out.print("Informe o valor que deseja depositar: R$");
        double deposito = Double.parseDouble(leitor.nextLine());

        if (deposito > 0) {
            this.saldo += deposito;    
        }
        
    }

    void sacar(){
        System.out.println("\n--- Sacar ---\n");

        System.out.print("Informe o valor que deseja sacar: R$");
        double saque = Double.parseDouble(leitor.nextLine());

        if (saque <= this.saldo && saque > 0) {
            this.saldo -= saque;    
        }
        
    }

    void getSaldo(){
        System.out.println("\n--- Saldo ---\n");

        System.out.println("Nome do Titular: " + this.nomeTitular);
        System.out.println("Saldo da Conta: " + this.saldo);
        System.out.println();
    }
}
