import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public void addToStock(ISell item){
        this.stock.add(item);
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public double getTotalMarkup(){
        double total = 0;
        for (ISell item : stock){
            total += item.calculateMarkUp();
        }

        return total;
    }
}
