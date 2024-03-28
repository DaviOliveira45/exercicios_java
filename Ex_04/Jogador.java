package Ex_04;

public class Jogador {

    private String nome;
    private int pontuacao;
    private int nivel;

    Jogador(String nome, int pontuacao, int nivel){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    String getNome(){
        String nomeJogador = this.nome;
        return nomeJogador;

    }

    void setPontuacao(int newPontuacao){
        this.pontuacao = newPontuacao;
        System.out.println("\n> Pontuação alterada para " + this.pontuacao);
        System.out.println();
    }

    void setNivel(int newNivel){
        this.nivel = newNivel;
        System.out.println("\n> Nível alterado para " + this.nivel);
        System.out.println();
    }

    void getInfoJogador(){
        String getNome = this.nome;
        int getPontuacao = this.pontuacao;
        int getNivel = this.nivel;

        System.out.println("\n--- Informações do Jogador ---\n");
        System.out.println("- Nome: " + getNome + "\n- Pontuação: " + getPontuacao + "\n- Nível: " + getNivel);
        System.out.println();
    }
}
