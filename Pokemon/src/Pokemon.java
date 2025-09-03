import java.util.ArrayList;
import java.util.Scanner;

// Classe Pokémon
class Pokemon {
    private String especie;
    private String tipo;
    private int nivel;

    public Pokemon(String especie, String tipo, int nivel) {
        this.especie = especie;
        this.tipo = tipo;
        if (nivel < 1) this.nivel = 1;
        else if (nivel > 100) this.nivel = 100;
        else this.nivel = nivel;
    }

    public void exibirPokemon() {
        System.out.println("Espécie: " + especie +
                "\n - Tipo: " + tipo +
                "\n - Nível: " + nivel);
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }
}