package PokemonProjeto.Pessoa;

import PokemonProjeto.Pokemon.Pokemon;

public class Treinador extends Humano{
    //atributos
    private Pokemon[] pokemons = new Pokemon[7];
    private String[] insignias = new String[9];
    int itens;
    //getters e setters
    public int getItens() {
        return itens;
    }
    public void setItens(int itens) {
        this.itens = itens;
    }
    //métodos públicos
    public void escolherPokemonInicial(String nome) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] != null && pokemons[i].getNome().equals(nome))
                System.out.println("Pokemons Escolhido: "+pokemons[i].getNome());
        }
    }
    public void exibirInventario() {
        System.out.println("Inventário: ");
        for (int i = 0; i < insignias.length; i++) {
            if (insignias[i] != null)
                System.out.println(insignias[i]);
        }
    }
    public void adicionarPokemon(Pokemon pokemon, int indice) {
        if (indice >= 0 && indice < pokemons.length) {
            if (pokemons[indice] == null) {
                pokemons[indice] = pokemon;
            } else {
                System.out.println("Já existe um Pokémon nesse índice.");
            }
        } else {
            System.out.println("[ERRO] esse indíce é inválido.");
        }
    }
    public void adicionarInsignia(String insignia, int indice) {
        if (indice >= 0 && indice < insignias.length) {
            insignias[indice] = insignia;
        }
    }
    //método sobrescrito
    @Override
    public void mostrarInformacoes() {
        System.out.println("-----Informações do PokemonProjeto.Pessoa.Treinador-----");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Profissão: "+this.getProfissao());
        System.out.println("Possui super-poder? "+this.getSuperPoder());
        System.out.println("Tipo de super-poder: "+this.getSuperPoder());
        System.out.println("Quantidade de dinheiro:"+this.getDinheiro());
        System.out.println("-------------------");
    }
    public void bolsa (){
        System.out.println("Quantidade de itens: "+this.getItens());
        System.out.println("Quantidade de dinheiro:"+this.getDinheiro());
        exibirInventario();
    }
    public void encontrarPokemonNome (String nome){
        for (int i = 0; i < pokemons.length; i++) {
            if (nome == pokemons[i].getNome()){
                System.out.println("Existe pokémon com este nome");
                pokemons[i].apresentar();

            }
        // Aqui mesma situação do debaixo se quiser resolver o problema da exceção.
        }
    }
    public Pokemon encontrarPokemonIndice (int numero) {
        // Aqui tem que ter um tratamento de exceção ou retirar o return pokemon e colocarrr void
        // caso o numero seja < 0 e maior que pokemon.lengt
        return null;
    }

    public void deletarPokemonIndice (int numero) {
        ///precisa verificar este número
        if (pokemons[numero]!= null) {
            pokemons[numero]= null;
        }
    }
}
