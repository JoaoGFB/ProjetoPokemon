public class PokemonLegends extends Pokemon  {
    private String habitat;
    private String raridade;
    
    public PokemonLegends(String nome, String t, String n, String h, String e, String m, String st, int[] IVs,String habitate, String raridadee) {
        super(nome, t, n, h, e, m, st, IVs);
        this.setHabitat(habitate);
        this.setRaridade(raridadee);
        
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
}
