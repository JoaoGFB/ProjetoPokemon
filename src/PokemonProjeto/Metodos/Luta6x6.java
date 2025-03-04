package PokemonProjeto.Metodos;

import PokemonProjeto.Pokemon.Pokemon;

public class Luta6x6 implements LutaInterface{
    private Pokemon[] equipe1;
    private Pokemon[] equipe2;

    public Luta6x6(Pokemon[] equipe1, Pokemon[] equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    @Override
    public void lutar() {
        int IVequipe1 = calcularIV(equipe1);
        int IVequipe2 = calcularIV(equipe2);
        decidirLuta6x6(IVequipe1, IVequipe2);
    }

    private void decidirLuta6x6(int IVequipe1, int IVequipe2) {
        if (IVequipe1 > IVequipe2) {
            System.out.println("Equipe 1 venceu!");
        } else if (IVequipe1 < IVequipe2) {
            System.out.println("Equipe 2 venceu!");
        } else {
            System.out.println("Empate!");
        }
    }

    public int calcularIV(Pokemon[] pokemons) {
        int iv = 0;
        for (Pokemon p : pokemons) {
            for (int stat : p.getIVs()) {
                iv += stat;
            }
        }
        return iv;
    }
}
