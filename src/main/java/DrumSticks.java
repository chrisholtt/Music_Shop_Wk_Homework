public class DrumSticks extends Selling implements ISell{

    public DrumSticks(double boughtFor, double sellingFor, InstrumentTypes type) {
        super(boughtFor, sellingFor, type);
    }

    @Override
    public double calculateMarkUp() {
        return this.sellingFor - boughtFor;

    }
}
