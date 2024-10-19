abstract class Humano {
    //classe abstrata (não pode ser instanciada diretamente)
    //atributos
    private String nome;
    private String profissao;
    private boolean eTreinador;
    private boolean possuiPoder;
    private String superPoder;
    //método abstrato
    abstract void mostrarInformacoes();
    //getters e setters
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public boolean geteTreinador() {
        return eTreinador;
    }
    public void seteTreinador(boolean eTreinador) {
        this.eTreinador = eTreinador;
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
}
