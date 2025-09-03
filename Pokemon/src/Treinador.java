import java.util.ArrayList;
import java.util.Scanner;

class Treinador {
    private String nome;
    private int idade;
    private String[] medalhas = new String[8];
    private int qtdMedalhas = 0;
    private ArrayList<Pokemon> equipe = new ArrayList<>();

    public Treinador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirPersonagem() {
        System.out.println("Treinador: " + nome + "\nIdade: " + idade);

        System.out.println("Medalhas:");
        if (qtdMedalhas == 0) {
            System.out.println("Nenhuma medalha");
        } else {
            for (int i = 0; i < qtdMedalhas; i++) {
                System.out.println("- " + medalhas[i]);
            }
        }

        System.out.println("Equipe Pokémon:");
        if (equipe.isEmpty()) {
            System.out.println("Nenhum Pokémon");
        } else {
            for (Pokemon p : equipe) {
                p.exibirPokemon();
            }
        }
    }

    public void adicionarPokemon(Pokemon p) {
        if (equipe.size() < 6) {
            equipe.add(p);
            System.out.println(p.getEspecie() + " adicionado à equipe!");
        } else {
            System.out.println("Equipe cheia! (máx. 6 Pokémon)");
        }
    }

    public void removerPokemon(String especie) {
        for (int i = 0; i < equipe.size(); i++) {
            if (equipe.get(i).getEspecie().equalsIgnoreCase(especie)) {
                equipe.remove(i);
                System.out.println(especie + " foi removido da equipe");
                return;
            }
        }
        System.out.println("Pokémon não encontrado na equipe");
    }

    public void adicionarMedalha(String medalha) {
        if (qtdMedalhas < 8) {
            medalhas[qtdMedalhas] = medalha;
            qtdMedalhas++;
            System.out.println("Medalha " + medalha + " conquistada!");
        } else {
            System.out.println("Já possui todas as medalhas!");
        }
    }

    public String getNome() {
        return nome;
    }
}