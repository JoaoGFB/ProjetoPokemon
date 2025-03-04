package PokemonProjeto.Pokemon;

import java.util.Arrays;
import java.util.Scanner;

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
    public Pokemon(String nome, String t, String n, String h, String e, String m, String st, int []IVs) {
        this.setNome(nome);
        this.setTipo(t);
        this.setNatureza(n);
        this.setHabilidades(h);
        this.setEvolucao(e);
        this.setMovimentos(m);
        this.setStatus(st);
        this.setIVs(IVs);
    }
    //método público para apresentar
    public String apresentar() {
        return "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", natureza='" + natureza + '\'' +
                ", habilidades='" + habilidades + '\'' +
                ", evolucao='" + evolucao + '\'' +
                ", movimentos='" + movimentos + '\'' +
                ", status='" + status + '\'' +
                ", itens=" + Arrays.toString(itens) +
                '\''+ "IVs=" +'}';
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
}