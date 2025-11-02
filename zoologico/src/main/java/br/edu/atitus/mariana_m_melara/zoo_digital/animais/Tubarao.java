package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;
public class Tubarao extends Peixes implements Nadador, Predador {
    public Tubarao(String nome, int idade, String tipoAgua) {
        super(nome, idade, tipoAgua);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " não faz som.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo peixes.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando rapidamente.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando vários peixes no oceano.");
    }
}
