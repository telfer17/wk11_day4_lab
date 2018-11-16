import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player() {
        this.hand = new ArrayList<Card>();
    }

    public int getCardCount() {
        return hand.size();
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public Card showCard(){
        return this.hand.get(0);
    }




}
