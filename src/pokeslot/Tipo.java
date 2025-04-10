package pokeslot;

public enum Tipo {
    Comun(0.5f, 20),
    PocoComun(1.0f, 40),
    Raro(2.0f, 40),
    SuperRaro(5.0f, 10),
    Legendario(50.0f, 10);
    
    private float value;
    private int probability;
    
    private Tipo(float value, int probability){
        this.value = value;
        this.probability = probability;
    }

    public int getProbability() {
        return probability;
    }

    public float getValue() {
        return value;
    }
}
