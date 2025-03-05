package PokemonProjeto;

import PokemonProjeto.Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class AcervoPokemons {
    private static List<Pokemon> pokemons = new ArrayList<>();

    public static Pokemon criarPokemon(String nome, String tipo, String natureza, String habilidade, String evolucao, String ataques, String status, int[] IVs) {
        Pokemon pokemon = new Pokemon(nome, tipo, natureza, habilidade, evolucao, ataques, status, IVs);
        pokemons.add(pokemon);
        return pokemon;
    }

    public static List<Pokemon> getPokemons() {
        return pokemons;
    }

    public static void exibirListaPokemons() {
        for (int i = 0; i < pokemons.size(); i++) {
            System.out.println((i + 1) + "- " + pokemons.get(i).apresentar());
        }
    }
}
