package br.edu.atitus.mariana_m_melara.zoo_digital.animais;

import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;

public abstract class Ave extends Animal {
    private String corPenas;

    public Ave(String nome, int idade, String corPenas) {
        super(nome, "Ave", idade);
        this.corPenas = corPenas;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    public void botar() {
        System.out.println(this.getNome() + " está botando.");
    }

}
