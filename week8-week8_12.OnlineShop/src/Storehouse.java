
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse() {
        prices = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        for (String price : this.prices.keySet()) {
            if (price.contains(product)) {
                return this.prices.get(product);
            }
        }
        return -99;
    }

    public int stock(String product) {
        for (String stock : this.stocks.keySet()) {
            if (stock.contains(product)) {
                return this.stocks.get(product);
            }
        }
        return 0;
    }

    public boolean take(String product) {
        int oldStock = stock(product);
        if (oldStock > 0){
            this.stocks.put(product, oldStock-1);
            return true;

        }
        return false;
    }
    public Set<String> products(){
        return this.prices.keySet();

    }
}
