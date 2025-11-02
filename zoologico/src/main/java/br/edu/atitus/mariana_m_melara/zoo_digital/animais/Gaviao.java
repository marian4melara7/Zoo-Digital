package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;
public class Gaviao extends Ave implements Voador, Predador {
    public Gaviao(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está gritando.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo de tudo.");
    }

    @Override
    public void voar() {
        System.out.println(this.getNome() + " está voando alto.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está no alto caçando insetos e cobras.");
    }
}
