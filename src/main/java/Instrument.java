public class Instrument {
    private String brand;
    private String color;

    InstrumentTypes type;

    public Instrument(String brand, String color, InstrumentTypes type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }
}
