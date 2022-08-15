package br.com.alura.linguagensapi;

public class Votacao {

    private String nomeLinguagem;
    private int voto;

    public Votacao (String nomeLinguagem, int voto){
        this.nomeLinguagem = nomeLinguagem;
        this.voto = voto;
    }

    public String getNomeLinguagem() {
        return nomeLinguagem;
    }

    public int getVoto() {
        return voto;
    }

    
    
}
