import java.util.Arrays;

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
    //construtor
    public Pokemon(String nome, String t, String n, String h, String e, String m, String st) {
       this.setNome(nome);
       this.setTipo(t);
       this.setNatureza(n);
       this.setHabilidades(h);
       this.setEvolucao(e);
       this.setMovimentos(m);
       this.setStatus(st);
    }
    //método público para apresentar
    public String apresentar() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", natureza='" + natureza + '\'' +
                ", habilidades='" + habilidades + '\'' +
                ", evolucao='" + evolucao + '\'' +
                ", movimentos='" + movimentos + '\'' +
                ", status='" + status + '\'' +
                ", itens=" + Arrays.toString(itens) +
                '}';
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
}
