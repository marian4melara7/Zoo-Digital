package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;
public class Cobra extends Reptil implements Predador {
    public Cobra(String nome, int idade, boolean temEscamas) {
        super(nome, idade, temEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está sibilando.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo ratinhos.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando ratinhos na mata.");
    }
}
