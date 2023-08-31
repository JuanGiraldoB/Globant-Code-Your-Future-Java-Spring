import Entities.Game;
import Entities.Player;
import Entities.Revolver;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Revolver revolver = new Revolver();
        Game game = new Game();

        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Player player = new Player(i, "Player", false);
            players.add(player);
        }

        System.out.println(revolver.toString());
        players.forEach(System.out::println);
        game.fillGame(players, revolver);
        game.round();

        System.out.println(revolver.toString());

    }

}
