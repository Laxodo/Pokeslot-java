package pokeslot;

import java.util.ArrayList;
import java.util.Random;
import pokeslot.exceptions.ExceptionNotEnoughtPoints;

public class Player {

    private Random rn = new Random();
    private String Nombre;
    private ArrayList<Pokemon> inventario;
    private float puntos;

    //Opciones
    private int printMode;

    public Player() {
        this.Nombre = "Player";
        this.inventario = new ArrayList();
        this.puntos = 0.0f;
        this.printMode = 1;
    }

    public Player(String Nombre, ArrayList<Pokemon> inventario, float puntos, int printMode) {
        this.Nombre = Nombre;
        this.inventario = inventario;
        this.puntos = puntos;
        this.printMode = printMode;
    }

    public Pokemon Tirar(Tipo tipo) throws ExceptionNotEnoughtPoints {
        if (this.puntos < 1) {
            throw new ExceptionNotEnoughtPoints();
        }

        this.puntos -= 1;

        if (rn.nextInt(tipo.getProbability()) == rn.nextInt(tipo.getProbability())) {
            while (true) {
                int pokedex = rn.nextInt(1, PokemonEnum.values().length + 1);
                if (Pokemon.obtenerTipoPorPokedex(pokedex).getTipo().equals(tipo)) {
                    Pokemon aux = new Pokemon(pokedex);
                    this.inventario.add(aux);
                    return aux;
                }
            }
        }
        return null;
    }

    public float Transferir(String pokemon) {
        if (!this.inventario.isEmpty()) {
            for (Pokemon pk : inventario) {
                if (pk.getNombre().equals(pokemon)) {
                    GanarPuntos(pk.getValue());
                    return pk.getValue();
                }
            }
        }
        return 0;
    }
    public float Transferir(String pokemon, int veces){
        int aux;
        int puntos = 0;
        for(aux = 0; aux < veces; aux++){
            float i = Transferir(pokemon);
            if(i == 0){
                break;
            }
            puntos += i;
        }
        System.out.printf("Se ha transferido %d puntos (+ %d tiradas)", aux, puntos);
        return puntos;
    }

    public String getNombre() {
        return Nombre;
    }

    public ArrayList<Pokemon> getInventario() {

        return this.inventario;
    }

    public void PrintInventario() {

        if (this.inventario.isEmpty()) {
            System.out.println("Vacio");
        } else {
            switch(this.printMode){
                case 1 -> PrintMode1();
                case 2 -> PrintMode2();
            }

        }
    }

    public float getPuntos() {
        return puntos;
    }

    private void GanarPuntos(float a) {
        puntos += a;
    }
    private void PrintMode1(){
        for (Pokemon pokemon : this.inventario) {
            System.out.printf("%s, ", pokemon.getNombre());
        }
    }
    private void PrintMode2(){
        for (Pokemon pokemon : this.inventario) {
            System.out.println(pokemon.getNombre());
        }
    }
}
