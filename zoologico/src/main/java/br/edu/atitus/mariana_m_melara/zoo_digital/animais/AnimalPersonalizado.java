package br.edu.atitus.mariana_m_melara.zoo_digital.animais;
import br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.*;


public class AnimalPersonalizado extends Animal implements Voador, Nadador, Corredor, Predador {
    private boolean isCorredor;
    private boolean isNadador;
    private boolean isVoador;
    private boolean isPredador;
    private String som;
    private String comida;

    public AnimalPersonalizado(String nome, int idade, String especie, boolean isCorredor, boolean isNadador,
            boolean isVoador, boolean isPredador, String som, String comida) {
        super(nome, especie, idade);
        this.isCorredor = isCorredor;
        this.isNadador = isNadador;
        this.isVoador = isVoador;
        this.isPredador = isPredador;
        this.som = som;
        this.comida = comida;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " " + som);
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " " + comida);
    }

    @Override
    public void correr() {
        if (isCorredor) {
            System.out.println(this.getNome() + " está correndo.");
        }
    }

    @Override
    public void nadar() {
        if (isNadador) {
            System.out.println(this.getNome() + " está nadando.");
        }
    }

    @Override
    public void voar() {
        if (isVoador) {
            System.out.println(this.getNome() + " está voando.");
        }
    }

    @Override
    public void cacar() {
        if (isPredador) {
            System.out.println(this.getNome() + " está caçando.");
        }
    }
}
