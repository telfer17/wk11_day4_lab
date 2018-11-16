import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static com.sun.tools.doclint.Entity.times;
import static junit.framework.TestCase.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setup(){
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void canPopulateDeck(){
       assertEquals(52, deck.getSize());
    }

//    @Test
//    public void showCardByIndex(){
//
//    }


    @Test
    public void canShuffleDeck(){
        deck.shuffle();

    }

    @Test
    public void canRemoveCardFromDeck(){
        deck.shuffle();
        deck.removeCard();
        assertEquals(51, deck.getSize());
    }


}
