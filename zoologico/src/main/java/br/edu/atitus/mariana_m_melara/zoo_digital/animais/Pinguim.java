package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class Pinguim extends Ave implements Nadador, Predador {
    public Pinguim(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " faz som de pinguim.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo peixe.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando lindamente.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando Krill no gelo.");
    }

}
