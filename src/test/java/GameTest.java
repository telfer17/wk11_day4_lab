import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Player player1;
    Player player2;

    @Before
    public void setup(){
        game = new Game();
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
        game.addPlayer(player1);
        game.addPlayer(player2);
    }

    @Test
    public void playersAddedToGame(){
        assertEquals(2, game.getPlayers());
    }

    @Test
    public void checkWinner(){
        deck.dealCards(player1);
        deck.dealCards(player2);
        assertEquals(player1, game.findWinner());
    }




}
