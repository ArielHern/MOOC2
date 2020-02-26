import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void sort() {
        Collections.sort(hand);
    }

    public void print() {
        for (Card card : this.hand) {
            System.out.println(card);

        }
    }

    public int compareTo(Hand other) {
        int currentHand = 0, compareHand = 0;

        for (Card card : this.hand) {
            currentHand += card.getValue();
        }
        for (Card card : other.hand) {
            compareHand += card.getValue();
        }
        return currentHand - compareHand;
    }

    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}
