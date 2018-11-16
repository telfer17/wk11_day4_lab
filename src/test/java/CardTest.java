import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

    public class CardTest {

        Card card;

        @Before
        public void setup(){
            card = new Card(Suit.HEARTS, Rank.ACE);
        }

        @Test
        public void canGetSuit(){
            assertEquals(Suit.HEARTS, card.getSuit());
        }

        @Test
        public void canGetRank(){
            assertEquals(Rank.ACE, card.getRank());
        }

        @Test
        public void queenHasValueTwelve() {
            Card card = new Card(Suit.HEARTS, Rank.QUEEN);
            assertEquals(12, card.getValueFromEnum());
        }
}
