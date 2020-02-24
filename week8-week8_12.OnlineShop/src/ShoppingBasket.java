import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {

        Purchase item = new Purchase(product, 1, price);

        if (this.basket.containsKey(product)) {
            this.basket.get(product).increaseAmount();
        } else {
            basket.put(product, item);
        }
    }


    public void print() {
        for (String product : this.basket.keySet()) {
            System.out.println(this.basket.get(product));
        }
    }


    public int price() {
        int total = 0;
        for (Purchase item : this.basket.values()) {
            total += item.price();

        }
        return total;
    }
}
