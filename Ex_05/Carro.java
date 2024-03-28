package Ex_05;

public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeAtual;

    Carro(String marca, String modelo,  String placa, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    void acelerar(){
        if (this.velocidadeAtual <= 225) {
            this.velocidadeAtual += 5;
            System.out.println("> Velocidade aumentada para " + this.velocidadeAtual);
        }else{
            System.out.println("> Velocidade máxima atingida!");
        }
    }

    void frear(){
        if (this.velocidadeAtual >= 5) {
            this.velocidadeAtual -= 5;
            System.out.println("> Velocidade diminuida para " + this.velocidadeAtual);
        }else{
            System.out.println("> O carro está parado, impossível diminuir a velocidade");
        }
    }

    String getMarca(){
        String marcaCarro = this.marca;
        return marcaCarro;
    }

    String getModelo(){
        String modeloCarro = this.modelo;
        return modeloCarro;
    }

    void infoCarro(){
        System.out.println("--- Informações do Carro ---\n");

        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade atual: " + this.velocidadeAtual);
    }
}
