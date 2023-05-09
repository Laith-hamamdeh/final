package coffeemachine;

public class Coffee {

    private String type;
    private int amount;
    private int water;
    private float caffeine;

    public Coffee(String type, int amount, int water) {
        this.type = type;
        this.amount = amount;
        this.water = water;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public float getCaffeine() {
        float a = Integer.valueOf(amount).floatValue();
        float w = Integer.valueOf(water).floatValue();
        caffeine = (20 * a) / w;
        return caffeine;
    }
}
