package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;
public class Lagarto extends Reptil implements Corredor, Predador {
    public Lagarto(String nome, int idade, boolean temEscamas) {
        super(nome, idade, temEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está chiando.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo insetinhos.");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo rapidamente.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando insetos.");
    }
}
