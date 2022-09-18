public class Piano extends Instrument implements IPlay{

    private int numberOfkeys;


    public Piano(String brand, String color, InstrumentTypes type, int numberOfkeys) {
        super(brand, color, type);
        this.numberOfkeys = numberOfkeys;
    }


    @Override
    public String play() {
        return "Interstellar theme tune!";
    }

}
