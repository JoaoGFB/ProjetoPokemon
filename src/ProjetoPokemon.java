public class ProjetoPokemon {
    public static void main(String[] args) {
        //criando o primeiro Pokémon e o inicializando com o vetor IVs1
        int[] IVs1 = {31, 30, 29, 28, 31};
        Pokemon pikachu = new Pokemon("Pikachu", "elétrico", "modesto",
                "static", "raichu", "choque do trovão, onda de choque", "dormindo", IVs1);

        //criando um segundo Pokémon e o inicializando com o vetor IVs2
        int[] IVs2 = {25, 27, 26, 24, 28};
        Pokemon charmander = new Pokemon("Charmander", "fogo", "bravíssimo",
                "chama", "charmeleon", "lança-chamas, garra de dragão", "envenenado", IVs2);

        //criando um Pokémon lendário (objeto da classe PokemonLegend) e inicializando o vetor IVs3
        int[] IVs3 = {31, 31, 30, 29, 31};
        PokemonLegends mewtwo = new PokemonLegends("Mewtwo", "psíquico", "calma",
                "pressão", "nenhuma", "psíquico, bola sombria", "dormindo", IVs3, "caverna", "raro");
        mewtwo.descreverHabitat();//usando o método descreverHabitat

        //apresentado o pokemon (informaçaões dele)
        System.out.println(pikachu.apresentar());

        //criando o treinador (exemplo)
        Treinador treinador1 = new Treinador();
        treinador1.setNome("Giovanni");
        treinador1.setProfissao("Treinador de Pokemon");
        treinador1.seteTreinador(true);
        treinador1.setDinheiro(78.50f);
        treinador1.setItens(4);
        //exibindo as informações do treinador por meio de um método sobrescrito
        treinador1.mostrarInformacoes();

        //adicionando Pokémons e insignias ao treinador
        treinador1.adicionarPokemon(pikachu, 0);  // Pikachu no time
        treinador1.adicionarPokemon(charmander, 1); // Charmander no time
        treinador1.adicionarPokemon(mewtwo, 2);
        treinador1.adicionarInsignia("insígnia da rocha", 0);
        treinador1.adicionarInsignia("insígnia do vulcão", 1);
        treinador1.adicionarInsignia("insígnia da cascata", 2);
        treinador1.adicionarInsignia("insígnia da alma", 3);

        //escolhendo Pokémon inicial e exibindo o inventário (insignias)
        treinador1.escolherPokemonInicial("Mewtwo");
        treinador1.exibirInventario();

        //criando primeira luta (aleatória)
        Luta luta1 = new Luta();
        luta1.luta1x1(pikachu, charmander);

        //criando mais 9 Pokémons para uma luta 6VS6
        int[] IVs4 = {30, 31, 30, 29, 31};
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "planta/venenoso", "calmo",
                "overgrow", "venusaur", "folha navalha, chicote de vinha", "envenenado", IVs4);
        int[] IVs5 = {28, 29, 30, 31, 27};
        Pokemon squirtle = new Pokemon("Squirtle", "água", "ousado",
                "torrent", "blastoise", "jato d'água, casco armado", "molhado", IVs5);
        int[] IVs6 = {31, 28, 27, 30, 31};
        Pokemon eevee = new Pokemon("Eevee", "normal", "jovial",
                "adaptabilidade", "umbreon/espeon", "ataque rápido, investida", "confuso", IVs6);
        int[] IVs7 = {27, 31, 29, 28, 30};
        Pokemon jolteon = new Pokemon("Jolteon", "elétrico", "tímido",
                "voltagem", "evolução final", "choque do trovão, agilidade", "paralisado", IVs7);
        int[] IVs8 = {31, 30, 29, 28, 31};
        Pokemon flareon = new Pokemon("Flareon", "fogo", "valente",
                "flash fire", "evolução final", "lança-chamas, superaquecimento", "queimado", IVs8);
        int[] IVs9 = {29, 31, 30, 27, 28};
        Pokemon snorlax = new Pokemon("Snorlax", "normal", "relaxado",
                "thick fat", "não evolui", "descanso, mega soco", "dormindo", IVs9);
        int[] IVs10 = {31, 28, 29, 31, 30};
        Pokemon alakazam = new Pokemon("Alakazam", "psíquico", "modesto",
                "syncronize", "não evolui", "psíquico, teleporte", "envenenado", IVs10);
        int[] IVs11 = {28, 27, 30, 31, 29};
        Pokemon gengar = new Pokemon("Gengar", "fantasma/venenoso", "travesso",
                "levitação", "não evolui", "bomba de gás, bola sombra", "assombrado", IVs11);
        int[] IVs12 = {30, 31, 29, 28, 31};
        Pokemon dragonite = new Pokemon("Dragonite", "dragão/voador", "firme",
                "inner focus", "não evolui", "raio, ventania", "voando", IVs12);

        //criando segunda luta (comparativa 6VS6)
        Luta luta2 = new Luta();
        luta2.lutar6x6(pikachu, charmander, mewtwo, bulbasaur, squirtle, eevee,
                jolteon, flareon, snorlax, alakazam, gengar, dragonite);
        luta2.DecidirLuta6x6(luta2.getPokemons1(), luta2.getPokemons2());

        //solicitando ao usuário para definir os IVs de um Pokémon
        alakazam.DefinirIVs();
        //exibindo os IVs do Pokémon que foram definidos pelo usuário
        alakazam.ExibirIVs();
    }
}
