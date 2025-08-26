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
    }
    void calculardano(Personagem atacante,Personagem alvo){
        double dano;
        dano = danobase + (1.2 * (atacante.job.ataque - alvo.job.defesa));
        System.out.println("Personagem "+atacante.nome+ " Ataca " +alvo.nome+);

        alvo.job.defesa -= (alvo.job.defesa / 100) * efeitodefesa;

        atacante.HP += efeitocura;
        if(atacante.Skill.elemento.equals(alvo.job.fraqueza)){
           dano = dano * 1.5;
        } if (efeitofuria > alvo.HP) {
            dano = dano * 2;
        }
        if (dano > alvo.HP){
            System.out.println("Ele morreu");
        }else{
            alvo.HP -=dano;
        }

        alvo.receberdano(dano);






    }
}
