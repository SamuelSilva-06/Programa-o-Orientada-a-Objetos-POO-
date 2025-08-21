public class Main {
    public static void main(String[] args) {
        Personagem S = new Personagem("Samuel", 100, 75, 1, 10, 50,45,10,100,90);

        Personagem N = new Personagem("Neto", 100, 75, 1, 11, 50,45,10,100,60);
        Batalha B = new Batalha();


        B.iniciarBatalha(S,N);

    }
}