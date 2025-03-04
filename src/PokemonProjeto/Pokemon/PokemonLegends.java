package PokemonProjeto.Pokemon;

public class PokemonLegends extends Pokemon  {
    private String habitat;
    private String raridade;
    private String lendario;
    
    public PokemonLegends(String nome, String t, String n, String h, String e, String m, String st, int[] IVs,String habitate, String raridadee, String lendarioo) {
        super(nome, t, n, h, e, m, st, IVs);
        this.setHabitat(habitate);
        this.setRaridade(raridadee);
        this.setLendario(lendarioo);
        
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitate) {
        this.habitat=habitate;
    }
    public String getRaridade() {
        return raridade;
    }
    public void setRaridade(String raridade1) {
        this.raridade=raridade1;
    }
    public void descreverHabitat () {
        System.out.println("O local que este pokemon habita é :"+this.habitat);
    }
    public void motivoLendario (){
        System.out.println(getLendario());
    }
    public void setLendario (String lendarioo){this.lendario=lendarioo;}
    public String getLendario(){return lendario;}
}
