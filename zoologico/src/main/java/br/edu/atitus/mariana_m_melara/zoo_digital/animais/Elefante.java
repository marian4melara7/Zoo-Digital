package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class Elefante extends Mamifero implements Nadador {
    public Elefante(String nome, int idade, boolean temPelo) {
        super(nome, idade, temPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está trombeteando.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo folhas.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está se banhando no rio.");
    }
}
