package pokeslot;

import java.util.ArrayList;
import java.util.Random;

public class Player {

    private Random rn = new Random();
    private String Nombre;
    private ArrayList<PokemonEnum> inventario;
    private float puntos;

    public Player() {
        this.Nombre = "Player";
        this.inventario = new ArrayList();
        this.puntos = 0.0f;
    }

    public Player(String Nombre, ArrayList<PokemonEnum> inventario, float puntos) {
        this.Nombre = Nombre;
        this.inventario = inventario;
        this.puntos = puntos;
    }

    public Pokemon Tirar(Tipo tipo) {
        int pokedex = rn.nextInt(1, PokemonEnum.values().length + 1);

        if (rn.nextInt(tipo.getProbability()) == rn.nextInt(tipo.getProbability())) {
            while (true) {
                if (Pokemon.obtenerTipoPorPokedex(pokedex).getTipo().equals(tipo)) {
                    return new Pokemon(pokedex);
                }
            }
        }
        return null;
    }
    
    public int Transferir(){
        if(!this.getInventario().isEmpty()){
            
        }
        return 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public ArrayList<PokemonEnum> getInventario() {
        return inventario;
    }

    public float getPuntos() {
        return puntos;
    }
}
