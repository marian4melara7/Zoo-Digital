package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;
public class Coruja extends Ave implements Voador, Predador {
    public Coruja(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está fazenod 'hu-hu'.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo ratinhos.");
    }

    @Override
    public void voar() {
        System.out.println(this.getNome() + " está voando à noite.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando ratinhos à noite.");
    }
}
