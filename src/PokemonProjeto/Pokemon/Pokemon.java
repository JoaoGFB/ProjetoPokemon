package PokemonProjeto.Pokemon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Pokemon {
    //atributos
    private String nome;
    private String tipo;
    private String natureza;
    private String habilidades;
    private String evolucao;
    private String movimentos;
    private String status;
    private String[] itens = new String[2];
    private int[] IVs = new int[6];
    //construtor
    public Pokemon(String nome, String tipo, String natu, String hab, String evo, String mov, String stat, int []IVs) {
        this.setNome(nome);
        this.setTipo(tipo);
        this.setNatureza(natu);
        this.setHabilidades(hab);
        this.setEvolucao(evo);
        this.setMovimentos(mov);
        this.setStatus(stat);
        this.setIVs(IVs);
    }
    //método público para apresentar
    public String apresentar() {
        return "PokemonProjeto.Pokemon.Pokemon{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", natureza='" + natureza + '\'' +
                "\nhabilidades='" + habilidades + '\'' +
                ", evolucao='" + evolucao + '\'' +
                ", movimentos='" + movimentos + '\'' +
                "\nstatus='" + status + '\'' +
                ", itens=" + Arrays.toString(itens) +
                '\''+ "IVs= [" +this.IVs[0]+","+this.IVs[1]+","+this.IVs[2]+","+this.IVs[3]
                +","+ this.IVs[4]+"] "+'}';
    }
    //geters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNatureza() {
        return natureza;
    }
    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }
    public String getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
    public String getEvolucao() {
        return evolucao;
    }
    public void setEvolucao(String evolucao) {
        this.evolucao = evolucao;
    }
    public String getMovimentos() {
        return movimentos;
    }
    public void setMovimentos(String movimentos) {
        this.movimentos = movimentos;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String[] getItens() {
        return itens;
    }
    public void setItens(String[] itens) {
        this.itens = itens;
    }
    public int[] getIVs() {
        return IVs;
    }
    public void setIVs(int[] IVs){
        this.IVs= IVs;
    }
    // Métodos pokemon
    public void definirIVs() {
        System.out.println("Defina o HP: ");
        this.IVs[0] = verificarIV();
        System.out.println("Defina o Attack: ");
        this.IVs[1] = verificarIV();
        System.out.println("Defina o Defesa: ");
        this.IVs[2] = verificarIV();
        System.out.println("Defina o Especial-Attack: ");
        this.IVs[3] = verificarIV();
        System.out.println("Defina o Especial-Defesa: ");
        this.IVs[4] = verificarIV();
    }
    public int verificarIV () {
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            numero = sc.nextInt();
            System.out.println("IV > 0");
        }while (numero<0);
        return numero;
    }

    public void exibirIVs() {
        System.out.println("Hp: " + this.IVs[0] + " Attack: " + this.IVs[1] + " Defesa: " + this.IVs[2] +
                " Especial-Attack: " + this.IVs[3] + " Especial-Defesa: " + this.IVs[4]);
    }

    public void evoluirPokemon() {
        Random aleatorio = new Random();
        int chance;
        do {
            chance = aleatorio.nextInt(5);
            System.out.println("O pokémon está juntando energia para evoluir...");
        } while (chance != 1);
        System.out.println("O pokémon evoluiu com sucesso.");
    }


}