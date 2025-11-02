package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class Traira extends Peixes implements Nadador {
    public Traira(String nome, int idade, String tipoAgua) {
        super(nome, idade, tipoAgua);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está fazendo som de peixe.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo lambari.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando no rio.");
    }
}
