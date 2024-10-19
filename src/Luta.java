import java.util.Random;

public class Luta {
    //atributos
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private Pokemon[] pokemons1 = new Pokemon[6];
    private Pokemon[] pokemons2 = new Pokemon[6];
    //construtor
    public Luta() {

    }
    public void luta1x1(Pokemon p1, Pokemon p2) {
        this.setPokemon1(p1);
        this.setPokemon2(p2);
        int IVp1 = CalcularIVUnico(p1);
        int IVp2 = CalcularIVUnico(p2);
        decidirLuta1x1(IVp1, IVp2);
    }
    public void decidirLuta1x1(int IVp1, int IVp2) {
        if (IVp1 > IVp2){
            System.out.println("O jogador 1 venceu a luta");
        } else if (IVp1 < IVp2) {
            System.out.println("O jogador 2 venceu a luta!");
        }
        else {
            System.out.println("Ocorreu um empate");
        }
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
    public void lutar6x6(Pokemon p1, Pokemon pk2,Pokemon pk3, Pokemon pk4,Pokemon pk5, Pokemon pk6,Pokemon p2, Pokemon pk8,Pokemon pk9
            , Pokemon pk10,Pokemon pk11, Pokemon pk12) {
        this.setPokemons1(p1, pk2, pk3, pk4, pk5, pk6);
        this.setPokemons2(p2,  pk8, pk9, pk10, pk11, pk12);
    }
    public Pokemon[] getPokemons1() {
        return pokemons1;
    }
    public Pokemon[] getPokemons2() {
        return pokemons2;
    }
    public void setPokemons1(Pokemon p1, Pokemon pk2,Pokemon pk3, Pokemon pk4,Pokemon pk5, Pokemon pk6) {
        pokemons1[0]=pk2;pokemons1[1]=pk3;pokemons1[5]=p1;
        pokemons1[2]=pk4;pokemons1[3]=pk5;pokemons1[4]=pk6;
    }
    public void setPokemons2(Pokemon p2, Pokemon pk8,Pokemon pk9, Pokemon pk10,Pokemon pk11, Pokemon pk12) {
        pokemons2[0]=pk8;pokemons2[1]=pk9; pokemons2[5]=p2;
        pokemons2[2]=pk10;pokemons2[3]=pk11;pokemons2[4]=pk12;
    }
    
    
    public void DecidirLuta6x6 (Pokemon[] aa, Pokemon[] bb) {
        int iv1,iv2;
        iv1 = CalcularIVMultiplo(aa);
        iv2 = CalcularIVMultiplo(bb);
        if (iv1>iv2){
            System.out.println("O jogador 1 ganhou");
        } else if (iv1==iv2) {
            System.out.println("O jogo foi um empate");    
        }
        else {
            System.out.println("O jogador 2 ganhou");
        }
    }
    
    public int CalcularIVUnico (Pokemon a){
        int iv=0;
        for (int i = 0; i < a.getIVs().length; i++) {
            iv= iv + a.getIVs()[i];
        }
        return iv;        
    }
    public int CalcularIVMultiplo (Pokemon[] a) {
        int iv = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].getIVs().length; j++) {
                iv = iv + a[i].getIVs()[j];
            }
        }
        return iv;
    }
}