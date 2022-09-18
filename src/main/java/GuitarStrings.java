public class GuitarStrings extends Selling implements ISell{

    public GuitarStrings(double boughtFor, double sellingFor, InstrumentTypes type) {
        super(boughtFor, sellingFor, type);
    }

    @Override
    public double calculateMarkUp() {
        return this.sellingFor - boughtFor;
    }
}
