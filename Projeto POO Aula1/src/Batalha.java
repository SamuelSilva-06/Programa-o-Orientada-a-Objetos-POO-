public class Batalha {
    public void iniciarBatalha(Personagem p1, Personagem p2){

        System.out.println("A Batalha entre " + p1.nome + " E " + p2.nome + " Começou!\n");
        int round = 0;

        while (p1.estavivo() && p2.estavivo()){
            round ++;
            System.out.println("Round " +round);
            if (p1.velocidade >= p2.velocidade){
                p1.atacar(p2);
                if (p2.estavivo()){
                    p2.atacar(p1);
                }
            }else{
                p2.atacar(p1);
                if (p1.estavivo()){
                    p1.atacar(p2);
                }
            }

            p1.mostrar_ficha();
            p2.mostrar_ficha();


        }
        if (p1.estavivo()) {
            System.out.println(p1.nome + " venceu!\n");
            System.out.println("O "+p1.nome+" GANH0 "+ p1.xp_ganho+"XP");
            p1.ganharxp(p1.xp_ganho);
        } else {
            System.out.println(p2.nome + " venceu!");
            System.out.println("O "+p2.nome+" GANH0 "+ p2.xp_ganho+"XP");
            p2.ganharxp(p2.xp_ganho);

        }
        p1.mostrar_ficha();
        p2.mostrar_ficha();

    }
}
