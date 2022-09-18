import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Guitar guitar;
    Piano piano;
    Shop shop;

    ISell guitarStrings;
    ISell drumSticks;

    @Before
    public void setUp(){
        guitar = new Guitar("Yamahah", "Black", InstrumentTypes.STRING, 6);
        piano = new Piano("Yamahah", "Red", InstrumentTypes.STRING, 32);
        shop = new Shop();

        guitarStrings = new GuitarStrings(2.00, 6.00, InstrumentTypes.STRING);
        drumSticks = new DrumSticks(4.00, 12.00, InstrumentTypes.PRECUSSION);

    }

    @Test
    public void canGetMarkup(){
        assertEquals(4.00, guitarStrings.calculateMarkUp(), 0.0);
    }


    @Test
    public void canAddToStock(){
        shop.addToStock(guitarStrings);
        shop.addToStock(drumSticks);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canGetTotalMarkUp(){
        shop.addToStock(guitarStrings);
        shop.addToStock(drumSticks);
        assertEquals(12.00, shop.getTotalMarkup(), 0.0);
    }
}
