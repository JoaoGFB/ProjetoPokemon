package PokemonProjeto.Metodos;

import PokemonProjeto.Pokemon.Pokemon;

public class Luta1x1 implements LutaInterface{
    private Pokemon pokemon1;
    private Pokemon pokemon2;

    public Luta1x1(Pokemon p1, Pokemon p2) {
        this.pokemon1 = p1;
        this.pokemon2 = p2;
    }

    @Override
    public void lutar() {
        int IVp1 = calcularIV(pokemon1);
        int IVp2 = calcularIV(pokemon2);
        decidirLuta1x1(IVp1, IVp2);
    }

    private void decidirLuta1x1(int IVp1, int IVp2) {
        if (IVp1 > IVp2) {
            System.out.println(pokemon1.getNome() + " venceu!");
        } else if (IVp1 < IVp2) {
            System.out.println(pokemon2.getNome() + " venceu!");
        } else {
            System.out.println("Empate!");
        }
    }

    public int calcularIV(Pokemon p) {
        int iv = 0;
        for (int stat : p.getIVs()) {
            iv += stat;
        }
        return iv;
    }
}
