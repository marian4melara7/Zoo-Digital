package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;
public class Tartaruga extends Reptil implements Nadador, Predador {
    public Tartaruga(String nome, int idade, boolean temEscamas) {
        super(nome, idade, temEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está quieta, faz sons suaves.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo algas e plantinhas.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando lindamente.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando insetos e peixes na água.");
    }
}
