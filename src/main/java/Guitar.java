public class Guitar extends Instrument implements IPlay{

    private int numberOfStrings;

    public Guitar(String brand, String color, InstrumentTypes type, int numberOfStrings) {
        super(brand, color, type);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "Smoke on the water!";
    }

}
