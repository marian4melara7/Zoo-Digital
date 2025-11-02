package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public class PeixeMorcego extends Peixes implements Nadador {
    public PeixeMorcego(String nome, int idade, String tipoAgua) {
        super(nome, idade, tipoAgua);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está borbulhando.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo tudo.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando.");
    }
}
