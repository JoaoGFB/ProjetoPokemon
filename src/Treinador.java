public class Treinador extends Humano{
    //atributos
    private Pokemon[] pokemons = new Pokemon[7];
    private String[] insignias = new String[9];
    float dinheiro;
    int itens;
    //getters e setters
    public float getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }
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
            pokemons[indice] = pokemon;
        }
    }
    public void adicionarInsignia(String insignia, int indice) {
        if (indice >= 0 && indice < insignias.length) {
            insignias[indice] = insignia;
        }
    }
        //método sobrescrito
    @Override
    void interagirComJogador() {

    }
}
