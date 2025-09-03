import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Treinador> treinadores = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Cadastrar novo treinador");
            System.out.println("2 - Mostrar dados do treinador");
            System.out.println("3 - Adicionar Pokémon ao treinador");
            System.out.println("4 - Remover Pokémon do treinador");
            System.out.println("5 - Ganhar medalha de treinador");
            System.out.println("6 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir Enter

            switch (opcao) {
                case 1 -> cadastrarTreinador();
                case 2 -> mostrarDados();
                case 3 -> adicionarPokemon();
                case 4 -> removerPokemon();
                case 5 -> ganharMedalha();
                case 6 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 6);
    }

    private Treinador selecionarTreinador() {
        if (treinadores.isEmpty()) {
            System.out.println("Nenhum treinador cadastrado.");
            return null;
        }

        System.out.println("Selecione um treinador:");
        for (int i = 0; i < treinadores.size(); i++) {
            System.out.println((i + 1) + " - " + treinadores.get(i).getNome());
        }

        int escolha = sc.nextInt();
        sc.nextLine();

        if (escolha < 1 || escolha > treinadores.size()) {
            System.out.println("Treinador inválido.");
            return null;
        }

        return treinadores.get(escolha - 1);
    }

    private void cadastrarTreinador() {
        System.out.print("Digite o nome do treinador: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        treinadores.add(new Treinador(nome, idade));
        System.out.println("Treinador cadastrado com sucesso!");
    }

    private void mostrarDados() {
        Treinador t = selecionarTreinador();
        if (t != null) {
            t.exibirPersonagem();
        }
    }

    private void adicionarPokemon() {
        Treinador treinadorEscolhido = selecionarTreinador();
        if (treinadorEscolhido != null) {
            System.out.print("Digite o nome do Pokémon: ");
            String nomePokemon = sc.nextLine();

            System.out.print("Digite o tipo do Pokémon: ");
            String tipoPokemon = sc.nextLine();

            System.out.print("Digite o nível (1 a 100): ");
            int nivelPokemon = sc.nextInt();
            sc.nextLine();

            Pokemon novoPokemon = new Pokemon(nomePokemon, tipoPokemon, nivelPokemon);
            treinadorEscolhido.adicionarPokemon(novoPokemon);
        }
    }

    private void removerPokemon() {
        Treinador treinadorEscolhido = selecionarTreinador();
        if (treinadorEscolhido != null) {
            System.out.print("Digite o nome do Pokémon que deseja remover da equipe: ");
            String especie = sc.nextLine();
            treinadorEscolhido.removerPokemon(especie);
        }
    }

    private void ganharMedalha() {
        Treinador t = selecionarTreinador();
        if (t != null) {
            System.out.print("Digite o nome da medalha conquistada: ");
            String medalha = sc.nextLine();
            t.adicionarMedalha(medalha);
        }
    }
}