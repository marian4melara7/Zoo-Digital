package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class Jacare extends Reptil implements Nadador, Predador {
    public Jacare(String nome, int idade, boolean temEscamas) {
        super(nome, idade, temEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está rugindo.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo carne.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando no rio.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando presas na água.");
    }
}
