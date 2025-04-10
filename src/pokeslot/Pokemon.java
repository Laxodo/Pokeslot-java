package pokeslot;

import java.util.Random;

public final class Pokemon {
    Random rn = new Random();
    
    static final int ShinyProbability = 10;
    private boolean shiny;
    private float value;
    private Tipo tipo;
    private String nombre;
    
    public Pokemon(int pokedex){
        PokemonEnum aux = obtenerTipoPorPokedex(pokedex);
        this.tipo = aux.getTipo();
        this.nombre = aux.getNombre();
        this.value = this.tipo.getValue();
        this.shiny = (rn.nextInt(ShinyProbability) == rn.nextInt(ShinyProbability));
        this.value += (this.shiny)? 2.0f : 0.0f;
    }
    
    public static PokemonEnum obtenerTipoPorPokedex(int numeroPokedex) {
        for (PokemonEnum pokemon : PokemonEnum.values()) {
            if (pokemon.getNumeroPokedex() == numeroPokedex) {
                return pokemon;
            }
        }
        return null;
    }

    public Random getRn() {
        return rn;
    }

    public static int getShinyProbability() {
        return ShinyProbability;
    }

    public boolean isShiny() {
        return shiny;
    }

    public float getValue() {
        return value;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }
}