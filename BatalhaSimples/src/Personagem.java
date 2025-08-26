public class Personagem {
    String nome;
    JOB job;
    int HP_max;
    int HP;
    int nivel;
    SKILL Skill;

    public Personagem(String nome,JOB job,int HP_max ,int HP,SKILL Skill){
        this.nome = nome;
        this.job = job;
        this.HP_max = HP_max + this.job.vigor;
        this.HP = this.HP_max;
        this.nivel = 1;
        this.Skill = Skill;
    }

    void exibirinfo(){
        System.out.println("Personagem "+this.nome+
                "\nClasse: "+this.job.nome+ " Nv " +this.nivel+
                "\nHP: "+this.HP+ " / " +this.HP_max+
                "\nAtaque: " +this.job.ataque+
                "\nDefesa: "+this.job.defesa+
                "\nVigor: "+this.job.vigor+
                "\nFraqueza: "+ this.job.fraqueza+
                "\nSkill: "+this.Skill.nome+ " (Base "+this.Skill.danobase+", Tipo "+this.Skill.elemento+
                ", Reduz defesa em "+this.Skill.efeitodefesa+ "%, Cura "+this.Skill.efeitocura+
                ", Furia "+this.Skill.efeitofuria+")\n");
    }

    void atacar(Personagem alvo){
        Skill.calculardano(this,alvo);
    }

    void receberdano(double dano){
        HP -= dano;
    }
}
