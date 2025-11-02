package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;
public class Pato extends Ave implements Voador, Corredor, Nadador {
    public Pato(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está grasnando. Quack! Quack!");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo plantinhas aquáticas.");
    }

    @Override
    public void voar() {
        System.out.println(this.getNome() + " Donald, saiu voando.");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo desajeitado.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando na água lindamente.");
    }
}
