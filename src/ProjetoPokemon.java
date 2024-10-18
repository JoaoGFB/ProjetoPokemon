public class ProjetoPokemon {
    public static void main(String[] args) {
        //criando o treinador (exemplo)
        Treinador treinador1 = new Treinador();
        treinador1.setProfissao("Treinador de Pokemon");
        treinador1.seteTreinador(true);
        treinador1.setDinheiro(78.50f);
        treinador1.setItens(4);

        //criando um pokemon (exemplo)
        Pokemon pikachu = new Pokemon("Pikachu", "Elétrico",
                "Natureza", "Habilidade",
                "evolução", "movimentos", "dormindo");

        treinador1.adicionarPokemon(pikachu, 0);
        treinador1.adicionarInsignia("alguma insignia", 0);

        treinador1.escolherPokemonInicial("Pikachu");
        treinador1.exibirInventario();

        System.out.println(pikachu.apresentar());
    }
}
