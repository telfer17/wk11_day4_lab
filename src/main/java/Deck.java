import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int getSize() {
        return this.cards.size();
    }

//    public Card findIndex(Suit suit, Rank rank){
//        if()
//    }

    public void populate() {

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                this.cards.add((card));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card removeCard(){
        return this.cards.remove(0);
    }

    public void dealCards(Player player){
        Card removedCard = this.removeCard();
        player.addCard(removedCard);
    }


}
