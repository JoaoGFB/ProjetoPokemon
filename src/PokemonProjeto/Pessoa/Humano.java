package PokemonProjeto.Pessoa;

abstract class Humano {
    //classe abstrata (não pode ser instanciada diretamente)
    //atributos
    private String nome;
    private String profissao;
    private boolean treinador;
    private boolean possuiPoder;
    private String superPoder;
    private float dinheiro;
    //método abstrato
    abstract void mostrarInformacoes();
    //getters e setters
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public boolean getTreinador() {
        return treinador;
    }
    public void setTreinador(boolean eTreinador) {
        this.treinador = eTreinador;
    }
    public boolean getPossuiPoder() {
        return possuiPoder;
    }
    public void setPossuiPoder(boolean possuiPoder) {
        this.possuiPoder = possuiPoder;
    }
    public String getSuperPoder() {
        return superPoder;
    }
    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }
}
