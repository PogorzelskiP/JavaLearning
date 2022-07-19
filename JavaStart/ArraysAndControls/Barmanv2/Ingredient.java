package JavaStart.ArraysAndControls.Barmanv2;
public class Ingredient {
    private String name;
    private String volume;

    public Ingredient() {
    }

    public Ingredient(String name, String volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
