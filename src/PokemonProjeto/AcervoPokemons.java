package PokemonProjeto;

import PokemonProjeto.Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static void buscarPokemonPorIndice(int indice) {
        int indiceAjustado = indice-1;
        if (indiceAjustado >= 0 && indiceAjustado < pokemons.size()) {
            System.out.println(pokemons.get(indiceAjustado).apresentar());
        } else {
            System.out.println("Índice inválido! O índice deve estar entre 0 e " + (pokemons.size() - 1));
        }
    }

    public static void adicionarNovoPokemon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Adicionar Novo Pokémon ---");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Tipo: ");
        String tipo = sc.nextLine();

        System.out.print("Natureza: ");
        String natureza = sc.nextLine();

        System.out.print("Habilidade: ");
        String habilidade = sc.nextLine();

        System.out.print("Evolução: ");
        String evolucao = sc.nextLine();

        System.out.print("Ataques (separados por vírgula): ");
        String ataques = sc.nextLine();

        System.out.print("Status: ");
        String status = sc.nextLine();

        int[] IVs = new int[5];
        System.out.println("Informe os IVs (5 valores): ");
        for (int i = 0; i < IVs.length; i++) {
            System.out.println((i+1)+"º IV: ");
            IVs[i] = sc.nextInt();
        }
        sc.nextLine();
        Pokemon novoPokemon = new Pokemon(nome, tipo, natureza, habilidade, evolucao, ataques, status, IVs);
        pokemons.add(novoPokemon);
        System.out.println("**** Pokémon adicionado com sucesso! ****");
    }

    public static void excluirPokemon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Excluir Pokémon ---");
        if (pokemons.isEmpty()) {
            System.out.println("Não há Pokémons para excluir.");
            return;
        }
        exibirListaPokemons();
        System.out.print("Digite o índice do Pokémon que deseja excluir (1 a " + pokemons.size() + "): ");
        int indice = sc.nextInt();
        sc.nextLine();
        int indiceAjustado = indice - 1;
        if (indiceAjustado >= 0 && indiceAjustado < pokemons.size()) {
            Pokemon pokemonRemovido = pokemons.remove(indiceAjustado);
            System.out.println("**** Pokémon removido: " + pokemonRemovido.apresentar()+" ****");
        } else {
            System.out.println("Índice inválido! Nenhum Pokémon foi removido.");
        }
    }
}
