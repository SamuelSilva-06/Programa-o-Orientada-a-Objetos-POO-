public class Personagem {
    String nome;
    int HP_max;
    int HP;
    int nivel;
    int velocidade;
    int ataque;
    int defesa;
    int xp;
    int xp_max;
    int xp_ganho;

    public  Personagem (String nome,int HP_max ,int HP,int nivel,int velocidade,int ataque ,int defesa,int xp, int xp_max,int xp_ganho){
        this.nome = nome;
        this.HP_max = HP_max;
        this.HP = HP;
        this.nivel = nivel;
        this.velocidade = velocidade;
        this.ataque = ataque;
        this.defesa = defesa;
        this.xp = xp;
        this.xp_max = xp_max;
        this.xp_ganho = xp_ganho;

    }

    void mostrar_ficha() {
        System.out.println("Personagem de Nome: " + this.nome +
                "\nNivel: " + this.nivel +
                "\nVelocidade: " + this.velocidade +
                "\nHP " + this.HP + "/" + this.HP_max+
                "\nXP "+ this.xp + "/" +this.xp_max+
                "\nDefesa " + this.defesa+"\n");
    }


   public void atacar(Personagem alvo){
        int danocausado = 2*this.ataque - alvo.defesa;
        System.out.println("O " +this.nome+ " Atacou o " +alvo.nome+ " Causando " +danocausado+ " Dano\n");
        alvo.HP -= danocausado;

        if (alvo.HP <= 0){
            alvo.HP = 0;
        }
    }

    public boolean estavivo(){
        return this.HP > 0;
    }

    public void ganharxp(int xp_ganho){
        this.xp += xp_ganho;
            if (this.xp >= this.xp_max){
                this.xp = this.xp - this.xp_max;
                this.nivel++;
                this.defesa = this.defesa + 40;
                System.out.println("O "+this.nome+" Subiu para o nivel " + this.nivel);
        }else{
                System.out.println("O " + this.nome+ " Nao subiu de nivel");
            }
    }

}
