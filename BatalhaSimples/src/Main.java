public class Main {
    public static void main(String[] args) {
        SKILL boladefogo =  new SKILL(15,"Fogo",20,0,0,"Bola de fogo");
        SKILL Espadasagrada = new SKILL(25,"luz",0,15,40,"Espada Sagrada");
        JOB NINJA = new JOB("Ninja",30,20,10,"Agua");

        JOB SANIM = new JOB("SANIM",25,30,40,"fogo");
        Personagem N = new Personagem("Sasuke",NINJA,100,75,boladefogo);
        Personagem S = new Personagem("Jiraya",SANIM,100,75,Espadasagrada);
        N.exibirinfo();
        S.exibirinfo();
        N.atacar(S);
    }
}