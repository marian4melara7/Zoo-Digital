package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class Cachorro extends Mamifero implements Nadador, Corredor, Predador {
    private String raca;

    public Cachorro(String nome, int idade, boolean temPelo, String raca) {
        super(nome, idade, temPelo);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está latindo.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo ração.");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo atrás da bolinha.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando cachorrinho.");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando a meia que roubou.");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
