package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class Urubu extends Ave implements Voador, Predador {
    public Urubu(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está grasnando.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo carniça.");
    }

    @Override
    public void voar() {
        System.out.println(this.getNome() + " está voando em círculos.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando carniça.");
    }
}
