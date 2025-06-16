package DSATASK;

public class VillageData {
    private String name;
    private double temperature;
    private double ph;
    private double chloride;
    private double flouride;

    public VillageData(String name, double temperature, double ph, double chloride, double flouride) {
        super();
        this.name = name;
        this.temperature = temperature;
        this.ph = ph;
        this.chloride = chloride;
        this.flouride = flouride;
    }

    public String getName() {
        return name;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPh() {
        return ph;
    }

    public double getChloride() {
        return chloride;
    }

    public double getFlouride() {
        return flouride;
    }
}
