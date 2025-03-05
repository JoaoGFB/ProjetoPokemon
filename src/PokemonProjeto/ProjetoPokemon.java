package PokemonProjeto;

import PokemonProjeto.Metodos.LutaUm;
import PokemonProjeto.Metodos.LutaSeis;
import PokemonProjeto.Pessoa.Treinador;
import PokemonProjeto.Pokemon.Pokemon;

import java.util.Scanner;

public class ProjetoPokemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Gostaria de ver a introdução pokémon?");
            System.out.println("0_Não\n1_Sim");
            numero = sc.nextInt();
        } while (numero < 0 || numero > 1);
        if (numero == 1) {
            exibirTextoPorPartes();
        }

        AcervoPokemons.criarPokemon("Pikachu", "elétrico", "modesto", "static", "raichu", "choque do trovão, onda de choque", "dormindo", new int[]{31, 30, 29, 28, 31});
        AcervoPokemons.criarPokemon("Charmander", "fogo", "bravíssimo", "chama", "charmeleon", "lança-chamas, garra de dragão", "envenenado", new int[]{25, 27, 26, 24, 28});
        AcervoPokemons.criarPokemon("Mewtwo", "psíquico", "calma", "pressão", "nenhuma", "psíquico, bola sombria", "dormindo", new int[]{31, 31, 30, 29, 31});
        AcervoPokemons.criarPokemon("Bulbasaur", "planta/venenoso", "calmo", "overgrow", "venusaur", "folha navalha, chicote de vinha", "envenenado", new int[]{30, 31, 30, 29, 31});
        AcervoPokemons.criarPokemon("Squirtle", "água", "ousado", "torrent", "blastoise", "jato d'água, casco armado", "molhado", new int[]{28, 29, 30, 31, 27});
        AcervoPokemons.criarPokemon("Eevee", "normal", "jovial", "adaptabilidade", "umbreon/espeon", "ataque rápido, investida", "confuso", new int[]{31, 28, 27, 30, 31});
        AcervoPokemons.criarPokemon("Jolteon", "elétrico", "tímido", "voltagem", "evolução final", "choque do trovão, agilidade", "paralisado", new int[]{27, 31, 29, 28, 30});
        AcervoPokemons.criarPokemon("Flareon", "fogo", "valente", "flash fire", "evolução final", "lança-chamas, superaquecimento", "queimado", new int[]{31, 30, 29, 28, 31});
        AcervoPokemons.criarPokemon("Snorlax", "normal", "relaxado", "thick fat", "não evolui", "descanso, mega soco", "dormindo", new int[]{29, 31, 30, 27, 28});
        AcervoPokemons.criarPokemon("Alakazam", "psíquico", "modesto", "syncronize", "não evolui", "psíquico, teleporte", "envenenado", new int[]{31, 28, 29, 31, 30});
        AcervoPokemons.criarPokemon("Gengar", "fantasma/venenoso", "travesso", "levitação", "não evolui", "bomba de gás, bola sombra", "assombrado", new int[]{28, 27, 30, 31, 29});
        AcervoPokemons.criarPokemon("Dragonite", "dragão/voador", "firme", "inner focus", "não evolui", "raio, ventania", "voando", new int[]{30, 31, 29, 28, 31});

        Treinador treinador1 = new Treinador();
        treinador1.setNome("Giovanni");
        treinador1.setProfissao("Líder do Team Rocket");
        treinador1.setTreinador(true);
        treinador1.setDinheiro(1000.50f);
        treinador1.setItens(5);
        treinador1.adicionarInsignia("Insígnia da Rocha", 0);
        treinador1.adicionarInsignia("Insígnia do Vulcão", 1);
        treinador1.adicionarInsignia("Insígnia da Cascata", 2);
        treinador1.adicionarInsignia("Insígnia da Alma", 3);

        int opcao;
        do {
            System.out.println("\n## Menu Pokémon ##");
            System.out.println("1. Ver Introdução Pokémon");
            System.out.println("2. Escolher Pokémon para Batalha (1x1)");
            System.out.println("3. Escolher Pokémon para Batalha (6x6)");
            System.out.println("4. Exibir IVs de um Pokémon");
            System.out.println("5. Definir IVs de um Pokémon");
            System.out.println("6. Exibir inventário do treinador");
            System.out.println("7- Buscar Pokémon por índice");
            System.out.println("8- Adicionar novo Pokémon");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            int escolha, escolhasFeitas = 0;
            switch (opcao) {
                case 1:
                    exibirTextoPorPartes();
                    break;
                case 2:
                    int[] p = new int[2];
                    while (escolhasFeitas < 2) {
                        System.out.println("\nEscolha o Pokémon para batalha:");
                        AcervoPokemons.exibirListaPokemons();
                        boolean valido;
                        do {
                            System.out.print("Digite o número do " + (escolhasFeitas + 1) + "º Pokémon escolhido: ");
                            escolha = sc.nextInt();
                            valido = escolha >= 1 && escolha <= AcervoPokemons.getPokemons().size();
                            if (escolhasFeitas == 1 && escolha - 1 == p[0]) {
                                System.out.println("Este Pokémon já foi escolhido! Escolha outro.");
                                valido = false;
                            }
                        } while (!valido);
                        p[escolhasFeitas] = escolha - 1;
                        escolhasFeitas++;
                    }
                    LutaUm l = new LutaUm(AcervoPokemons.getPokemons().get(p[0]), AcervoPokemons.getPokemons().get(p[1]));
                    l.lutar();
                    break;
                case 3:
                    Pokemon[] equipe1 = new Pokemon[6];
                    Pokemon[] equipe2 = new Pokemon[6];
                    Pokemon[][] equipes = {equipe1, equipe2};
                    boolean[] escolhidos = new boolean[AcervoPokemons.getPokemons().size()];
                    for (int equipe = 0; equipe < 2; equipe++) {
                        escolhasFeitas = 0;
                        System.out.println("\nEscolha os 6 Pokémon para a Equipe " + (equipe + 1) + ":");
                        while (escolhasFeitas < 6) {
                            System.out.println("\nEscolha o " + (escolhasFeitas + 1) + "º Pokémon da Equipe " + (equipe + 1) + ":");
                            AcervoPokemons.exibirListaPokemons();
                            boolean valido;
                            do {
                                System.out.print("Digite o número do Pokémon escolhido: ");
                                escolha = sc.nextInt();
                                valido = escolha >= 1 && escolha <= AcervoPokemons.getPokemons().size();

                                if (valido && escolhidos[escolha - 1]) {
                                    System.out.println("Este Pokémon já foi escolhido! Escolha outro.");
                                    valido = false;
                                }
                            } while (!valido);
                            equipes[equipe][escolhasFeitas] = AcervoPokemons.getPokemons().get(escolha - 1);
                            escolhidos[escolha - 1] = true; // Marca esse Pokémon como escolhido
                            escolhasFeitas++;
                        }
                    }
                    LutaSeis luta6x6 = new LutaSeis(equipe1, equipe2);
                    luta6x6.lutar();
                    break;
                case 4:
                    do {
                        System.out.println("Digite o número do Pokémon que deseja ver os IVs: ");
                        AcervoPokemons.exibirListaPokemons();
                        escolha = sc.nextInt();
                    } while (escolha < 1 || escolha > AcervoPokemons.getPokemons().size());
                    AcervoPokemons.getPokemons().get(escolha - 1).exibirIVs();
                    break;
                case 5:
                    do {
                        System.out.println("Digite o número do Pokémon que deseja definir os IVs: ");
                        AcervoPokemons.exibirListaPokemons();
                        escolha = sc.nextInt();
                    } while (escolha < 1 || escolha > AcervoPokemons.getPokemons().size());
                    Pokemon pokemonEscolhido = AcervoPokemons.getPokemons().get(escolha - 1);
                    pokemonEscolhido.definirIVs();
                    break;
                case 6:
                    treinador1.exibirInventario();
                    break;
                case 7:
                    do {
                        System.out.println("Digite um índice para buscar um Pokémon: ");
                        escolha = sc.nextInt();
                    } while(escolha < 1 || escolha > 12);
                    AcervoPokemons.buscarPokemonPorIndice(escolha);
                    break;
                case 8:
                    AcervoPokemons.adicionarNovoPokemon();
                    break;
                case 9:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);
        sc.close();
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
