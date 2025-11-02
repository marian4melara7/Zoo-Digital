package br.edu.atitus.mariana_m_melara.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.edu.atitus.mariana_m_melara.zoo_digital.animais.*;

public class ZooDigitalApp {
    private static List<Animal> animais = new ArrayList<>();

    static {
        animais.add(new Cachorro("Rex", 5, true, "Labrador"));
        animais.add(new Golfinho("FreeWilly", 12, false));
        animais.add(new Pato("Donald", 42, "Branco"));
        animais.add(new Pinguim("Feet", 9, "Branco e Preto"));
        animais.add(new Traira("Nemo", 1, "Doce"));
        animais.add(new PeixeMorcego("Batman", 2, "Salgada"));
        animais.add(new Gato("Marcelina", 2, true));
        animais.add(new Elefante("Dumbo", 20, true));
        animais.add(new Coruja("Edwiges", 5, "Branca"));
        animais.add(new Gaviao("Hawkman", 4, "Cinza"));
        animais.add(new Tubarao("Pitucho", 2, "Salgada"));
        animais.add(new PeixePalhaco("Marlin", 3, "Salgada"));
        animais.add(new Cobra("Snape", 7, true));
        animais.add(new Tartaruga("Mestre Huguei", 1000, true));
        animais.add(new Lagarto("Godzilla", 15, true));
        animais.add(new Crocodilo("Abelha", 25, true));
        animais.add(new Leao("Simba", 8, true));
        animais.add(new Tigre("Tigresa", 6, true));
        animais.add(new Urubu("Zumbi", 10, "Preto"));
        animais.add(new Condor("Roberto", 15, "Marrom"));
        animais.add(new Salmao("Sushi", 3, "Doce"));
        animais.add(new Baiacu("Fufi", 4, "Salgada"));
        animais.add(new Jacare("Lagartão", 20, true));
        animais.add(new Iguana("Lizzy", 5, true));
        animais.add(new Serpente("Viper", 4, true));
        animais.add(new Camaleao("Pascal", 2, true));
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            clearScreen();
            System.out.println("=== ZOO DIGITAL ===");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Listar Todos os Animais");
            System.out.println("3. Listar Animais Corredores");
            System.out.println("4. Listar Animais Nadadores");
            System.out.println("5. Listar Animais Voadores");
            System.out.println("6. Listar Animais Predadores");
            System.out.println("7. Exibir Total de Animais");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Opção inválida! Tente novamente.");
                scanner.nextLine();
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarAnimal(scanner);
                    break;
                case 2:
                    listarTodosAnimais();
                    break;
                case 3:
                    listarAnimaisCorredores();
                    break;
                case 4:
                    listarAnimaisNadadores();
                    break;
                case 5:
                    listarAnimaisVoadores();
                    break;
                case 6:
                    listarAnimaisPredadores();
                    break;
                case 7:
                    exibirTotalAnimais();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            if (opcao != 0 && opcao != -1) {
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarAnimal(Scanner scanner) {
        System.out.println("\n=== CADASTRAR ANIMAL ===");
        System.out.println("Tipos disponíveis:");
        System.out.println("1. Cachorro");
        System.out.println("2. Golfinho");
        System.out.println("3. Pato");
        System.out.println("4. Pinguim");
        System.out.println("5. Traira");
        System.out.println("6. PeixeMorcego");
        System.out.println("7. Gato");
        System.out.println("8. Elefante");
        System.out.println("9. Coruja");
        System.out.println("10. Gaviao");
        System.out.println("11. Tubarao");
        System.out.println("12. PeixePalhaco");
        System.out.println("13. Cobra");
        System.out.println("14. Tartaruga");
        System.out.println("15. Lagarto");
        System.out.println("16. Crocodilo");
        System.out.println("17. Leao");
        System.out.println("18. Tigre");
        System.out.println("19. Urubu");
        System.out.println("20. Condor");
        System.out.println("21. Salmao");
        System.out.println("22. Baiacu");
        System.out.println("23. Jacare");
        System.out.println("24. Iguana");
        System.out.println("25. Serpente");
        System.out.println("26. Camaleao");
        System.out.println("27. Animal Personalizado");
        System.out.print("Escolha o tipo: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        Animal animal = null;
        switch (tipo) {
            case 1:
                System.out.print("Raça: ");
                String raca = scanner.nextLine();
                animal = new Cachorro(nome, idade, true, raca);
                break;
            case 2:
                animal = new Golfinho(nome, idade, false);
                break;
            case 3:
                System.out.print("Cor das Penas: ");
                String corPenasPato = scanner.nextLine();
                animal = new Pato(nome, idade, corPenasPato);
                break;
            case 4:
                System.out.print("Cor das Penas: ");
                String corPenasPinguim = scanner.nextLine();
                animal = new Pinguim(nome, idade, corPenasPinguim);
                break;
            case 5:
                animal = new Traira(nome, idade, "Doce");
                break;
            case 6:
                System.out.print("Tipo de Água: ");
                String tipoAguaPeixeMorcego = scanner.nextLine();
                animal = new PeixeMorcego(nome, idade, tipoAguaPeixeMorcego);
                break;
            case 7:
                animal = new Gato(nome, idade, true);
                break;
            case 8:
                animal = new Elefante(nome, idade, true);
                break;
            case 9:
                System.out.print("Cor das Penas: ");
                String corPenasCoruja = scanner.nextLine();
                animal = new Coruja(nome, idade, corPenasCoruja);
                break;
            case 10:
                System.out.print("Cor das Penas: ");
                String corPenasGaviao = scanner.nextLine();
                animal = new Gaviao(nome, idade, corPenasGaviao);
                break;
            case 11:
                System.out.print("Tipo de Água: ");
                String tipoAguaTubarao = scanner.nextLine();
                animal = new Tubarao(nome, idade, tipoAguaTubarao);
                break;
            case 12:
                System.out.print("Tipo de Água: ");
                String tipoAguaPeixePalhaco = scanner.nextLine();
                animal = new PeixePalhaco(nome, idade, tipoAguaPeixePalhaco);
                break;
            case 13:
                animal = new Cobra(nome, idade, true);
                break;
            case 14:
                animal = new Tartaruga(nome, idade, true);
                break;
            case 15:
                animal = new Lagarto(nome, idade, true);
                break;
            case 16:
                animal = new Crocodilo(nome, idade, true);
                break;
            case 17:
                animal = new Leao(nome, idade, true);
                break;
            case 18:
                animal = new Tigre(nome, idade, true);
                break;
            case 19:
                System.out.print("Cor das Penas: ");
                String corPenasUrubu = scanner.nextLine();
                animal = new Urubu(nome, idade, corPenasUrubu);
                break;
            case 20:
                System.out.print("Cor das Penas: ");
                String corPenasCondor = scanner.nextLine();
                animal = new Condor(nome, idade, corPenasCondor);
                break;
            case 21:
                System.out.print("Tipo de Água: ");
                String tipoAguaSalmao = scanner.nextLine();
                animal = new Salmao(nome, idade, tipoAguaSalmao);
                break;
            case 22:
                System.out.print("Tipo de Água: ");
                String tipoAguaBaiacu = scanner.nextLine();
                animal = new Baiacu(nome, idade, tipoAguaBaiacu);
                break;
            case 23:
                animal = new Jacare(nome, idade, true);
                break;
            case 24:
                animal = new Iguana(nome, idade, true);
                break;
            case 25:
                animal = new Serpente(nome, idade, true);
                break;
            case 26:
                animal = new Camaleao(nome, idade, true);
                break;
            case 27:
                System.out.print("Espécie: ");
                String especie = scanner.nextLine();
                System.out.print("Som (ex: está latindo): ");
                String som = scanner.nextLine();
                System.out.print("Comida (ex: está comendo ração): ");
                String comida = scanner.nextLine();
                System.out.print("É corredor? (s/n): ");
                boolean isCorredor = scanner.nextLine().equalsIgnoreCase("s");
                System.out.print("É nadador? (s/n): ");
                boolean isNadador = scanner.nextLine().equalsIgnoreCase("s");
                System.out.print("É voador? (s/n): ");
                boolean isVoador = scanner.nextLine().equalsIgnoreCase("s");
                System.out.print("É predador? (s/n): ");
                boolean isPredador = scanner.nextLine().equalsIgnoreCase("s");
                animal = new AnimalPersonalizado(nome, idade, especie, isCorredor, isNadador, isVoador, isPredador, som,
                        comida);
                break;
            default:
                System.out.println("Tipo inválido!");
                return;
        }

        if (animal != null) {
            animais.add(animal);
            System.out.println("Animal cadastrado com sucesso!");
        }
    }

    private static void listarTodosAnimais() {
        System.out.println("\n=== TODOS OS ANIMAIS ===");
        for (Animal animal : animais) {
            System.out.println("\n--- " + animal.getNome() + " (" + animal.getEspecie() + ") ---");
            System.out.println("Idade: " + animal.getIdade());
            animal.emitirSom();
            animal.comer();
        }
        System.out.println("\n===================================");
    }

    private static void listarAnimaisCorredores() {
        System.out.println("\n=== ANIMAIS CORREDORES ===");
        for (Animal animal : animais) {
            if (animal instanceof br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.Corredor) {
                System.out.println("\n--- " + animal.getNome() + " (" + animal.getEspecie() + ") ---");
                System.out.println("Idade: " + animal.getIdade());
                ((br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.Corredor) animal).correr();
            }
        }
        System.out.println("\n===================================");
    }

    private static void listarAnimaisNadadores() {
        System.out.println("\n=== ANIMAIS NADADORES ===");
        for (Animal animal : animais) {
            if (animal instanceof br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.Nadador) {
                System.out.println("\n--- " + animal.getNome() + " (" + animal.getEspecie() + ") ---");
                System.out.println("Idade: " + animal.getIdade());
                ((br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.Nadador) animal).nadar();
            }
        }
        System.out.println("\n===================================");
    }

    private static void listarAnimaisVoadores() {
        System.out.println("\n=== ANIMAIS VOADORES ===");
        for (Animal animal : animais) {
            if (animal instanceof br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.Voador) {
                System.out.println("\n--- " + animal.getNome() + " (" + animal.getEspecie() + ") ---");
                System.out.println("Idade: " + animal.getIdade());
                ((br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.Voador) animal).voar();
            }
        }
        System.out.println("\n===================================");
    }

    private static void listarAnimaisPredadores() {
        System.out.println("\n=== ANIMAIS PREDADORES ===");
        for (Animal animal : animais) {
            if (animal instanceof br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.Predador) {
                System.out.println("\n--- " + animal.getNome() + " (" + animal.getEspecie() + ") ---");
                System.out.println("Idade: " + animal.getIdade());
                ((br.edu.atitus.mariana_m_melara.zoo_digital.comportamentos.Predador) animal).cacar();
            }
        }
        System.out.println("\n===================================");
    }

    private static void exibirTotalAnimais() {
        System.out.println("\nTotal de animais: " + Animal.getContador());
    }
}
