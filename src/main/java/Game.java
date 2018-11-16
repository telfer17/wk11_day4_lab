import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;

    public Game() {
        this.players = new ArrayList<Player>();
    }

    public int getPlayers() {
        return players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Player findWinner(){
        Player winner = null;
        if(players.get(0).showCard().getValueFromEnum() > players.get(1).showCard().getValueFromEnum()) {
           return winner = players.get(0);
        }
        else{
            return winner = players.get(1);
        }
    }

}
