package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class Camaleao extends Reptil implements Corredor, Predador {
    public Camaleao(String nome, int idade, boolean temEscamas) {
        super(nome, idade, temEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " não emite som.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo insetos.");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo lentamente.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando insetos.");
    }
}
