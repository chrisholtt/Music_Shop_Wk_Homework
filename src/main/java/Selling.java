public class Selling {
    protected double boughtFor;
    protected double sellingFor;

    private InstrumentTypes type;

    public Selling(double boughtFor, double sellingFor, InstrumentTypes type) {
        this.boughtFor = boughtFor;
        this.sellingFor = sellingFor;
        this.type = type;
    }
}
