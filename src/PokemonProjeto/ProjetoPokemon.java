package PokemonProjeto;

import PokemonProjeto.Metodos.LutaUm;
import PokemonProjeto.Metodos.LutaSeis;
import PokemonProjeto.Pessoa.Treinador;
import PokemonProjeto.Pokemon.Pokemon;
import PokemonProjeto.Pokemon.PokemonLegends;

import java.util.Scanner;

public class ProjetoPokemon {
    public static void main(String[] args) {
        //explicando o Pokémon
        Scanner sc = new Scanner(System.in);
        String palava;
        int numero;

        do {
            System.out.println("Gostaria de ver a introdução pokémon?");
            System.out.println("0_Não\n1_Sim");
            numero=sc.nextInt();
        } while (numero<0||numero>1);
        if (numero==1) {
            exibirTextoPorPartes();
            System.out.println("digite uma letra para continuar.");
            palava = sc.next();

        }
        System.out.println("------- Abordando os conceitos de POO com a temática de Pokémon -------");
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
                "pressão", "nenhuma", "psíquico, bola sombria", "dormindo", IVs3, "caverna", "raro",
                "Um pokémon lendario, criado artificialmente usando o DNA do lendário pokémon Mew e otimizando a sua genética para o combate.");
        mewtwo.descreverHabitat();//usando o método descreverHabitat

        //apresentado o pokemon (informaçaões dele)
        System.out.println(pikachu.apresentar());

        //criando o treinador (exemplo)
        Treinador treinador1 = new Treinador();
        treinador1.setNome("Giovanni");
        treinador1.setProfissao("PokemonProjeto.Pessoa.Treinador de PokemonProjeto.Pokemon.Pokemon");
        treinador1.setTreinador(true);
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
        LutaUm luta1x1 = new LutaUm (pikachu, charmander);
        luta1x1.lutar();
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


        Pokemon [] equipe1 = {pikachu, charmander, mewtwo, bulbasaur, squirtle, eevee};
        Pokemon [] equipe2 = {jolteon, flareon, snorlax, alakazam, gengar, dragonite};
        LutaSeis luta6x6 = new LutaSeis(equipe1, equipe2);
        luta6x6.lutar();

