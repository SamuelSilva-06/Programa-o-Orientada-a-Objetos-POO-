import java.util.ArrayList;
import java.util.Scanner;

public class Treinador {
    private  String nome;
    int idade;
    String[] Medalhas = new String[8];
    int quntmedalhas = 0;
    ArrayList<Pokemon> Equipe = new ArrayList<>();

    Treinador(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void exibirpersonagem(){
        System.out.println("O treinador: \n" +
                "nome: "+nome+
                "\nIdade"+idade);
        System.out.println("Medalhas: ");

        for (int i = 0; i < quntmedalhas ; i++){
            System.out.println(Medalhas[i]);
        }
        if (quntmedalhas == 0){
            System.out.println("Nenhuma medalha");
        }
        System.out.println("Equipe pokemon: ");
        if (Equipe.isEmpty()){
            System.out.println("Nenhum Pokemon");
        }else{
            for (Pokemon p : Equipe){
                exibirpersonagem();
            }
        }
    }

    void adicionarpokemon(Pokemon p){
        if (Equipe.size() < 0){
            Equipe.add(p);
            System.out.println(p.Especie+" Adicionado a Equipe");
        }else{
            System.out.println("Equipe cheia! (max. 6 pokemon");
        }
    }

    void removerpokemon(String nomePokemon){
        for(Pokemon p:Equipe){
            if (p.Especie.equalsIgnoreCase(nomePokemon)){
                Equipe.remove(p);
                System.out.println(nomePokemon+" Foi removido da equipe");
                return;
            }
        }
        System.out.println("Pokemon nao encontrado na equipe");
    }

    void adicionarmedalha(String Medalha){
        if (quntmedalhas < 8){
            Medalhas[quntmedalhas] = Medalha;
            quntmedalhas++;
            System.out.println("Medalha "+Medalha+" conquistada");


        }else{
            System.out.println("Ja possui todas as medalhas");
        }
    }
    public String getNome(){
        return  nome;
    }
}
