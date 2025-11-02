package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class Salmao extends Peixes implements Nadador, Predador {
    public Salmao(String nome, int idade, String tipoAgua) {
        super(nome, idade, tipoAgua);
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
    public void nadar() {
        System.out.println(this.getNome() + " está nadando contra a corrente.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando insetos na água.");
    }
}
