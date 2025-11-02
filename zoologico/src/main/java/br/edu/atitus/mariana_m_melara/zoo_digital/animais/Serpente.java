package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class Serpente extends Reptil implements Nadador, Predador {
    public Serpente(String nome, int idade, boolean temEscamas) {
        super(nome, idade, temEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está sibilando.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo roedores.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando no rio.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando ratos.");
    }
}
