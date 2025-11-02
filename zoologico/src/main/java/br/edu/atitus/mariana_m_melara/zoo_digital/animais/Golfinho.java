package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;



public class Golfinho extends Mamifero implements Nadador {
    public Golfinho(String nome, int idade, boolean temPelo) {
        super(nome, idade, temPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está assoviando.");
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo peixes.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando e brincando.");
    }

}
