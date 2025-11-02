package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;
public class Gato extends Mamifero implements Corredor, Predador {
    public Gato(String nome, int idade, boolean temPelo) {
        super(nome, idade, temPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está miando miau miau.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo ração e peixinhos.");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo atrás de um rato.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando ratinhos e passarinhos.");
    }
}
