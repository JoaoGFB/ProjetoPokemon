import java.util.Random;

public class Luta {
    //atributos
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    //construtor
    public Luta(Pokemon p1, Pokemon p2) {
        this.setPokemon1(p1);
        this.setPokemon2(p2);
    }
    //método público
    public void lutar() {
        System.out.println(this.getPokemon1()+" VS "+this.getPokemon2());
        Random aleatorio = new Random();
        int ganhador = aleatorio.nextInt(2);
        System.out.println("Resultado");
        switch (ganhador) {
            case 0:
                System.out.println(this.getPokemon1().getNome()+" venceu a luta");
                break;
            case 1:
                System.out.println(this.getPokemon2().getNome()+" venceu a luta");
                break;
        }
    }
    //getters e setters
    public Pokemon getPokemon1() {
        return pokemon1;
    }
    public void setPokemon1(Pokemon pokemon1) {
        this.pokemon1 = pokemon1;
    }
    public Pokemon getPokemon2() {
        return pokemon2;
    }
    public void setPokemon2(Pokemon pokemon2) {
        this.pokemon2 = pokemon2;
    }
}
