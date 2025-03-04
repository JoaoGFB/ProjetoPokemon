package PokemonProjeto.Metodos;
import PokemonProjeto.Pokemon.Pokemon;

import java.util.Random;


public class Luta {
    //atributos

    private Pokemon[] pokemons1 = new Pokemon[6];
    private Pokemon[] pokemons2 = new Pokemon[6];
    //construtor
    public Luta() {

    }
    //getters e setters

    public void lutar6x6(Pokemon p1, Pokemon pk2, Pokemon pk3, Pokemon pk4, Pokemon pk5, Pokemon pk6, Pokemon p2, Pokemon pk8, Pokemon pk9
            , Pokemon pk10, Pokemon pk11, Pokemon pk12) {
        this.setPokemons1(p1, pk2, pk3, pk4, pk5, pk6);
        this.setPokemons2(p2,  pk8, pk9, pk10, pk11, pk12);
    }
    public Pokemon[] getPokemons1() {
        return pokemons1;
    }
    public Pokemon[] getPokemons2() {
        return pokemons2;
    }
    public void setPokemons1(Pokemon p1, Pokemon pk2, Pokemon pk3, Pokemon pk4, Pokemon pk5, Pokemon pk6) {
        pokemons1[0]=pk2;pokemons1[1]=pk3;pokemons1[5]=p1;
        pokemons1[2]=pk4;pokemons1[3]=pk5;pokemons1[4]=pk6;
    }
    public void setPokemons2(Pokemon p2, Pokemon pk8, Pokemon pk9, Pokemon pk10, Pokemon pk11, Pokemon pk12) {
        pokemons2[0]=pk8;pokemons2[1]=pk9; pokemons2[5]=p2;
        pokemons2[2]=pk10;pokemons2[3]=pk11;pokemons2[4]=pk12;
    }
    
    
    public void decidirLuta6x6 (Pokemon[] aa, Pokemon[] bb) {
        int iv1,iv2;
        iv1 = calcIvMult(aa);
        iv2 = calcIvMult(bb);
        if (iv1>iv2){
            System.out.println("O jogador 1 ganhou");
        } else if (iv1==iv2) {
            System.out.println("O jogo foi um empate");    
        }
        else {
            System.out.println("O jogador 2 ganhou");
        }
    }
    

    public int calcIvMult (Pokemon[] a) {
        int iv = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].getIVs().length; j++) {
                iv = iv + a[i].getIVs()[j];
            }
        }
        return iv;
    }

}