        //solicitando ao usuário para definir os IVs de um Pokémon
        alakazam.definirIVs();
        //exibindo os IVs do Pokémon que foram definidos pelo usuário
        alakazam.exibirIVs();
    }

    private static void exibirTextoPorPartes() {
        Scanner scanner = new Scanner(System.in);
        String[] partesTexto = {
                "Olá. Bem-vindo ao mundo dos pokémon! Meu nome é Professor Carvalho. Este mundo é habitado por criaturas chamadas de pokémon.",
                "Para algumas pessoas, os pokémons são animais de estimação; outros os usam para lutar entre si. Eu, no entanto, dedico minha vida e profissão a estudá-los.",
                "Cada pokémon tem atributos únicos que influenciam como agem entre si e com as pessoas. Por exemplo, este pokémon chamado <nomedopokemon> possui o tipo <atributos>, o que permite que <exemplo>.",
                "Além disso, cada pokémon pode usar movimentos e habilidades durante as batalhas, e cada movimento está associado a um tipo específico.",
                "Dependendo do tipo do movimento e do pokémon afetado por ele, ele pode ser super-eficaz, ineficaz ou não ser afetado.",
                "Este <nomedopokemon>, por exemplo, é do tipo <tipo> e pode executar um movimento chamado <movimento>.",
                "Conforme um pokémon luta, ele recebe experiência e, com o passar do tempo, atinge novos níveis.",
                "Em certos casos, os pokémons podem evoluir quando chegam a um nível específico, aumentando seus atributos.",
                "Apesar de nem todos os pokémons evoluírem, todos ficam mais fortes quanto mais batalham.",
                "Veja este <nomedopokemon>, que pode evoluir para um <evolucao> quando chegar ao nível <nivel>.",
                "Para me ajudar a catalogar e estudar pokémons, criei a Pokédex, uma enciclopédia de bolso que armazena todas as informações adquiridas de todos os pokémons da região.",
                "Nela, você pode acessar atributos, habilidades e características de todos os pokémons.",
                "Permita-me demonstrar. Olhe o que a Pokédex tem a dizer sobre este <nomedopokemon>: <descricao>. Incrível, não?",
                "Pokémons podem ter diferentes atributos que influenciam suas habilidades.",
                "Entre elas estão as habilidades, que funcionam como uma espécie de efeito ativado dependendo de certas condições.",
                "Este <nomedopokemon> possui a habilidade <habilidade>.",
                "Além disso, há as naturezas que aumentam um atributo de um pokémon, porém diminuem outro.",
                "Cada pokémon possui afinidade em certos atributos, e treinadores experientes chamam isso de 'Valores Individuais' ou 'IVs'.",
                "Quanto mais IVs um pokémon possuir, mais forte ele é.",
                "Durante uma batalha, um pokémon pode ser afetado por certos movimentos, resultando em uma condição.",
                "Os pokémons também podem segurar até um item para ajudá-los em batalha.",
                "Alguns itens são como frutas que, durante certas condições, o pokémon come, causando efeitos variados.",
                "Por exemplo, este <item> faz com que <efeito> quando <condição>.",
                "Por último, um fenômeno raro entre os pokémons é o 'Pokérus', uma espécie de vírus.",
                "Não se sabe exatamente como os pokémons contraem essa doença, mas sabemos que o único efeito dela é causar um aumento no ganho de experiência.",
                "Em todas as regiões do mundo, é possível encontrar pokémons lendários.",
                "Estes pokémons possuem grande poder, mas existem apenas um de suas respectivas espécies e são extremamente difíceis de serem capturados.",
                "Já nós, seres humanos, podemos ter várias profissões, uma delas sendo a de treinador pokémon, na qual interagimos com o jogador.",
                "O jogador é uma pessoa diferente, pois pode interagir com o mundo, enquanto nós não conseguimos interagir apenas com ele.",
                "Existem pessoas especiais que possuem poderes, e elas são tão raras que quase não existem.",
                "Os treinadores não podem levar mais de seis pokémons ao mesmo tempo.",
                "Além disso, os treinadores que possuem as 8 insígnias da região podem tentar derrotar a Elite 4, que são os treinadores mais fortes.",
                "Se conseguir derrotá-los, torna-se um campeão.",
                "Treinadores podem ter outras profissões que, às vezes, definem o tipo de pokémon que usam.",
                "Eles podem ganhar dinheiro batalhando ou vendendo itens que possuem.",
                "A maioria dos itens é destinada ao uso em batalha, como curar o HP do seu pokémon.",
                "As Pokébolas são itens feitos para capturar pokémons.",
                "Algumas Pokébolas têm funções específicas, como a Dive Ball, que serve para facilitar a captura de pokémons debaixo da água; essa é apenas uma entre várias Pokébolas especiais.",
                "Os iniciais são pokémons de três tipos diferentes: água, planta e fogo.",
                "Apenas o jogador e seu rival podem escolher um pokémon inicial para começar a jornada.",
                "Durante a jornada, você pode se deparar com alguma 'barreira' que impeça seu progresso, mas não se preocupe, pois é possível que, durante sua jornada, você encontre algum item que ajude a remover a barreira e prosseguir.",
                "O jogador tem um inventário onde guarda todos os seus itens, incluindo itens especiais, a TM case e Pokébolas.",
                "A TM case serve para guardar discos chamados TM, que possuem a capacidade de ensinar movimentos para os pokémons."
        };

        System.out.println("Pressione Enter para continuar...");

        for (int i = 0; i < partesTexto.length; i++) {
            String parte = partesTexto[i];
            System.out.println(parte);
            scanner.nextLine();
        }
        System.out.println("Fim da introdução.");
    }
}
