import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Deck deck;

    @Before
    public void setup(){
        player1 = new Player();
        player2 = new Player();
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void playerCanGetCard(){
        Card removedCard = deck.removeCard();
        player1.addCard(removedCard);
        assertEquals(1, player1.getCardCount());
        assertEquals(51, deck.getSize());
    }
}
