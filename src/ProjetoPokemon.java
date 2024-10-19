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

        Pokemon bulbasaur = new Pokemon("Bulbasaur", "tipo", "natureza",
                "habilidade", "evolução", "movimentos", "dormindo");

        //criando um novo objeto Luta e colocando os pokemons para lutarem
        Luta batalha1 = new Luta(pikachu, bulbasaur);
        batalha1.lutar();//o resultado é aleatório

        //adicionando um pokemon e uma insignia ao treinador
        treinador1.adicionarPokemon(pikachu, 0);
        treinador1.adicionarInsignia("alguma insignia", 0);

        //escolhendo um pokemon inicial e exibindo o inventário
        treinador1.escolherPokemonInicial("Pikachu");
        treinador1.exibirInventario();

        //apresentado o pokemon (informaçaões dele)
        System.out.println(pikachu.apresentar());
    }
}
