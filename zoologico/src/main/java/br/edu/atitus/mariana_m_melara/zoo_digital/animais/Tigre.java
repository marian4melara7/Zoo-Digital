package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class Tigre extends Mamifero implements Nadador, Corredor, Predador {
    public Tigre(String nome, int idade, boolean temPelo) {
        super(nome, idade, temPelo);
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
    public void correr() {
        System.out.println(this.getNome() + " está correndo pela floresta.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando presas.");
    }
}
