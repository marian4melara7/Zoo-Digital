package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public abstract class Reptil extends Animal {
    private boolean temEscamas;

    public Reptil(String nome, int idade, boolean temEscamas) {
        super(nome, "Reptil", idade);
        this.temEscamas = temEscamas;
    }

    public boolean isTemEscamas() {
        return temEscamas;
    }

    public void setTemEscamas(boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    public void rastejar() {
        System.out.println(this.getNome() + " está rastejando.");
    }
}
