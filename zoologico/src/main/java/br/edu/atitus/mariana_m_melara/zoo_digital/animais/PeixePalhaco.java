package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;
public class PeixePalhaco extends Peixes implements Nadador {
    public PeixePalhaco(String nome, int idade, String tipoAgua) {
        super(nome, idade, tipoAgua);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está fazendo bolhas.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo algas.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando no recife.");
    }
}
