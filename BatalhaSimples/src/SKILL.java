public class SKILL {
    int danobase;
    String elemento;
    int efeitodefesa;
    int efeitocura;
    int efeitofuria;
    String nome;

    public SKILL(int danobase,String elemento,int efeitodefesa , int efeitocura , int efeitofuria,String nome){
        this.danobase = danobase;
        this.elemento = elemento;
        this.efeitodefesa = efeitodefesa;
        this.efeitofuria = efeitofuria;
        this.nome = nome;
        this.efeitocura = efeitocura;
    }
    void calculardano(Personagem atacante,Personagem alvo){
        double dano;
        dano = danobase + ( 1.2 * atacante.job.ataque - alvo.job.defesa);


        atacante.HP += this.efeitocura;
        if(atacante.HP > atacante.HP_max) atacante.HP = atacante.HP_max;

        if (efeitofuria > alvo.HP) {
            dano = dano * 2;

        }

        if(this.elemento.equals(alvo.job.fraqueza)){
            dano *= 1.5;
            System.out.println("Personagem "+atacante.nome+ " Ataca " +alvo.nome+
                    ": Dano = ("+this.danobase+" + 1.2 * "+atacante.job.ataque+
                    " - " +alvo.job.defesa+ ") * 1.5 = " +(int)dano+".");
        }else{
            System.out.println("Personagem "+atacante.nome+ " Ataca " +alvo.nome+
                    ": Dano = ("+this.danobase+" + 1.2 * "+atacante.job.ataque+
                    " - " +alvo.job.defesa+ ")  = " +(int)dano+".");
        }
        alvo.job.defesa -= (alvo.job.defesa * efeitodefesa) / 100;
        if(alvo.job.defesa < 0) alvo.job.defesa = 0;

        if (efeitodefesa > 0){
            System.out.println("Defesa de "+alvo.nome+ " cai pra "+alvo.job.defesa+".\n");
        }

        if (efeitocura > 0){
            System.out.println("O "+atacante.nome+ " cura "+this.efeitocura+ "HP.");
        }

        if (efeitofuria > 0 && alvo.HP > this.efeitofuria){
            System.out.println("Se "+atacante.nome+" Tivesse "+this.efeitofuria+
                    "HP ou menos, o dano seria "+(int)(dano * 2)+ ".");
        }

        if (dano < 0) dano = 0;

        alvo.HP -= dano;

        if (alvo.HP  < 0) alvo.HP = 0;








    }
}
