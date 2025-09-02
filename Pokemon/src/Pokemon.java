
public class Pokemon {
    protected String Especie;
    protected String Tipo;
    protected int nivel;

    public Pokemon(String Especie,String Tipo,int nivel){
        this.Especie = Especie;
        this.Tipo = Tipo;
        if (nivel < 1)this.nivel = 1;
        else if (nivel > 100)this.nivel = 100;
        else this.nivel = nivel;
    }

    void exibirinfo(){
        System.out.println("Especie: "+Especie+
                "\ntipo: "+Tipo+
                "\nNivel: "+nivel);
    }
}
