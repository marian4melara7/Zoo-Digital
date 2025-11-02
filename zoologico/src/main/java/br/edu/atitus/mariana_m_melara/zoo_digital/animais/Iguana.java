package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class Iguana extends Reptil implements Corredor, Nadador {
    public Iguana(String nome, int idade, boolean temEscamas) {
        super(nome, idade, temEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está chiando.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo folhas.");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo no chão.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando em água doce.");
    }
}
